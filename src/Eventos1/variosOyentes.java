package Eventos1;

import javax.swing.*;
import java.awt.event.*;

public class variosOyentes {
    public static void main(String[] args){

        marcoS marcoPrincipal = new marcoS();
        marcoPrincipal.setVisible(true);
        marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoS extends JFrame{

    public marcoS(){

        setTitle("Varios oyentes");
        setBounds(1200, 200, 350, 150);
        lamines laminaPrincipal = new lamines();
        add(laminaPrincipal);
    }
}

class lamines extends JPanel{

    public lamines(){
        
        JButton boton_Nuevo = new JButton("NUEVO");
        add(boton_Nuevo);
        boton_Cerrartodo = new JButton("CERRAR TODO");
        add(boton_Cerrartodo);

        nuevoOyente mioyente = new nuevoOyente();
        boton_Nuevo.addActionListener(mioyente);
    }

    private class nuevoOyente implements ActionListener{

        public void actionPerformed(ActionEvent e){

            MarcoEmergente marco = new MarcoEmergente(boton_Cerrartodo);
            marco.setVisible(true);

        }
    }
    JButton boton_Cerrartodo;
}

class MarcoEmergente extends JFrame{

    public MarcoEmergente(JButton boton_principal){

        contador++;
        setTitle("Ventana " + contador);
        setBounds(40*contador, 40*contador, 300, 150);
        cierreVentanas oyenteCerrar = new cierreVentanas();
        boton_principal.addActionListener(oyenteCerrar);

    }

    private class cierreVentanas implements ActionListener{

        public void actionPerformed(ActionEvent e){

            dispose();
        }
    }
    private static int contador = 0;
}

