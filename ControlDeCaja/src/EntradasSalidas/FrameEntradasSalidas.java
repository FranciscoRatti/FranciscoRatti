import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import javax.swing.border.*;
import java.time.*;

public class FrameEntradasSalidas extends JFrame{
    public static void main(String[] args) {
        new FrameEntradasSalidas();
    }

    public FrameEntradasSalidas() {
        setLayout(null);
        add(new panelVenta());
        add(new panelPago());

        setBounds(400, 200, 700, 370);
        setTitle("Entradas y Salidas");
        setIconImage(new ImageIcon("logoEntradasSalidas.gif").getImage());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class panelVenta extends JPanel{
        public panelVenta() {
            setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
            setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createSoftBevelBorder(BevelBorder.LOWERED),
                "VENTA:", 
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font(null, Font.BOLD, 16)
            ));
            setBounds(10, 10, 665, 150);

            add(new panelDatos());
            add(new panelBotones());
        }

        private ButtonGroup grupo;
        private JRadioButton contadoBoton, debitoBoton, transferenciaBoton;
        private JTextField fechaDia, fechaMes, fechaAño, monto;
        private LocalDate ahora = LocalDate.now();
        private class panelDatos extends JPanel {
            public panelDatos() {
                setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
                setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

                add(new JLabel("   Fecha:   "));
                fechaDia = new JTextField(String.valueOf(ahora.getDayOfMonth()), 2);
                fechaDia.setHorizontalAlignment(SwingConstants.CENTER);
                add(fechaDia);

                add(new JLabel(" / "));
                fechaMes = new JTextField(String.valueOf(ahora.getMonthValue()), 2);
                fechaMes.setHorizontalAlignment(SwingConstants.CENTER);
                add(fechaMes);

                add(new JLabel(" / "));
                fechaAño = new JTextField(String.valueOf(ahora.getYear()), 3);
                fechaAño.setHorizontalAlignment(SwingConstants.CENTER);
                add(fechaAño);

                add(Box.createHorizontalStrut(10));
                add(new JLabel(" Monto: "));
                monto = new JTextField(6);
                monto.setHorizontalAlignment(SwingConstants.RIGHT);
                add(monto);

                add(Box.createHorizontalStrut(10));
                JLabel contado = new JLabel(" Efectivo: ");
                contado.setFont(new Font(null, Font.BOLD, 14));
                add(contado);

                contadoBoton = new JRadioButton("", true);
                add(contadoBoton);

                add(Box.createHorizontalStrut(10));
                JLabel debito = new JLabel(" Debito: ");
                debito.setFont(new Font(null, Font.BOLD, 14));
                add(debito);
                
                debitoBoton = new JRadioButton();
                add(debitoBoton);
                
                add(Box.createHorizontalStrut(10));
                JLabel transferencia = new JLabel(" Transferencia: ");
                transferencia.setFont(new Font(null, Font.BOLD, 14));
                add(transferencia);
                
                transferenciaBoton = new JRadioButton();
                add(transferenciaBoton);

                grupo = new ButtonGroup();
                grupo.add(contadoBoton);
                grupo.add(debitoBoton);
                grupo.add(transferenciaBoton);
            }
        }

        private class panelBotones extends JPanel {
            public panelBotones() {
                setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));

