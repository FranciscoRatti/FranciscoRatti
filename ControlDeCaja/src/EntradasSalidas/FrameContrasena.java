import java.awt.event.*;
import javax.swing.*;

public class FrameContrasena extends JFrame{
    public FrameContrasena() {
        add(new PanelContrasena());

        setBounds(660, 350, 175, 75);
        setIconImage(new ImageIcon("logoEntradasSalidas.gif").getImage());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    JPasswordField contraseña = new JPasswordField(10);
    private class PanelContrasena extends JPanel {
        public PanelContrasena() {
            contraseña.setHorizontalAlignment(SwingConstants.CENTER);
            add(contraseña);

            InputMap mapa = getInputMap(WHEN_IN_FOCUSED_WINDOW);
            mapa.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enter");
            ActionMap accion = getActionMap();
            accion.put("enter", new AbstractAction() {public void actionPerformed (ActionEvent e) {enter(new String(contraseña.getPassword()));}});
        }
    }

    public void enter(String contraseña) {
        if (contraseña.equals("2507")) {
            dispose();
            new FrameEliminarPagos();
        } else {
            JOptionPane.showMessageDialog(FrameContrasena.this, "La contraseña es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}