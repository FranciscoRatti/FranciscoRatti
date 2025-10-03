import java.awt.Color;
import java.awt.event.*;

public class OpcionesColores {
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

    public OpcionesColores() {
        String[] MatrizOpciones = {
            "                                                  ┌-----┐  ",
            "  OPCIONES:                                       |SALIR|  ",
            " ┌=======================================================┐ ",
            " =                                                       = ",
            " =                                                       = ",
            " =                       -<PIEZAS>-                      = ",
            " =                                                       = ",
            " =               ┌--┐             ┌--┐             ┌-┐   = ",
            " =               |##|             |##|             |#|   = ",
            " =               | #|             |# |             |#|   = ",
            " =               | #|             |# |             |#|   = ",
            " =               └--┘             └--┘             |#|   = ",
            " =                                                 └-┘   = ",
            " =               ┌--┐             ┌--┐                   = ",
            " =               |# |             | #|             ┌--┐  = ",
            " =               |##|             |##|             |##|  = ",
            " =               | #|             |# |             |##|  = ",
            " =               └--┘             └--┘             └--┘  = ",
            " =                                                       = ",
            " =               ┌--┐        -<SELECCIONAR COLOR>-       = ",
            " =               | #|                                    = ",
            " =               |##|          █   █   █   █   █         = ",
            " =               | #|                                    = ",
            " =               └--┘                                    = ",
            " =                             █   █   █   █   █         = ",
            " =                                                       = ",
            " =                                                       = ",
            " └=======================================================┘ "
        }; Frame.setText(MatrizOpciones, 0, 0, Frame.PREDETERMINADO);

        Frame.setText(pieza0, 8, 18, Frame.CERO);
        Frame.setText(pieza1, 8, 35, Frame.UNO);
        Frame.setText(pieza2, 8, 52, Frame.DOS);
        Frame.setText(pieza4, 14, 18, Frame.CUATRO);
        Frame.setText(pieza5, 14, 35, Frame.CINCO);
        Frame.setText(pieza3, 15, 52, Frame.TRES);
        Frame.setText(pieza6, 20, 18, Frame.SEIS);

        Frame.setText(Frame.colores[0], 9, 7, Frame.CERO);
        Frame.setText(Frame.colores[1], 9, 24, Frame.UNO);
        Frame.setText(Frame.colores[2], 9, 41, Frame.DOS);
        Frame.setText(Frame.colores[4], 15, 7, Frame.CUATRO);
        Frame.setText(Frame.colores[5], 15, 24, Frame.CINCO);
        Frame.setText(Frame.colores[3], 15, 41, Frame.TRES);
        Frame.setText(Frame.colores[6], 21, 7, Frame.SEIS);

        Frame.setText(new String[]{"+"}, 21, 31, Color.BLUE);
        Frame.setText(new String[]{"+"}, 21, 35, Color.CYAN);
        Frame.setText(new String[]{"+"}, 21, 39, Color.GREEN);
        Frame.setText(new String[]{"+"}, 21, 43, Color.YELLOW);
        Frame.setText(new String[]{"+"}, 21, 47, Color.WHITE);
        Frame.setText(new String[]{"+"}, 24, 31, new Color(255, 150, 0));
        Frame.setText(new String[]{"+"}, 24, 35, Color.PINK);
        Frame.setText(new String[]{"+"}, 24, 39, Color.RED);
        Frame.setText(new String[]{"+"}, 24, 43, Color.MAGENTA);
        Frame.setText(new String[]{"+"}, 24, 47, Color.GRAY);

        //Botones
        Menu.frame.add(Frame.botonSalirOpcionesColores);
        Menu.frame.add(Frame.botonPieza0);
        Menu.frame.add(Frame.botonPieza1);
        Menu.frame.add(Frame.botonPieza2);
        Menu.frame.add(Frame.botonPieza3);
        Menu.frame.add(Frame.botonPieza4);
        Menu.frame.add(Frame.botonPieza5);
        Menu.frame.add(Frame.botonPieza6);
        Menu.frame.add(Frame.botonAzul);
        Menu.frame.add(Frame.botonCyan);
        Menu.frame.add(Frame.botonVerde);
        Menu.frame.add(Frame.botonAmarillo);
        Menu.frame.add(Frame.botonBlanco);
        Menu.frame.add(Frame.botonNaranja);
        Menu.frame.add(Frame.botonRosa);
        Menu.frame.add(Frame.botonRojo);
        Menu.frame.add(Frame.botonMagenta);
        Menu.frame.add(Frame.botonGris);
        Menu.frame.repaint();
    }
}

