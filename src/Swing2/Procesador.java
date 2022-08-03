package Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanio = new JMenu("Tamano");

        configMenu("Arial", "Fuente", "Arial", 9, 10);
        configMenu("Times New Roman", "Fuente", "Times New Roman", 9, 10);
        configMenu("Calibri", "Fuente", "Calibri", 9, 10);

        configMenu("Negrita", "Estilo", "", Font.BOLD, 1);
        configMenu("Cursiva", "Estilo", "", Font.ITALIC, 1);

        configMenu("12", "Tamano", "12", 9, 12);
        configMenu("16", "Tamano", "16", 9, 16);
        configMenu("20", "Tamano", "20", 9, 20);
        configMenu("24", "Tamano", "24", 9, 24);

        barraMenu.add(fuente);
        barraMenu.add(estilo);
        barraMenu.add(tamanio);

        laminaMenu.add(barraMenu);
        add(laminaMenu, BorderLayout.NORTH);

        miArea = new JTextPane();
        add(miArea, BorderLayout.CENTER);

    }  

    public void configMenu(String rotulo, String menu, String tipo_letra, int style, int tam){

        JMenuItem elem_menu = new JMenuItem(rotulo);

        if(menu == "Fuente"){
            fuente.add(elem_menu);
        }else if(menu == "Estilo"){
            estilo.add(elem_menu);
        }else if(menu == "Tamano"){
            tamanio.add(elem_menu);
        }

        elem_menu.addActionListener(new gestionaEventos(rotulo, tipo_letra, style, tam));
    }

    private class gestionaEventos implements ActionListener{

        String tipo_texto, menu;
        int tamano_letra, estilo_letra;

        gestionaEventos(String elemento, String texto2, int estilo2, int tam_letra){

            tipo_texto = texto2;
            estilo_letra = estilo2;
            tamano_letra = tam_letra;
            menu = elemento;
        }

        public void actionPerformed(ActionEvent e){

            letras = miArea.getFont();

            if(menu == "Arial" || menu == "Times New Roman" || menu == "Calibri"){

                estilo_letra = letras.getStyle();
                tamano_letra = letras.getSize();

            }else if(menu == "Negrita" || menu == "Cursiva"){

                tipo_texto = letras.getFontName();
                tamano_letra = letras.getSize();

            }else if(menu == "12" || menu == "16" || menu == "20" || menu == "24"){

                tipo_texto = letras.getFontName();
                estilo_letra = letras.getStyle();
            }

            miArea.setFont(new Font(tipo_texto, estilo_letra, tamano_letra));
        }
    }
    private JTextPane miArea;
    private JMenu fuente, estilo, tamanio;
    private Font letras;
}

