package Layouts;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Layout2_calculadora {
    
    public static void main(String[] args){

        marcoCalculadora calculadora = new marcoCalculadora();
        calculadora.setVisible(true);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class marcoCalculadora extends JFrame{

    public marcoCalculadora(){

        setTitle("Calculadora");
        setBounds(400, 400, 450, 350);

        pantalla visualizacion = new pantalla();
        add(visualizacion);
        // pack();                                          Da tamanio personalizado a los elementos de nuestra ventana
    }
}

class pantalla extends JPanel{

    public pantalla(){

        principio = true;
        setLayout(new BorderLayout());
        pantallita = new JButton("0");
        pantallita.setEnabled(false);
        add(pantallita, BorderLayout.NORTH);

        botones = new JPanel();
        botones.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new insertarNumero();
        ActionListener ordenar = new orden();
        insertarBoton("7", insertar);
        insertarBoton("8", insertar);
        insertarBoton("9", insertar);
        insertarBoton("/", ordenar);
        insertarBoton("4", insertar);
        insertarBoton("5", insertar);
        insertarBoton("6", insertar);
        insertarBoton("*", ordenar);
        insertarBoton("1", insertar);
        insertarBoton("2", insertar);
        insertarBoton("3", insertar);
        insertarBoton("-", ordenar);
        insertarBoton("0", insertar);
        insertarBoton(",", insertar);
        insertarBoton("+", ordenar);
        insertarBoton("=", ordenar);

        add(botones, BorderLayout.CENTER);
        ultimaOperacion = "=";
    }

    private void insertarBoton(String rotulo, ActionListener oyente){

        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        botones.add(boton);
    }

    private class insertarNumero implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String entrada = e.getActionCommand();

            if(principio){

                pantallita.setText("");
                principio = false;
            }

            pantallita.setText(pantallita.getText() + entrada);           
        }
    }

    private class orden implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantallita.getText()));
            ultimaOperacion = operacion;
            principio = true;
        }

        public void calcular(Double num){

            if(ultimaOperacion.equals("+")){

                resultado += num;
            }
            else if(ultimaOperacion.equals("-")){

                resultado -= num;
            }
            else if(ultimaOperacion.equals("*")){

                resultado *= num;
            }
            else if(ultimaOperacion.equals("/")){

                resultado /= num;
            }
            else if(ultimaOperacion.equals("=")){

                resultado = num;
            }

            pantallita.setText("" + resultado);
        }
    }

    private JPanel botones;
    private JButton pantallita;
    private boolean principio;
    private Double resultado;
    private String ultimaOperacion;
}


