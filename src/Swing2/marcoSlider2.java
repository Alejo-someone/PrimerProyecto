package Swing2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class marcoSlider2 {
    
    public static void main(String[] args){

        frameSlider2 marcoY = new frameSlider2();
        marcoY.setVisible(true);
        marcoY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class frameSlider2 extends JFrame{

    public frameSlider2(){

        setBounds(350, 450, 600, 200);
        frameLamina2 laminaY = new frameLamina2();
        add(laminaY);
    }
}

class frameLamina2 extends JPanel{

    public frameLamina2(){

        setLayout(new BorderLayout());
        rotulo = new JLabel("Aqui viene otra vez nuestro texto de prueba xd .....");
        add(rotulo, BorderLayout.CENTER);

        control2 = new JSlider(8, 58, 12);
        control2.setMajorTickSpacing(25);
        control2.setMinorTickSpacing(5);
        control2.setPaintTicks(true);
        control2.setPaintLabels(true);
        control2.setSnapToTicks(true);
        control2.setFont(new Font("Times New Roman", Font.ITALIC, 10));
        JPanel laminaXY = new JPanel();
        control2.addChangeListener(new eventoSlider());
        laminaXY.add(control2);
        add(laminaXY, BorderLayout.NORTH);
    }

    private class eventoSlider implements ChangeListener{

        public void stateChanged(ChangeEvent e){

            rotulo.setFont(new Font("Times New Roman", Font.PLAIN, control2.getValue()));
        }
    }

    private JSlider control2;
    private JLabel rotulo;
}