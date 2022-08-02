package Swing2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class botonRadio2 {
    
    public static void main(String[] args){

        marcoRadio2 marco8 = new marcoRadio2();
        marco8.setVisible(true);
        marco8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoRadio2 extends JFrame{

    public marcoRadio2(){

        setBounds(350, 350, 600, 250);
        laminaRadio2 lamina8 = new laminaRadio2();
        add(lamina8);
    }
}

class laminaRadio2 extends JPanel{

    public laminaRadio2(){

        setLayout(new BorderLayout());
        texto = new JLabel("Este texto es para las pruebas de JRadio....");
        texto.setFont(new Font("Serif", Font.PLAIN, 13));
        add(texto, BorderLayout.CENTER);
        laminaBotones = new JPanel();
        migrupo = new ButtonGroup();

        colocarBotones("Pequenio", false, 10);
        colocarBotones("Mediano", true, 16);
        colocarBotones("Grande", false, 20);
        colocarBotones("XXL", false, 26);

        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void colocarBotones(String nombre, boolean selecc, final int tamanio){

        JRadioButton boton = new JRadioButton(nombre, selecc);
        migrupo.add(boton);
        laminaBotones.add(boton);

        ActionListener mievento = new ActionListener(){

            public void actionPerformed(ActionEvent e){

                texto.setFont(new Font("Serif", Font.PLAIN, tamanio));
            }
        };

        boton.addActionListener(mievento);
    }

    private JLabel texto;
    private ButtonGroup migrupo;
    private JPanel laminaBotones;
}