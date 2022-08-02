package Swing2;

import javax.swing.*;

public class botonRadio {
    
    public static void main(String[] main){

        marcoRadio marco7 = new marcoRadio();
        marco7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco7.setVisible(true);
    }
}

class marcoRadio extends JFrame{

    public marcoRadio(){

        setBounds(350, 350, 600, 250);
        laminaRadio lamina7 = new laminaRadio();
        add(lamina7);

    }
}

class laminaRadio extends JPanel{

    public laminaRadio(){

        ButtonGroup grupo1 = new ButtonGroup();
        JRadioButton boton1 = new JRadioButton("Amarillo", true);
        JRadioButton boton2 = new JRadioButton("Azul", false);
        JRadioButton boton3 = new JRadioButton("Rojo", false);
        grupo1.add(boton1);
        grupo1.add(boton2);
        grupo1.add(boton3);

        add(boton1);
        add(boton2);
        add(boton3);


    }
}

