import java.awt.*;

public class Pieza {
    private static int x = 5;
    private static int y = 28;
    private static int pieza;
    private static int rotacion = 0;
    public static Color color;
    
    public Pieza(int numero) {pieza = numero;}
    public void resetValues() {x = 5; y = 28; rotacion = 0;}

    public int bajar() {
        if (pieza == 0) {
            x++;
            if (rotacion == 0) {
                if (!Frame.equals(".", x+2, y+1) || !Frame.equals(".", x, y)) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(0, 0, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                }
            } else if (rotacion == 1) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x, y+1)) || !(Frame.equals(".", x, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;   
                } else {
                    if (x != 6) {Frame.crearPieza(0, 1, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                }
            } else if (rotacion == 2) {
                if (!(Frame.equals(".", x+2, y)) || !(Frame.equals(".", x+2, y+1))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(0, 2, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(0, 2, x, y, true, Frame.CERO);
                }
            } else if (rotacion == 3) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x+1, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(0, 3, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(0, 3, x, y, true, Frame.CERO);
                }
            }
        } else if (pieza == 1) {
            x++;
            if (rotacion == 0) {
                if (!(Frame.equals(".", x+2, y)) || !(Frame.equals(".", x, y+1))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(1, 0, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                }
            } else if (rotacion == 1) {
                if (!(Frame.equals(".", x, y)) || !(Frame.equals(".", x, y+1)) || !(Frame.equals(".", x+1, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(1, 1, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                }
            } else if (rotacion == 2) {
                if (!(Frame.equals(".", x+2, y)) || !(Frame.equals(".", x+2, y+1))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(1, 2, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(1, 2, x, y, true, Frame.UNO);
                }
            } else if (rotacion == 3) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x+1, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(1, 3, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(1, 3, x, y, true, Frame.UNO);
                }
            }
        } else if (pieza == 2) {
            x++;
            if (rotacion == 0) {
                if (!(Frame.equals(".", x+3, y))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(2, 0, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                }
            } else if (rotacion == 1) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x+1, y+2)) || !(Frame.equals(".", x+1, y+3))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(2, 1, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                }
            }
        } else if (pieza == 3) {
            x++;
            if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+1, y+1))) {
                Partida.flagFinal = true;
                x = 5;
            } else {
                if (x != 6) {Frame.crearPieza(3, 0, x-1, y, false, Frame.PREDETERMINADO);}
                Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
            }
        } else if (pieza == 4) {
            x++;
            if (rotacion == 0) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+2, y+1))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(4, 0, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                }
            } else if (rotacion == 1) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(4, 1, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                }
            }
        } else if (pieza == 5) {
            x++;
            if (rotacion == 0) {
                if (!(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x+2, y))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(5, 0, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                }
            } else if (rotacion == 1) {
                if (!(Frame.equals(".", x, y)) || !(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x+1, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(5, 1, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                }
            }
        } else if (pieza == 6) {
            x++;
            if (rotacion == 0) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+2, y+1))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(6, 0, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                }
            } else if (rotacion == 1) {
                if (!(Frame.equals(".", x+1, y)) || !(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x+1, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(6, 1, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                }
            } else if (rotacion == 2) {
                if (!(Frame.equals(".", x+2, y)) || !(Frame.equals(".", x+1, y+1))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(6, 2, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(6, 2, x, y, true, Frame.SEIS);
                }
            } else if (rotacion == 3) {
                if (!(Frame.equals(".", x, y)) || !(Frame.equals(".", x+1, y+1)) || !(Frame.equals(".", x, y+2))) {
                    Partida.flagFinal = true;
                    x = 5;
                } else {
                    if (x != 6) {Frame.crearPieza(6, 3, x-1, y, false, Frame.PREDETERMINADO);}
                    Frame.crearPieza(6, 3, x, y, true, Frame.SEIS);
                }
            }
        }
        return y;
    }

    public int fondo() {
        if (x > 5 && Partida.flagPausa) {
            while (cantAbajo) {abajo();}
            Menu.audioFondo.setFramePosition(0);
            Menu.audioFondo.start();
        }
        return y;
    }

    public boolean cantAbajo = true;
    public int abajo() {
        if (x > 5 && cantAbajo && Partida.flagPausa) {
            Menu.audioTecla.setFramePosition(0);
            Menu.audioTecla.start();
            if (pieza == 0) {
                if (rotacion == 0 &&  Frame.equals(".", x+3, y+1) &&  Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(0, 0, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(0, 0, x, y, true,  Frame.CERO);
                } else if (rotacion == 1 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+1, y+1) &&  Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(0, 1, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(0, 1, x, y, true,  Frame.CERO);
                } else if ( rotacion == 2 &&  Frame.equals(".", x+3, y) &&  Frame.equals(".", x+3, y+1)) {
                    Frame.crearPieza(0, 2, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(0, 2, x, y, true,  Frame.CERO);
                } else if (rotacion == 3 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(0, 3, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(0, 3, x, y, true,  Frame.CERO);
                } else {cantAbajo = false;}
            } else if (pieza == 1) {
                if (rotacion == 0 &&  Frame.equals(".", x+3, y) &&  Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(1, 0, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(1, 0, x, y, true,  Frame.UNO);
                } else if (rotacion == 1 &&  Frame.equals(".", x+1, y) &&  Frame.equals(".", x+1, y+1) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(1, 1, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(1, 1, x, y, true,  Frame.UNO);
                } else if (rotacion == 2 &&  Frame.equals(".", x+3, y) &&  Frame.equals(".", x+3, y+1)) {
                    Frame.crearPieza(1, 2, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(1, 2, x, y, true,  Frame.UNO);
                } else if (rotacion == 3 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(1, 3, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(1, 3, x, y, true,  Frame.UNO);
                } else {cantAbajo = false;}
            } else if (pieza == 2) {
                if (rotacion == 0 &&  Frame.equals(".", x+4, y)) {
                    Frame.crearPieza(2, 0, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(2, 0, x, y, true,  Frame.DOS);
                } else if (rotacion == 1 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+2, y+2) &&  Frame.equals(".", x+2, y+3)) {
                    Frame.crearPieza(2, 1, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(2, 1, x, y, true,  Frame.DOS);
                } else {cantAbajo = false;}
            } else if (pieza == 3) {
                if ( Frame.equals(".", x+2, y) &&  Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(3, 0, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(3, 0, x, y, true,  Frame.TRES);
                } else {cantAbajo = false;}
            } else if (pieza == 4) {
                if (rotacion == 0 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+3, y+1)) {
                    Frame.crearPieza(4, 0, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(4, 0, x, y, true,  Frame.CUATRO);
                } else if (rotacion == 1 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(4, 1, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(4, 1, x, y, true,  Frame.CUATRO);
                } else {cantAbajo = false;}
            } else if (pieza == 5) {
                if (rotacion == 0 &&  Frame.equals(".", x+3, y) &&  Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(5, 0, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(5, 0, x, y, true,  Frame.CINCO);
                } else if (rotacion == 1 &&  Frame.equals(".", x+1, y) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(5, 1, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(5, 1, x, y, true,  Frame.CINCO);
                } else {cantAbajo = false;}
            } else if (pieza == 6) {
                if (rotacion == 0 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+3, y+1)) {
                    Frame.crearPieza(6, 0, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(6, 0, x, y, true,  Frame.SEIS);
                } else if (rotacion == 1 &&  Frame.equals(".", x+2, y) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(6, 1, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(6, 1, x, y, true,  Frame.SEIS);
                } else if (rotacion == 2 &&  Frame.equals(".", x+3, y) &&  Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(6, 2, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(6, 2, x, y, true,  Frame.SEIS);
                } else if (rotacion == 3 &&  Frame.equals(".", x+1, y) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(6, 3, x, y, false,  Frame.PREDETERMINADO);
                    x++;
                    Frame.crearPieza(6, 3, x, y, true,  Frame.SEIS);
                }  else {cantAbajo = false;}
            }
        }
        return y;
    }

    public int izquierda() {
        if (x > 5 && cantAbajo && Partida.flagPausa) {
            Menu.audioTecla.setFramePosition(0);
            Menu.audioTecla.start();
            if (pieza == 0) {
                if (rotacion == 0 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y) &&  Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(0, 0, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(0, 0, x, y, true,  Frame.CERO);
                } else if (rotacion == 1 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1)) {
                    Frame.crearPieza(0, 1, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(0, 1, x, y, true,  Frame.CERO);
                } else if (rotacion == 2 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x+2, y-1)) {
                    Frame.crearPieza(0, 2, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(0, 2, x, y, true,  Frame.CERO);
                } else if (rotacion == 3 && Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(0, 3, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(0, 3, x, y, true,  Frame.CERO);
                }
            } else if (pieza == 1) {
                if (rotacion == 0 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x+2, y-1)) {
                    Frame.crearPieza(1, 0, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(1, 0, x, y, true,  Frame.UNO);
                } else if (rotacion == 1 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1)) {
                    Frame.crearPieza(1, 1, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(1, 1, x, y, true,  Frame.UNO);
                } else if (rotacion == 2 && Frame.equals(".", x, y) &&  Frame.equals(".", x+1, y) &&  Frame.equals(".", x+2, y-1)) {
                    Frame.crearPieza(1, 2, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(1, 2, x, y, true,  Frame.UNO);
                } else if (rotacion == 3 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1)) {
                    Frame.crearPieza(1, 3, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(1, 3, x, y, true,  Frame.UNO);
                }
            } else if (pieza == 2) {
                if (rotacion == 0 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x+2, y-1) &&  Frame.equals(".", x+3, y-1)) {
                    Frame.crearPieza(2, 0, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(2, 0, x, y, true,  Frame.DOS);
                } else if (rotacion == 1 && Frame.equals(".", x+1, y-1)) {
                    Frame.crearPieza(2, 1, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(2, 1, x, y, true,  Frame.DOS);
                }
            } else if (pieza == 3) {
                if( Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1)) {
                    Frame.crearPieza(3, 0, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(3, 0, x, y, true,  Frame.TRES);
                }
            } else if (pieza == 4) {
                if (rotacion == 0 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(4, 0, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(4, 0, x, y, true,  Frame.CUATRO);
                } else if (rotacion == 1 && Frame.equals(".", x, y) &&  Frame.equals(".", x+1, y-1)) {
                    Frame.crearPieza(4, 1, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(4, 1, x, y, true,  Frame.CUATRO);
                }
            } else if (pieza == 5) {
                if (rotacion == 0 && Frame.equals(".", x, y) &&  Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x+2, y-1)) {
                    Frame.crearPieza(5, 0, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(5, 0, x, y, true,  Frame.CINCO);
                } else if (rotacion == 1 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(5, 1, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(5, 1, x, y, true,  Frame.CINCO);
                }
            } else if (pieza == 6) {
                if (rotacion == 0 && Frame.equals(".", x, y) &&  Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(6, 0, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(6, 0, x, y, true,  Frame.SEIS);
                } else if (rotacion == 1 && Frame.equals(".", x, y) &&  Frame.equals(".", x+1, y-1)) {
                    Frame.crearPieza(6, 1, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(6, 1, x, y, true,  Frame.SEIS);
                } else if (rotacion == 2 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y-1) &&  Frame.equals(".", x+2, y-1)) {
                    Frame.crearPieza(6, 2, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(6, 2, x, y, true,  Frame.SEIS);
                } else if (rotacion == 3 && Frame.equals(".", x, y-1) &&  Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(6, 3, x, y, false,  Frame.PREDETERMINADO);
                    y--;
                    Frame.crearPieza(6, 3, x, y, true,  Frame.SEIS);
                }
            }
        }
        return x;
    }
    
    public int derecha() {
        if (x > 5 && cantAbajo && Partida.flagPausa) {
            Menu.audioTecla.setFramePosition(0);
            Menu.audioTecla.start();
            if (pieza == 0) {
                if (rotacion == 0 &&  Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+2) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(0, 0, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(0, 0, x, y, true,  Frame.CERO);
                } else if (rotacion == 1 &&  Frame.equals(".", x, y+3) &&  Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(0, 1, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(0, 1, x, y, true,  Frame.CERO);
                } else if (rotacion == 2 &&  Frame.equals(".", x, y+1) &&  Frame.equals(".", x+1, y+1) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(0, 2, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(0, 2, x, y, true,  Frame.CERO);
                } else if (rotacion == 3 &&  Frame.equals(".", x, y+3) &&  Frame.equals(".", x+1, y+3)) {
                    Frame.crearPieza(0, 3, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(0, 3, x, y, true,  Frame.CERO);
                }
            } else if (pieza == 1) {
                if (rotacion == 0 &&  Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+1) &&  Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(1, 0, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(1, 0, x, y, true,  Frame.UNO);
                } else if (rotacion == 1 &&  Frame.equals(".", x, y+3) &&  Frame.equals(".", x+1, y+3)) {
                    Frame.crearPieza(1, 1, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(1, 1, x, y, true,  Frame.UNO);
                } else if (rotacion == 2 &&  Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+2) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(1, 2, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(1, 2, x, y, true,  Frame.UNO);
                }  else if (rotacion == 3 &&  Frame.equals(".", x, y+1) &&  Frame.equals(".", x+1, y+3)) {
                    Frame.crearPieza(1, 3, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(1, 3, x, y, true,  Frame.UNO);
                }
            } else if (pieza == 2) {
                if (rotacion == 0 && Frame.equals(".", x, y+1) &&  Frame.equals(".", x+1, y+1) &&  Frame.equals(".", x+2, y+1) &&  Frame.equals(".", x+3, y+1)) {
                    Frame.crearPieza(2, 0, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(2, 0, x, y, true,  Frame.DOS);
                } else if (rotacion == 1 && y>= 0 &&  Frame.equals(".", x+1, y+4)) {
                    Frame.crearPieza(2, 1, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(2, 1, x, y, true,  Frame.DOS);
                }
            } else if (pieza == 3) {
                if (Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(3, 0, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(3, 0, x, y, true,  Frame.TRES);
                }
            } else if (pieza == 4) {
                if (rotacion == 0 &&  Frame.equals(".", x, y+1) &&  Frame.equals(".", x+1, y+2) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(4, 0, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(4, 0, x, y, true,  Frame.CUATRO);
                } else if (rotacion == 1 &&  Frame.equals(".", x, y+3) &&  Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(4, 1, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(4, 1, x, y, true,  Frame.CUATRO);
                }
            } else if (pieza == 5) {
                if (rotacion == 0 &&  Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+2) &&  Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(5, 0, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(5, 0, x, y, true,  Frame.CINCO);
                } else if (rotacion == 1 &&  Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+3)) {
                    Frame.crearPieza(5, 1, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(5, 1, x, y, true,  Frame.CINCO);
                }
            } else if (pieza == 6) {
                if (rotacion == 0 &&  Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+2) &&  Frame.equals(".", x+2, y+2)) {
                    Frame.crearPieza(6, 0, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(6, 0, x, y, true,  Frame.SEIS);
                } else if (rotacion == 1 &&  Frame.equals(".", x, y+2) &&  Frame.equals(".", x+1, y+3)) {
                    Frame.crearPieza(6, 1, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(6, 1, x, y, true,  Frame.SEIS);
                } else if (rotacion == 2 &&  Frame.equals(".", x, y+1) &&  Frame.equals(".", x+1, y+2) &&  Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(6, 2, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(6, 2, x, y, true,  Frame.SEIS);
                } else if (rotacion == 3 &&  Frame.equals(".", x, y+3) &&  Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(6, 3, x, y, false,  Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(6, 3, x, y, true,  Frame.SEIS);
                }
            }
        }
        return x;
    }

    public int girar() {
        if (x > 5 && cantAbajo && Partida.flagPausa) {
            Menu.audioTecla.setFramePosition(0);
            Menu.audioTecla.start();
            if (pieza == 0) {
                if (rotacion == 3 && Frame.equals( ".", x, y) && Frame.equals( ".", x, y+1) && Frame.equals( ".", x+2, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(0, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                } else if (rotacion == 0) {
                    if (Frame.equals( ".", x+1, y) && Frame.equals( ".", x, y+2)) {
                        rotacion = 1;
                        Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                    } else if (Frame.equals( ".", x, y-1) && Frame.equals( ".", x+1, y-1)){
                        rotacion = 1;
                        Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                    }
                } else if (rotacion == 1 && Frame.equals( ".", x+2, y) && Frame.equals( ".", x+2, y+1)) {
                    rotacion = 2;
                    Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 2, x, y, true, Frame.CERO);
                } else if (rotacion == 2) {
                    if (Frame.equals( ".", x, y+2) && Frame.equals( ".", x+1, y+1) && Frame.equals( ".", x+1, y+2)) {
                        rotacion = 3;
                        Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(0, 3, x, y, true, Frame.CERO);
                    } else if (Frame.equals( ".", x, y+1) && Frame.equals( ".", x+1, y-1) && Frame.equals( ".", x+1, y+1)){
                        rotacion = 3;
                        Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(0, 3, x, y, true, Frame.CERO);
                    }
                }
            } else if (pieza == 1) {
                if (rotacion == 3 && Frame.equals( ".", x, y+1) && Frame.equals( ".", x+2, y)) {
                    rotacion = 0;
                    Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                } else if (rotacion == 0) {
                    if (Frame.equals( ".", x, y+2) && Frame.equals( ".", x+1, y+2)) {
                        rotacion = 1;
                        Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                    } else if (Frame.equals( ".", x, y-1) && Frame.equals( ".", x+1, y+1)){
                        rotacion = 1;
                        Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                    }
                } else if (rotacion == 1 && Frame.equals( ".", x+2, y) && Frame.equals( ".", x+2, y+1) && Frame.equals( ".", x+1, y+1)) {
                    rotacion = 2;
                    Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 2, x, y, true, Frame.UNO);
                } else if (rotacion == 2) {
                    if (Frame.equals( ".", x, y) && Frame.equals( ".", x+1, y+2) && Frame.equals( ".", x+1, y)) {
                        rotacion = 3;
                        Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(1, 3, x, y, true, Frame.UNO);
                    } else if (Frame.equals( ".", x, y-1) && Frame.equals( ".", x+1, y-1) && Frame.equals( ".", x+1, y)){
                        rotacion = 3;
                        Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(1, 3, x, y, true, Frame.UNO);
                    }
                }
            } else if (pieza == 2) {
                if (rotacion == 0) {
                    if (Frame.equals(".", x+1, y-1) && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+1, y+2)){
                        rotacion = 1;
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y-1, true, Frame.DOS);
                        y--;
                    } else if (Frame.equals(".", x+1, y+1) && Frame.equals(".", x+1, y+2) && Frame.equals(".", x+1, y+3)) {
                        rotacion = 1;
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                    } else if (Frame.equals(".", x+1, y-2) && Frame.equals(".", x+1, y-1) && Frame.equals(".", x+1, y+1)) {
                        rotacion = 1;
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y-2, true, Frame.DOS);
                        y--; y--;
                    } else if (Frame.equals(".", x+1, y-3) && Frame.equals(".", x+1, y-2) && Frame.equals(".", x+1, y-1)) {
                        rotacion = 1;
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y-3, true, Frame.DOS);
                        y--; y--; y--;
                    }
                } else if (rotacion == 1) {
                    if (Frame.equals(".", x, y+1) && Frame.equals(".", x+2, y+1) && Frame.equals(".", x+3, y+1)){
                        rotacion = 0;
                        Frame.crearPieza(2, 1, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 0, x, y+1, true, Frame.DOS);
                        y++;
                    }
                }
            } else if (pieza == 4) {
                if (rotacion == 0) {
                    if (Frame.equals(".", x, y+1) && Frame.equals(".", x, y+2)) {
                        rotacion = 1;
                        Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    } else if (Frame.equals(".", x, y+1) && Frame.equals(".", x+1, y-1)) {
                        rotacion = 1;
                        Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    }
                } else if (rotacion == 1 && Frame.equals(".", x, y) && Frame.equals(".", x+2, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                }
            } else if (pieza == 5) {
                if (rotacion == 0) {
                    if (Frame.equals(".", x, y) && Frame.equals(".", x+1, y+2)) {
                        rotacion = 1;
                        Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    } else if (Frame.equals(".", x, y) && Frame.equals(".", x, y-1)) {
                        rotacion = 1;
                        Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    }
                } else if (rotacion == 1 && Frame.equals(".", x+1, y) && Frame.equals(".", x+2, y)) {
                    rotacion = 0;
                    Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                }
            } else if (pieza == 6) {
                if (rotacion == 0) {
                    if (Frame.equals(".", x+1, y+2)) {
                        rotacion = 1;
                        Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                    } else if (Frame.equals(".", x+1, y-1) && Frame.equals(".", x, y)) {
                        rotacion = 1;
                        Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                    }
                } else if (rotacion == 1 && Frame.equals(".", x+2, y+1)) {
                    rotacion = 2;
                    Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                    y++;
                    Frame.crearPieza(6, 2, x, y, true, Frame.SEIS);
                } else if (rotacion == 2) {
                    if (Frame.equals(".", x+1, y-1)) {
                        rotacion = 3;
                        Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        x++;
                        Frame.crearPieza(6, 3, x, y, true, Frame.SEIS);
                    } else if (Frame.equals(".", x+2, y+1) && Frame.equals(".", x+1, y+2)) {
                        rotacion = 3;
                        Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                        x++;
                        Frame.crearPieza(6, 3, x, y, true, Frame.SEIS);
                    }
                } else if (rotacion == 3 && Frame.equals(".", x-1, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(6, 3, x, y, false, Frame.PREDETERMINADO);
                    x--;
                    Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                }
            }
        }
        return rotacion;
    }

    int intermedio;
    boolean flagGuardar = false;
    private int cantGuardar = 0;
    public void guardar() {
        flagGuardar = false;
        if (cantGuardar == 0 && x > 5 && cantAbajo && Partida.flagPausa) {
            Menu.audioClick.setFramePosition(0);
            Menu.audioClick.start();
            cantGuardar++;
            if (Partida.guardar != -1) {
                intermedio = Partida.siguiente;
                Partida.siguiente = Partida.guardar;
            }

            if (Partida.siguiente == 0 && rotacion == 0) {
                if (pieza == 0) {
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 2) {
                    if (y == 13 && Frame.equals(".", x, y-1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                        flagGuardar = true;
                    } else if(Frame.equals(".", x, y+1) && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+2, y+1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                        flagGuardar = true;
                    }
                } else if (pieza == 3 && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(3, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 0, x, y, true, Frame.CERO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 0 && rotacion == 1) {
                if (pieza == 0) {
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 2 && Frame.equals(".", x, y) && Frame.equals(".", x, y+1) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(2, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x+1, y) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 1, x, y, true, Frame.CERO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 0 && rotacion == 2) {
                if (pieza == 0) {
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y) && Frame.equals(".", x, y)) {
                    Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 2, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 2, x, y, true, Frame.CERO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 0 && rotacion == 3) {
                if (pieza == 0) {
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 3, x, y, true, Frame.CERO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+1, y) && Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(6, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(0, 3, x, y, true, Frame.CERO);
                    flagGuardar = true;
                }
            } if (Partida.siguiente == 1 && rotacion == 0) {
                if (pieza == 0 && Frame.equals(".", x+1, y) && Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 1) {
                    flagGuardar = true;
                } else if (pieza == 2) {
                    if (y == 13 && Frame.equals(".", x, y-1) && Frame.equals(".", x+1, y-1) && Frame.equals(".", x+2, y-1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                        flagGuardar = true;
                    } else if(Frame.equals(".", x, y+1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                        flagGuardar = true;
                    }
                } else if (pieza == 3 && Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(3, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x+2, y) && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+2, y) && Frame.equals(".", x, y)) {
                    Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 0, x, y, true, Frame.UNO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 1 && rotacion == 1) {
                if (pieza == 0 && Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 1) {
                    flagGuardar = true;
                } else if (pieza == 2 && Frame.equals(".", x, y) && Frame.equals(".", x, y+1) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(2, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y) && Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 1, x, y, true, Frame.UNO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 1 && rotacion == 2) {
                if (pieza == 0 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 2, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 1) {
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+2, y+1) && pieza == 6 && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 2, x, y, true, Frame.UNO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 1 && rotacion == 3) {
                if (pieza == 0 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 2, x, y, true, Frame.UNO);
                    flagGuardar = true;
                } else if (pieza == 1) {
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y+1) && pieza == 6 && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(1, 2, x, y, true, Frame.UNO);
                    flagGuardar = true;
                }
            } if (Partida.siguiente == 2 && rotacion == 0) {
                if (pieza == 0 && Frame.equals(".", x+1, y) && Frame.equals(".", x+2, y) && Frame.equals(".", x+3, y)) {
                    Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+3, y)) {
                    Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                } else if (pieza == 2) {
                    flagGuardar = true;
                } else if (pieza == 3 && Frame.equals(".", x+2, y) && Frame.equals(".", x+3, y)) {
                    Frame.crearPieza(3, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x+2, y) && Frame.equals(".", x+3, y)) {
                    Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x, y) && Frame.equals(".", x+3, y)) {
                    Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y) && Frame.equals(".", x+2, y) && Frame.equals(".", x+3, y)) {
                    Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 2 && rotacion == 1) {
                if (pieza == 0) {
                    if (y > 2 && Frame.equals(".", x+1, y-1) && Frame.equals(".", x+1, y+2) && Frame.equals(".", x+1, y+1)) {
                        Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y+3) && Frame.equals(".", x+1, y+2) && Frame.equals(".", x+1, y+1)) {
                        Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                } else if (pieza == 1) {
                    if (y > 2 && Frame.equals(".", x+1, y-1) && Frame.equals(".", x+1, y) && Frame.equals(".", x+1, y+1)) {
                        Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y) && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+1, y+3)) {
                        Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                } else if (pieza == 2) {
                    flagGuardar = true;
                } else if (pieza == 4) {
                    if (y > 2 && Frame.equals(".", x+1, y-1) && Frame.equals(".", x+1, y+2)) {
                        Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y+2) && Frame.equals(".", x+1, y+3)) {
                        Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                } else if (pieza == 5) {
                    if (y > 2 && Frame.equals(".", x+1, y-1) && Frame.equals(".", x+1, y)) {
                        Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y) && Frame.equals(".", x+1, y+3)) {
                        Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                } else if (pieza == 6) {
                    if (y > 2 && Frame.equals(".", x+1, y-1)) {
                        Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y+3)) {
                        Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                }
            } else if (Partida.siguiente == 2 && rotacion == 2) {
                if (pieza == 0 && Frame.equals(".", x+3, y)) {
                    rotacion = 0;
                    Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+3, y) && Frame.equals(".", x+1, y) && Frame.equals(".", x, y)) {
                    rotacion = 0;
                    Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+3, y)) {
                    rotacion = 0;
                    Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(2, 0, x, y, true, Frame.DOS);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 2 && rotacion == 3) {
                if (pieza == 0) {
                    if (y > 2 && Frame.equals(".", x+1, y-1)) {
                        rotacion = 1;
                        Frame.crearPieza(0, 3, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y+3)) {
                        rotacion = 1;
                        Frame.crearPieza(0, 3, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                } else if (pieza == 1) {
                    if (y > 2 && Frame.equals(".", x+1, y-1)) {
                        rotacion = 1;
                        Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y+3)) {
                        rotacion = 1;
                        Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                } else if (pieza == 6) {
                    if (y > 2 && Frame.equals(".", x+1, y-1) && Frame.equals(".", x+1, y) && Frame.equals(".", x+1, y+2)) {
                        rotacion = 1;
                        Frame.crearPieza(6, 3, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    } else if (Frame.equals(".", x+1, y) && Frame.equals(".", x+1, y+2) && Frame.equals(".", x+1, y+3)) {
                        rotacion = 1;
                        Frame.crearPieza(6, 3, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(2, 1, x, y, true, Frame.DOS);
                        flagGuardar = true;
                    }
                }
            } if (Partida.siguiente == 3 && rotacion == 0) {
                if (pieza == 0 && Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 2 && Frame.equals(".", x, y+1) && Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 3) {
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 3 && rotacion == 1) {
                if (pieza == 0 && Frame.equals(".", x+1, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+1, y)) {
                    rotacion = 0;
                    Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 2 && Frame.equals(".", x, y) && Frame.equals(".", x, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(2, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y)) {
                    rotacion = 0;
                    Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x+1, y)) {
                    rotacion = 0;
                    Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y)) {
                    rotacion = 0;
                    Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 3 && rotacion == 2) {
                if (pieza == 0 && Frame.equals(".", x, y+1) && Frame.equals(".", x+1, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y) && Frame.equals(".", x+1, y)) {
                    rotacion = 0;
                    Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 3 && rotacion == 3) {
                if (pieza == 0 && Frame.equals(".", x, y+1) && Frame.equals(".", x, y)) {
                    rotacion = 0;
                    Frame.crearPieza(0, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+1, y)) {
                    rotacion = 0;
                    Frame.crearPieza(6, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(3, 0, x, y, true, Frame.TRES);
                    flagGuardar = true;
                }
            } if (Partida.siguiente == 4 && rotacion == 0) {
                if (pieza == 0 && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 2) {
                    if (y == 13 && Frame.equals(".", x, y-1) && Frame.equals(".", x+1, y-1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                        flagGuardar = true;
                    } else if(Frame.equals(".", x+1, y+1) && Frame.equals(".", x+2, y+1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                        flagGuardar = true;
                    }
                } else if (pieza == 3 && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(3, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 4) {
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x, y) && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 4 && rotacion == 1) {
                if (pieza == 0 && Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 2 && Frame.equals(".", x, y+1) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(2, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 4) {
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x+1, y) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 4 && rotacion == 2) {
                if (pieza == 0 && Frame.equals(".", x+1, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y) && Frame.equals(".", x+1, y)) {
                    rotacion = 0;
                    Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+2, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 0, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 4 && rotacion == 3) {
                if (pieza == 0 && Frame.equals(".", x, y+1)) {
                    rotacion = 1;
                    Frame.crearPieza(0, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y+1) && Frame.equals(".", x, y+2)) {
                    rotacion = 1;
                    Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+1, y)) {
                    rotacion = 1;
                    Frame.crearPieza(6, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(4, 1, x, y, true, Frame.CUATRO);
                    flagGuardar = true;
                }
            } if (Partida.siguiente == 5 && rotacion == 0) {
                if (pieza == 0 && Frame.equals(".", x+1, y) && Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 2) {
                    if (y == 13 && Frame.equals(".", x+2, y-1) && Frame.equals(".", x+1, y-1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                        flagGuardar = true;
                    } else if(Frame.equals(".", x+1, y+1) && Frame.equals(".", x, y+1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                        flagGuardar = true;
                    }
                } else if (pieza == 3 && Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(3, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y+1) && Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 5) {
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+2, y)) {
                    Frame.crearPieza(6, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 5 && rotacion == 1) {
                if (pieza == 0 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 2 && Frame.equals(".", x, y+1) && Frame.equals(".", x, y)) {
                    Frame.crearPieza(2, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y) && Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 5) {
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(6, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 5 && rotacion == 2) {
                if (pieza == 0 && Frame.equals(".", x, y+1) && Frame.equals(".", x+1, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y)) {
                    rotacion = 0;
                    Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y+1)) {
                    rotacion = 0;
                    Frame.crearPieza(6, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 0, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 5 && rotacion == 3) {
                if (pieza == 0 && Frame.equals(".", x, y) && Frame.equals(".", x, y+1)) {
                    rotacion = 1;
                    Frame.crearPieza(0, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y+1)) {
                    rotacion = 1;
                    Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x+1, y+2)) {
                    rotacion = 1;
                    Frame.crearPieza(6, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(5, 1, x, y, true, Frame.CINCO);
                    flagGuardar = true;
                }
            } if (Partida.siguiente == 6 && rotacion == 0) {
                if (pieza == 0 && Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(0, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(1, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 2) {
                    if (y == 13 && Frame.equals(".", x+1, y-1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        y--;
                        Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                        flagGuardar = true;
                    } else if(Frame.equals(".", x, y+1) && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+2, y+1)) {
                        Frame.crearPieza(2, 0, x, y, false, Frame.PREDETERMINADO);
                        Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                        flagGuardar = true;
                    }
                } else if (pieza == 3 && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(3, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(4, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x+2, y+1)) {
                    Frame.crearPieza(5, 0, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 0, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 6) {
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 6 && rotacion == 1) {
                if (pieza == 0 && Frame.equals(".", x+1, y+1) && Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(0, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x+1, y) && Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(1, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 2 && Frame.equals(".", x, y)) {
                    Frame.crearPieza(2, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 4 && Frame.equals(".", x+1, y+2)) {
                    Frame.crearPieza(4, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 5 && Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(5, 1, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 1, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 6) {
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 6 && rotacion == 2) {
                if (pieza == 0 && Frame.equals(".", x+1, y+1)) {
                    Frame.crearPieza(0, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 2, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y) && Frame.equals(".", x+1, y)) {
                    Frame.crearPieza(1, 2, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 2, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 6 && Frame.equals(".", x, y+1)) {
                    flagGuardar = true;
                }
            } else if (Partida.siguiente == 6 && rotacion == 3) {
                if (pieza == 0 && Frame.equals(".", x, y) && Frame.equals(".", x, y+1)) {
                    Frame.crearPieza(0, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 3, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 1 && Frame.equals(".", x, y+1) && Frame.equals(".", x, y+2)) {
                    Frame.crearPieza(1, 3, x, y, false, Frame.PREDETERMINADO);
                    Frame.crearPieza(6, 3, x, y, true, Frame.SEIS);
                    flagGuardar = true;
                } else if (pieza == 6) {
                    flagGuardar = true;
                }
            }

            if (Partida.guardar != -1 && flagGuardar) {
                Partida.guardar = pieza;
                pieza =  Partida.siguiente;
                Partida.siguiente = intermedio;
            } else if (Partida.guardar != -1) {
                Partida.siguiente = intermedio;
            }
        }

        if (Partida.guardar == -1 && flagGuardar) {
            Partida.guardar = pieza;
            do {
                Partida.random = Math.random() * 10;
            } while (Partida.random > 7 || Partida.random == pieza || Partida.random == Partida.siguiente);
            pieza = Partida.siguiente;
            Partida.siguiente = (int) Partida.random;

            Partida.AccionTiempo.actulizarSig();
        }

        //Cambiar pantalla
        String[] marco2x3 = {
            "┌──┐",
            "|~~|",
            "|~~|",
            "|~~|",
            "└──┘",
            " ~~~"
        };
        String[] marco1x4 = {
            "~┌─┐",
            "~|~|",
            "~|~|",
            "~|~|",
            "~|~|",
            " └─┘"
        };
        String[] marco2x2 = {
            "┌──┐",
            "|~~|",
            "|~~|",
            "└──┘",
            "~~~~",
            " ~~~"
        };
        
        if (Partida.guardar == 0) {
            Frame.setText(marco2x3, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(Frame.piezaCrear[0][0], 7, 17, Frame.CERO);
        } else if (Partida.guardar == 1) {
            Frame.setText(marco2x3, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(Frame.piezaCrear[1][0], 7, 17, Frame.UNO);
        } else if (Partida.guardar == 2) {
            Frame.setText(marco1x4, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(Frame.piezaCrear[2][0], 7, 18, Frame.DOS);
        } else if (Partida.guardar == 3) {
            Frame.setText(marco2x2, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(Frame.piezaCrear[3][0], 7, 17, Frame.TRES);
        } else if (Partida.guardar == 4) {
            Frame.setText(marco2x3, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(Frame.piezaCrear[4][0], 7, 17, Frame.CUATRO);
        } else if (Partida.guardar == 5) {
            Frame.setText(marco2x3, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(Frame.piezaCrear[5][0], 7, 17, Frame.CINCO);
        } else if (Partida.guardar == 6) {
            Frame.setText(marco2x3, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(Frame.piezaCrear[6][0], 7, 17, Frame.SEIS);
        }
    }
}