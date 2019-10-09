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
    private int milisegundosDefault = 2000;

    public ThreadFigura(Tablero tablero) {
        this.tablero = tablero;
        this.running = true;
    }

    @Override
    public void run() {
        while (isRunning()) {
            int pick = new Random().nextInt(Shapes.values().length);
            Shapes shape = Shapes.values()[pick];
            // iteración de figura
            for (int heigthIndex = -3; heigthIndex < Tablero.FILAS_Y; heigthIndex++) {
                int columnaActual = tablero.getIndex_x();

                if (heigthIndex >= 0) {
                    try {
                        shape.fall(tablero, columnaActual, heigthIndex);
                    } catch (IndexOutOfBoundsException ignore){}

                    try {
                        sleep((long) (factorVelocidad * milisegundosDefault));
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }

                    // verificar si chocó con algo

                    if(heigthIndex+shape.getyExtension()==Tablero.FILAS_Y || shape.contact(tablero, columnaActual, heigthIndex)){
                        tablero.setIndex_x(5);
                        break;
                    }else {
                        shape.clear(tablero, columnaActual, heigthIndex);
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

    public void setRunning(boolean running) {
        this.running = running;
    }

    void decrementVelocidad() {
        
        if (factorVelocidad > 0.30)
            this.factorVelocidad -= 0.10;
    }
    
    
    
    
    
}
