package Swing2;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class campoPassword {
    
    public static void main(String[] args){

        marcoPass newMarco = new marcoPass();
        newMarco.setVisible(true);
        newMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoPass extends JFrame{

    public marcoPass(){

        setTitle("Comprobacion de Password");
        // setBounds(550, 250, 400, 400);
        laminaPassword newLamine = new laminaPassword();
        add(newLamine);
        pack();
    }
}

class laminaPassword extends JPanel{

    public laminaPassword(){

        setLayout(new BorderLayout());
        JPanel upLamine = new JPanel();
        upLamine.setLayout(new GridLayout(2, 2));
        add(upLamine, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contrasenia");
        JTextField cUsuario = new JTextField(15);
        cPassword = new JPasswordField(15);

        accederPass evento = new accederPass();
        cPassword.getDocument().addDocumentListener(evento);

        upLamine.add(etiqueta1);
        upLamine.add(cUsuario);
        upLamine.add(etiqueta2);
        upLamine.add(cPassword);

        JButton botonConfirmacion = new JButton("Acceder");
        add(botonConfirmacion, BorderLayout.SOUTH);
    }

    private class accederPass implements DocumentListener{

        public void insertUpdate(DocumentEvent e) {

            char[] contrasena;

            contrasena = cPassword.getPassword();

            if(contrasena.length < 8 || contrasena.length > 12){

                cPassword.setBackground((Color.RED).brighter().brighter());
            }else{

                cPassword.setBackground((Color.WHITE));
            }
        }

        public void removeUpdate(DocumentEvent e) {    
            
            char[] contrasena;

            contrasena = cPassword.getPassword();

            if(contrasena.length < 8 || contrasena.length > 12){

                cPassword.setBackground((Color.RED).brighter().brighter());
            }else{

                cPassword.setBackground((Color.WHITE));
            }
        }

        public void changedUpdate(DocumentEvent e) {            
        }

    }

    private JPasswordField cPassword;
}
