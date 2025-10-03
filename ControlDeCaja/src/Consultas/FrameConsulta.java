import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.*;
import javax.swing.*;
import javax.swing.border.*;

public class FrameConsulta extends JFrame{
    public static int[] getMesYAño (int mes, int año) {
        if (mes < 1) {
            año--;
            if (mes == 0) {mes = 12;}
            else if (mes == -1) {mes = 11;}
            else if (mes == -2) {mes = 10;}
            else if (mes == -3) {mes = 9;}
            else if (mes == -4) {mes = 8;}
            else if (mes == -5) {mes = 7;}
            else if (mes == -6) {mes = 6;}
            else if (mes == -7) {mes = 5;}
            else if (mes == -8) {mes = 4;}
            else if (mes == -9) {mes = 3;}
            else if (mes == -10) {mes = 2;}
            else if (mes == -11) {mes = 1;}
        } return new int[]{mes, año};
    }

    public FrameConsulta() {
        int mesActual = LocalDate.now().getMonthValue();
        int añoActual = LocalDate.now().getYear();
        ResultSet VentaSumMes1, VentaSumMes2, VentaSumMes3, VentaSumMes4, VentaSumMes5, VentaSumMes6, VentaSumMes7, VentaSumMes8, VentaSumMes9, VentaSumMes10, VentaSumMes11, VentaSumMes12;
        ResultSet PagoSumMes1, PagoSumMes2, PagoSumMes3, PagoSumMes4, PagoSumMes5, PagoSumMes6, PagoSumMes7, PagoSumMes8, PagoSumMes9, PagoSumMes10, PagoSumMes11, PagoSumMes12;
        ResultSet PagoTablaMes1, PagoTablaMes2, PagoTablaGeneral, VentaTablaGeneral;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Statement estado = DriverManager.getConnection("jdbc:ucanaccess://BaseDeDatos.accdb").createStatement();

            int[] mesAño1 = getMesYAño(mesActual, añoActual);
            int[] mesAño2 = getMesYAño(mesActual-1, añoActual);
            int[] mesAño3 = getMesYAño(mesActual-2, añoActual);
            int[] mesAño4 = getMesYAño(mesActual-3, añoActual);
            int[] mesAño5 = getMesYAño(mesActual-4, añoActual);
            int[] mesAño6 = getMesYAño(mesActual-5, añoActual);
            int[] mesAño7 = getMesYAño(mesActual-6, añoActual);
            int[] mesAño8 = getMesYAño(mesActual-7, añoActual);
            int[] mesAño9= getMesYAño(mesActual-8, añoActual);
            int[] mesAño10 = getMesYAño(mesActual-9, añoActual);
            int[] mesAño11 = getMesYAño(mesActual-10, añoActual);
            int[] mesAño12 = getMesYAño(mesActual-11, añoActual);

            VentaSumMes1 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño1[0] + " AND year(Fecha) = " + mesAño1[1]);
            VentaSumMes2 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño2[0] + " AND year(Fecha) = " + mesAño2[1]);
            VentaSumMes3 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño3[0] + " AND year(Fecha) = " + mesAño3[1]);
            VentaSumMes4 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño4[0] + " AND year(Fecha) = " + mesAño4[1]);
            VentaSumMes5 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño5[0] + " AND year(Fecha) = " + mesAño5[1]);
            VentaSumMes6 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño6[0] + " AND year(Fecha) = " + mesAño6[1]);
            VentaSumMes7 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño7[0] + " AND year(Fecha) = " + mesAño7[1]);
            VentaSumMes8 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño8[0] + " AND year(Fecha) = " + mesAño8[1]);
            VentaSumMes9 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño9[0] + " AND year(Fecha) = " + mesAño9[1]);
            VentaSumMes10 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño10[0] + " AND year(Fecha) = " + mesAño10[1]);
            VentaSumMes11 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño11[0] + " AND year(Fecha) = " + mesAño11[1]);
            VentaSumMes12 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Venta WHERE month(Fecha) = " + mesAño12[0] + " AND year(Fecha) = " + mesAño12[1]);

            PagoSumMes1 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño1[0] + " AND year(Fecha) = " + mesAño1[1]);
            PagoSumMes2 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño2[0] + " AND year(Fecha) = " + mesAño2[1]);
            PagoSumMes3 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño3[0] + " AND year(Fecha) = " + mesAño3[1]);
            PagoSumMes4 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño4[0] + " AND year(Fecha) = " + mesAño4[1]);
            PagoSumMes5 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño5[0] + " AND year(Fecha) = " + mesAño5[1]);
            PagoSumMes6 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño6[0] + " AND year(Fecha) = " + mesAño6[1]);
            PagoSumMes7 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño7[0] + " AND year(Fecha) = " + mesAño7[1]);
            PagoSumMes8 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño8[0] + " AND year(Fecha) = " + mesAño8[1]);
            PagoSumMes9 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño9[0] + " AND year(Fecha) = " + mesAño9[1]);
            PagoSumMes10 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño10[0] + " AND year(Fecha) = " + mesAño10[1]);
            PagoSumMes11 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño11[0] + " AND year(Fecha) = " + mesAño11[1]);
            PagoSumMes12 = estado.executeQuery("SELECT SUM(Monto) AS Total FROM Pago WHERE month(Fecha) = " + mesAño12[0] + " AND year(Fecha) = " + mesAño12[1]);

            PagoTablaMes1 = estado.executeQuery("SELECT * FROM Pago WHERE month(Fecha) = " + mesAño1[0] + " AND year(Fecha) = " + mesAño1[1] + " ORDER BY Fecha DESC, Hora DESC");
            PagoTablaMes2 = estado.executeQuery("SELECT * FROM Pago WHERE month(Fecha) = " + mesAño2[0] + " AND year(Fecha) = " + mesAño2[1] + " ORDER BY Fecha DESC, Hora DESC");
            PagoTablaGeneral = estado.executeQuery("SELECT * FROM Pago ORDER BY Fecha DESC, Hora DESC");
            VentaTablaGeneral = estado.executeQuery("SELECT * FROM Venta ORDER BY Fecha DESC, Hora DESC");

            estado.close();

            VentaSumMes1.next(); PagoSumMes1.next();
            int total1 = Integer.parseInt(VentaSumMes1.getString("Total")) - Integer.parseInt(PagoSumMes1.getString("Total"));
            VentaSumMes2.next(); PagoSumMes2.next();
            int total2 = Integer.parseInt(VentaSumMes2.getString("Total")) - Integer.parseInt(PagoSumMes2.getString("Total"));
            VentaSumMes3.next(); PagoSumMes3.next();
            int total3 = Integer.parseInt(VentaSumMes3.getString("Total")) - Integer.parseInt(PagoSumMes3.getString("Total"));
            VentaSumMes4.next(); PagoSumMes4.next();
            int total4 = Integer.parseInt(VentaSumMes4.getString("Total")) - Integer.parseInt(PagoSumMes4.getString("Total"));
            VentaSumMes5.next(); PagoSumMes5.next();
            int total5 = Integer.parseInt(VentaSumMes5.getString("Total")) - Integer.parseInt(PagoSumMes5.getString("Total"));
            VentaSumMes6.next(); PagoSumMes6.next();
            int total6 = Integer.parseInt(VentaSumMes6.getString("Total")) - Integer.parseInt(PagoSumMes6.getString("Total"));
            VentaSumMes7.next(); PagoSumMes7.next();
            int total7 = Integer.parseInt(VentaSumMes7.getString("Total")) - Integer.parseInt(PagoSumMes7.getString("Total"));
            VentaSumMes8.next(); PagoSumMes8.next();
            int total8 = Integer.parseInt(VentaSumMes8.getString("Total")) - Integer.parseInt(PagoSumMes8.getString("Total"));
            VentaSumMes9.next(); PagoSumMes9.next();
            int total9 = Integer.parseInt(VentaSumMes9.getString("Total")) - Integer.parseInt(PagoSumMes9.getString("Total"));
            VentaSumMes10.next(); PagoSumMes10.next();
            int total10 = Integer.parseInt(VentaSumMes10.getString("Total")) - Integer.parseInt(PagoSumMes10.getString("Total"));
            VentaSumMes11.next(); PagoSumMes11.next();
            int total11 = Integer.parseInt(VentaSumMes11.getString("Total")) - Integer.parseInt(PagoSumMes11.getString("Total"));
            VentaSumMes12.next(); PagoSumMes12.next();
            int total12 = Integer.parseInt(VentaSumMes12.getString("Total")) - Integer.parseInt(PagoSumMes12.getString("Total"));

            add(new PanelMesActual(total1, PagoTablaMes1, VentaSumMes1, PagoSumMes1));
            add(new PanelMesAnterior(total2, PagoTablaMes2, VentaSumMes2, PagoSumMes2));
            add(new PanelBotones(total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, total11, total12, VentaTablaGeneral, PagoTablaGeneral));
        } catch (SQLException | ClassNotFoundException e) {e.printStackTrace();}

        setLayout(null);

        setBounds(200, 100, 1090, 600);
        setTitle("Consulta");
        setIconImage(new ImageIcon("logoConsulta.gif").getImage());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class PanelMesActual extends JPanel {
        public PanelMesActual(int total, ResultSet PagoTabla, ResultSet VentaSuma, ResultSet PagoSuma) {
            setBounds(550, 10, 500, 500);
            setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), "PAGOS MES ACTUAL", TitledBorder.CENTER, TitledBorder.CENTER, new Font(null, Font.BOLD, 20)));

            String[][] datos = new String[300][3];
            String[] campos = {"Fecha", "Monto", "Destino"};

            try {
                int fila = 0;
                while (PagoTabla.next()) {
                    datos[fila][0] = PagoTabla.getString("Fecha").substring(0, 10);
                    datos[fila][1] = PagoTabla.getString("Monto");
                    datos[fila][2] = PagoTabla.getString("Destino");
                    fila++;
                }add(new JScrollPane(new JTable(datos, campos)));

                add(new JLabel("VENTAS"));
                JTextField ventas = new JTextField(VentaSuma.getString("Total"), 6);
                ventas.setHorizontalAlignment(SwingConstants.RIGHT);
                add(ventas);

                add(new JLabel(" -   PAGOS"));
                JTextField pagos = new JTextField(PagoSuma.getString("Total"), 6);
                pagos.setHorizontalAlignment(SwingConstants.RIGHT);
                add(pagos);                

                add(new JLabel(" =   GANANCIA"));
                JTextField ganancia = new JTextField(String.valueOf(total), 6);
                ganancia.setHorizontalAlignment(SwingConstants.RIGHT);
                add(ganancia);
            } catch (SQLException e) {e.printStackTrace();}
        }
    }

    private class PanelMesAnterior extends JPanel {
        public PanelMesAnterior(int total, ResultSet PagoTabla, ResultSet VentaSuma, ResultSet PagoSuma) {
            setBounds(25, 10, 500, 500);
            setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), "PAGOS MES ANTERIOR", TitledBorder.CENTER, TitledBorder.CENTER, new Font(null, Font.BOLD, 20)));

            String[][] datos = new String[300][3];
            String[] campos = {"Fecha", "Monto", "Destino"};

            try {
                int fila = 0;
                while (PagoTabla.next()) {
                    datos[fila][0] = PagoTabla.getString("Fecha").substring(0, 10);
                    datos[fila][1] = PagoTabla.getString("Monto");
                    datos[fila][2] = PagoTabla.getString("Destino");
                    fila++;
                } add(new JScrollPane(new JTable(datos, campos)));

                add(new JLabel("VENTAS"));
                JTextField ventas = new JTextField(VentaSuma.getString("Total"), 6);
                ventas.setHorizontalAlignment(SwingConstants.RIGHT);
                add(ventas);

                add(new JLabel(" -   PAGOS"));
                JTextField pagos = new JTextField(PagoSuma.getString("Total"), 6);
                pagos.setHorizontalAlignment(SwingConstants.RIGHT);
                add(pagos);                

                add(new JLabel(" =   GANANCIA"));
                JTextField ganancia = new JTextField(String.valueOf(total), 6);
                ganancia.setHorizontalAlignment(SwingConstants.RIGHT);
                add(ganancia);
            } catch (SQLException e) {e.printStackTrace();}
        }
    }

    private class PanelBotones extends JPanel {
        JTextField condicion, fechaDia, fechaMes, fechaAño;
        LocalDate ahora = LocalDate.now();
        public PanelBotones(int total1, int total2, int total3, int total4, int total5, int total6, int total7, int total8, int total9, int total10, int total11, int total12, ResultSet venta, ResultSet pago) {
            setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
            setBounds(25, 520, 1025, 30);

            add(new JLabel("   Fecha:   "));
            condicion = new JTextField("=", 2);
            condicion.setHorizontalAlignment(SwingConstants.CENTER);
            add(condicion);

            add(new JLabel("  "));
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
            JButton consultaDia = new JButton("Consultar por fecha");
            consultaDia.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
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

                boolean flagCondicion = false;
                String cT = condicion.getText();
                if (
                    !cT.equals("=") &&
                    !cT.equals("<") &&
                    !cT.equals(">")
                ) {flagCondicion = true;}

                if (flagCondicion) {
                    JOptionPane.showMessageDialog(FrameConsulta.this, "La condicion esta mal escrita\n    Caracteres admitidos: =, <, >", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (flagDia) {
                    JOptionPane.showMessageDialog(FrameConsulta.this, "El dia esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (flagMes) {
                    JOptionPane.showMessageDialog(FrameConsulta.this, "El mes esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (flagAño) {
                    JOptionPane.showMessageDialog(FrameConsulta.this, "El año esta mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (flagFecha) {
                    JOptionPane.showMessageDialog(FrameConsulta.this, "La fecha ingresada esta despues de la actual", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                        Statement estado = DriverManager.getConnection("jdbc:ucanaccess://BaseDeDatos.accdb").createStatement();
                        String textoFecha = "#" + textoMes + "/" + textoDia + "/" + textoAño + "#";

                        if (cT.equals("=")){
                            ResultSet resultadoVenta = estado.executeQuery("SELECT * FROM Venta WHERE Day(Fecha) " + cT + " " + textoDia + " AND Month(Fecha) " + cT + " " + textoMes + " AND Year(Fecha) " + cT + " " + textoAño + " ORDER BY Fecha DESC, Hora DESC");
                            ResultSet resultadoPago = estado.executeQuery("SELECT * FROM Pago WHERE Day(Fecha) " + cT + " " + textoDia + " AND Month(Fecha) " + cT + " " + textoMes + " AND Year(Fecha) " + cT + " " + textoAño + " ORDER BY Fecha DESC, Hora DESC");
                            new FrameFecha(resultadoVenta, resultadoPago);
                        } else {
                            ResultSet resultadoVenta = estado.executeQuery("SELECT * FROM Venta WHERE Fecha " + cT + " " + textoFecha + " ORDER BY Fecha DESC, Hora DESC");
                            ResultSet resultadoPago = estado.executeQuery("SELECT * FROM Pago WHERE Fecha " + cT + " " + textoFecha + " ORDER BY Fecha DESC, Hora DESC");
                            new FrameFecha(resultadoVenta, resultadoPago);
                        }

                        estado.close();
                    } catch (SQLException | ClassNotFoundException ex) {ex.printStackTrace();}
                }
            }});
            add(consultaDia);

            add(Box.createHorizontalStrut(20));
            JButton verGraficos = new JButton("Ver graficos");
            verGraficos.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
                new FrameGraficos(total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, total11, total12);
            }});
            add(verGraficos);

            add(Box.createHorizontalStrut(20));
            JButton verGeneral = new JButton("Ver todos los datos");
            verGeneral.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
                new FrameGeneral(venta, pago);
            }});
            add(verGeneral);
        }
    }
}