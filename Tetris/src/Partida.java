import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.sound.sampled.Clip;
import javax.swing.*;

public class Partida extends JPanel{

    //Tiempos
    AccionTiempo accionT = new AccionTiempo();
    AccionPuntuacion accionP = new AccionPuntuacion();
    public final Timer tiempoPerder = new Timer(1000, accionT);
    public final Timer tiempoIntermedio = new Timer(100, accionT);
    public final Timer tiempoPuntuacion = new Timer(100, accionP);
    public final Timer tiempo1 = new Timer(1000, accionT);
    public final Timer tiempo2 = new Timer(800, accionT);
    public final Timer tiempo3 = new Timer(600, accionT);
    public final Timer tiempo4 = new Timer(400, accionT);
    public final Timer tiempo5 = new Timer(300, accionT);
    public final Timer tiempo6 = new Timer(200, accionT);
    public final Timer tiempo7 = new Timer(100, accionT);
    public static Pieza objetoPieza;

    //Setear tiempos
    public void setTiempos (boolean activar) {
        if (activar) {
            tiempo1.start();
            tiempoPuntuacion.start();
        } else {
            tiempo1.stop();
            tiempo2.stop();
            tiempo3.stop();
            tiempo4.stop();
            tiempo5.stop();
            tiempo6.stop();
            tiempo7.stop();
            tiempoPerder.stop();
            tiempoIntermedio.stop();
            tiempoPuntuacion.stop();
        }
    }

