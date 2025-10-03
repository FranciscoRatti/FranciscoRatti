import java.awt.event.*;

public class OpcionesControles {
    public static final String[] pieza0 = {
        "++",
        " +",
        " +"
    };
    public static final String[] pieza1 = {
        "++",
        "+",
        "+"
    };
    public static final String[] pieza2 = {
        "+",
        "+",
        "+",
        "+"
    };
    public static final String[] pieza3 = {
        "++",
        "++"
    };
    public static final String[] pieza4 = {
        "+",
        "++",
        " +"
    };
    public static final String[] pieza5 = {
        " +",
        "++",
        "+"
    };
    public static final String[] pieza6 = {
        " +",
        "++",
        " +"
    };

    public OpcionesControles() {
        String[] MatrizOpciones = {
            "                                                  ┌-----┐  ",
            "  OPCIONES:                                       |SALIR|  ",
            " ┌=======================================================┐ ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                     -<CONTROLES>-                     = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                      GIRAR = < >                      = ",
            " =                                                       = ",
            " =                    DERECHA = < >                      = ",
            " =                                                       = ",
            " =                      ABAJO = < >                      = ",
            " =                                                       = ",
            " =                  IZQUIERDA = < >                      = ",
            " =                                                       = ",
            " =                    GUARDAR = < >                      = ",
            " =                                                       = ",
            " =                      FONDO = < >                      = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " └=======================================================┘ "
        }; Frame.setText(MatrizOpciones, 0, 0, Frame.PREDETERMINADO);

        String[] controles = {
            String.valueOf(Frame.controles[0]), "",
            String.valueOf(Frame.controles[1]), "",
            String.valueOf(Frame.controles[2]), "",
            String.valueOf(Frame.controles[3]), "",
            String.valueOf(Frame.controles[4]), "",
            String.valueOf(Frame.controles[5])
        }; Frame.setText(controles, 10, 33, Frame.PREDETERMINADO);

        //Botones
        Menu.frame.add(Frame.botonSalirOpcionesControles);
        Menu.frame.add(Frame.botonGirar);
        Menu.frame.add(Frame.botonDerecha);
        Menu.frame.add(Frame.botonAbajo);
        Menu.frame.add(Frame.botonIzquierda);
        Menu.frame.add(Frame.botonGuardar);
        Menu.frame.add(Frame.botonFondo);
        Menu.frame.repaint();
    }

    public static void setControles(char letra) {
        if (!AccionMouseOpcionesControles.flagGirar) {
            Frame.controles[0] = letra;
            AccionMouseOpcionesControles.reset();
        } else if (!AccionMouseOpcionesControles.flagDerecha) {
            Frame.controles[1] = letra;
            AccionMouseOpcionesControles.reset();
        } else if (!AccionMouseOpcionesControles.flagAbajo) {
            Frame.controles[2] = letra;
            AccionMouseOpcionesControles.reset();
        } else if (!AccionMouseOpcionesControles.flagIzquierda) {
            Frame.controles[3] = letra;
            AccionMouseOpcionesControles.reset();
        } else if (!AccionMouseOpcionesControles.flagGuardar) {
            Frame.controles[4] = letra;
            AccionMouseOpcionesControles.reset();
        } else if (!AccionMouseOpcionesControles.flagFondo) {
            Frame.controles[5] = letra;
            AccionMouseOpcionesControles.reset();
        }
    }
}

//Accion boton
class AccionMouseOpcionesControles extends MouseAdapter {
    private String boton;
    public AccionMouseOpcionesControles (String nombreBoton) {boton = nombreBoton;}

    //Controles
    private final String[] controlesSi = {"{ }"};
    private final String[] controlesNo = {"< >"};
    private final String[] controlesPre = {"{_}"};

    //Salir
    private final String[] salirSi = {"┌=====┐", "=+++++="};
    private final String[] salirNo = {"┌-----┐", "|+++++|"};

    //Flags
    public static boolean flagGirar = true;
    public static boolean flagDerecha = true;
    public static boolean flagAbajo = true;
    public static boolean flagIzquierda = true;
    public static boolean flagGuardar = true;
    public static boolean flagFondo = true;
    
