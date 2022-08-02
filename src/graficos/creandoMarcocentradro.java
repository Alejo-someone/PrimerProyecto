package graficos;

import javax.swing.*;
import java.awt.*;

public class creandoMarcocentradro {
    public static void main(String[] args){
        MarcoCentrado marco2= new MarcoCentrado();
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setVisible(true);
        marco2.setTitle("Mi marco centrado xd");


    }
}

class MarcoCentrado extends JFrame{
    public MarcoCentrado(){
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension tamanioScreen = myScreen.getScreenSize();
        int alturaPantalla = tamanioScreen.height;
        int anchoPantalla = tamanioScreen.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        Image myIcon = myScreen.getImage("/Users/someone/Downloads/black.gif");
        setIconImage(myIcon);
    }
}
