package ajedrez;

public abstract class Piezas {

    public boolean color;

    public Piezas() {
    }

    public Piezas(boolean color) {
        this.color = color;

    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piezas";
    }

    public abstract int[][] movimiento(int x, int y, Piezas[][] tablero);
}
