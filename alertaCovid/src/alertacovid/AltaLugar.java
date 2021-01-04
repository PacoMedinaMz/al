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

public class AltaLugar {
    private JFrame frame;
    private JPanel panel;
    private JLabel label, usr, pass, nomt, callet, numt, dest, colt, tipot;
    private JTextField id, nom, calle, num, des, col, tipo;
    private JPasswordField c;
    private JButton b1;
    
    AltaLugar(){
        frame = new JFrame("Alta de nuevos lugares");
        frame.setSize(750, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        
        label = new JLabel("Login de lugares");
        Font font = new Font("Agency FB", Font.BOLD, 38);
        label.setFont(font);
        panel.add(label);
        label.setBounds(225, 35, 450, 50);
        
        
        b1 = new JButton("Enviar");
        b1.setBounds(285, 525, 175, 50);
        panel.add(b1);
        
        Font f = new Font("Agency FB", Font.ITALIC, 22);
        usr = new JLabel("Ingresan el identificador:");
        pass = new JLabel("Ingresan la contraseña:");
        usr.setFont(f);
        usr.setBounds(50, 100, 350, 50);
        pass.setFont(f);
        pass.setBounds(50, 150, 450, 50);
        panel.add(usr);
        panel.add(pass);
        
        id = new JTextField();
        id.setBounds(400, 115, 225, 25);
        id.setFont(f);
        panel.add(id);
        
        c = new JPasswordField();
        c.setBounds(400, 165, 225, 25);
        panel.add(c);
       
        nomt = new JLabel("Nombre:");
        callet = new JLabel("Calle:");
        numt = new JLabel("Numero:");
        dest = new JLabel("Descripción:");
        colt = new JLabel("Colonia:");
        tipot = new JLabel("Tipo:");
        nom = new JTextField();
        calle = new JTextField();
        num = new JTextField();
        des = new JTextField();
        col = new JTextField();
        tipo = new JTextField();
        
        nomt.setFont(f);
        callet.setFont(f);
        numt.setFont(f);
        dest.setFont(f);
        colt.setFont(f);
        tipot.setFont(f);
        nom.setFont(f);
        calle.setFont(f);
        num.setFont(f);
        des.setFont(f);
        col.setFont(f);
        tipo.setFont(f);
        
        nomt.setBounds(50, 200, 450, 50);
        callet.setBounds(50, 250, 450, 50);
        numt.setBounds(50, 300, 450, 50);
        dest.setBounds(50, 350, 450, 50);
        colt.setBounds(50, 400, 450, 50);
        tipot.setBounds(50, 450, 450, 50);
        nom.setBounds(400, 215, 225, 25);
        calle.setBounds(400, 265, 225, 25);
        num.setBounds(400, 315, 225, 25);
        des.setBounds(400, 365, 225, 25);
        col.setBounds(400, 415, 225, 25);
        tipo.setBounds(400, 465, 225, 25);
        
        panel.add(nomt);
        panel.add(callet);
        panel.add(numt);
        panel.add(dest);
        panel.add(colt);
        panel.add(tipot);
        panel.add(nom);
        panel.add(calle);
        panel.add(num);
        panel.add(des);
        panel.add(col);
        panel.add(tipo);
        
        frame.setVisible(true);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //CodigoLugar cl = new CodigoLugar();
                frame.setVisible(false);
            }
        });
    }
}
