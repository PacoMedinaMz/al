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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InicarLugar {
    private JFrame frame;
    private JPanel panel;
    private JLabel label, usr, pass;
    private JTextField usr1;
    private JPasswordField c;
    private JButton b1;
    
    InicarLugar(){
        out.println("Login de lugares");
        frame = new JFrame("Login de lugares");
        frame.setSize(750, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        
        label = new JLabel("Login de lugares");
        Font font = new Font("Agency FB", Font.BOLD, 38);
        label.setFont(font);
        panel.add(label);
        label.setBounds(225, 65, 450, 50);
        
        b1 = new JButton("Iniciar sesión");
        b1.setBounds(315, 450, 175, 50);
        panel.add(b1);
        
        Font f = new Font("Agency FB", Font.ITALIC, 22);
        usr = new JLabel("Ingresan el identificador:");
        pass = new JLabel("Ingresan la contraseña:");
        usr.setFont(f);
        usr.setBounds(255, 150, 350, 50);
        pass.setFont(f);
        pass.setBounds(255, 280, 450, 50);
        panel.add(usr);
        panel.add(pass);
        
        usr1 = new JTextField();
        usr1.setBounds(255, 200, 275, 35);
        usr.setFont(f);
        panel.add(usr1);
        
        c = new JPasswordField();
        c.setBounds(255, 330, 275, 35);
        panel.add(c);
        
        frame.setVisible(true);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String p = usr1.getText();
                out.print(p);
                CodigoLugar cl = new CodigoLugar(p);
                frame.setVisible(false);
            }
        });
    }
}
