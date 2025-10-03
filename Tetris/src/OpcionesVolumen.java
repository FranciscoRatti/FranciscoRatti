import java.awt.event.*;

public class OpcionesVolumen {
    public OpcionesVolumen() {
        String[] MatrizOpciones = {
            "                                                  ┌-----┐  ",
            "  OPCIONES:                                       |SALIR|  ",
            " ┌=======================================================┐ ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                      -<VOLUMEN>-                      = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                MUSICA = |----------|                  = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =               EFECTOS = |----------|                  = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " └=======================================================┘ "
        }; Frame.setText(MatrizOpciones, 0, 0, Frame.PREDETERMINADO);

        Frame.setText(new String[]{"▲", "■", "▼"}, 11, 28 + Frame.volumenMusica, Frame.PREDETERMINADO);
        Frame.setText(new String[]{"▲", "■", "▼"}, 15, 28 + Frame.volumenEfectos, Frame.PREDETERMINADO);

        //Botones
        Menu.frame.add(Frame.botonSalirOpcionesVolumen);
        Menu.frame.add(Frame.botonMusica1);
        Menu.frame.add(Frame.botonMusica2);
        Menu.frame.add(Frame.botonMusica3);
        Menu.frame.add(Frame.botonMusica4);
        Menu.frame.add(Frame.botonMusica5);
        Menu.frame.add(Frame.botonMusica6);
        Menu.frame.add(Frame.botonMusica7);
        Menu.frame.add(Frame.botonMusica8);
        Menu.frame.add(Frame.botonMusica9);
        Menu.frame.add(Frame.botonMusica10);
        Menu.frame.add(Frame.botonEfectos1);
        Menu.frame.add(Frame.botonEfectos2);
        Menu.frame.add(Frame.botonEfectos3);
        Menu.frame.add(Frame.botonEfectos4);
        Menu.frame.add(Frame.botonEfectos5);
        Menu.frame.add(Frame.botonEfectos6);
        Menu.frame.add(Frame.botonEfectos7);
        Menu.frame.add(Frame.botonEfectos8);
        Menu.frame.add(Frame.botonEfectos9);
        Menu.frame.add(Frame.botonEfectos10);
        Menu.frame.repaint();
    }
}

//Accion boton
class AccionMouseOpcionesVolumen extends MouseAdapter {
    private String boton;
    public AccionMouseOpcionesVolumen (String nombreBoton) {boton = nombreBoton;}

    //Salir
    private final String[] salirSi = {"┌=====┐", "=+++++="};
    private final String[] salirNo = {"┌-----┐", "|+++++|"};

    private static final String[] resetVolumen = {"~~~~~~~~~~", "----------", "~~~~~~~~~~"};
    public static void reset(int tipo) {
        if (tipo == 0) {
            Frame.setText(resetVolumen, 11, 28, Frame.PREDETERMINADO);
            Frame.setText(new String[]{"▲", "■", "▼"}, 11, 28 + Frame.volumenMusica, Frame.PREDETERMINADO);
        }
        else if (tipo == 1) {
            Frame.setText(resetVolumen, 15, 28, Frame.PREDETERMINADO);
            Frame.setText(new String[]{"▲", "■", "▼"}, 15, 28 + Frame.volumenEfectos, Frame.PREDETERMINADO);
        }
    }

