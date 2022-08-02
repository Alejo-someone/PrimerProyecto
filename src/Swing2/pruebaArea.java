package Swing2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pruebaArea {
    
    public static void main(String[] args){

        marcoPrueba marcoA = new marcoPrueba();
        marcoA.setVisible(true);
        marcoA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoPrueba extends JFrame{

    public marcoPrueba(){

        setTitle("Pruebas de JTextArea");
        setBounds(450, 450, 600, 300);
        setLayout(new BorderLayout());
        laminaBotones = new JPanel();
        botonInsertar = new JButton("Insertar");

        botonInsertar.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                areaTexto.append("Este texto sera agregado mediante el boton Insertar...");
            }
        });

        laminaBotones.add(botonInsertar);
        botonSaltolinea = new JButton("Salto de linea");

        botonSaltolinea.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                boolean saltar = !areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);

                if(saltar){

                    botonSaltolinea.setText("Quitar salto de linea");
                }else{

                    botonSaltolinea.setText("Salto de linea");
                }
            }
        });

        laminaBotones.add(botonSaltolinea);
        add(laminaBotones, BorderLayout.SOUTH);

        areaTexto = new JTextArea(8, 20);
        laminaBarras = new JScrollPane(areaTexto);
        add(laminaBarras, BorderLayout.CENTER);
    }

    private JPanel laminaBotones;
    private JButton botonInsertar, botonSaltolinea; 
    private JTextArea areaTexto;
    private JScrollPane laminaBarras;
}
