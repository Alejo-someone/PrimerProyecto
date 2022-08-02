package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;


public class primerDibujo {
    public static void main(String[] args){
        marco_dibujos marcoTest = new marco_dibujos();
        marcoTest.setVisible(true);
        marcoTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marco_dibujos extends JFrame{
    public marco_dibujos(){
        setTitle("Prueba de dibujo y pintado");
        setSize(400, 400);
        setLocation(350, 200);
        laminaFiguras lamina1 = new laminaFiguras();
        add(lamina1);
        lamina1.setBackground(SystemColor.window);
    }
}

class laminaFiguras extends JPanel{
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        //g.drawRect(50, 50, 300, 200);         metodo normal
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangle = new Rectangle2D.Double(100,100,250,125);
        g2.setPaint(Color.BLUE);
        g2.fill(rectangle);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangle);
        g2.setPaint(new Color(109,172,59).darker());
        g2.fill(elipse);
        //g2.draw(new Line2D.Double(100, 100, 350, 225));

        /*double centerX = rectangle.getCenterX();
        double centerY = rectangle.getCenterY();
        double radio = 125;
        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX+radio, centerY+radio);
        g2.draw(circle);*/
    }
}