    public Partida() {

        //Tiempos
        setTiempos(true);
        AccionTiempo.setNuevaPieza();

        //Pintar
        String[] MatrizPartida = {
            " ┌----┐                                          GIRAR:< > ",
            " |MENU|                                        DERECHA:< > ",
            " └----┘                                          ABAJO:< > ",
            "                                             IZQUIERDA:< > ",
            " Nombre:                                       GUARDAR:< > ",
            " ┌=====┐                                         FONDO:< > ",
            " =     =             <{............}>                      ",
            " └=====┘             <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "                     <{............}>                      ",
            "         Puntuacion: <{............}>    (       )     =1° ",
            "         ┌─────────┐ <{............}>    (       )     =2° ",
            "         |0000000x0| <{============}>    (       )     =3° ",
            "         └─────────┘ <{xxxxxxxxxxxx}>    (       )     =4° ",
            "                                         (       )     =5° "
        }; Frame.setText(MatrizPartida, 0, 0, Frame.PREDETERMINADO);

        //Nombre y controles
        Frame.setText(Menu.nombre, 6, 2, Frame.PREDETERMINADO);
        for (int i = 0; i < 6; i++) {Frame.MATRIZ[i][56].setText(String.valueOf(Frame.controles[i]));}
        
        //Marcador
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("Puntuaciones.txt"));
            for (int i = 24; i <= 28; i++) {
                Frame.setText(new String[]{buffer.readLine()}, i, 42, Frame.PREDETERMINADO);
                Frame.setText(new String[]{buffer.readLine()}, i, 50, Frame.PREDETERMINADO);
            }
            buffer.close();
        } catch (IOException e) {e.printStackTrace();}

        Menu.frame.add(Frame.botonPartida);
    }

    //Actualizar marcador
    public void actualizarMarcador() {

        //Guardar valores
        String nombre = "";
        for (int i = 2; i <= 6; i++) {
            nombre = nombre + Frame.MATRIZ[6][i].getText();
        }
        int indice = 28;
        String textoPuntuacion = "";
        for (int i = 10; i <= 16; i++){
            textoPuntuacion = textoPuntuacion + Frame.MATRIZ[26][i].getText();
        }
        int puntuacion;
        try {puntuacion = Integer.parseInt(textoPuntuacion);}
        catch (NumberFormatException e) {puntuacion = 0;}

        //Evalua si el nombre esta en el marcador
        for (int i = 24; i <= 28; i++) {
            String nombreMarcador = "";
            for (int j = 50; j <= 54; j++) {
                nombreMarcador = nombreMarcador + Frame.MATRIZ[i][j].getText();
            }
            if (nombre.equals(nombreMarcador)) {indice = i;}
        }

        for (int i = indice; i >= 24; i--) {
            
            //Guardar puntuacion de marcador a evaluar
            String textoMarcador = "";
            for (int j = 42; j <= 48; j++){
                textoMarcador = textoMarcador + Frame.MATRIZ[i][j].getText();
            }
            int marcador = Integer.parseInt(textoMarcador);

            //Evaluar si puntuacion es mayor que puntuacion de marcador
            if (puntuacion > marcador) {
                Frame.setText(new String[]{"-<NUEVO RECORD>-"}, 22, 41, Frame.PREDETERMINADO);

                for (int k = 42; k <= 48; k++){
                    if (i != indice) {Frame.MATRIZ[i+1][k].setText(Frame.MATRIZ[i][k].getText());}
                    Frame.MATRIZ[i][k].setText(String.valueOf(textoPuntuacion.charAt(k-42)));
                }
                for (int k = 50; k <= 54; k++){
                    if (i != indice) {Frame.MATRIZ[i+1][k].setText(Frame.MATRIZ[i][k].getText());}
                    Frame.MATRIZ[i][k].setText(Frame.MATRIZ[6][k-48].getText());
                }
            }
        }

        //Actualizar archivo
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter("Puntuaciones.txt"));
            for (int i = 24; i <= 28; i++) {
                for (int j = 42; j <= 48; j++) {
                    buffer.write(Frame.MATRIZ[i][j].getText());
                } buffer.newLine();
                for (int j = 50; j <= 54; j++) {
                    buffer.write(Frame.MATRIZ[i][j].getText());
                } buffer.newLine();
            }
            buffer.close();
        } catch (IOException e) {e.printStackTrace();}
    }

    //Game over
    public static void gameOver() {
        String[] reset = {
            "............",
            "............",
            "............",
            "............",
            "............",
            "............",
            "............",
            "............",
            ".┌========┐.",
            ".=GAMEOVER=.",
            "┌==========┐",
            "=RESTART(r)=",
            "└==========┘",
            "............",
            "............",
            "............",
            "............",
            "............",
            "............",
            "............"
        }; Frame.setText(reset, 6, 23, Frame.PREDETERMINADO);
    }

    //Reiniciar pantalla
    public void reset() {
        String[] reset = new String[20];
        for (int i = 0; i < 20; i++) {reset[i] = "............";}
        Frame.setText(reset, 6, 23, Frame.PREDETERMINADO);
        objetoPieza.resetValues();
    }

    //Accion reiniciar
    public static boolean flagPausa = true;
    public void reiniciar() {
        if (!(flagPausa)) {

            //Reiniciar valores
            flagPausa = true;
            flagPerder = true;
            flagBorrar = false;
            reset();
            guardar = -1;
            contador = 0;
            puntuacion = 0;
            numero = "";
            tiempoPerder.stop();
            tiempoIntermedio.stop();
            tiempoPuntuacion.start();
            tiempo1.start();
            tiempo2.stop();
            tiempo3.stop();
            tiempo4.stop();
            tiempo5.stop();
            tiempo6.stop();
            tiempo7.stop();
            AccionTiempo.setNuevaPieza();
            flagFinal = false;

            //Actualizar pantalla
            String[] matrizGuardar = {
                "~~~~",
                "~~~~",
                "~~~~",
                "~~~~",
                "~~~~",
                " ~~~"
            };
            Frame.setText(matrizGuardar, 6, 16, Frame.PREDETERMINADO);
            Frame.setText(new String[]{"~~~~~~~~~~~~~~~~"}, 21, 41, Frame.PREDETERMINADO);

            //Sonido
            Menu.audioPartida.setFramePosition(0);
            Menu.audioPartida.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    //Accion pausa
    private static boolean flagTiempo1 = false, flagTiempo2 = false, flagTiempo3 = false, flagTiempo4 = false, flagTiempo5 = false, flagTiempo6 = false, flagTiempo7 = false;
    private static String[][] pausaText = new String[5][12];
    private static Color[][] pausaColor = new Color[5][12];
    public void pausa() {

        //Sacar pausa
        if (flagPerder && !(flagPausa)) {
            flagPausa = true;
            if (flagTiempo1) {tiempo1.start(); flagTiempo1 = false;}
            else if (flagTiempo2) {tiempo2.start(); flagTiempo1 = false;}
            else if (flagTiempo3) {tiempo3.start(); flagTiempo1 = false;}
            else if (flagTiempo4) {tiempo4.start(); flagTiempo1 = false;}
            else if (flagTiempo5) {tiempo5.start(); flagTiempo1 = false;}
            else if (flagTiempo6) {tiempo6.start(); flagTiempo1 = false;}
            else if (flagTiempo7) {tiempo7.start(); flagTiempo1 = false;}

            int indiceFila = 0;
            int indiceColummna = 0;
            for (int fila = 14; fila <= 18; fila++) {
                indiceColummna = 0;
                for (int columna = 23; columna <= 34; columna++) {
                    Frame.MATRIZ[fila][columna].setText(pausaText[indiceFila][indiceColummna]);
                    Frame.MATRIZ[fila][columna].setForeground(pausaColor[indiceFila][indiceColummna]);
                    indiceColummna++;
                }
                indiceFila++;
            }

        //Hacer pausa
        } else if (flagPerder){
            flagPausa = false;
            tiempoIntermedio.stop();
            if (flagTiempo1) {tiempo1.stop();}
            else if (flagTiempo2) {tiempo2.stop();}
            else if (flagTiempo3) {tiempo3.stop();}
            else if (flagTiempo4) {tiempo4.stop();}
            else if (flagTiempo5) {tiempo5.stop();}
            else if (flagTiempo6) {tiempo6.stop();}
            else if (flagTiempo7) {tiempo7.stop();}

            int indiceFila = 0;
            int indiceColummna = 0;
            for (int fila = 14; fila <= 18; fila++) {
                indiceColummna = 0;
                for (int columna = 23; columna <= 34; columna++) {
                    if (Frame.equals("[ ]", fila, columna)) {pausaText[indiceFila][indiceColummna] = "[ ]";}
                    else {pausaText[indiceFila][indiceColummna] = ".";}
                    pausaColor[indiceFila][indiceColummna] = Frame.MATRIZ[fila][columna].getForeground();
                    Frame.MATRIZ[fila][columna].setForeground(Frame.PREDETERMINADO);
                    indiceColummna++;
                }
                indiceFila++;
            }

            final String[] pausa = {
                " ┌========┐",
                " =.PAUSA!.=",
                "┌==========┐",
                "=RESTART(r)=",
                "└==========┘",
            }; Frame.setText(pausa, 14, 23, Frame.PREDETERMINADO);
        }
    }
    
    //Accion Tiempo
    public static int guardar = -1;
    public String numero = "";
    public static int siguiente, pieza, puntuacion, puntuacionLinea, completo, contador = 0;
    public static double random;
    public static boolean flagFinal = true;
    public boolean flagPerder = true;
    public boolean flagBorrar = false;
    private static boolean flagActualizar = true;
    class AccionTiempo implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            if (objetoPieza != null) {
                if (objetoPieza.cantAbajo) {tiempoIntermedio.stop();}
                else {tiempoIntermedio.start();}
            }

            if (tiempo1.isRunning()) {flagTiempo1 = true;}
            else if (tiempo2.isRunning()) {flagTiempo2 = true;}
            else if (tiempo3.isRunning()) {flagTiempo3 = true;}
            else if (tiempo4.isRunning()) {flagTiempo4 = true;}
            else if (tiempo5.isRunning()) {flagTiempo5 = true;}
            else if (tiempo6.isRunning()) {flagTiempo6 = true;}
            else if (tiempo7.isRunning()) {flagTiempo7 = true;}

            //Tiempos
            if (Partida.flagPausa) {contador++;}
            
            if (contador == 90) {
                tiempo1.stop();
                tiempo2.start();
            } else if (contador == 202) {
                tiempo1.stop();
                tiempo2.stop();
                tiempo3.start();
            } else if (contador == 352) {
                tiempo1.stop();
                tiempo2.stop();
                tiempo3.stop();
                tiempo4.start();
            } else if (contador == 577) {
                tiempo1.stop();
                tiempo2.stop();
                tiempo3.stop();
                tiempo4.stop();
                tiempo5.start();
            } else if (contador == 877) {
                tiempo1.stop();
                tiempo2.stop();
                tiempo3.stop();
                tiempo4.stop();
                tiempo5.stop();
                tiempo6.start();
            } else if (contador == 1327) {
                tiempo1.stop();
                tiempo2.stop();
                tiempo3.stop();
                tiempo4.stop();
                tiempo5.stop();
                tiempo6.stop();
                tiempo7.start();
            }

            //Perder
            if (flagFinal) {
                for (int i = 23; i <= 34; i++) {
                    if (!(Frame.equals(".", 8, i))) {
                        flagPerder = false;
                    }
                }
            }

            //Valores
            if (flagPerder) {
                flagActualizar = true;
                if (flagPausa) {puntuacion++;}
                numero = String.valueOf(puntuacion);
                if (flagFinal) {
                    
                    //Linea completa
                    int cantLineas = 0;
                    for (int i = 25; i > 9; i--){
                        int completo = 0;
                        for (int j = 23; j <= 34; j++) {
                            if (Frame.equals("[ ]", i, j)) {completo++;}

                            //Si hay linea
                            if (completo == 12) {
                                completo = 0;
                                cantLineas++;
                                for (int ii = i-1; ii > 9; ii--) {
                                    for (int jj = 23; jj <= 34; jj++) {
                                        if (ii < 25) {
                                            Frame.MATRIZ[ii+1][jj].setText(Frame.MATRIZ[ii][jj].getText());
                                            Frame.MATRIZ[ii+1][jj].setForeground(Frame.MATRIZ[ii][jj].getForeground());
                                        }
                                    }
                                }
                                System.out.println(i);
                                i++;
                            }
                        }
                    }

                    if (cantLineas > 0) {
                        System.out.println(cantLineas);
                        Menu.audioLinea.setFramePosition(0);
                        Menu.audioLinea.start();
                    }

                    //Puntuacion
                    if (cantLineas == 1) {puntuacionLinea = 100; puntuacion -= 1;}
                    else if (cantLineas == 2) {puntuacionLinea = 300; puntuacion -= 3;}
                    else if (cantLineas == 3) {puntuacionLinea = 500; puntuacion -= 5;}
                    else if (cantLineas == 4) {puntuacionLinea = 800; puntuacion -= 8;}
                    numero = String.valueOf(puntuacion);

                    if (tiempo1.isRunning()) {puntuacion += puntuacionLinea * 1;}
                    else if (tiempo2.isRunning()) {puntuacion += puntuacionLinea * 2;}
                    else if (tiempo3.isRunning()) {puntuacion += puntuacionLinea * 3;}
                    else if (tiempo4.isRunning()) {puntuacion += puntuacionLinea * 4;}
                    else if (tiempo5.isRunning()) {puntuacion += puntuacionLinea * 5;}
                    else if (tiempo6.isRunning()) {puntuacion += puntuacionLinea * 6;}
                    else if (tiempo7.isRunning()) {puntuacion += puntuacionLinea * 7;}

                    //Nueva pieza
                    setNuevaPieza();
                    flagFinal = false;
                    objetoPieza = new Pieza(pieza);
                    objetoPieza.resetValues();
                }

                numero = String.valueOf(puntuacion);
                if (numero.length() == 1) {numero = "000000" + numero;}
                else if (numero.length() == 2) {numero = "00000" + numero;}
                else if (numero.length() == 3) {numero = "0000" + numero;}
                else if (numero.length() == 4) {numero = "000" + numero;}
                else if (numero.length() == 5) {numero = "00" + numero;}
                else if (numero.length() == 6) {numero = "0" + numero;}

                //Piezas
                if (Partida.flagPausa) {
                    objetoPieza.bajar();
                }
            
            //Perder
            } else {
                tiempo1.stop();
                tiempo2.stop();
                tiempo3.stop();
                tiempo4.stop();
                tiempo5.stop();
                tiempo6.stop();
                tiempo7.stop();
                tiempoPuntuacion.stop();
                tiempoIntermedio.stop();
                tiempoPerder.start();
                objetoPieza.cantAbajo = true;
                flagPausa = false;
                for (int fila = 6; fila <= 25; fila++) {
                    for (int columna = 23; columna <= 34; columna++) {
                        if (Frame.equals("[ ]", fila, columna)) {
                            Frame.MATRIZ[fila][columna].setForeground(Color.RED);
                        }
                    }
                }
                if (flagBorrar) {Partida.gameOver();}
                flagBorrar = true;
                objetoPieza.resetValues();

                if (flagActualizar){
                    Menu.audioPartida.stop();
                    Menu.audioGameOver.setFramePosition(0);
                    Menu.audioGameOver.start();
                    actualizarMarcador();
                    flagActualizar = false;
                }
            }
        }

        //Nueva pieza
        public static void setNuevaPieza() {
            do {
                random = Math.random() * 10;
            } while (random > 6 || random == pieza || random == siguiente);
            pieza = siguiente;
            siguiente = (int) random;
            
            actulizarSig();
        }

        //Actualizar pantalla siguiente
        public static void actulizarSig() {
            //Siguiente
            String[] marco2x3 = {
                "┌──┐",
                "|~~|",
                "|~~|",
                "|~~|",
                "└──┘",
                "~~~"
            };
            String[] marco1x4 = {
                "┌─┐~",
                "|~|~",
                "|~|~",
                "|~|~",
                "|~|~",
                "└─┘"
            };
            String[] marco2x2 = {
                "┌──┐",
                "|~~|",
                "|~~|",
                "└──┘",
                "~~~~",
                "~~~"
            };
            
            if (siguiente == 0) {
                Frame.setText(marco2x3, 6, 38, Frame.PREDETERMINADO);
                Frame.setText(Frame.piezaCrear[0][0], 7, 39, Frame.CERO);
            } else if (siguiente == 1) {
                Frame.setText(marco2x3, 6, 38, Frame.PREDETERMINADO);
                Frame.setText(Frame.piezaCrear[1][0], 7, 39, Frame.UNO);
            } else if (siguiente == 2) {
                Frame.setText(marco1x4, 6, 38, Frame.PREDETERMINADO);
                Frame.setText(Frame.piezaCrear[2][0], 7, 39, Frame.DOS);
            } else if (siguiente == 3) {
                Frame.setText(marco2x2, 6, 38, Frame.PREDETERMINADO);
                Frame.setText(Frame.piezaCrear[3][0], 7, 39, Frame.TRES);
            } else if (siguiente == 4) {
                Frame.setText(marco2x3, 6, 38, Frame.PREDETERMINADO);
                Frame.setText(Frame.piezaCrear[4][0], 7, 39, Frame.CUATRO);
            } else if (siguiente == 5) {
                Frame.setText(marco2x3, 6, 38, Frame.PREDETERMINADO);
                Frame.setText(Frame.piezaCrear[5][0], 7, 39, Frame.CINCO);
            } else if (siguiente == 6) {
                Frame.setText(marco2x3, 6, 38, Frame.PREDETERMINADO);
                Frame.setText(Frame.piezaCrear[6][0], 7, 39, Frame.SEIS);
            }
        }
    }

    //Accion puntuacion
    class AccionPuntuacion implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            Frame.setText(new String[]{numero}, 26, 10, Frame.PREDETERMINADO);

            if(tiempo1.isRunning()) {Frame.setText(new String[]{"1"}, 26, 18, Frame.PREDETERMINADO);}
            else if(tiempo2.isRunning()) {Frame.setText(new String[]{"2"}, 26, 18, Frame.PREDETERMINADO);}
            else if(tiempo3.isRunning()) {Frame.setText(new String[]{"3"}, 26, 18, Frame.PREDETERMINADO);}
            else if(tiempo4.isRunning()) {Frame.setText(new String[]{"4"}, 26, 18, Frame.PREDETERMINADO);}
            else if(tiempo5.isRunning()) {Frame.setText(new String[]{"5"}, 26, 18, Frame.PREDETERMINADO);}
            else if(tiempo6.isRunning()) {Frame.setText(new String[]{"6"}, 26, 18, Frame.PREDETERMINADO);}
            else if(tiempo7.isRunning()) {Frame.setText(new String[]{"7"}, 26, 18, Frame.PREDETERMINADO);}
        }
    }
}

