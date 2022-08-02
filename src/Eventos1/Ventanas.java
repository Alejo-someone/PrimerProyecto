package Eventos1;

import javax.swing.JFrame;
import java.awt.event.*;

public class Ventanas extends JFrame implements WindowFocusListener{
    public static void main(String[] args){

        Ventanas Vent = new Ventanas();
        Vent.iniciar();
    }

    public void iniciar(){

        marco1 = new Ventanas();
        marco2 = new Ventanas();

        marco1.setVisible(true);
        marco1.setBounds(300, 300, 500, 500);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);

        marco2.setVisible(true);
        marco2.setBounds(900, 300, 500, 500);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.addWindowFocusListener(this);
    }

    public void windowGainedFocus(WindowEvent e) {
        
        if(e.getSource() == marco1){
            marco1.setTitle("Tengo el foco!!!");
        }else{
            marco2.setTitle("Tengo el foco!!!");
        }
    }

    public void windowLostFocus(WindowEvent e) {
        
        if(e.getSource() == marco1){
            marco1.setTitle(":(");
        }else{
            marco2.setTitle(":(");
        }
    }

    Ventanas marco1;
    Ventanas marco2;
}