                JButton añadir = new JButton("Añadir registro");
                añadir.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {

                    String origen = "Desconocido";
                    try {origen = InetAddress.getLocalHost().getHostName();}
                    catch (UnknownHostException ex) {ex.printStackTrace();}

                    boolean flagDia = false;
                    String textoDia = fechaDia.getText();

                    if (textoDia.length() > 2 || textoDia.length() == 0) {flagDia = true;}
                    else {
                        for (int i = 0; i < textoDia.length(); i++) {
                            if (
                                textoDia.charAt(i) != '0' &&
                                textoDia.charAt(i) != '1' &&
                                textoDia.charAt(i) != '2' &&
                                textoDia.charAt(i) != '3' &&
                                textoDia.charAt(i) != '4' &&
                                textoDia.charAt(i) != '5' &&
                                textoDia.charAt(i) != '6' &&
                                textoDia.charAt(i) != '7' &&
                                textoDia.charAt(i) != '8' &&
                                textoDia.charAt(i) != '9'
                            ) {flagDia = true;}
                        }
                    }

                    boolean flagMes = false;
                    String textoMes = fechaMes.getText();
                    if (textoMes.length() > 2 || textoMes.length() == 0) {flagMes = true;}
                    else {
                        for (int i = 0; i < textoMes.length(); i++) {
                            if (
                                textoMes.charAt(i) != '0' &&
                                textoMes.charAt(i) != '1' &&
                                textoMes.charAt(i) != '2' &&
                                textoMes.charAt(i) != '3' &&
                                textoMes.charAt(i) != '4' &&
                                textoMes.charAt(i) != '5' &&
                                textoMes.charAt(i) != '6' &&
                                textoMes.charAt(i) != '7' &&
                                textoMes.charAt(i) != '8' &&
                                textoMes.charAt(i) != '9'
                            ) {flagMes = true;}
                        }
                    }

                    boolean flagAño = false;
                    String textoAño = fechaAño.getText();
                    if (textoAño.length() > 4 || textoAño.length() == 0) {flagAño = true;}
                    else {
                        for (int i = 0; i < textoAño.length(); i++) {
                            if (
                                textoAño.charAt(i) != '0' &&
                                textoAño.charAt(i) != '1' &&
                                textoAño.charAt(i) != '2' &&
                                textoAño.charAt(i) != '3' &&
                                textoAño.charAt(i) != '4' &&
                                textoAño.charAt(i) != '5' &&
                                textoAño.charAt(i) != '6' &&
                                textoAño.charAt(i) != '7' &&
                                textoAño.charAt(i) != '8' &&
                                textoAño.charAt(i) != '9'
                            ) {flagAño = true;}
                        }
                    }

                    boolean flagFecha = false;
                    if (!flagDia && !flagMes && !flagAño) {
                        LocalDate fechaIngresada = LocalDate.of(Integer.parseInt(textoAño), Integer.parseInt(textoMes), Integer.parseInt(textoDia));
                        if (fechaIngresada.isAfter(ahora)) {flagFecha = true;}
                    }


                    boolean flagMonto = false;
                    char[] montoChar = monto.getText().toCharArray();
                    for (int i = 0; i < montoChar.length; i++) {
                        if (
                                montoChar[i] != '.' &&
                                montoChar[i] != ',' &&
                                montoChar[i] != '0' &&
                                montoChar[i] != '1' &&
                                montoChar[i] != '2' &&
                                montoChar[i] != '3' &&
                                montoChar[i] != '4' &&
                                montoChar[i] != '5' &&
                                montoChar[i] != '6' &&
                                montoChar[i] != '7' &&
                                montoChar[i] != '8' &&
                                montoChar[i] != '9'
                            ){flagMonto = true;}
                        else if (montoChar[i] == ',') {montoChar[i] = '.';}
                    }
                    String montoText = new String(montoChar);

                    if (flagDia) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "El dia esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagMes) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "El mes esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagAño) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "El año esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagFecha) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "La fecha ingresada esta despues de la actual", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagMonto) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "El monto esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String fechaText = "#" + textoMes + "/" + textoDia + "/" + textoAño + "#";
                        Consulta consulta = new Consulta();
                        if (grupo.getSelection() == contadoBoton.getModel()) {
                            consulta = new Consulta(Consulta.UPDATE, "INSERT INTO Venta (Origen, Fecha, Monto, Contado, Debito, Transferencia) VALUES ('" + origen + "', " + fechaText + ", " + montoText + ", 1, 0, 0)");
                        } else if (grupo.getSelection() == debitoBoton.getModel()) {
                            consulta = new Consulta(Consulta.UPDATE, "INSERT INTO Venta (Origen, Fecha, Monto, Contado, Debito, Transferencia) VALUES ('" + origen + "', " + fechaText + ", " + montoText + ", 0, 1, 0)");
                        } else if (grupo.getSelection() == transferenciaBoton.getModel()) {
                            consulta = new Consulta(Consulta.UPDATE, "INSERT INTO Venta (Origen, Fecha, Monto, Contado, Debito, Transferencia) VALUES ('" + origen + "', " + fechaText + ", " + montoText + ", 0, 0, 1)");
                        }
                        if (consulta.getFlag()) {
                            JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "Actualizacion completada con exito", "", JOptionPane.INFORMATION_MESSAGE);
                            monto.setText("");
                            fechaDia.setText(String.valueOf(ahora.getDayOfMonth()));
                            fechaMes.setText(String.valueOf(ahora.getMonthValue()));
                            fechaAño.setText(String.valueOf(ahora.getYear()));
                        }
                        else {JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "Error al actualizar", "", JOptionPane.ERROR_MESSAGE);}
                    }
                }});
                add(añadir);

                JButton eliminar = new JButton("Consultar registros");
                eliminar.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
                    new FrameEliminarVentas();
                }});
                add(eliminar);
            }
        }
    }

    private class panelPago extends JPanel{
        public panelPago() {
            setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
            setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createSoftBevelBorder(BevelBorder.LOWERED),
                "PAGO:",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font(null, Font.BOLD, 16)
            ));
            setBounds(10, 170, 665, 150);

            add(new panelDatos());
            add(new panelBotones());
        }

        private JTextField fechaDia, fechaMes, fechaAño, monto;
        private JComboBox<String> destino;
        private LocalDate ahora = LocalDate.now();
        private class panelDatos extends JPanel {
            public panelDatos() {
                setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
                setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

                add(new JLabel("   Fecha:   "));
                fechaDia = new JTextField(String.valueOf(ahora.getDayOfMonth()), 2);
                fechaDia.setHorizontalAlignment(SwingConstants.CENTER);
                add(fechaDia);

                add(new JLabel(" / "));
                fechaMes = new JTextField(String.valueOf(ahora.getMonthValue()), 2);
                fechaMes.setHorizontalAlignment(SwingConstants.CENTER);
                add(fechaMes);

                add(new JLabel(" / "));
                fechaAño = new JTextField(String.valueOf(ahora.getYear()), 3);
                fechaAño.setHorizontalAlignment(SwingConstants.CENTER);
                add(fechaAño);

                add(Box.createHorizontalStrut(10));
                add(new JLabel(" Monto: "));
                monto = new JTextField(6);
                monto.setHorizontalAlignment(SwingConstants.RIGHT);
                add(monto);

                add(Box.createHorizontalStrut(10));
                add(new JLabel(" Destino: "));
                destino = new JComboBox<>(new String[]{"Alquiler", "ARCA", "ARBA", "Contador", "Expensas", "Impuestos", "Limpieza", "Luz", "Municipalidad", "Otros", "Planes", "Proveedor", "Sueldos", "Viatico"});
                add(destino);
            }
        }

        private class panelBotones extends JPanel {
            public panelBotones() {
                setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));

                JButton añadir = new JButton("Añadir registro");
                añadir.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {

                    String origen = "Desconocido";
                    try {origen = InetAddress.getLocalHost().getHostName();}
                    catch (UnknownHostException ex) {ex.printStackTrace();}
                    
                    boolean flagDia = false;
                    String textoDia = fechaDia.getText();

                    if (textoDia.length() > 2 || textoDia.length() == 0) {flagDia = true;}
                    else {
                        for (int i = 0; i < textoDia.length(); i++) {
                            if (
                                textoDia.charAt(i) != '0' &&
                                textoDia.charAt(i) != '1' &&
                                textoDia.charAt(i) != '2' &&
                                textoDia.charAt(i) != '3' &&
                                textoDia.charAt(i) != '4' &&
                                textoDia.charAt(i) != '5' &&
                                textoDia.charAt(i) != '6' &&
                                textoDia.charAt(i) != '7' &&
                                textoDia.charAt(i) != '8' &&
                                textoDia.charAt(i) != '9'
                            ) {flagDia = true;}
                        }
                    }

                    boolean flagMes = false;
                    String textoMes = fechaMes.getText();
                    if (textoMes.length() > 2 || textoMes.length() == 0) {flagMes = true;}
                    else {
                        for (int i = 0; i < textoMes.length(); i++) {
                            if (
                                textoMes.charAt(i) != '0' &&
                                textoMes.charAt(i) != '1' &&
                                textoMes.charAt(i) != '2' &&
                                textoMes.charAt(i) != '3' &&
                                textoMes.charAt(i) != '4' &&
                                textoMes.charAt(i) != '5' &&
                                textoMes.charAt(i) != '6' &&
                                textoMes.charAt(i) != '7' &&
                                textoMes.charAt(i) != '8' &&
                                textoMes.charAt(i) != '9'
                            ) {flagMes = true;}
                        }
                    }

                    boolean flagAño = false;
                    String textoAño = fechaAño.getText();
                    if (textoAño.length() > 4 || textoAño.length() == 0) {flagAño = true;}
                    else {
                        for (int i = 0; i < textoAño.length(); i++) {
                            if (
                                textoAño.charAt(i) != '0' &&
                                textoAño.charAt(i) != '1' &&
                                textoAño.charAt(i) != '2' &&
                                textoAño.charAt(i) != '3' &&
                                textoAño.charAt(i) != '4' &&
                                textoAño.charAt(i) != '5' &&
                                textoAño.charAt(i) != '6' &&
                                textoAño.charAt(i) != '7' &&
                                textoAño.charAt(i) != '8' &&
                                textoAño.charAt(i) != '9'
                            ) {flagAño = true;}
                        }
                    }

                    boolean flagFecha = false;
                    if (!flagDia && !flagMes && !flagAño) {
                        LocalDate fechaIngresada = LocalDate.of(Integer.parseInt(textoAño), Integer.parseInt(textoMes), Integer.parseInt(textoDia));
                        if (fechaIngresada.isAfter(ahora)) {flagFecha = true;}
                    }

                    boolean flagMonto = false;
                    char[] montoChar = monto.getText().toCharArray();
                    for (int i = 0; i < montoChar.length; i++) {
                        if (
                                montoChar[i] != '.' &&
                                montoChar[i] != ',' &&
                                montoChar[i] != '0' &&
                                montoChar[i] != '1' &&
                                montoChar[i] != '2' &&
                                montoChar[i] != '3' &&
                                montoChar[i] != '4' &&
                                montoChar[i] != '5' &&
                                montoChar[i] != '6' &&
                                montoChar[i] != '7' &&
                                montoChar[i] != '8' &&
                                montoChar[i] != '9'
                            ){flagMonto = true;}
                        else if (montoChar[i] == ',') {montoChar[i] = '.';}
                    }
                    String montoText = new String(montoChar);

                    if (flagDia) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "El dia esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagMes) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "El mes esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagAño) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "El año esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagFecha) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "La fecha ingresada esta despues de la actual", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flagMonto) {
                        JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "ERROR, el monto esta mal escrito", "", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String fechaText = "#" + textoMes + "/" + textoDia + "/" + textoAño + "#";
                        Consulta consulta = new Consulta(Consulta.UPDATE, "INSERT INTO Pago (Origen, Fecha, Monto, Destino) VALUES ('" + origen + "', " + fechaText + ", " + montoText + ", '" + (String) destino.getSelectedItem() + "')");
                        if (consulta.getFlag()) {
                            JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "Actualizacion completada con exito", "", JOptionPane.INFORMATION_MESSAGE);
                            monto.setText("");
                            fechaDia.setText(String.valueOf(ahora.getDayOfMonth()));
                            fechaMes.setText(String.valueOf(ahora.getMonthValue()));
                            fechaAño.setText(String.valueOf(ahora.getYear()));
                        }
                        else {JOptionPane.showMessageDialog(FrameEntradasSalidas.this, "Error al actualizar", "", JOptionPane.ERROR_MESSAGE);}
                    }
                }});
                add(añadir);

                JButton eliminar = new JButton("Consultar registro", new ImageIcon("candado.png"));
                eliminar.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
                    new FrameContrasena();
                }
                });
                add(eliminar);
            }
        }
    }
}