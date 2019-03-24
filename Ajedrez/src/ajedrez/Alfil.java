package ajedrez;

public class Alfil extends Piezas {

    String figura;

    public Alfil() {
    }

    public Alfil(boolean color) {
        super(color);
        if (color) {
            figura = "♗";
        } else {
            figura = "♝";
        }
    }

    @Override
    public String toString() {
        return figura;
    }

    @Override
    public int[][] movimiento(int x, int y, Piezas[][] tablero) {
        int cont = 0;
        int cont_e = 0;
        int[][] pos = new int[4][16];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 16; j++) {
                pos[i][j] = -1;
            }
        }
        int j = y;
        for (int i = x; i >= 0; i--) {
            if ((i - 1 >= 0) && (j + 1 < 8)) {
                if (tablero[i - 1][j + 1] == null) {
                    if (cont_e == 0) {
                        pos[0][cont] = i - 1;
                        pos[0][cont + 1] = j + 1;
                        cont += 2;
                    }
                } else if (tablero[i - 1][j + 1].getColor() != this.color) {
                    if (cont_e == 0) {
                        pos[0][cont] = i - 1;
                        pos[0][cont + 1] = j + 1;
                        cont += 2;
                        cont_e = 1;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
            j++;
        }
        j = y;
        cont = 0;
        cont_e = 0;
        for (int i = x; i >= 0; i--) {
            if ((i - 1 >= 0) && (j - 1 >= 0)) {
                if (tablero[i - 1][j - 1] == null) {
                    if (cont_e == 0) {
                        pos[1][cont] = i - 1;
                        pos[1][cont + 1] = j - 1;
                        cont += 2;
                    }
                } else if (tablero[i - 1][j - 1].getColor() != this.color) {
                    if (cont_e == 0) {
                        pos[1][cont] = i - 1;
                        pos[1][cont + 1] = j - 1;
                        cont += 2;
                        cont_e = 1;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
            j--;
        }
        j = y;
        cont = 0;
        cont_e = 0;
        for (int i = x; i < 8; i++) {
            if ((i + 1 < 8) && (j + 1 < 8)) {
                if (tablero[i + 1][j + 1] == null) {
                    if (cont_e == 0) {
                        pos[2][cont] = i + 1;
                        pos[2][cont + 1] = j + 1;
                        cont += 2;
                    }
                } else if (tablero[i + 1][j + 1].getColor() != this.color) {
                    if (cont_e == 0) {
                        pos[2][cont] = i + 1;
                        pos[2][cont + 1] = j + 1;
                        cont += 2;
                        cont_e = 1;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
            j++;
        }
        j = y;
        cont = 0;
        cont_e = 0;
        for (int i = x; i < 8; i++) {
            if ((i + 1 < 8) && (j - 1 >= 0)) {
                if (tablero[i + 1][j - 1] == null) {
                    if (cont_e == 0) {
                        pos[3][cont] = i + 1;
                        pos[3][cont + 1] = j - 1;
                        cont += 2;
                    }
                } else if (tablero[i + 1][j - 1].getColor() != this.color) {
                    if (cont_e == 0) {
                        pos[3][cont] = i + 1;
                        pos[3][cont + 1] = j - 1;
                        cont += 2;
                        cont_e = 1;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
            j--;
        }

        return pos;
    }
}
