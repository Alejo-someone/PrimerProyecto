package Swing2;

import java.awt.Font;

import javax.swing.*;

public class marcoSlider {
    
    public static void main(String[] args){

        frameSlider marcoX = new frameSlider();
        marcoX.setVisible(true);
        marcoX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class frameSlider extends JFrame{

    public frameSlider(){

        setBounds(450, 350, 600, 300);
        frameLamina laminaX = new frameLamina();
        add(laminaX);
    }
}

class frameLamina extends JPanel{

    public frameLamina(){

        JSlider control = new JSlider(0, 100, 25);
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Times New Roamn", Font.ITALIC, 10));
        control.setSnapToTicks(true);
        add(control);
    }   
}
