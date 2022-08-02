package Eventos1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pruebaEventos {
    public static void main(String[] args){
        marcoConbotones marco1 = new marcoConbotones();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true);
    }
}

class marcoConbotones extends JFrame{
    public marcoConbotones(){
        setTitle("Marco con botones");
        setBounds(550, 325, 400, 400);
        laminaBoton lamina1 = new laminaBoton();
        add(lamina1);
    }
}

class laminaBoton extends JPanel{
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public laminaBoton(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        colorFondo yellow = new colorFondo(Color.YELLOW);
        colorFondo blue = new colorFondo(Color.BLUE);
        colorFondo red = new colorFondo(Color.RED);
    
        botonAzul.addActionListener(blue);
        botonAmarillo.addActionListener(yellow);
        botonRojo.addActionListener(red);
    }

    private class colorFondo implements ActionListener{
        public colorFondo(Color c){
            colordeFondo = c;
        }
    
        public void actionPerformed(ActionEvent e){
            setBackground(colordeFondo);
        }
    
        private Color colordeFondo;
    }
}

