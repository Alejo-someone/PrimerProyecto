package Swing2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pruebaTexto {
    public static void main(String[] args){

        marcoTexto marco5 = new marcoTexto();
        marco5.setVisible(true);
        marco5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class marcoTexto extends JFrame{

    public marcoTexto(){

        setTitle("Prueba de texto");
        setBounds(500, 450, 350, 350);
        laminaTexto lamina5 = new laminaTexto();
        add(lamina5);

    }
}

class laminaTexto extends JPanel{

    public laminaTexto(){

        setLayout(new BorderLayout());

        JPanel sublamina = new JPanel();
        sublamina.setLayout(new FlowLayout());

        resultado = new JLabel("",JLabel.CENTER);
        JLabel texto1 = new JLabel("email: ");
        sublamina.add(texto1);
        campo1 = new JTextField(20);
        sublamina.add(campo1);
        //System.out.println(campo1.getText().trim());            .trim() permite ignorar los espacios adicionales

        add(resultado, BorderLayout.CENTER);
        JButton boton1 = new JButton("Validar");
        Dametexto evento1 = new Dametexto();
        boton1.addActionListener(evento1);
        sublamina.add(boton1);
        add(sublamina, BorderLayout.NORTH);
    }

    private class Dametexto implements ActionListener{

        public void actionPerformed(ActionEvent e){

            int correcto = 0;
            String email = campo1.getText().trim();

            for(int i = 0; i < email.length(); i++){

                if(email.charAt(i) == '@'){

                    correcto++;
                }
            }

            if(correcto != 1){

                resultado.setText("Ingrese un email valido");
            }else{

                resultado.setText("Correcto");
            }
        }
    }

    private JTextField campo1;
    private JLabel resultado;
}   
