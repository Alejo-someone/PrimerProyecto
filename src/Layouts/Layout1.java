package Layouts;

import java.awt.*;
import javax.swing.*;

public class Layout1 {
    
    public static void main(String[] args){

        marco1 main_marco = new marco1();
        main_marco.setVisible(true);
        main_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marco1 extends JFrame{

    public marco1(){

        setTitle("Tipos de layouts");
        setBounds(400, 400, 350, 500);
        lamina1 main_lamina = new lamina1();
        add(main_lamina, BorderLayout.NORTH);
        lamina2 second_lamina = new lamina2();
        add(second_lamina, BorderLayout.SOUTH);
    }
}

class lamina1 extends JPanel{

    public lamina1(){

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarillo"));
        add(new JButton("Azul"));
        
    }
}

class lamina2 extends JPanel{

    public lamina2(){

        setLayout(new BorderLayout());
        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.CENTER);
        add(new JButton("Negro"), BorderLayout.EAST);
    }
}