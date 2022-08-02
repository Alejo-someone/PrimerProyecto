package graficos;

import javax.swing.*;

public class Creating_marcos {
    public static void main(String [] args){
        miMarco marco1 = new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miMarco extends JFrame{
    public miMarco(){
        //setSize(500, 400);
        //setLocation(650, 350);                                Inicia la ventana en las coordenadas que se especifica
        setBounds(650, 350, 500, 400);
        //setResizable(false);                                  Permite el reajuste de la ventana
        //setExtendedState(Frame.MAXIMIZED_BOTH);                 Le da un estado inicial de maximizado a la ventana
        setTitle("Mi primer programa");
    }
}
