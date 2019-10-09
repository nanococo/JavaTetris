package pieces;

import tablero.Tablero;

import java.awt.*;

public enum Shapes {
    MIRROR_L(Color.GREEN, 3){
        @Override public void fall(Tablero tablero, int actualColumn, int i){
            tablero.tableroLabels[actualColumn][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[actualColumn][i+1].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[actualColumn][i+2].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[actualColumn-1][i+2].setFilled(true).label.setBackground(getColor());


        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+2].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual-1][i+2].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int heigthToBottom){

            boolean bottomOneIsFilled = tablero.tableroLabels[columnaActual-1][heigthToBottom+3].isFilled();
            boolean bottomTwoIsFilled = tablero.tableroLabels[columnaActual][heigthToBottom+3].isFilled();

            return tablero.tableroLabels[columnaActual-1][heigthToBottom+3].isFilled() ||
                    tablero.tableroLabels[columnaActual][heigthToBottom+3].isFilled();
        }
    },
    MIRROR_Z(Color.CYAN, 2){
        @Override public void fall(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual+1][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+1].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual-1][i+1].setFilled(true).label.setBackground(getColor());
        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual+1][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual-1][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int i){
            return tablero.tableroLabels[columnaActual-1][i+2].isFilled() || tablero.tableroLabels[columnaActual][i+2].isFilled();
        }
    },
    SQUARE(Color.MAGENTA,2){
        @Override public void fall(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual+1][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+1].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual+1][i+1].setFilled(true).label.setBackground(getColor());
        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual+1][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual+1][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int i){
            return tablero.tableroLabels[columnaActual+1][i+2].isFilled() || tablero.tableroLabels[columnaActual][i+2].isFilled();
        }
    },
    LINE(Color.BLUE,4){
        @Override public void fall(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+1].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+2].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+3].setFilled(true).label.setBackground(getColor());
        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+2].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+3].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int i){
            return tablero.tableroLabels[columnaActual-1][i+4].isFilled();
        }
    },
    T(Color.RED,2){
        @Override public void fall(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual+1][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual-1][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+1].setFilled(true).label.setBackground(getColor());
        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual+1][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual-1][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int i){
            return tablero.tableroLabels[columnaActual][i+2].isFilled();
        }
    },
    L(Color.YELLOW,3){
        @Override public void fall(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+1].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+2].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual+1][i+2].setFilled(true).label.setBackground(getColor());
        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+2].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual+1][i+2].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int i){
            return tablero.tableroLabels[columnaActual+1][i+3].isFilled() || tablero.tableroLabels[columnaActual][i+3].isFilled();
        }
    },
    Z(Color.WHITE,2){
        @Override public void fall(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual-1][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+1].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual+1][i+1].setFilled(true).label.setBackground(getColor());
        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual-1][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual+1][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int i){
            return tablero.tableroLabels[columnaActual+1][i+2].isFilled() || tablero.tableroLabels[columnaActual][i+2].isFilled();
        }
    };

    private Color color;
    private int yExtension;

    Shapes(Color color, int yExtension){
        this.color = color;
        this.yExtension = yExtension;
    }

    public Color getColor() {
        return color;
    }

    public int getyExtension() {
        return yExtension;
    }

    public void fall(Tablero tablero, int columnaActual, int i){}
    public void clear(Tablero tablero, int columnaActual, int i){}
    public boolean contact(Tablero tablero, int columnaActual, int i){return false;}
}
