package Eventos1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cambioEstado {
    public static void main(String[] args){

        marcoEstado miMarco0 = new marcoEstado();
        miMarco0.setVisible(true);
        miMarco0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class marcoEstado extends JFrame{
    public marcoEstado(){
        setTitle("Probando estados de ventana");
        setBounds(300, 300, 500, 350);
        CambiaEstado nuevo_estado = new CambiaEstado();
        addWindowStateListener(nuevo_estado);
    }
}

class CambiaEstado implements WindowStateListener{

    public void windowStateChanged(WindowEvent e){
        //System.out.println("La ventana ha cambiado de estado");
        //System.out.println(e.getNewState());

        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta a pantalla completa");
        }else if(e.getNewState() == Frame.NORMAL){
            System.out.println("La ventana esta normal");
        }if(e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana esta minizada");
        }
    }
}
