import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameContrasena extends JFrame{
    public static void main(String[] args) {
        new FrameContrasena();
    }

    public FrameContrasena() {
        add(new PanelContrasena());

        setBounds(
            Toolkit.getDefaultToolkit().getScreenSize().width / 2- 85,
            Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 50,
            175, 75
        );
        setIconImage(new ImageIcon("logoConsulta.gif").getImage());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
            new FrameConsulta();
        } else {
            JOptionPane.showMessageDialog(FrameContrasena.this, "La contraseña es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}