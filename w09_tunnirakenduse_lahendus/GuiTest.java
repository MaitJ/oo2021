package v1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiTest {

    public static void main(String[] args) {
        JPanel menu = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        DrawingPanel drawingField = new DrawingPanel();
        JFrame frame = new JFrame("Gui test");
        frame.add(menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);


        Jadayhendus j1 = new Jadayhendus();
        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Sisend a = new Sisend();
        Sisend b = new Sisend();
        j1.lisa(l1);
        j1.lisa(l2);
        b.lisa(l2);
        a.lisa(l1);
        JButton button = new JButton("A");
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        menu.add(button, c);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.seisund(!l1.seisund);
                drawingField.repaint();
            }
        });

        JButton button2 = new JButton("B");
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        menu.add(button2, c);

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.weighty = 1;
        c.ipady = 300;
        c.gridwidth = 2;
        c.gridheight = 2;
        menu.add(drawingField, c);

        drawingField.lisaVoolujuht(l1);

        frame.setVisible(true);
        menu.setVisible(true);
    }
}