    //Resetear
    public static void reset() {
        flagGirar = true;
        flagDerecha = true;
        flagAbajo = true;
        flagIzquierda = true;
        flagGuardar = true;
        flagFondo = true;

        String[] resetControles = {
            "<" + String.valueOf(Frame.controles[0]) + ">",
            "",
            "<" + String.valueOf(Frame.controles[1]) + ">",
            "",
            "<" + String.valueOf(Frame.controles[2]) + ">",
            "",
            "<" + String.valueOf(Frame.controles[3]) + ">",
            "",
            "<" + String.valueOf(Frame.controles[4]) + ">",
            "",
            "<" + String.valueOf(Frame.controles[5]) + ">",
        };
        Frame.setText(resetControles, 10, 32, Frame.PREDETERMINADO);
    }

    //Acciones
    public void mouseEntered(MouseEvent e) {
        if (boton.equals("salir")) {Frame.setText(salirSi, 0, 50, Frame.PREDETERMINADO);}
        else if (boton.equals("girar")) {Frame.setText(controlesSi, 10, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("derecha")) {Frame.setText(controlesSi, 12, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("abajo")) {Frame.setText(controlesSi, 14, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("izquierda")) {Frame.setText(controlesSi, 16, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("guardar")) {Frame.setText(controlesSi, 18, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("fondo")) {Frame.setText(controlesSi, 20, 32, Frame.PREDETERMINADO);}
    }

    public void mouseExited(MouseEvent e) {
        if (boton.equals("salir")) {Frame.setText(salirNo, 0, 50, Frame.PREDETERMINADO);}
        else if (boton.equals("girar") && flagGirar) {Frame.setText(controlesNo, 10, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("derecha") && flagDerecha) {Frame.setText(controlesNo, 12, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("abajo") && flagAbajo) {Frame.setText(controlesNo, 14, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("izquierda") && flagIzquierda) {Frame.setText(controlesNo, 16, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("guardar") && flagGuardar) {Frame.setText(controlesNo, 18, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("fondo") && flagFondo) {Frame.setText(controlesNo, 20, 32, Frame.PREDETERMINADO);}
    }

    public void mousePressed(MouseEvent e) {
        Menu.audioClick.setFramePosition(0);
        Menu.audioClick.start();
        if (boton.equals("salir")) {Frame.setText(salirSi, 0, 50, Frame.FONDO);}
        else if (boton.equals("girar")) {Frame.setText(controlesPre, 10, 32, Frame.FONDO);}
        else if (boton.equals("derecha")) {Frame.setText(controlesPre, 12, 32, Frame.FONDO);}
        else if (boton.equals("abajo")) {Frame.setText(controlesPre, 14, 32, Frame.FONDO);}
        else if (boton.equals("izquierda")) {Frame.setText(controlesPre, 16, 32, Frame.FONDO);}
        else if (boton.equals("guardar")) {Frame.setText(controlesPre, 18, 32, Frame.FONDO);}
        else if (boton.equals("fondo")) {Frame.setText(controlesPre, 20, 32, Frame.FONDO);}
    }

    public void mouseReleased(MouseEvent e) {
        if (boton.equals("salir")) {
            Menu.frame.remove(Frame.botonSalirOpcionesControles);
            Menu.frame.remove(Frame.botonGirar);
            Menu.frame.remove(Frame.botonDerecha);
            Menu.frame.remove(Frame.botonAbajo);
            Menu.frame.remove(Frame.botonIzquierda);
            Menu.frame.remove(Frame.botonGuardar);
            Menu.frame.remove(Frame.botonFondo);
            Menu.frame.repaint();

            Frame.borraPanel();
            new Opciones();
        }
        else if (boton.equals("girar")) {reset(); flagGirar = false; Frame.setText(controlesPre, 10, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("derecha")) {reset(); flagDerecha = false; Frame.setText(controlesPre, 12, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("abajo")) {reset(); flagAbajo = false; Frame.setText(controlesPre, 14, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("izquierda")) {reset(); flagIzquierda = false; Frame.setText(controlesPre, 16, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("guardar")) {reset(); flagGuardar = false; Frame.setText(controlesPre, 18, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("fondo")) {reset(); flagFondo = false; Frame.setText(controlesPre, 20, 32, Frame.PREDETERMINADO);}
    }
}