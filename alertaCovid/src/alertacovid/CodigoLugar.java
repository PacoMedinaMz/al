package alertacovid;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.out;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CodigoLugar {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton b1;
    
    CodigoLugar(String cod){
        out.println("Lugar");
        frame = new JFrame("Código del lugar");
        frame.setSize(550, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        
        label = new JLabel(cod);
        Font font = new Font("Agency FB", Font.BOLD, 48);
        label.setFont(font);
        panel.add(label);
        label.setBounds(50, 25, 350, 100);
        
        b1 = new JButton("Salir");
        b1.setBounds(175, 200, 175, 50);
        panel.add(b1);
        
        frame.setVisible(true);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
}
}
