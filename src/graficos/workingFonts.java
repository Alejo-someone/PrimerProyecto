package graficos;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;

public class workingFonts {
    public static void main(String[] args){
        marcos marcoText = new marcos();
        marcoText.setVisible(true);
        marcoText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcos extends JFrame{
    public marcos(){
        setTitle("Probando las fuentes en nuestras ventanas");
        setSize(640, 400);
        setLocation(300, 300);
        lamine lamineTest = new lamine();
        add(lamineTest);
        lamineTest.setBackground((Color.DARK_GRAY).brighter().brighter());
        lamineTest.setForeground(Color.ORANGE);
    }
}

class lamine extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; 
        Font myfont = new FontUIResource("Helvetica", Font.ITALIC, 28);
        g2.setFont(myfont);
        g2.drawString("David Nacimba", 100, 100);
    }
}