    //Acciones
    public void mouseEntered(MouseEvent e) {
        if (boton.equals("salir")) {Frame.setText(salirSi, 0, 50, Frame.PREDETERMINADO);}
        
        else if (boton.equals("musica1") && Frame.equals("-", 12, 28)) {Frame.MATRIZ[12][28].setText("=");}
        else if (boton.equals("musica2") && Frame.equals("-", 12, 29)) {Frame.MATRIZ[12][29].setText("=");}
        else if (boton.equals("musica3") && Frame.equals("-", 12, 30)) {Frame.MATRIZ[12][30].setText("=");}
        else if (boton.equals("musica4") && Frame.equals("-", 12, 31)) {Frame.MATRIZ[12][31].setText("=");}
        else if (boton.equals("musica5") && Frame.equals("-", 12, 32)) {Frame.MATRIZ[12][32].setText("=");}
        else if (boton.equals("musica6") && Frame.equals("-", 12, 33)) {Frame.MATRIZ[12][33].setText("=");}
        else if (boton.equals("musica7") && Frame.equals("-", 12, 34)) {Frame.MATRIZ[12][34].setText("=");}
        else if (boton.equals("musica8") && Frame.equals("-", 12, 35)) {Frame.MATRIZ[12][35].setText("=");}
        else if (boton.equals("musica9") && Frame.equals("-", 12, 36)) {Frame.MATRIZ[12][36].setText("=");}
        else if (boton.equals("musica10") && Frame.equals("-", 12, 37)) {Frame.MATRIZ[12][37].setText("=");}

        else if (boton.equals("efectos1") && Frame.equals("-", 16, 28)) {Frame.MATRIZ[16][28].setText("=");}
        else if (boton.equals("efectos2") && Frame.equals("-", 16, 29)) {Frame.MATRIZ[16][29].setText("=");}
        else if (boton.equals("efectos3") && Frame.equals("-", 16, 30)) {Frame.MATRIZ[16][30].setText("=");}
        else if (boton.equals("efectos4") && Frame.equals("-", 16, 31)) {Frame.MATRIZ[16][31].setText("=");}
        else if (boton.equals("efectos5") && Frame.equals("-", 16, 32)) {Frame.MATRIZ[16][32].setText("=");}
        else if (boton.equals("efectos6") && Frame.equals("-", 16, 33)) {Frame.MATRIZ[16][33].setText("=");}
        else if (boton.equals("efectos7") && Frame.equals("-", 16, 34)) {Frame.MATRIZ[16][34].setText("=");}
        else if (boton.equals("efectos8") && Frame.equals("-", 16, 35)) {Frame.MATRIZ[16][35].setText("=");}
        else if (boton.equals("efectos9") && Frame.equals("-", 16, 36)) {Frame.MATRIZ[16][36].setText("=");}
        else if (boton.equals("efectos10") && Frame.equals("-", 16, 37)) {Frame.MATRIZ[16][37].setText("=");}
    }

    public void mouseExited(MouseEvent e) {
        if (boton.equals("salir")) {Frame.setText(salirNo, 0, 50, Frame.PREDETERMINADO);}
        
        else if (boton.equals("musica1") && Frame.equals("=", 12, 28)) {Frame.MATRIZ[12][28].setText("-");}
        else if (boton.equals("musica2") && Frame.equals("=", 12, 29)) {Frame.MATRIZ[12][29].setText("-");}
        else if (boton.equals("musica3") && Frame.equals("=", 12, 30)) {Frame.MATRIZ[12][30].setText("-");}
        else if (boton.equals("musica4") && Frame.equals("=", 12, 31)) {Frame.MATRIZ[12][31].setText("-");}
        else if (boton.equals("musica5") && Frame.equals("=", 12, 32)) {Frame.MATRIZ[12][32].setText("-");}
        else if (boton.equals("musica6") && Frame.equals("=", 12, 33)) {Frame.MATRIZ[12][33].setText("-");}
        else if (boton.equals("musica7") && Frame.equals("=", 12, 34)) {Frame.MATRIZ[12][34].setText("-");}
        else if (boton.equals("musica8") && Frame.equals("=", 12, 35)) {Frame.MATRIZ[12][35].setText("-");}
        else if (boton.equals("musica9") && Frame.equals("=", 12, 36)) {Frame.MATRIZ[12][36].setText("-");}
        else if (boton.equals("musica10") && Frame.equals("=", 12, 37)) {Frame.MATRIZ[12][37].setText("-");}

        else if (boton.equals("efectos1") && Frame.equals("=", 16, 28)) {Frame.MATRIZ[16][28].setText("-");}
        else if (boton.equals("efectos2") && Frame.equals("=", 16, 29)) {Frame.MATRIZ[16][29].setText("-");}
        else if (boton.equals("efectos3") && Frame.equals("=", 16, 30)) {Frame.MATRIZ[16][30].setText("-");}
        else if (boton.equals("efectos4") && Frame.equals("=", 16, 31)) {Frame.MATRIZ[16][31].setText("-");}
        else if (boton.equals("efectos5") && Frame.equals("=", 16, 32)) {Frame.MATRIZ[16][32].setText("-");}
        else if (boton.equals("efectos6") && Frame.equals("=", 16, 33)) {Frame.MATRIZ[16][33].setText("-");}
        else if (boton.equals("efectos7") && Frame.equals("=", 16, 34)) {Frame.MATRIZ[16][34].setText("-");}
        else if (boton.equals("efectos8") && Frame.equals("=", 16, 35)) {Frame.MATRIZ[16][35].setText("-");}
        else if (boton.equals("efectos9") && Frame.equals("=", 16, 36)) {Frame.MATRIZ[16][36].setText("-");}
        else if (boton.equals("efectos10") && Frame.equals("=", 16, 37)) {Frame.MATRIZ[16][37].setText("-");}
    }