//Accion boton
class AccionMouseOpcionesColores extends MouseAdapter {
    private String boton;
    public AccionMouseOpcionesColores (String nombreBoton) {boton = nombreBoton;}

    //Colores
    private final String[] ColorSi = {"< >"};
    private final String[] ColorNo = {"~ ~"};
    private final String[] ColorPre = {"┌=┐", "= =", "└=┘"};

    //Flags
    private static boolean flagAzul = true;
    private static boolean flagCyan = true;
    private static boolean flagVerde = true;
    private static boolean flagAmarillo = true;
    private static boolean flagBlanco = true;
    private static boolean flagNaranja = true;
    private static boolean flagRosa = true;
    private static boolean flagRojo = true;
    private static boolean flagMagenta = true;
    private static boolean flagGris = true;
    
    //Resetear
    private static final String[] resetColores = {
        "~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~",
        "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~",
        "~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~",
        "~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~",
        "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~",
        "~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~"
        
    };
    public static void reset() {
        flagAzul = true;
        flagCyan = true;
        flagVerde = true;
        flagAmarillo = true;
        flagBlanco = true;
        flagNaranja = true;
        flagRosa = true;
        flagRojo = true;
        flagMagenta = true;
        flagGris = true;
        Frame.setText(resetColores, 20, 30, Frame.PREDETERMINADO);
    }

    //Salir
    private final String[] salirSi = {"┌=====┐", "=+++++="};
    private final String[] salirNo = {"┌-----┐", "|+++++|"};

