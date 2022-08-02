package Eventos1;

import javax.swing.*;
import java.awt.event.*;

public class eventoVentana {
    public static void main(String[] args){
        marcoVentana marco1 = new marcoVentana();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoVentana marco2 = new marcoVentana();
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}

class marcoVentana extends JFrame{
    public marcoVentana(){
        setTitle("Marco con respuestas");
        setBounds(400, 400, 450, 350);
        setVisible(true);
        mVentana oyenteVentana = new mVentana();
        addWindowListener(oyenteVentana);

    }
}

class mVentana extends WindowAdapter{
   
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    }

}