//Accion de mouse
class AccionMousePartida extends MouseAdapter {
    private final String[] MenuSi = {
        "┌====┐",
        "=    =",
        "└====┘"
    };
    private final String[] MenuNo = {
        "┌----┐",
        "|    |",
        "└----┘"
    };
    private final String[] MenuPre = {
        "++++++",
        "++++++",
        "++++++"
    };

    public void mouseEntered(MouseEvent e) {
        Frame.setText(MenuSi, 0, 1, Frame.PREDETERMINADO);
    }

    public void mouseExited(MouseEvent e) {
        Frame.setText(MenuNo, 0, 1, Frame.PREDETERMINADO);
    }

    public void mousePressed(MouseEvent e) {
        Menu.audioClick.setFramePosition(0);
        Menu.audioClick.start();
        Frame.setText(MenuPre, 0, 1, Frame.FONDO);
    }

    public void mouseReleased(MouseEvent e) {
        Menu.partida.setTiempos(false);

        Menu.frame.remove(Frame.botonPartida);

        Menu.frame.panel.setTeclas();
        Partida.flagFinal = false;
        Frame.borraPanel();
        new Menu();

        Menu.audioPartida.stop();
        Menu.audioTitulo.setFramePosition(0);
        Menu.audioTitulo.loop(Clip.LOOP_CONTINUOUSLY);

        Timer timer = new Timer(0, new AbstractAction() {public void actionPerformed (ActionEvent e) {
            Menu.frame.repaint();
        }});
        timer.setRepeats(false);
        timer.start();
    }
}