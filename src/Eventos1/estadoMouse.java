package Eventos1;

import javax.swing.JFrame;
import javax.swing.event.*;
import java.awt.event.MouseEvent;


public class estadoMouse {
    public static void main(String[] args){

        marcoMouse marco3 = new marcoMouse();
        marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoMouse extends JFrame{

    public marcoMouse(){
        setTitle("Test de raton");
        setBounds(350, 350, 500, 400);
        setVisible(true);
        eventosMouse evento1 = new eventosMouse();
        addMouseMotionListener(evento1);
    }
}

class eventosMouse extends MouseInputAdapter {

    public void mouseDragged(MouseEvent e){
        System.out.println("Estas arrastrando");
    }

    public void mouseMoved(MouseEvent e){
        System.out.println("Estas moviendo el cursor");
    }
}
