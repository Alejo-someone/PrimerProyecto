package graficos;

import java.awt.*;
import javax.swing.*;

public class EscribiendoenMarco {
    public static void main(String[] args){
        MarcoconTexto myMarco = new MarcoconTexto();
        myMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoconTexto extends JFrame{
    public MarcoconTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(550, 300);
        setTitle("Primer test");
        Lamina lamina1 = new Lamina();
        add(lamina1);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int i = 10;
        int j = 30;

        for(int k = 0; k < 5; k++){

            g.drawString("Esta es la " + k + " linea que tendra nuestro marco", i, j);
            
            i += 10;
            j += 20;
        }

    }
}