    public void mousePressed(MouseEvent e) {
        Menu.audioClick.setFramePosition(0);
        Menu.audioClick.start();
        if (boton.equals("salir")) {Frame.setText(salirSi, 0, 50, Frame.FONDO);}

        else if (boton.equals("musica1") && Frame.equals("=", 12, 28)) {Frame.MATRIZ[12][28].setForeground(Frame.FONDO); Frame.volumenMusica = 0;}
        else if (boton.equals("musica2") && Frame.equals("=", 12, 29)) {Frame.MATRIZ[12][29].setForeground(Frame.FONDO); Frame.volumenMusica = 1;}
        else if (boton.equals("musica3") && Frame.equals("=", 12, 30)) {Frame.MATRIZ[12][30].setForeground(Frame.FONDO); Frame.volumenMusica = 2;}
        else if (boton.equals("musica4") && Frame.equals("=", 12, 31)) {Frame.MATRIZ[12][31].setForeground(Frame.FONDO); Frame.volumenMusica = 3;}
        else if (boton.equals("musica5") && Frame.equals("=", 12, 32)) {Frame.MATRIZ[12][32].setForeground(Frame.FONDO); Frame.volumenMusica = 4;}
        else if (boton.equals("musica6") && Frame.equals("=", 12, 33)) {Frame.MATRIZ[12][33].setForeground(Frame.FONDO); Frame.volumenMusica = 5;}
        else if (boton.equals("musica7") && Frame.equals("=", 12, 34)) {Frame.MATRIZ[12][34].setForeground(Frame.FONDO); Frame.volumenMusica = 6;}
        else if (boton.equals("musica8") && Frame.equals("=", 12, 35)) {Frame.MATRIZ[12][35].setForeground(Frame.FONDO); Frame.volumenMusica = 7;}
        else if (boton.equals("musica9") && Frame.equals("=", 12, 36)) {Frame.MATRIZ[12][36].setForeground(Frame.FONDO); Frame.volumenMusica = 8;}
        else if (boton.equals("musica10") && Frame.equals("=", 12, 37)) {Frame.MATRIZ[12][37].setForeground(Frame.FONDO); Frame.volumenMusica = 9;}

        else if (boton.equals("efectos1") && Frame.equals("=", 16, 28)) {Frame.MATRIZ[16][28].setForeground(Frame.FONDO); Frame.volumenEfectos = 0;}
        else if (boton.equals("efectos2") && Frame.equals("=", 16, 29)) {Frame.MATRIZ[16][29].setForeground(Frame.FONDO); Frame.volumenEfectos = 1;}
        else if (boton.equals("efectos3") && Frame.equals("=", 16, 30)) {Frame.MATRIZ[16][30].setForeground(Frame.FONDO); Frame.volumenEfectos = 2;}
        else if (boton.equals("efectos4") && Frame.equals("=", 16, 31)) {Frame.MATRIZ[16][31].setForeground(Frame.FONDO); Frame.volumenEfectos = 3;}
        else if (boton.equals("efectos5") && Frame.equals("=", 16, 32)) {Frame.MATRIZ[16][32].setForeground(Frame.FONDO); Frame.volumenEfectos = 4;}
        else if (boton.equals("efectos6") && Frame.equals("=", 16, 33)) {Frame.MATRIZ[16][33].setForeground(Frame.FONDO); Frame.volumenEfectos = 5;}
        else if (boton.equals("efectos7") && Frame.equals("=", 16, 34)) {Frame.MATRIZ[16][34].setForeground(Frame.FONDO); Frame.volumenEfectos = 6;}
        else if (boton.equals("efectos8") && Frame.equals("=", 16, 35)) {Frame.MATRIZ[16][35].setForeground(Frame.FONDO); Frame.volumenEfectos = 7;}
        else if (boton.equals("efectos9") && Frame.equals("=", 16, 36)) {Frame.MATRIZ[16][36].setForeground(Frame.FONDO); Frame.volumenEfectos = 8;}
        else if (boton.equals("efectos10") && Frame.equals("=", 16, 37)) {Frame.MATRIZ[16][37].setForeground(Frame.FONDO); Frame.volumenEfectos = 9;}
    }

