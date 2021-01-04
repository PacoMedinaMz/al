/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertacovid;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author zerme
 */
public class Opciones {
    private JFrame frame;
    private JPanel panel;
    private JLabel mensaje, t;
    private JButton b2, b3;
    private int opc=1;
    
    Opciones(){
        frame = new JFrame ("Bienvenido");
        frame.setSize(650, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        t = new JLabel("¿Qué quieres hacer?");
        panel.add(t);
        t.setBounds(125, 50, 450, 100);
        Font font = new Font("Agency FB", Font.BOLD, 34);
        t.setFont(font);
        
        //b1 = new JButton("Alerta");
        //b1.setBounds(278, 138, 95, 50);
        b2 = new JButton("Estado");
        b2.setBounds(175, 200, 95, 50);
        b3 = new JButton("Visita");
        b3.setBounds(375,200,95,50);
        //panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        
        //b3.addActionListener(MostrarEstado());
        b2.addActionListener(new ActionListener() { 
            @Override public void actionPerformed(ActionEvent e) { 
                //opc = 2;
                JFrame estado = new JFrame("Estado");
                estado.setBounds(250, 250, 400, 300);
                //estado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mensaje = new JLabel();
                Font font = new Font("Agency FB", Font.BOLD, 38);
                mensaje.setFont(font);
                //mensaje.setBounds(90, 10, 295, 100);
                JPanel panelE = new JPanel();
                panelE.setLayout(null);
                //panelE.setBackground(Color.RED);
                switch(opc){
                    case 0:
                        panelE.remove(mensaje);
                        panelE.setBackground(Color.GREEN);
                        mensaje.setText("    Limpio    ");
                        mensaje.setBounds(90, 10, 295, 100);
                        panelE.add(mensaje);
                        break;
                    case 1:
                        panelE.remove(mensaje);
                        panelE.setBackground(Color.YELLOW);
                        mensaje.setText("En Contacto");
                        mensaje.setBounds(90, 10, 295, 100);
                        panelE.add(mensaje);
                        break;
                    case 2:
                        panelE.remove(mensaje);
                        panelE.setBackground(Color.RED);
                        mensaje.setText("Contagiado");
                        mensaje.setBounds(90, 10, 295, 100);
                        panelE.add(mensaje);
                        break;
                }
                //panelE.add(mensaje);
                JButton regreso = new JButton("Tuve contracto");
                regreso.setBounds(125, 100, 150, 35);
                panelE.add(regreso);
                estado.add(panelE);
                estado.setResizable(false);
                estado.setVisible(true);
                
                JButton l = new JButton("Limpio");
                l.setBounds(125, 135, 150, 35);
                panelE.add(l);
                estado.add(panelE);
                estado.setResizable(false);
                estado.setVisible(true);
                
                JButton c = new JButton("Contagiado");
                c.setBounds(125, 170, 150, 35);
                panelE.add(c);
                estado.add(panelE);
                estado.setResizable(false);
                estado.setVisible(true);
                
                regreso.addActionListener(new ActionListener(){
                    @Override public void actionPerformed(ActionEvent a){
                        opc=1;
                        panelE.setBackground(Color.YELLOW);
                        panelE.remove(mensaje);
                        panelE.remove(regreso);
                        mensaje.setText("En Contacto");
                        //mensaje.setBounds(90, 10, 295, 100);
                        //regreso.setBounds(80,100 , 60, 80);
                        panelE.add(mensaje);
                        panelE.add(regreso);
                        
                        
                    }
                });
                
                l.addActionListener(new ActionListener(){
                    @Override public void actionPerformed(ActionEvent a){
                        opc=0;
                        panelE.setBackground(Color.GREEN);
                        panelE.remove(mensaje);
                        panelE.remove(regreso);
                        mensaje.setText("    Limpio    ");
                        //mensaje.setBounds(90, 10, 295, 100);
                        //regreso.setBounds(80,100 , 60, 80);
                        panelE.add(mensaje);
                        panelE.add(regreso);
                        
                        
                    }
                });
                
                c.addActionListener(new ActionListener(){
                    @Override public void actionPerformed(ActionEvent a){
                        opc=2;
                        panelE.setBackground(Color.RED);
                        panelE.remove(mensaje);
                        panelE.remove(regreso);
                        mensaje.setText("Contagiado");
                        //mensaje.setBounds(90, 10, 295, 100);
                        //regreso.setBounds(80,100 , 60, 80);
                        panelE.add(mensaje);
                        panelE.add(regreso);
                        
                        
                    }
                });
            } 
        }); 
        
        b3.addActionListener(new ActionListener() { 
            @Override public void actionPerformed(ActionEvent e) { 
                //opc = 2;
                JFrame estado = new JFrame("Codigo del lugar");
                estado.setBounds(350, 350, 400, 300);
                //estado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mensaje = new JLabel();
                Font font = new Font("Agency FB", Font.BOLD, 28);
                mensaje.setFont(font);
                //mensaje.setBounds(90, 10, 295, 100);
                JPanel panelE = new JPanel();
                panelE.setLayout(null);
                //panelE.setBackground(Color.RED);
               
                //panelE.add(mensaje);
                JButton regreso = new JButton("Enviar");
                regreso.setBounds(125, 170, 150, 35);
                panelE.add(regreso);
                estado.add(panelE);
                estado.setResizable(false);
                estado.setVisible(true);
                
                JTextField cod = new JTextField();
                cod.setFont(font);
                cod.setBounds(125, 120, 150, 35);
                panelE.add(cod);
                
                JLabel l = new JLabel("Ingrese el codigo: ");
                l.setFont(font);
                l.setBounds(50, 25, 300, 75);
                panelE.add(l);
                
                regreso.addActionListener(new ActionListener(){
                    @Override public void actionPerformed(ActionEvent a){
                        JFrame v = new JFrame("Visita");
                        v.setBounds(350, 350, 400, 300);
                        //estado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JLabel men = new JLabel();
                        Font font = new Font("Agency FB", Font.BOLD, 28);
                        men.setFont(font);
                        //mensaje.setBounds(90, 10, 295, 100);
                        JPanel pE = new JPanel();
                        pE.setLayout(null);
                        //panelE.setBackground(Color.RED);
               
                        //panelE.add(mensaje);
                        JButton ter = new JButton("Terminar");
                        ter.setBounds(125, 170, 150, 35);
                        pE.add(ter);
                        estado.add(pE);
                        estado.setResizable(false);
                        estado.setVisible(true);
                        
                        JLabel l = new JLabel("Estas en una visita");
                        l.setFont(font);
                        l.setBounds(50, 25, 300, 75);
                        pE.add(l);                
                        
                    }
                });
            } 
        }); 
        frame.setVisible(true);
    }
    void MostrarEstado(){
        
    }   
}