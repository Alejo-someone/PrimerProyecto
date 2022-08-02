package Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

public class Procesador {
    
    public static void main(String[] args){

        marcoProcesador marco = new marcoProcesador();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoProcesador extends JFrame{

    public marcoProcesador(){

        setBounds(400, 400, 600, 250);
        laminaProcesador lamina = new laminaProcesador();
        add(lamina);
    }
}   

class laminaProcesador extends JPanel{

    public laminaProcesador(){

        setLayout(new BorderLayout());
        JPanel laminaMenu = new JPanel();
        JMenuBar barraMenu = new JMenuBar();
        
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamano = new JMenu("Tamano");

        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem serif = new JMenuItem("Serif");
        JMenuItem times = new JMenuItem("Times New Roman");
        fuente.add(arial);
        fuente.add(serif);
        fuente.add(times);

        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        estilo.add(negrita);
        estilo.add(cursiva);

        JMenuItem pequeno = new JMenuItem("10");
        JMenuItem mediano = new JMenuItem("16");
        JMenuItem grande = new JMenuItem("24");
        tamano.add(pequeno);
        tamano.add(mediano);
        tamano.add(grande);

        barraMenu.add(fuente);
        barraMenu.add(estilo);
        barraMenu.add(tamano);

        laminaMenu.add(barraMenu);
        add(laminaMenu, BorderLayout.NORTH);

        espacioTexto = new JTextArea(8, 20);
        espacioTexto.setFont(new Font("Helvetica", Font.PLAIN, 12));

        manejaFuente fonts = new manejaFuente();
        
        arial.addActionListener(fonts);
        serif.addActionListener(fonts);
        times.addActionListener(fonts);

        add(espacioTexto, BorderLayout.CENTER);

    }

    private class manejaFuente implements ActionListener{

        public void actionPerformed(ActionEvent e){

            if(e.getActionCommand().equalsIgnoreCase("arial")){

                espacioTexto.setFont(new Font("Arial", Font.PLAIN, 12));

            }else if(e.getSource().equalsIgnoreCase("serif")){

                espacioTexto.setFont(new Font("Serif", Font.PLAIN, 12));

            }else if(e.getSource().equals("times")){

                espacioTexto.setFont(new Font("Times New Roman", Font.PLAIN, 12));

            }
        }
    }

    private JTextArea espacioTexto; 
}

