package Poo;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTempo {
    public static void main(String [] args){

        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsa OK para acabar");
            System.exit(0);
    }
}

class Reloj{

    public void enMarcha(int intervalo, boolean sonido){
        class damelaHora2 implements ActionListener{
            public void actionPerformed(ActionEvent evento){
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3 sg: " + ahora);
                if(sonido){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oyente = new damelaHora2();
        Timer miTempo = new Timer(intervalo, oyente);
        miTempo.start();
    }
}
