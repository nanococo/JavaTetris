package tablero;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    public Tablero tablero;

    MyKeyListener(Tablero tablero){
        this.tablero = tablero;

    }
    /** Handle the key typed event from the text field. */
    public void keyTyped(KeyEvent e) {
        System.out.println("KEY TYPED: ");
    }

    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
        System.out.println("KEY PRESSED: ");
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        System.out.println("KEY RELEASED: ");
    }

//    @Override
//    public void keyTyped(KeyEvent e) {
//        System.out.println("pressed");
//    }
//
//    public void keyPressed(KeyEvent keyEvent){
//
//        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN){
//            tablero.threadFigura.decrementVelocidad();
//        } else{
//            if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT){
//                tablero.decrementIndex_x();
//            } else {
//                if(keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
//                    tablero.incrementIndex_x();
//                }
//            }
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
}
