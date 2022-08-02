package Eventos1;

import java.awt.event.*;
import javax.swing.*;

public class estadoTeclas {
    public static void main(String[] args){

        marcoTeclas TestMarco = new marcoTeclas();
        TestMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class marcoTeclas extends JFrame{

    public marcoTeclas(){
        setTitle("Prueba de evento de teclas");
        setVisible(true);
        setBounds(300, 300, 500, 350);
        eventoTeclado tecla = new eventoTeclado();
        addKeyListener(tecla);
    }
}

class eventoTeclado implements KeyListener{

    public void keyPressed(KeyEvent e) {
        //System.out.println(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
        
    }

    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println(letra);
    }
    
}