/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import pieces.Shapes;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class ThreadFigura extends Thread {
    private Tablero tablero;
    
    
    private boolean running;
    private boolean paused = false;
    private double factorVelocidad = 1.0;
    private int milisegundosDefault = 1000;
    private boolean moveRight = false;
    private boolean moveLeft = false;

    ThreadFigura(Tablero tablero) {
        this.tablero = tablero;
        this.running = true;
    }

    @Override
    public void run() {
        while (isRunning()) {
            int pick = new Random().nextInt(Shapes.values().length);
            Shapes shape = Shapes.values()[pick];
            //Shapes shape = Shapes.MIRROR_Z;
            tablero.setShapes(shape);
            // iteración de figura
            for (int index = -3; index < Tablero.FILAS_Y; index++) {
                int columnaActual = tablero.getIndex_x();

                if (index >= 0) {


                    if(moveLeft){

                        decrementIndex_x(columnaActual, shape, index);

                        moveLeft = false;

                    } else if (moveRight){
                        incrementIndex_x(columnaActual, shape, Tablero.COLUMNAS_X, index);
                        moveRight = false;

                    }

                    try {
                        shape.fall(tablero, columnaActual, index);
                    } catch (IndexOutOfBoundsException ignore){}


                    try {
                        sleep((long) (factorVelocidad * milisegundosDefault));
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }

                    // verificar si chocó con algo

                    if(index+shape.getyExtension()==Tablero.FILAS_Y || shape.contact(tablero, columnaActual, index)){
                        tablero.setIndex_x(5);
                        tablero.checkBottom();
                        break;
                    }else {
                        shape.clear(tablero, columnaActual, index);
                    }


                    while (paused) {
                        try {
                            sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadFigura.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

            }

        }
    }

    private boolean isRunning() {
        return running;
    }

    public boolean isMoveRight() {
        return moveRight;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public boolean isMoveLeft() {
        return moveLeft;
    }

    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    void decrementVelocidad() {
        
        if (factorVelocidad > 0.30)
            this.factorVelocidad -= 0.10;
    }

    private void decrementIndex_x(int currentColumn, Shapes shapes, int index){
        if (currentColumn-shapes.getxLeft() > 0 && !(shapes.leftContact(currentColumn, index, tablero)))
            tablero.setIndex_x(tablero.getIndex_x()-1);

    }
    private void incrementIndex_x(int currentColumn, Shapes shapes, int COLUMNAS_X, int index){
        if (currentColumn+shapes.getxRight() < (COLUMNAS_X-1) && !(shapes.rightContact(currentColumn, index, tablero)))
            tablero.setIndex_x(tablero.getIndex_x()+1);
    }
    

    
    
}
