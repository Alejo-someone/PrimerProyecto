package Swing2;

import javax.swing.*;
import java.awt.event.*;

public class marcoArea {
    
    public static void main(String[] args){

        marcoArea1 marco0 = new marcoArea1();
        marco0.setVisible(true);
        marco0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class marcoArea1 extends JFrame{

    public marcoArea1(){

        setBounds(400, 400 , 550, 550);
        setTitle("Area de texto");
        laminaArea lamina1 = new laminaArea();
        add(lamina1);

    }
}

class laminaArea extends JPanel{

    public laminaArea(){

        miArea = new JTextArea(8, 20);
        JScrollPane laminaBarras = new JScrollPane(miArea);
        // miArea.setLineWrap(true);
        add(laminaBarras);

        JButton boton1 = new JButton("Ingresar");
        boton1.addActionListener(new gestionaArea());
        add(boton1);
    }

    private class gestionaArea implements ActionListener{


        public void actionPerformed(ActionEvent e) {

            System.out.println(miArea.getText());
        }
    }

    private JTextArea miArea;
}
