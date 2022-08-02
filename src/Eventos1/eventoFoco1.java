package Eventos1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class eventoFoco1 {
    public static void main(String[] args){

        marcoFocus marquito = new marcoFocus();
        marquito.setVisible(true);
        marquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoFocus extends JFrame{

    public marcoFocus(){

        setBounds(300, 300, 599, 499);
        setTitle("Marco con Focus1");
        add(new laminaFocus());
    }
}

class laminaFocus extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(80, 10, 150, 20);
        cuadro2.setBounds(80, 60, 150, 20);
        add(cuadro1);
        add(cuadro2);
        focusSelector focoP = new focusSelector();
        cuadro1.addFocusListener(focoP);
    }

    private class focusSelector implements FocusListener{

        public void focusGained(FocusEvent e) {
  
        }
    
        public void focusLost(FocusEvent e) {
    
            String email = cuadro1.getText();
            boolean comprobacion = false;

            for(int i = 0; i < email.length(); i++){
                if(email.charAt(i) == '@'){
                    comprobacion = true;
                }
            }

            if(comprobacion){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        }
    }

    JTextField cuadro1;
    JTextField cuadro2;
}

