import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class Menu{

    public static Clip audioTitulo, audioPartida, audioClick, audioTecla, audioFondo, audioLinea, audioGameOver;
    public static FloatControl controlTitulo, controlPartida, controlClick, controlTecla, controlFondo, controlLinea, controlGameOver;
    public static Frame frame;
    public static Partida partida;
    public static void main(String[] args) {
        try {
            audioTitulo = AudioSystem.getClip();
            audioTitulo.open(AudioSystem.getAudioInputStream(new File("Audios/titulo.wav")));
            controlTitulo = (FloatControl) audioTitulo.getControl(FloatControl.Type.MASTER_GAIN);
            controlTitulo.setValue(-9);

            Timer timer = new Timer(100, new AbstractAction() {public void actionPerformed (ActionEvent e) {
                audioTitulo.loop(Clip.LOOP_CONTINUOUSLY);
            }});
            timer.setRepeats(false);
            timer.start();

            audioPartida = AudioSystem.getClip();
            audioPartida.open(AudioSystem.getAudioInputStream(new File("Audios/partida.wav")));
            controlPartida = (FloatControl) audioPartida.getControl(FloatControl.Type.MASTER_GAIN);
            controlPartida.setValue(-9);

            audioClick = AudioSystem.getClip();
            audioClick.open(AudioSystem.getAudioInputStream(new File("Audios/click.wav")));
            controlClick = (FloatControl) audioClick.getControl(FloatControl.Type.MASTER_GAIN);
            controlClick.setValue(-9);

            audioTecla = AudioSystem.getClip();
            audioTecla.open(AudioSystem.getAudioInputStream(new File("Audios/tecla.wav")));
            controlTecla = (FloatControl) audioTecla.getControl(FloatControl.Type.MASTER_GAIN);
            controlTecla.setValue(-9);

            audioFondo = AudioSystem.getClip();
            audioFondo.open(AudioSystem.getAudioInputStream(new File("Audios/fondo.wav")));
            controlFondo = (FloatControl) audioFondo.getControl(FloatControl.Type.MASTER_GAIN);
            controlFondo.setValue(-9);

            audioLinea = AudioSystem.getClip();
            audioLinea.open(AudioSystem.getAudioInputStream(new File("Audios/linea.wav")));
            controlLinea = (FloatControl) audioLinea.getControl(FloatControl.Type.MASTER_GAIN);
            controlLinea.setValue(-9);

            audioGameOver = AudioSystem.getClip();
            audioGameOver.open(AudioSystem.getAudioInputStream(new File("Audios/gameOver.wav")));
            controlGameOver = (FloatControl) audioGameOver.getControl(FloatControl.Type.MASTER_GAIN);
            controlGameOver.setValue(-9);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {e.printStackTrace();}
        
        frame = new Frame();

        Menu menu = new Menu();
        menu.TIEMPO1.start();
        menu.TIEMPO2.setInitialDelay(2000);
        menu.TIEMPO2.start();
        menu.TIEMPO3.setInitialDelay(4000);
        menu.TIEMPO3.start();
        menu.TIEMPO4.setInitialDelay(6000);
        menu.TIEMPO4.start();
    }

    public final Timer TIEMPO1 = new Timer(8000, new accionTiempo(0, 15));
    public final Timer TIEMPO2 = new Timer(8000, new accionTiempo(18, 27));
    public final Timer TIEMPO3 = new Timer(8000, new accionTiempo(30, 45));
    public final Timer TIEMPO4 = new Timer(8000, new accionTiempo(49, 58));
    public Menu(boolean activar) {
        if (activar) {
            TIEMPO1.start();
            TIEMPO2.setInitialDelay(2000);
            TIEMPO2.start();
            TIEMPO3.setInitialDelay(4000);
            TIEMPO3.start();
            TIEMPO4.setInitialDelay(6000);
            TIEMPO4.start();
        } else {
            TIEMPO1.stop();
            TIEMPO2.stop();
            TIEMPO3.stop();
            TIEMPO4.stop();
        }
    }

    //Flags
    public static boolean flagEscribir = false;
    public static boolean flagOpciones = true;
    public static boolean flagJugar = true;

    public Menu(){
        String[] MatrizMenu = {
            "$$                    &&  $?          &&&        %&        ",
            "??                    %%  ??          %%%        $%        ",
            " ?           //       $$       ¿      $$$        ?$        ",
            " ?           //       ??      ¿/¿     ???        ??        ",
            "             &&       ?       /&/     ?           ?        ",
            "   ¿         %%   ¿¿  ?    ¿  &%&          ¿¿¿            ¿",
            "   /         $$   ┌=====================┐  ///           ¿/",
            "   &         ??   =### ### ### ### # ###=  &&&           /&",
            "   %         ??   = #  #    #  # #   #  =  %%%           &%",
            "   $             <= #  ##   #  ##  # ###=> $$$           %$",
            "   ?              = #  #    #  # # #   #=  ???           $?",
            "   ?              = #  ###  #  # # # ###=   ?            ??",
            "   ?       ¿      └=====================┘                ? ",
            "   ?       /¿     //¿                   ¿          ¿       ",
            "           &/     &&/     ┌-----┐     ¿¿/          /¿¿     ",
            "     ¿     %&     %%&     |JUGAR|     //&          &//     ",
            "     /     $%     $$%     └-----┘     &&%   ¿      %&&     ",
            "     &¿    ?$     ??$                 %%$  ¿/      $%%     ",
            "     %/    ??      ??    ┌-------┐    $$?  /&      ?$$     ",
            "     $&    ?             |OPTIONS|    ???  &%      ???     ",
            "     ?%                  └-------┘         %$              ",
            "     ?$                                    $?              ",
            "     ??       ¿¿          ┌-----┐          ??              ",
            "             ¿//          |SALIR|           ?         ¿¿¿  ",
            "             /&&          └-----┘                     ///  ",
            "             &%%           /  %$%                     &&&  ",
            "¿¿           %$$          ¿&  $?$                     %%%  ",
            "//           $??          /%  ???                ¿    $$$  ",
            "&&           ??       ¿¿  &$          ¿¿¿        /¿   ???  ",
            "%%                    //  %?          ///        &/     ?  "
        }; Frame.setText(MatrizMenu, 0, 0, Frame.PREDETERMINADO);

        Menu.frame.add(Frame.botonJugar);
        Menu.frame.add(Frame.botonOpciones);
        Menu.frame.add(Frame.botonSalir);
    }

    private class accionTiempo implements ActionListener {
        int min, max;
        public accionTiempo(int min, int max) {this.min = min; this.max = max;}

        public void actionPerformed(ActionEvent e) {
            if (flagOpciones && flagJugar) {
                for (int fila = 29; fila >= 0; fila--) {
                    for (int columna = min; columna <= max; columna++){
                        if (Frame.equals("[ ]", fila, columna) && !(fila > 6 && fila < 12 && columna > 18 && columna < 40)) {
                            if (fila == 5 && columna > 16 && columna < 25 || columna > 33 && columna < 42) {
                                Frame.MATRIZ[13][columna].setText(Frame.MATRIZ[5][columna].getText());
                                Frame.MATRIZ[13][columna].setForeground(Frame.MATRIZ[5][columna].getForeground());
                            } else if (fila == 5 && columna > 24 && columna < 34) {
                                Frame.MATRIZ[25][columna].setText(Frame.MATRIZ[5][columna].getText());
                                Frame.MATRIZ[25][columna].setForeground(Frame.MATRIZ[5][columna].getForeground());
                            } else {
                                if (fila == 29) {
                                    Frame.MATRIZ[0][columna].setText(Frame.MATRIZ[29][columna].getText());
                                    Frame.MATRIZ[0][columna].setForeground(Frame.MATRIZ[29][columna].getForeground());
                                } else {
                                    if (Frame.MATRIZ[fila+1][columna].getForeground().equals(Frame.SOMBRA5)) {
                                        Frame.MATRIZ[fila][columna].setText(" ");
                                        Frame.MATRIZ[fila][columna].setForeground(Frame.PREDETERMINADO);
                                    } else {
                                        Frame.MATRIZ[fila+1][columna].setText(Frame.MATRIZ[fila][columna].getText());
                                        Frame.MATRIZ[fila+1][columna].setForeground(Frame.MATRIZ[fila][columna].getForeground());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    //Accion escribir
    public static void escribir(String letra) {
        if (flagEscribir && !letra.equals("⎵") && !letra.equals("←") && !letra.equals("↑") && !letra.equals("→") && !letra.equals("↓")) {
            Menu.audioTecla.setFramePosition(0);
            Menu.audioTecla.start();
            if (Frame.MATRIZ[15][27].getText().equals("_")) {Frame.MATRIZ[15][27].setText(letra);}
            else if (Frame.MATRIZ[15][28].getText().equals("_")) {Frame.MATRIZ[15][28].setText(letra);}
            else if (Frame.MATRIZ[15][29].getText().equals("_")) {Frame.MATRIZ[15][29].setText(letra);}
            else if (Frame.MATRIZ[15][30].getText().equals("_")) {Frame.MATRIZ[15][30].setText(letra);}
            else if (Frame.MATRIZ[15][31].getText().equals("_")) {Frame.MATRIZ[15][31].setText(letra); 
                Frame.setText(new String[]{"<Enter>"}, 13, 26, Frame.PREDETERMINADO);
                flagEnter = true;
                nombre[0] =
                    Frame.MATRIZ[15][27].getText() +
                    Frame.MATRIZ[15][28].getText() +
                    Frame.MATRIZ[15][29].getText() +
                    Frame.MATRIZ[15][30].getText() +
                    Frame.MATRIZ[15][31].getText();
            }
        }
    }

    //Accion borrar
    public static void borrar() {
        if (flagEscribir) {
            Menu.audioTecla.setFramePosition(0);
            Menu.audioTecla.start();
            if (!(Frame.MATRIZ[15][31].getText().equals("_"))) {Frame.MATRIZ[15][31].setText("_");
                Frame.setText(new String[]{"Nombre:"}, 13, 26, Frame.PREDETERMINADO);
                flagEnter = false;
            }
            else if (!(Frame.MATRIZ[15][30].getText().equals("_"))) {Frame.MATRIZ[15][30].setText("_");}
            else if (!(Frame.MATRIZ[15][29].getText().equals("_"))) {Frame.MATRIZ[15][29].setText("_");}
            else if (!(Frame.MATRIZ[15][28].getText().equals("_"))) {Frame.MATRIZ[15][28].setText("_");}
            else if (!(Frame.MATRIZ[15][27].getText().equals("_"))) {Frame.MATRIZ[15][27].setText("_");}
        }
    }

    //Accion enter
    private static boolean flagEnter = false;
    public static String[] nombre = new String[1];
    public static void enter() {
        if (flagEnter) {
            Menu.audioFondo.setFramePosition(0);
            Menu.audioFondo.start();

            Menu.frame.remove(Frame.botonJugar);
            Menu.frame.remove(Frame.botonOpciones);
            Menu.frame.remove(Frame.botonSalir);

            Menu.frame.panel.setControles();
            Frame.borraPanel();
            partida = new Partida();
            Menu.flagEscribir = false;
            Menu.flagJugar = false;
            Partida.flagFinal = true;

            Timer timer = new Timer(100, new AbstractAction() {public void actionPerformed (ActionEvent e) {
                frame.repaint();
                audioTitulo.stop();
                audioPartida.setFramePosition(0);
                audioPartida.loop(Clip.LOOP_CONTINUOUSLY);
            }});
            timer.setRepeats(false);
            timer.start();
        }
    }
}

//Accion boton
class AccionMouseMenu extends MouseAdapter {
    private String boton;
    public AccionMouseMenu (String nombreBoton) {boton = nombreBoton;}

    //Jugar
    private final String[] jugarSi = {
        "┌=====┐",
        "=     =",
        "└=====┘"
    };
    private final String[] jugarNo = {
        "┌-----┐",
        "|     |",
        "└-----┘"
    };
    private final String[] jugarPre = {
        "Nombre:",
        "+++++++",
        "+_____+",
        "+++++++"
    };
    private final String[] salirPre = {
        "+++++++",
        "+++++++",
        "+++++++"
    };

    //Opciones
    private final String[] opcionesSi = {
        "┌=======┐",
        "=       =",
        "└=======┘"
    };
    private final String[] opcionesNo = {
        "┌-------┐",
        "|       |",
        "└-------┘"
    };
    private final String[] opcionesPre = {
        "+++++++++",
        "+++++++++",
        "+++++++++"
    };

    //Acciones
    public void mouseEntered(MouseEvent e) {
        if (boton.equals("jugar")) {Frame.setText(jugarSi, 14, 26, Frame.PREDETERMINADO);}
        else if (boton.equals("opciones")) {Frame.setText(opcionesSi, 18, 25, Frame.PREDETERMINADO);}
        else if (boton.equals("salir")) {Frame.setText(jugarSi, 22, 26, Frame.PREDETERMINADO);}
    }

    public void mouseExited(MouseEvent e) {
        if (boton.equals("jugar")) {Frame.setText(jugarNo, 14, 26, Frame.PREDETERMINADO);}
        else if (boton.equals("opciones")) {Frame.setText(opcionesNo, 18, 25, Frame.PREDETERMINADO);}
        else if (boton.equals("salir")) {Frame.setText(jugarNo, 22, 26, Frame.PREDETERMINADO);}
    }

    public void mousePressed(MouseEvent e) {
        Menu.audioClick.setFramePosition(0);
        Menu.audioClick.start();
        if (boton.equals("jugar")) {Frame.setText(jugarPre, 13, 26, Frame.FONDO);}
        else if (boton.equals("opciones")) {Frame.setText(opcionesPre, 18, 25, Frame.FONDO);}
        else if (boton.equals("salir")) {Frame.setText(salirPre, 22, 26, Frame.FONDO);}
    }

    public void mouseReleased(MouseEvent e) {
        if (boton.equals("jugar")) {
            Frame.setText(jugarPre, 13, 26, Frame.PREDETERMINADO);
            Menu.flagEscribir = true;
        }
        else if (boton.equals("opciones")) {
            Menu.frame.remove(Frame.botonJugar);
            Menu.frame.remove(Frame.botonOpciones);
            Menu.frame.remove(Frame.botonSalir);
            new Menu(false);
            Menu.flagEscribir = false;
            Menu.flagJugar = false;
            Menu.flagOpciones = false;
            Frame.borraPanel();
            new Opciones();
        }
        else if (boton.equals("salir")) {
            System.exit(0);
        }
    }
}