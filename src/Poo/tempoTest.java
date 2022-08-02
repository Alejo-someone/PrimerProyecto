package Poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;

public class tempoTest {
    public static void main(String[] args){

        giveHour oyente = new giveHour();
        Timer myTempo = new Timer(5000, oyente);
        myTempo.start();
        JOptionPane.showMessageDialog(null, "Pulsa ACEPTAR  para salir.");
        System.exit(0);
    }
}


class giveHour implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Date now = new Date();
        System.out.println("te pongo la hora cada 5 segundos: " + now);
    }
}