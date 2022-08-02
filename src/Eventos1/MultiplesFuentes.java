package Eventos1;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class MultiplesFuentes {
    public static void main(String[] args){

        marcoAcciones marco4 = new marcoAcciones();
        marco4.setVisible(true);
        marco4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoAcciones extends JFrame{

    public marcoAcciones(){

        setTitle("Probando multiples acciones");
        setBounds(10, 10, 1300, 1400);
        panelControl lamina4 = new panelControl();
        add(lamina4);
    }
}

class panelControl extends JPanel{

    public panelControl(){
        /*JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");

        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);*/

        accionColor accionAmarillo = new accionColor("Amarillo",  Color.YELLOW);
        accionColor accionAzul = new accionColor("Azul", Color.BLUE);
        accionColor accionRojo = new accionColor("Rojo", Color.RED);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

        InputMap mapa = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke teclaYellow = KeyStroke.getKeyStroke("shift A");
        KeyStroke teclaBlue = KeyStroke.getKeyStroke("shift B");
        KeyStroke teclaRed = KeyStroke.getKeyStroke("shift C");

        mapa.put(teclaYellow, "fondoAmarillo");
        mapa.put(teclaBlue, "fondoAzul");
        mapa.put(teclaRed, "fondoRojo");

        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondoAmarillo", accionAmarillo);
        mapaAccion.put("fondoAzul", accionAzul);
        mapaAccion.put("fondoRojo", accionRojo);
    }

    private class accionColor extends AbstractAction{

        public accionColor(String nombre, Color colorBoton){
    
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color" + nombre);
            putValue("Color_Fondo", colorBoton);

        }
    
        public void actionPerformed(ActionEvent e) {
            
            Color c = (Color)getValue("Color_Fondo");
            setBackground(c);
            System.out.println(getValue(Action.SHORT_DESCRIPTION));
        }
    }


}

