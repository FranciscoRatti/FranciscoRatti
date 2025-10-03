import java.awt.event.*;

public class Opciones {
    public Opciones() {
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
            " =                       ┌-------┐                       = ",
            " =                       |COLORES|                       = ",
            " =                       └-------┘                       = ",
            " =                                                       = ",
            " =                      ┌---------┐                      = ",
            " =                      |CONTROLES|                      = ",
            " =                      └---------┘                      = ",
            " =                                                       = ",
            " =                       ┌-------┐                       = ",
            " =                       |VOLUMEN|                       = ",
            " =                       └-------┘                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " =                                                       = ",
            " └=======================================================┘ ",
        }; Frame.setText(MatrizOpciones, 0, 0, Frame.PREDETERMINADO);

        //Botones
        Menu.frame.add(Frame.botonSalirOpciones);
        Menu.frame.add(Frame.botonColores);
        Menu.frame.add(Frame.botonControles);
        Menu.frame.add(Frame.botonVolumen);
        Menu.frame.repaint();
    }

    public static void reproducir() {
        Menu.audioTecla.setFramePosition(0);
        Menu.audioTecla.start();
    }
}

//Accion boton
class AccionMouseOpciones extends MouseAdapter {
    private String boton;
    public AccionMouseOpciones(String nombreBoton) {boton = nombreBoton;}

    //Elejir
    private final String[] marco1Si = {"┌=======┐", "=+++++++=", "└=======┘"};
    private final String[] marco1No = {"┌-------┐", "|+++++++|", "└-------┘"};
    private final String[] marco2Si = {"┌=========┐", "=+++++++++=", "└=========┘"};
    private final String[] marco2No = {"┌---------┐", "|+++++++++|", "└---------┘"};

    //Salir
    private final String[] salirSi = {"┌=====┐", "=+++++="};
    private final String[] salirNo = {"┌-----┐", "|+++++|"};

    //Acciones
    public void mouseEntered(MouseEvent e) {
        if (boton.equals("salir")){Frame.setText(salirSi, 0, 50, Frame.PREDETERMINADO);}
        else if (boton.equals("colores")){Frame.setText(marco1Si, 9, 25, Frame.PREDETERMINADO);}
        else if (boton.equals("controles")){Frame.setText(marco2Si, 13, 24, Frame.PREDETERMINADO);}
        else if (boton.equals("volumen")){Frame.setText(marco1Si, 17, 25, Frame.PREDETERMINADO);}
    }

    public void mouseExited(MouseEvent e) {
        if (boton.equals("salir")) {Frame.setText(salirNo, 0, 50, Frame.PREDETERMINADO);}
        else if (boton.equals("colores")){Frame.setText(marco1No, 9, 25, Frame.PREDETERMINADO);}
        else if (boton.equals("controles")){Frame.setText(marco2No, 13, 24, Frame.PREDETERMINADO);}
        else if (boton.equals("volumen")){Frame.setText(marco1No, 17, 25, Frame.PREDETERMINADO);}
    }

    public void mousePressed(MouseEvent e) {
        Menu.audioClick.setFramePosition(0);
        Menu.audioClick.start();
        if (boton.equals("salir")) {Frame.setText(salirSi, 0, 50, Frame.FONDO);}
        else if (boton.equals("colores")){Frame.setText(marco1Si, 9, 25, Frame.FONDO);}
        else if (boton.equals("controles")){Frame.setText(marco2Si, 13, 24, Frame.FONDO);}
        else if (boton.equals("volumen")){Frame.setText(marco1Si, 17, 25, Frame.FONDO);}
    }

    public void mouseReleased(MouseEvent e) {
        if (boton.equals("salir")) {
            Menu.frame.remove(Frame.botonSalirOpciones);
            Menu.frame.remove(Frame.botonColores);
            Menu.frame.remove(Frame.botonControles);
            Menu.frame.remove(Frame.botonVolumen);
            Menu.frame.repaint();

            new Menu(true);
            Menu.flagJugar = true;
            Menu.flagOpciones = true;
            Frame.borraPanel();
            new Menu();
        } else {
            Menu.frame.remove(Frame.botonSalirOpciones);
            Menu.frame.remove(Frame.botonColores);
            Menu.frame.remove(Frame.botonControles);
            Menu.frame.remove(Frame.botonVolumen);
            Frame.borraPanel();

            if (boton.equals("colores")){new OpcionesColores();}
            else if (boton.equals("controles")){new OpcionesControles();}
            else if (boton.equals("volumen")){new OpcionesVolumen();}
        }
    }
}