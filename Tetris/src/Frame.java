import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Frame extends JFrame{

    //Matriz
    public static JLabel[][] MATRIZ = new JLabel[30][59];
    public static void setText(String[] array, int fila, int columna, Color color) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++){
                if (array[i].charAt(j) == '?') {
                    MATRIZ[i + fila][j + columna].setText("[ ]");
                    MATRIZ[i + fila][j + columna].setForeground(FONDO);;
                } else if (array[i].charAt(j) == '$') {
                    MATRIZ[i + fila][j + columna].setText("[ ]");
                    MATRIZ[i + fila][j + columna].setForeground(SOMBRA1);
                } else if (array[i].charAt(j) == '%') {
                    MATRIZ[i + fila][j + columna].setText("[ ]");
                    MATRIZ[i + fila][j + columna].setForeground(SOMBRA2);
                } else if (array[i].charAt(j) == '&') {
                    MATRIZ[i + fila][j + columna].setText("[ ]");
                    MATRIZ[i + fila][j + columna].setForeground(SOMBRA3);
                } else if (array[i].charAt(j) == '/') {
                    MATRIZ[i + fila][j + columna].setText("[ ]");
                    MATRIZ[i + fila][j + columna].setForeground(SOMBRA4);
                } else if (array[i].charAt(j) == '¿') {
                    MATRIZ[i + fila][j + columna].setText("[ ]");
                    MATRIZ[i + fila][j + columna].setForeground(SOMBRA5);
                }
                
                else if (array[i].charAt(j) == '+') {MATRIZ[i + fila][j + columna].setForeground(color);}
                else if (array[i].charAt(j) == '~') {MATRIZ[i + fila][j + columna].setText(null);}
                else if (array[i].charAt(j) == '#') {
                    MATRIZ[i + fila][j + columna].setText("[ ]");
                    MATRIZ[i + fila][j + columna].setForeground(color);
                }
                else if (array[i].charAt(j) != ' ') {
                    MATRIZ[i + fila][j + columna].setText(String.valueOf(array[i].charAt(j)));
                    if (array[i].charAt(j) == '.') {
                        MATRIZ[i + fila][j + columna].setForeground(FONDO);
                    } else {
                        MATRIZ[i + fila][j + columna].setForeground(color);
                    }
                }
            }
        }
    }
    public static boolean equals(String texto, int fila, int columna) {
        if (MATRIZ[fila][columna].getText() == null) {return false;}
        else if (MATRIZ[fila][columna].getText().equals(texto)) {return true;}
        return false;
    }
    public static void borraPanel() {
        for (JLabel[] i: MATRIZ) {for (JLabel j: i) {
            if (j.getText() != null) {if (!j.getText().equals(" ")) {
                j.setText(null);
                j.setForeground(PREDETERMINADO);
            }}
        }}
    }

    //Tamaños
    public static final int ANCHO = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static final int ALTO = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static final int TAMAÑO_FUENTES = (ANCHO + ALTO) / 100;

    //Colores
    public static final Color PREDETERMINADO = Color.GREEN;
    public static Color CERO = new Color(255, 150, 0);
    public static Color UNO = Color.BLUE;
    public static Color DOS = Color.CYAN;
    public static Color TRES = Color.YELLOW;
    public static Color CUATRO = Color.GREEN;
    public static Color CINCO = Color.RED;
    public static Color SEIS = Color.MAGENTA;

    public static final Color FONDO = new Color(0, 100, 0);
    public static final Color SOMBRA1 = new Color(0, 30, 0);
    public static final Color SOMBRA2 = new Color(0, 20, 0);
    public static final Color SOMBRA3 = new Color(0, 15, 0);
    public static final Color SOMBRA4 = new Color(0, 10, 0);
    public static final Color SOMBRA5 = new Color(0, 5, 0);

    //Fuentes
    public static final Font FUENTE = new Font(null, Font.BOLD, TAMAÑO_FUENTES);

    //Colores
    public static String[][] colores = {{"~NARANJA"}, {"~~~~AZUL"}, {"~CELESTE"}, {"AMARILLO"}, {"~~~VERDE"}, {"~~~~ROJO"}, {"~MAGENTA"}};

    //Controles
    public static char[] controles = {'↑', '→', '↓', '←', 'C', '⎵'};

    //Volumen
    public static int volumenMusica = 6;
    public static int volumenEfectos= 6;

    //Piezas
    public static final String[][][] piezaCrear = {
        {
            {
                "##",
                " #",
                " #",
            }, {
                "###",
                "#"
            }, {
                "#",
                "#",
                "##",
            }, {
                "  #",
                "###"
            }
        }, {
            {
                "##",
                "#",
                "#"
            }, {
                "###",
                "  #"
            }, {
                " #",
                " #",
                "##"
            }, {
                "#",
                "###"
            }
        }, {
            {
                "#",
                "#",
                "#",
                "#",
            }, {
                "",
                "####"
            }
        }, {
            {
                "##",
                "##"
            }
        }, {
            {
                "#",
                "##",
                " #"
            }, {
                " ##",
                "##"
            }
        }, {
            {
                " #",
                "##",
                "#"
            }, {
                "##",
                " ##"
            }
        }, {
            {
                " #",
                "##",
                " #"
            }, {
                " #",
                "###"
            }, {
                "#",
                "##",
                "#"
            }, {
                "###",
                " #"
            }
        }
    };

    public static final String[][][] piezaBorrar = {
        {
            {
                "..",
                " .",
                " .",
            }, {
                "...",
                "."
            }, {
                ".",
                ".",
                "..",
            }, {
                "  .",
                "..."
            }
        }, {
            {
                "..",
                ".",
                "."
            }, {
                "...",
                "  ."
            }, {
                " .",
                " .",
                ".."
            }, {
                ".",
                "..."
            }
        }, {
            {
                ".",
                ".",
                ".",
                ".",
            }, {
                "",
                "...."
            }
        }, {
            {
                "..",
                ".."
            }
        }, {
            {
                ".",
                "..",
                " ."
            }, {
                " ..",
                ".."
            }
        }, {
            {
                " .",
                "..",
                "."
            }, {
                "..",
                " .."
            }
        }, {
            {
                " .",
                "..",
                " ."
            }, {
                " .",
                "..."
            }, {
                ".",
                "..",
                "."
            }, {
                "...",
                " ."
            }
        }
    };
    public static void crearPieza (int pieza, int rotacion, int fila, int columna, boolean crear, Color c) {
        if (crear) {setText(piezaCrear[pieza][rotacion], fila, columna, c);}
        else {setText(piezaBorrar[pieza][rotacion], fila, columna, c);}
    }

    //Frame
    public Panel panel;
    public static AccionPanel
        botonJugar, botonOpciones, botonSalir,
        botonColores, botonControles, botonVolumen, botonSalirOpciones,
        botonPieza0, botonPieza1, botonPieza2, botonPieza3, botonPieza4, botonPieza5, botonPieza6, botonAzul, botonCyan, botonVerde, botonAmarillo, botonBlanco, botonNaranja, botonRosa, botonRojo, botonMagenta, botonGris, botonSalirOpcionesColores, 
        botonGirar, botonDerecha, botonAbajo, botonIzquierda, botonGuardar, botonFondo, botonSalirOpcionesControles,
        botonMusica1, botonMusica2, botonMusica3, botonMusica4, botonMusica5, botonMusica6, botonMusica7, botonMusica8, botonMusica9, botonMusica10, botonEfectos1, botonEfectos2, botonEfectos3, botonEfectos4, botonEfectos5, botonEfectos6, botonEfectos7, botonEfectos8, botonEfectos9, botonEfectos10, botonSalirOpcionesVolumen,
        botonPartida;
    public Frame(){
        setLayout(null);

        //Menu
        botonJugar = new AccionPanel(26, 14, 7, 3);
        botonOpciones = new AccionPanel(25, 18, 9, 3);
        botonSalir = new AccionPanel(26, 22, 7, 3);

        //Opciones
        botonColores = new AccionPanel(25, 9, 9, 3);
        botonControles = new AccionPanel(24, 13, 11, 3);
        botonVolumen = new AccionPanel(25, 17, 9, 3);
        botonSalirOpciones = new AccionPanel(50, 0, 7, 3);

        //Opciones colores
        botonPieza0 = new AccionPanel(7, 9, 8, 1);
        botonPieza1 = new AccionPanel(24, 9, 8, 1);
        botonPieza2 = new AccionPanel(41, 9, 8, 1);
        botonPieza4 = new AccionPanel(7, 15, 8, 1);
        botonPieza5 = new AccionPanel(24, 15, 8, 1);
        botonPieza3 = new AccionPanel(41, 15, 8, 1);
        botonPieza6 = new AccionPanel(7, 21, 8, 1);

        botonAzul = new AccionPanel(30, 21, 3, 1);
        botonCyan = new AccionPanel(34, 21, 3, 1);
        botonVerde = new AccionPanel(38, 21, 3, 1);
        botonAmarillo = new AccionPanel(42, 21, 3, 1);
        botonBlanco = new AccionPanel(46, 21, 3, 1);
        botonNaranja = new AccionPanel(30, 24, 3, 1);
        botonRosa = new AccionPanel(34, 24, 3, 1);
        botonRojo = new AccionPanel(38, 24, 3, 1);
        botonMagenta = new AccionPanel(42, 24, 3, 1);
        botonGris = new AccionPanel(46, 24, 3, 1);

        botonSalirOpcionesColores = new AccionPanel(50, 0, 7, 3);

        //Opciones controles
        botonGirar = new AccionPanel(32, 10, 3, 1);
        botonDerecha = new AccionPanel(32, 12, 3, 1);
        botonAbajo = new AccionPanel(32, 14, 3, 1);
        botonIzquierda = new AccionPanel(32, 16, 3, 1);
        botonGuardar = new AccionPanel(32, 18, 3, 1);
        botonFondo = new AccionPanel(32, 20, 3, 1);

        botonSalirOpcionesControles = new AccionPanel(50, 0, 7, 3);

        //Opciones volumen
        botonMusica1 = new AccionPanel(28, 12, 1, 1);
        botonMusica2 = new AccionPanel(29, 12, 1, 1);
        botonMusica3 = new AccionPanel(30, 12, 1, 1);
        botonMusica4 = new AccionPanel(31, 12, 1, 1);
        botonMusica5 = new AccionPanel(32, 12, 1, 1);
        botonMusica6 = new AccionPanel(33, 12, 1, 1);
        botonMusica7 = new AccionPanel(34, 12, 1, 1);
        botonMusica8 = new AccionPanel(35, 12, 1, 1);
        botonMusica9 = new AccionPanel(36, 12, 1, 1);
        botonMusica10 = new AccionPanel(37, 12, 1, 1);

        botonEfectos1 = new AccionPanel(28, 16, 1, 1);
        botonEfectos2 = new AccionPanel(29, 16, 1, 1);
        botonEfectos3 = new AccionPanel(30, 16, 1, 1);
        botonEfectos4 = new AccionPanel(31, 16, 1, 1);
        botonEfectos5 = new AccionPanel(32, 16, 1, 1);
        botonEfectos6 = new AccionPanel(33, 16, 1, 1);
        botonEfectos7 = new AccionPanel(34, 16, 1, 1);
        botonEfectos8 = new AccionPanel(35, 16, 1, 1);
        botonEfectos9 = new AccionPanel(36, 16, 1, 1);
        botonEfectos10 = new AccionPanel(37, 16, 1, 1);

        botonSalirOpcionesVolumen = new AccionPanel(50, 0, 7, 3);
        
        //Opciones partida
        botonPartida = new AccionPanel(1, 0, 6, 3);

        //Botones menu
        botonJugar.addMouseListener(new AccionMouseMenu("jugar"));
        botonOpciones.addMouseListener(new AccionMouseMenu("opciones"));
        botonSalir.addMouseListener(new AccionMouseMenu("salir"));

        //Botones opciones
        botonColores.addMouseListener(new AccionMouseOpciones("colores"));
        botonControles.addMouseListener(new AccionMouseOpciones("controles"));
        botonVolumen.addMouseListener(new AccionMouseOpciones("volumen"));
        botonSalirOpciones.addMouseListener(new AccionMouseOpciones("salir"));
        
        //Botones colores
        botonPieza0.addMouseListener(new AccionMouseOpcionesColores("0"));
        botonPieza1.addMouseListener(new AccionMouseOpcionesColores("1"));
        botonPieza2.addMouseListener(new AccionMouseOpcionesColores("2"));
        botonPieza3.addMouseListener(new AccionMouseOpcionesColores("3"));
        botonPieza4.addMouseListener(new AccionMouseOpcionesColores("4"));
        botonPieza5.addMouseListener(new AccionMouseOpcionesColores("5"));
        botonPieza6.addMouseListener(new AccionMouseOpcionesColores("6"));

        botonAzul.addMouseListener(new AccionMouseOpcionesColores("azul"));
        botonCyan.addMouseListener(new AccionMouseOpcionesColores("cyan"));
        botonVerde.addMouseListener(new AccionMouseOpcionesColores("verde"));
        botonAmarillo.addMouseListener(new AccionMouseOpcionesColores("amarillo"));
        botonBlanco.addMouseListener(new AccionMouseOpcionesColores("blanco"));
        botonNaranja.addMouseListener(new AccionMouseOpcionesColores("naranja"));
        botonRosa.addMouseListener(new AccionMouseOpcionesColores("rosa"));
        botonRojo.addMouseListener(new AccionMouseOpcionesColores("rojo"));
        botonMagenta.addMouseListener(new AccionMouseOpcionesColores("magenta"));
        botonGris.addMouseListener(new AccionMouseOpcionesColores("gris"));

        botonSalirOpcionesColores.addMouseListener(new AccionMouseOpcionesColores("salir"));

        //Botones controles
        botonGirar.addMouseListener(new AccionMouseOpcionesControles("girar"));
        botonDerecha.addMouseListener(new AccionMouseOpcionesControles("derecha"));
        botonAbajo.addMouseListener(new AccionMouseOpcionesControles("abajo"));
        botonIzquierda.addMouseListener(new AccionMouseOpcionesControles("izquierda"));
        botonGuardar.addMouseListener(new AccionMouseOpcionesControles("guardar"));
        botonFondo.addMouseListener(new AccionMouseOpcionesControles("fondo"));

        botonSalirOpcionesControles.addMouseListener(new AccionMouseOpcionesControles("salir"));
        
        //Botones volumen
        botonMusica1.addMouseListener(new AccionMouseOpcionesVolumen("musica1"));
        botonMusica2.addMouseListener(new AccionMouseOpcionesVolumen("musica2"));
        botonMusica3.addMouseListener(new AccionMouseOpcionesVolumen("musica3"));
        botonMusica4.addMouseListener(new AccionMouseOpcionesVolumen("musica4"));
        botonMusica5.addMouseListener(new AccionMouseOpcionesVolumen("musica5"));
        botonMusica6.addMouseListener(new AccionMouseOpcionesVolumen("musica6"));
        botonMusica7.addMouseListener(new AccionMouseOpcionesVolumen("musica7"));
        botonMusica8.addMouseListener(new AccionMouseOpcionesVolumen("musica8"));
        botonMusica9.addMouseListener(new AccionMouseOpcionesVolumen("musica9"));
        botonMusica10.addMouseListener(new AccionMouseOpcionesVolumen("musica10"));

        botonEfectos1.addMouseListener(new AccionMouseOpcionesVolumen("efectos1"));
        botonEfectos2.addMouseListener(new AccionMouseOpcionesVolumen("efectos2"));
        botonEfectos3.addMouseListener(new AccionMouseOpcionesVolumen("efectos3"));
        botonEfectos4.addMouseListener(new AccionMouseOpcionesVolumen("efectos4"));
        botonEfectos5.addMouseListener(new AccionMouseOpcionesVolumen("efectos5"));
        botonEfectos6.addMouseListener(new AccionMouseOpcionesVolumen("efectos6"));
        botonEfectos7.addMouseListener(new AccionMouseOpcionesVolumen("efectos7"));
        botonEfectos8.addMouseListener(new AccionMouseOpcionesVolumen("efectos8"));
        botonEfectos9.addMouseListener(new AccionMouseOpcionesVolumen("efectos9"));
        botonEfectos10.addMouseListener(new AccionMouseOpcionesVolumen("efectos10"));

        botonSalirOpcionesVolumen.addMouseListener(new AccionMouseOpcionesVolumen("salir"));

        //Boton partida
        botonPartida.addMouseListener(new AccionMousePartida());

        //Panel
        panel = new Panel();
        add(panel);

        //Caracteristicas del frame
        setUndecorated(true);
        setBounds(0, 0, Frame.ANCHO, Frame.ALTO);
        setTitle("Tetris");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    //Crear boton
    class AccionPanel extends JPanel {
        public AccionPanel(int x, int y, int width, int height) {
            setBackground(Color.WHITE);
            setBounds(
                Frame.ANCHO / 59 * x,
                Frame.ALTO / 30 * y + (Frame.ANCHO / 120),
                Frame.ANCHO / 59 * width,
                Frame.ALTO / 30 * height
            );
        }
    }

    //Panel
    public class Panel extends JPanel{
        public Panel() {
            setBackground(Color.BLACK);
            setLayout(new GridLayout(30, 59, 0, 0));
            setBounds(0, 0, Frame.ANCHO, Frame.ALTO);

            for(int i = 0; i < 30; i++) {
                for (int j = 0; j < 59; j++){
                    Frame.MATRIZ[i][j] = new JLabel(" ");
                    Frame.MATRIZ[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                    Frame.MATRIZ[i][j].setVerticalAlignment(SwingConstants.CENTER);
                    Frame.MATRIZ[i][j].setForeground(Frame.PREDETERMINADO);
                    Frame.MATRIZ[i][j].setFont(Frame.FUENTE);
                    add(Frame.MATRIZ[i][j]);
            }}
            
            setTeclas();
        }

        //Teclas
        public void setTeclas() {
            InputMap inputMap = getInputMap();
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "⎵");
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "←");
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "↑");
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "→");
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "↓");
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enter");
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "esc");
            inputMap.put(KeyStroke.getKeyStroke('a'), "A");
            inputMap.put(KeyStroke.getKeyStroke('b'), "B");
            inputMap.put(KeyStroke.getKeyStroke('c'), "C");
            inputMap.put(KeyStroke.getKeyStroke('d'), "D");
            inputMap.put(KeyStroke.getKeyStroke('e'), "E");
            inputMap.put(KeyStroke.getKeyStroke('f'), "F");            
            inputMap.put(KeyStroke.getKeyStroke('g'), "G");
            inputMap.put(KeyStroke.getKeyStroke('h'), "H");            
            inputMap.put(KeyStroke.getKeyStroke('i'), "I");            
            inputMap.put(KeyStroke.getKeyStroke('j'), "J");
            inputMap.put(KeyStroke.getKeyStroke('k'), "K");
            inputMap.put(KeyStroke.getKeyStroke('l'), "L");
            inputMap.put(KeyStroke.getKeyStroke('m'), "M");
            inputMap.put(KeyStroke.getKeyStroke('n'), "N");
            inputMap.put(KeyStroke.getKeyStroke('\u00F1'), "Ñ");
            inputMap.put(KeyStroke.getKeyStroke('o'), "O");
            inputMap.put(KeyStroke.getKeyStroke('p'), "P");
            inputMap.put(KeyStroke.getKeyStroke('q'), "Q");
            inputMap.put(KeyStroke.getKeyStroke('r'), "R");
            inputMap.put(KeyStroke.getKeyStroke('s'), "S");
            inputMap.put(KeyStroke.getKeyStroke('t'), "T");
            inputMap.put(KeyStroke.getKeyStroke('u'), "Y");
            inputMap.put(KeyStroke.getKeyStroke('v'), "V");
            inputMap.put(KeyStroke.getKeyStroke('w'), "W");
            inputMap.put(KeyStroke.getKeyStroke('x'), "X");
            inputMap.put(KeyStroke.getKeyStroke('y'), "Y");
            inputMap.put(KeyStroke.getKeyStroke('z'), "Z");
            inputMap.put(KeyStroke.getKeyStroke('1'), "1");
            inputMap.put(KeyStroke.getKeyStroke('2'), "2");
            inputMap.put(KeyStroke.getKeyStroke('3'), "3");
            inputMap.put(KeyStroke.getKeyStroke('4'), "4");
            inputMap.put(KeyStroke.getKeyStroke('5'), "5");
            inputMap.put(KeyStroke.getKeyStroke('6'), "6");
            inputMap.put(KeyStroke.getKeyStroke('7'), "7");
            inputMap.put(KeyStroke.getKeyStroke('8'), "8");
            inputMap.put(KeyStroke.getKeyStroke('9'), "9");
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "borrar");
            ActionMap actionMap = getActionMap();
            actionMap.put("⎵", new AbstractAction() {public void actionPerformed (ActionEvent e) {OpcionesControles.setControles('⎵');}});
            actionMap.put("←", new AbstractAction() {public void actionPerformed (ActionEvent e) {OpcionesControles.setControles('←');}});
            actionMap.put("↑", new AbstractAction() {public void actionPerformed (ActionEvent e) {OpcionesControles.setControles('↑');}});
            actionMap.put("→", new AbstractAction() {public void actionPerformed (ActionEvent e) {OpcionesControles.setControles('→');}});
            actionMap.put("↓", new AbstractAction() {public void actionPerformed (ActionEvent e) {OpcionesControles.setControles('↓');}});
            actionMap.put("enter", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.enter();}});
            actionMap.put("A", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("A"); OpcionesControles.setControles('A');}});
            actionMap.put("B", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("B"); OpcionesControles.setControles('B');}});
            actionMap.put("C", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("C"); OpcionesControles.setControles('C');}});
            actionMap.put("D", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("D"); OpcionesControles.setControles('D');}});
            actionMap.put("E", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("E"); OpcionesControles.setControles('E');}});
            actionMap.put("F", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("F"); OpcionesControles.setControles('F');}});
            actionMap.put("G", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("G"); OpcionesControles.setControles('G');}});
            actionMap.put("H", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("H"); OpcionesControles.setControles('H');}});
            actionMap.put("I", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("I"); OpcionesControles.setControles('I');}});
            actionMap.put("J", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("J"); OpcionesControles.setControles('J');}});
            actionMap.put("K", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("K"); OpcionesControles.setControles('K');}});
            actionMap.put("L", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("L"); OpcionesControles.setControles('L');}});
            actionMap.put("M", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("M"); OpcionesControles.setControles('M');}});
            actionMap.put("N", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("N"); OpcionesControles.setControles('N');}});
            actionMap.put("Ñ", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("Ñ"); OpcionesControles.setControles('Ñ');}});
            actionMap.put("O", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("O"); OpcionesControles.setControles('O');}});
            actionMap.put("P", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("P"); OpcionesControles.setControles('P');}});
            actionMap.put("Q", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("Q"); OpcionesControles.setControles('Q');}});
            actionMap.put("R", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("R"); OpcionesControles.setControles('R');}});
            actionMap.put("S", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("S"); OpcionesControles.setControles('S');}});
            actionMap.put("T", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("T"); OpcionesControles.setControles('T');}});
            actionMap.put("U", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("U"); OpcionesControles.setControles('U');}});
            actionMap.put("V", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("V"); OpcionesControles.setControles('V');}});
            actionMap.put("W", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("W"); OpcionesControles.setControles('W');}});
            actionMap.put("X", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("X"); OpcionesControles.setControles('X');}});
            actionMap.put("Y", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("Y"); OpcionesControles.setControles('Y');}});
            actionMap.put("Z", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("Z"); OpcionesControles.setControles('Z');}});
            actionMap.put("0", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("0"); OpcionesControles.setControles('0');}});
            actionMap.put("1", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("1"); OpcionesControles.setControles('1');}});
            actionMap.put("2", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("2"); OpcionesControles.setControles('2');}});
            actionMap.put("3", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("3"); OpcionesControles.setControles('3');}});
            actionMap.put("4", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("4"); OpcionesControles.setControles('4');}});
            actionMap.put("5", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("5"); OpcionesControles.setControles('5');}});
            actionMap.put("6", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("6"); OpcionesControles.setControles('6');}});
            actionMap.put("7", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("7"); OpcionesControles.setControles('7');}});
            actionMap.put("8", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("8"); OpcionesControles.setControles('8');}});
            actionMap.put("9", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.escribir("9"); OpcionesControles.setControles('9');}});
            actionMap.put("borrar", new AbstractAction() {public void actionPerformed (ActionEvent e) {Menu.borrar();}});
        }

        public void setControles() {
            setTeclas();
            ActionMap actionMap = getActionMap();
            actionMap.put("esc", new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.partida.pausa();}});
            actionMap.put("R", new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.partida.reiniciar(); Menu.escribir("R"); OpcionesControles.setControles('R');}});
            actionMap.put(String.valueOf(controles[0]), new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.escribir(String.valueOf(controles[0])); OpcionesControles.setControles(controles[0]); Partida.objetoPieza.girar();}});
            actionMap.put(String.valueOf(controles[1]), new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.escribir(String.valueOf(controles[1])); OpcionesControles.setControles(controles[1]); Partida.objetoPieza.derecha();}});
            actionMap.put(String.valueOf(controles[2]), new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.escribir(String.valueOf(controles[2])); OpcionesControles.setControles(controles[2]); Partida.objetoPieza.abajo();}});
            actionMap.put(String.valueOf(controles[3]), new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.escribir(String.valueOf(controles[3])); OpcionesControles.setControles(controles[3]); Partida.objetoPieza.izquierda();}});
            actionMap.put(String.valueOf(controles[4]), new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.escribir(String.valueOf(controles[4])); OpcionesControles.setControles(controles[4]); Partida.objetoPieza.guardar();}});
            actionMap.put(String.valueOf(controles[5]), new AbstractAction(){public void actionPerformed(ActionEvent e) {Menu.escribir(String.valueOf(controles[5])); OpcionesControles.setControles(controles[5]); Partida.objetoPieza.fondo();}});
        }
    }
}