    public void mouseReleased(MouseEvent e) {
        if (boton.equals("salir")) {
            Menu.frame.remove(Frame.botonSalirOpcionesVolumen);
            Menu.frame.remove(Frame.botonMusica1);
            Menu.frame.remove(Frame.botonMusica2);
            Menu.frame.remove(Frame.botonMusica3);
            Menu.frame.remove(Frame.botonMusica4);
            Menu.frame.remove(Frame.botonMusica5);
            Menu.frame.remove(Frame.botonMusica6);
            Menu.frame.remove(Frame.botonMusica7);
            Menu.frame.remove(Frame.botonMusica8);
            Menu.frame.remove(Frame.botonMusica9);
            Menu.frame.remove(Frame.botonMusica10);
            Menu.frame.remove(Frame.botonEfectos1);
            Menu.frame.remove(Frame.botonEfectos2);
            Menu.frame.remove(Frame.botonEfectos3);
            Menu.frame.remove(Frame.botonEfectos4);
            Menu.frame.remove(Frame.botonEfectos5);
            Menu.frame.remove(Frame.botonEfectos6);
            Menu.frame.remove(Frame.botonEfectos7);
            Menu.frame.remove(Frame.botonEfectos8);
            Menu.frame.remove(Frame.botonEfectos9);
            Menu.frame.remove(Frame.botonEfectos10);
            Menu.frame.repaint();

            Frame.borraPanel();
            new Opciones();
        } else {
            if (boton.equals("musica1")) {reset(0); setValue(0, -80);}
            else if (boton.equals("musica2")) {reset(0); setValue(0, -74);}
            else if (boton.equals("musica3")) {reset(0); setValue(0, -57);}
            else if (boton.equals("musica4")) {reset(0); setValue(0, -42);}
            else if (boton.equals("musica5")) {reset(0); setValue(0, -29);}
            else if (boton.equals("musica6")) {reset(0); setValue(0, -18);}
            else if (boton.equals("musica7")) {reset(0); setValue(0, -9);}
            else if (boton.equals("musica8")) {reset(0); setValue(0, -2);}
            else if (boton.equals("musica9")) {reset(0); setValue(0, 3);}
            else if (boton.equals("musica10")) {reset(0); setValue(0, 6);}

            else if (boton.equals("efectos1")) {reset(1); setValue(1, -80);}
            else if (boton.equals("efectos2")) {reset(1); setValue(1, -74);}
            else if (boton.equals("efectos3")) {reset(1); setValue(1, -57);}
            else if (boton.equals("efectos4")) {reset(1); setValue(1, -42);}
            else if (boton.equals("efectos5")) {reset(1); setValue(1, -29);}
            else if (boton.equals("efectos6")) {reset(1); setValue(1, -18);}
            else if (boton.equals("efectos7")) {reset(1); setValue(1, -9);}
            else if (boton.equals("efectos8")) {reset(1); setValue(1, -2);}
            else if (boton.equals("efectos9")) {reset(1); setValue(1, 3);}
            else if (boton.equals("efectos10")) {reset(1); setValue(1, 6);}
        }
    }

    public void setValue (int tipo, int valor) {
        if (tipo == 0) {
            Menu.controlTitulo.setValue(valor);
            Menu.controlPartida.setValue(valor);
            Menu.controlGameOver.setValue(valor);
        } else if (tipo == 1) {
            Menu.controlClick.setValue(valor);
            Menu.controlFondo.setValue(valor);
            Menu.controlLinea.setValue(valor);
            Menu.controlTecla.setValue(valor);
        }
    } 
}