    //Acciones
    public void mouseEntered(MouseEvent e) {
        if (boton.equals("salir")) {Frame.setText(salirSi, 0, 50, Frame.PREDETERMINADO);}

        else if (boton.equals("azul") && flagAzul) {Frame.setText(ColorSi, 21, 30, Frame.PREDETERMINADO);}
        else if (boton.equals("cyan") && flagCyan) {Frame.setText(ColorSi, 21, 34, Frame.PREDETERMINADO);}
        else if (boton.equals("verde") && flagVerde) {Frame.setText(ColorSi, 21, 38, Frame.PREDETERMINADO);}
        else if (boton.equals("amarillo") && flagAmarillo) {Frame.setText(ColorSi, 21, 42, Frame.PREDETERMINADO);}
        else if (boton.equals("blanco") && flagBlanco) {Frame.setText(ColorSi, 21, 46, Frame.PREDETERMINADO);}
        else if (boton.equals("naranja") && flagNaranja) {Frame.setText(ColorSi, 24, 30, Frame.PREDETERMINADO);}
        else if (boton.equals("rosa") && flagRosa) {Frame.setText(ColorSi, 24, 34, Frame.PREDETERMINADO);}
        else if (boton.equals("rojo") && flagRojo) {Frame.setText(ColorSi, 24, 38, Frame.PREDETERMINADO);}
        else if (boton.equals("magenta") && flagMagenta) {Frame.setText(ColorSi, 24, 42, Frame.PREDETERMINADO);}
        else if (boton.equals("gris") && flagGris) {Frame.setText(ColorSi, 24, 46, Frame.PREDETERMINADO);}

        else if (boton.equals("0")) {Frame.setText(new String[]{"<"}, 9, 15, Frame.PREDETERMINADO);}
        else if (boton.equals("1")) {Frame.setText(new String[]{"<"}, 9, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("2")) {Frame.setText(new String[]{"<"}, 9, 49, Frame.PREDETERMINADO);}
        else if (boton.equals("4")) {Frame.setText(new String[]{"<"}, 15, 15, Frame.PREDETERMINADO);}
        else if (boton.equals("5")) {Frame.setText(new String[]{"<"}, 15, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("3")) {Frame.setText(new String[]{"<"}, 15, 49, Frame.PREDETERMINADO);}
        else if (boton.equals("6")) {Frame.setText(new String[]{"<"}, 21, 15, Frame.PREDETERMINADO);}
    }

    public void mouseExited(MouseEvent e) {
        if (boton.equals("salir")) {Frame.setText(salirNo, 0, 50, Frame.PREDETERMINADO);}

        else if (boton.equals("azul") && flagAzul) {Frame.setText(ColorNo, 21, 30, Frame.PREDETERMINADO);}
        else if (boton.equals("cyan") && flagCyan) {Frame.setText(ColorNo, 21, 34, Frame.PREDETERMINADO);}
        else if (boton.equals("verde") && flagVerde) {Frame.setText(ColorNo, 21, 38, Frame.PREDETERMINADO);}
        else if (boton.equals("amarillo") && flagAmarillo) {Frame.setText(ColorNo, 21, 42, Frame.PREDETERMINADO);}
        else if (boton.equals("blanco") && flagBlanco) {Frame.setText(ColorNo, 21, 46, Frame.PREDETERMINADO);}
        else if (boton.equals("naranja") && flagNaranja) {Frame.setText(ColorNo, 24, 30, Frame.PREDETERMINADO);}
        else if (boton.equals("rosa") && flagRosa) {Frame.setText(ColorNo, 24, 34, Frame.PREDETERMINADO);}
        else if (boton.equals("rojo") && flagRojo) {Frame.setText(ColorNo, 24, 38, Frame.PREDETERMINADO);}
        else if (boton.equals("magenta") && flagMagenta) {Frame.setText(ColorNo, 24, 42, Frame.PREDETERMINADO);}
        else if (boton.equals("gris") && flagGris) {Frame.setText(ColorNo, 24, 46, Frame.PREDETERMINADO);}

        else if (boton.equals("0")) {Frame.setText(new String[]{"~"}, 9, 15, Frame.PREDETERMINADO);}
        else if (boton.equals("1")) {Frame.setText(new String[]{"~"}, 9, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("2")) {Frame.setText(new String[]{"~"}, 9, 49, Frame.PREDETERMINADO);}
        else if (boton.equals("4")) {Frame.setText(new String[]{"~"}, 15, 15, Frame.PREDETERMINADO);}
        else if (boton.equals("5")) {Frame.setText(new String[]{"~"}, 15, 32, Frame.PREDETERMINADO);}
        else if (boton.equals("3")) {Frame.setText(new String[]{"~"}, 15, 49, Frame.PREDETERMINADO);}
        else if (boton.equals("6")) {Frame.setText(new String[]{"~"}, 21, 15, Frame.PREDETERMINADO);}
    }

    public void mousePressed(MouseEvent e) {
        Menu.audioClick.setFramePosition(0);
        Menu.audioClick.start();
        if (boton.equals("salir")) {Frame.setText(salirSi, 0, 50, Frame.FONDO);}

        else if (boton.equals("azul") && flagAzul) {reset(); flagAzul = false; Frame.setText(ColorPre, 20, 30, Frame.PREDETERMINADO);}
        else if (boton.equals("cyan") && flagCyan) {reset(); flagCyan = false; Frame.setText(ColorPre, 20, 34, Frame.PREDETERMINADO);}
        else if (boton.equals("verde") && flagVerde) {reset(); flagVerde = false; Frame.setText(ColorPre, 20, 38, Frame.PREDETERMINADO);}
        else if (boton.equals("amarillo") && flagAmarillo) {reset(); flagAmarillo = false; Frame.setText(ColorPre, 20, 42, Frame.PREDETERMINADO);}
        else if (boton.equals("blanco") && flagBlanco) {reset(); flagBlanco = false; Frame.setText(ColorPre, 20, 46, Frame.PREDETERMINADO);}
        else if (boton.equals("naranja") && flagNaranja) {reset(); flagNaranja = false; Frame.setText(ColorPre, 23, 30, Frame.PREDETERMINADO);}
        else if (boton.equals("rosa") && flagRosa) {reset(); flagRosa = false; Frame.setText(ColorPre, 23, 34, Frame.PREDETERMINADO);}
        else if (boton.equals("rojo") && flagRojo) {reset(); flagRojo = false; Frame.setText(ColorPre, 23, 38, Frame.PREDETERMINADO);}
        else if (boton.equals("magenta") && flagMagenta) {reset(); flagMagenta = false; Frame.setText(ColorPre, 23, 42, Frame.PREDETERMINADO);}
        else if (boton.equals("gris") && flagGris) {reset(); flagGris = false; Frame.setText(ColorPre, 23, 46, Frame.PREDETERMINADO);}
        
        else {
            String cambiarColor[] = {""};
            Color color = Color.BLACK;
            if (!flagAzul) {cambiarColor[0] = "~~~~AZUL"; color = Color.BLUE;}
            else if (!flagCyan) {cambiarColor[0] = "~CELESTE"; color = Color.CYAN;}
            else if (!flagVerde) {cambiarColor[0] = "~~~VERDE"; color = Color.GREEN;}
            else if (!flagAmarillo) {cambiarColor[0] = "AMARILLO"; color = Color.YELLOW;}
            else if (!flagBlanco) {cambiarColor[0] = "~~BLANCO"; color = Color.WHITE;}
            else if (!flagNaranja) {cambiarColor[0] = "~NARANJA"; color = new Color(255, 150, 0);}
            else if (!flagRosa) {cambiarColor[0] = "~~~~ROSA"; color = Color.PINK;}
            else if (!flagRojo) {cambiarColor[0] = "~~~~ROJO"; color = Color.RED;}
            else if (!flagMagenta) {cambiarColor[0] = "~MAGENTA"; color = Color.MAGENTA;}
            else if (!flagGris) {cambiarColor[0] = "~~~~GRIS"; color = Color.GRAY;}

            if (boton.equals("0")) {Frame.setText(cambiarColor, 9, 7, color); Frame.CERO = color; Frame.setText(OpcionesColores.pieza0, 8, 18, Frame.CERO); Frame.colores[0] = cambiarColor;}
            else if (boton.equals("1")) {Frame.setText(cambiarColor, 9, 24, color); Frame.UNO = color; Frame.setText(OpcionesColores.pieza1, 8, 35, Frame.UNO); Frame.colores[1] = cambiarColor;}
            else if (boton.equals("2")) {Frame.setText(cambiarColor, 9, 41, color); Frame.DOS = color; Frame.setText(OpcionesColores.pieza2, 8, 52, Frame.DOS); Frame.colores[2] = cambiarColor;}
            else if (boton.equals("4")) {Frame.setText(cambiarColor, 15, 7, color); Frame.CUATRO = color; Frame.setText(OpcionesColores.pieza4, 14, 18, Frame.CUATRO); Frame.colores[3] = cambiarColor;}
            else if (boton.equals("5")) {Frame.setText(cambiarColor, 15, 24, color); Frame.CINCO = color; Frame.setText(OpcionesColores.pieza5, 14, 35, Frame.CINCO); Frame.colores[4] = cambiarColor;}
            else if (boton.equals("3")) {Frame.setText(cambiarColor, 15, 41, color); Frame.TRES = color; Frame.setText(OpcionesColores.pieza3, 15, 52, Frame.TRES); Frame.colores[5] = cambiarColor;}
            else if (boton.equals("6")) {Frame.setText(cambiarColor, 21, 7, color); Frame.SEIS = color; Frame.setText(OpcionesColores.pieza6, 20, 18, Frame.SEIS); Frame.colores[6] = cambiarColor;}
        }
    }

    public void mouseReleased(MouseEvent e) {
        if (boton.equals("salir")) {
            Menu.frame.remove(Frame.botonSalirOpcionesColores);
            Menu.frame.remove(Frame.botonPieza0);
            Menu.frame.remove(Frame.botonPieza1);
            Menu.frame.remove(Frame.botonPieza2);
            Menu.frame.remove(Frame.botonPieza3);
            Menu.frame.remove(Frame.botonPieza4);
            Menu.frame.remove(Frame.botonPieza5);
            Menu.frame.remove(Frame.botonPieza6);
            Menu.frame.remove(Frame.botonAzul);
            Menu.frame.remove(Frame.botonCyan);
            Menu.frame.remove(Frame.botonVerde);
            Menu.frame.remove(Frame.botonAmarillo);
            Menu.frame.remove(Frame.botonBlanco);
            Menu.frame.remove(Frame.botonNaranja);
            Menu.frame.remove(Frame.botonRosa);
            Menu.frame.remove(Frame.botonRojo);
            Menu.frame.remove(Frame.botonMagenta);
            Menu.frame.remove(Frame.botonGris);
            Menu.frame.repaint();

            Frame.borraPanel();
            new Opciones();
        }
    }
}