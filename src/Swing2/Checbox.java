package Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Checbox {
    
    public static void main(String[] args){

        marcoCheck marcoBox = new marcoCheck();
        marcoBox.setVisible(true);
        marcoBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoCheck extends JFrame{

    public marcoCheck(){

        setTitle("Checbox");
        setBounds(440, 440, 600, 300);
        laminaCheck laminaBox = new laminaCheck();
        add(laminaBox);

    }
}

class laminaCheck extends JPanel{

    public laminaCheck(){

        setLayout(new BorderLayout());
        
        Font letra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("Este sera nuestro texto de prueba para las CheckBoxs");
        texto.setFont(letra);

        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);

        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");
        check1.addActionListener(new manejaChecks());
        check2.addActionListener(new manejaChecks());

        JPanel laminaChecks  = new JPanel();
        laminaChecks.add(check1);
        laminaChecks.add(check2);
        add(laminaChecks, BorderLayout.SOUTH);
    }

    private class manejaChecks implements ActionListener{

        public void actionPerformed(ActionEvent e){

            int tipo = 0;

            if(check1.isSelected()) tipo += Font.BOLD;

            if(check2.isSelected()) tipo += Font.ITALIC;

            texto.setFont(new Font("Serif", tipo, 24));
        }
    }


    private JLabel texto;
    private JCheckBox check1, check2;
}
