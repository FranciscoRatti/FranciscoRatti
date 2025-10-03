import java.time.*;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.data.category.*;

public class FrameGraficos extends JFrame {
    public FrameGraficos(int total1, int total2, int total3, int total4, int total5, int total6, int total7, int total8, int total9, int total10, int total11, int total12) {
        int mesActual = LocalDate.now().getMonthValue();
        int añoActual = LocalDate.now().getYear();

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(total12, String.valueOf(total12), String.valueOf(FrameConsulta.getMesYAño(mesActual-11, añoActual)[0]));
        dataSet.addValue(total11, String.valueOf(total11), String.valueOf(FrameConsulta.getMesYAño(mesActual-10, añoActual)[0]));
        dataSet.addValue(total10, String.valueOf(total10), String.valueOf(FrameConsulta.getMesYAño(mesActual-9, añoActual)[0]));
        dataSet.addValue(total9, String.valueOf(total9), String.valueOf(FrameConsulta.getMesYAño(mesActual-8, añoActual)[0]));
        dataSet.addValue(total8, String.valueOf(total8), String.valueOf(FrameConsulta.getMesYAño(mesActual-7, añoActual)[0]));
        dataSet.addValue(total7, String.valueOf(total7), String.valueOf(FrameConsulta.getMesYAño(mesActual-6, añoActual)[0]));
        dataSet.addValue(total6, String.valueOf(total6), String.valueOf(FrameConsulta.getMesYAño(mesActual-5, añoActual)[0]));
        dataSet.addValue(total5, String.valueOf(total5), String.valueOf(FrameConsulta.getMesYAño(mesActual-4, añoActual)[0]));
        dataSet.addValue(total4, String.valueOf(total4), String.valueOf(FrameConsulta.getMesYAño(mesActual-3, añoActual)[0]));
        dataSet.addValue(total3, String.valueOf(total3), String.valueOf(FrameConsulta.getMesYAño(mesActual-2, añoActual)[0]));
        dataSet.addValue(total2, String.valueOf(total2), String.valueOf(FrameConsulta.getMesYAño(mesActual-1, añoActual)[0]));
        dataSet.addValue(total1, String.valueOf(total1), String.valueOf(FrameConsulta.getMesYAño(mesActual, añoActual)[0]));
        
        JFreeChart grafico = ChartFactory.createBarChart(
            "Ganancias por mes",
            "Mes",
            "Valor",
            dataSet
        );
        grafico.setTextAntiAlias(false);
        ChartPanel panel = new ChartPanel(grafico);
        add(panel);

        setBounds(300, 110, 890, 600);
        setTitle("Grafico");
        setIconImage(new ImageIcon("logoConsulta.gif").getImage());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}