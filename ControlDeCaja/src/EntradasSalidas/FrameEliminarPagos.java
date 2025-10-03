import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class FrameEliminarPagos extends JFrame{
    JTable tabla = new JTable();
    private String[] id = new String[10];
    private String[][] datos = new String[10][5];
    private String[] campos = {"Origen", "Fecha", "Hora", "Monto", "Destino"};
    public FrameEliminarPagos() {
        setLayout(new BorderLayout());

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Statement estado = DriverManager.getConnection("jdbc:ucanaccess://BaseDeDatos.accdb").createStatement();
            ResultSet resultado = estado.executeQuery("SELECT * FROM Pago ORDER BY Fecha DESC, Hora DESC");
            
            int fila = 0;
            while (resultado.next()) {
                if (fila < 10) {
                    id[fila] = resultado.getString("id");
                    datos[fila][0] = resultado.getString("Origen");
                    datos[fila][1] = resultado.getString("Fecha").substring(0, 10);
                    datos[fila][2] = resultado.getString("Hora").substring(11, 19);
                    datos[fila][3] = "$ " + resultado.getString("Monto");
                    datos[fila][4] = resultado.getString("Destino");
                    fila++;
                }
            }

            estado.close();
            resultado.close();
        } catch (SQLException | ClassNotFoundException e) {e.printStackTrace();}

        tabla = new JTable(datos, campos);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        add(new PanelBoton(), BorderLayout.SOUTH);

        setBounds(525, 250, 450, 257);
        setTitle("Eliminar registro de ventas");
        setIconImage(new ImageIcon("logoEntradasSalidas.gif").getImage());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private class PanelBoton extends JPanel {
        public PanelBoton() {
            JButton eliminar = new JButton("Eliminar registro");
            eliminar.addActionListener(new ActionListener() {public void actionPerformed (ActionEvent e) {
                if (tabla.getSelectedRowCount() == 1) {
                    int opcion = JOptionPane.showConfirmDialog(FrameEliminarPagos.this, "El registro eliminado no se podra recuperar ¿Desea continuar?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (opcion == 0) {
                        Consulta consulta = new Consulta(Consulta.UPDATE, "DELETE FROM Pago WHERE Id = " + id[tabla.getSelectedRow()]);
                        if (consulta.getFlag()) {
                            JOptionPane.showMessageDialog(FrameEliminarPagos.this, "Eliminacion completada con exito", "", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                            new FrameEliminarPagos();
                        }
                        else {JOptionPane.showMessageDialog(FrameEliminarPagos.this, "Error al eliminar", "", JOptionPane.ERROR_MESSAGE);}
                    }
                } else if (tabla.getSelectedRowCount() == 0) {
                    JOptionPane.showMessageDialog(FrameEliminarPagos.this, "Primero seleccione un registro", "Error", JOptionPane.ERROR_MESSAGE);
                } else {JOptionPane.showMessageDialog(FrameEliminarPagos.this, "Solo se puede eliminar un registro a la vez", "Error", JOptionPane.ERROR_MESSAGE);}
            }});
            add(eliminar);
        }
    }
}