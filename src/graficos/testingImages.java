package graficos;

import javax.swing.*;
import java.awt.*;
import java.io.*;

import javax.imageio.*;

public class testingImages {
    public static void main(String [] args){
        miMarc2 marco0 = new miMarc2();
        marco0.setVisible(true);
        marco0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miMarc2 extends JFrame{
    
    public miMarc2(){
        setSize(1000, 960);
        setLocation(10, 10);
        setTitle("Marco con imagenes");
        lamina lamina0 = new lamina();
        add(lamina0);
    }
}

class lamina extends JPanel{


    public lamina(){
        try{
            imagen = ImageIO.read(new File("./src/graficos/black.gif"));
        }catch(IOException e){
            System.out.println("No se ha podido encontrar tu imagen");
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchoImagen = imagen.getWidth(this);
        int altoImagen = imagen.getHeight(this);

        g.drawImage(imagen, 0, 0, null);
        for(int i = 0; i < 300; i++){
            for(int j = 0; j < 200; j++){
                g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen*i, altoImagen*j);
            }
        }
    }

    private Image imagen;
}
