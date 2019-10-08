/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author diego
 */
public class MyJLabel {
    public static final Color DEFAULT_COLOR = new Color(51, 51, 51);
    public JLabel label;
    private boolean filled = false;

    public MyJLabel() {
        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.DARK_GRAY);
        label.setText("");
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }

    public boolean isFilled() {
        return filled;
    }

    public MyJLabel setFilled(boolean filled) {
        this.filled = filled;
        return this;
    }    
}
