import java.awt.Font;
import java.sql.*;
import javax.swing.*;

public class FrameGeneral extends JFrame{
    public FrameGeneral(ResultSet venta, ResultSet pago) {
        setLayout(null);

        add(new PanelVenta(venta));
        add(new PanelPago(pago));

        setBounds(250, 150, 1000, 510);
        setTitle("Todos los datos");
        setIconImage(new ImageIcon("logoConsulta.gif").getImage());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private class PanelVenta extends JPanel {
        private String[][] datos = new String[5000][5];
        private String[] campos = {"Fecha", "Monto", "Contado", "Debito", "Transferencia"};
        public PanelVenta(ResultSet resultado) {
            try {
                int fila = 0;
                while (resultado.next()) {
                    datos[fila][0] = resultado.getString("Fecha").substring(0, 10);
                    datos[fila][1] = "$ " + resultado.getString("Monto");
                    
                    if (resultado.getBoolean("Contado")) {datos[fila][2] = "TRUE";}
                    else {datos[fila][2] = " ";}
                    if (resultado.getBoolean("Debito")) {datos[fila][3] = "TRUE";}
                    else {datos[fila][3] = " ";}
                    if (resultado.getBoolean("Transferencia")) {datos[fila][4] = "TRUE";}
                    else {datos[fila][4] = " ";}

                    fila++;
                }
            } catch (SQLException e) {e.printStackTrace();}

            JLabel texto = new JLabel("- VENTAS -");
            texto.setFont(new Font(null, Font.BOLD, 18));
            add(texto);

            add(new JScrollPane(new JTable(datos, campos)));

            setBounds(5, 5, 490, 750);
        }
    }

    private class PanelPago extends JPanel {
        private String[][] datos = new String[500][5];
        private String[] campos = {"Fecha", "Monto", "Destino"};
        public PanelPago(ResultSet resultado) {
            try {
                int fila = 0;
                while (resultado.next()) {
                    datos[fila][0] = resultado.getString("Fecha").substring(0, 10);
                    datos[fila][1] = "$ " + resultado.getString("Monto");
                    datos[fila][2] = resultado.getString("Destino");
                    fila++;
                }
            } catch (SQLException e) {e.printStackTrace();}

            JLabel texto = new JLabel("- PAGOS -");
            texto.setFont(new Font(null, Font.BOLD, 18));
            add(texto);

            add(new JScrollPane(new JTable(datos, campos)));

            setBounds(495, 5, 490, 750);
        }
    }
}