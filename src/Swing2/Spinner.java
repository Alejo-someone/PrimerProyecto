package Swing2;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class Spinner {
    
    public static void main(String[] args){

        frameSpinner marcoZ = new frameSpinner();
        marcoZ.setVisible(true);
        marcoZ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class frameSpinner extends JFrame{

    public frameSpinner(){

        setBounds(450,350,600,200);
        laminaSpinner laminaZ = new laminaSpinner();
        add(laminaZ);
    }
}

class laminaSpinner extends JPanel{

    public laminaSpinner(){

        //String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1){

            public Object getNextValue(){

                return super.getPreviousValue();
            }
    
            public Object getPreviousValue(){
    
                return super.getNextValue();
            }
        });                                              //CLASE INTERNA ANONIMA

        DimensionUIResource d = new DimensionUIResource(150, 20);
        control.setPreferredSize(d);
        add(control);
    }

    /*private class spinnerModel extends SpinnerNumberModel{

        public spinnerModel(){

            super(5, 0, 10, 1);
        }

        public Object getNextValue(){

            return super.getPreviousValue();
        }

        public Object getPreviousValue(){

            return super.getNextValue();
        }
    }*/                                               //en lugar de esta clase podemos hacer una clase interna anonima
}
