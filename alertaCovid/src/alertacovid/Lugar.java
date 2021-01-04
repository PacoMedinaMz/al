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

public class Lugar {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton b1, b2;
    
    Lugar(){
        out.println("Lugar");
        frame = new JFrame("Menu para lugares");
        frame.setSize(750, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        
        label = new JLabel("Menu para lugares");
        Font font = new Font("Agency FB", Font.BOLD, 48);
        label.setFont(font);
        panel.add(label);
        label.setBounds(125, 25, 550, 350);
        
        b1 = new JButton("Iniciar sesión");
        b1.setBounds(175, 300, 175, 50);
        b2 = new JButton("Dar de alta un lugar");
        b2.setBounds(400, 300, 225, 50);
        panel.add(b1);
        panel.add(b2);
        
        frame.setVisible(true);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                InicarLugar il = new InicarLugar();
                frame.setVisible(false);
            }
        });
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AltaLugar al = new AltaLugar();
                frame.setVisible(false);
            }
        });
    }    
}