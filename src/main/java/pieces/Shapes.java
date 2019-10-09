package pieces;

import tablero.Tablero;

import java.awt.*;

public enum Shapes {
    MIRROR_L(Color.GREEN, 3, 1, 0){
        @Override public void fall(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+1].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual][i+2].setFilled(true).label.setBackground(getColor());
            tablero.tableroLabels[columnaActual-1][i+2].setFilled(true).label.setBackground(getColor());
        }
        @Override public void clear(Tablero tablero, int columnaActual, int i){
            tablero.tableroLabels[columnaActual][i].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+1].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual][i+2].setFilled(false).label.setBackground(Color.DARK_GRAY);
            tablero.tableroLabels[columnaActual-1][i+2].setFilled(false).label.setBackground(Color.DARK_GRAY);
        }
        @Override public boolean contact(Tablero tablero, int columnaActual, int i){
            return tablero.tableroLabels[columnaActual-1][i+3].isFilled() || tablero.tableroLabels[columnaActual][i+3].isFilled();
        }
    },
    MIRROR_Z(Color.CYAN, 2, 1, 1){
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
    SQUARE(Color.MAGENTA,2, 0, 1){
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
    LINE(Color.BLUE,4,0,0){
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
    T(Color.RED,2,1,1){
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
    L(Color.YELLOW,3,0,1){
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
    Z(Color.WHITE,2,1,1){
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
    private int xLeft;
    private int xRight;


    Shapes(Color color, int yExtension, int xLeft, int xRight){
        this.color = color;
        this.yExtension = yExtension;
        this.xLeft = xLeft;
        this.xRight = xRight;
    }

    public Color getColor() {
        return color;
    }

    public int getyExtension() {
        return yExtension;
    }
    public int getxLeft() {
        return xLeft;
    }
    public int getxRight() {
        return xRight;
    }

    public boolean rightContact(int column, int index, Tablero tablero){
        return tablero.tableroLabels[column + 1][index].isFilled();
    }


    public void fall(Tablero tablero, int columnaActual, int i){}
    public void clear(Tablero tablero, int columnaActual, int i){}
    public boolean contact(Tablero tablero, int columnaActual, int i){return false;}
}
