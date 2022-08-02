package Swing2;

import javax.swing.*;
public class frameMenu {
    
    public static void main(String[] args){

        marcoMenu marco = new marcoMenu();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoMenu extends JFrame{

    public marcoMenu(){

        setBounds(450, 450, 600, 250);
        laminaMenu lamina = new laminaMenu();
        add(lamina);
    }
}

class laminaMenu extends JPanel{

    public laminaMenu(){

        JMenuBar miBarra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");

        archivo.add(guardar);
        archivo.add(guardarComo);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        herramientas.add(generales);
        opciones.add(opcion1);
        opciones.add(opcion2);
        edicion.add(opciones);

        miBarra.add(archivo);
        miBarra.add(edicion);
        miBarra.add(herramientas);
        add(miBarra);
    }
}