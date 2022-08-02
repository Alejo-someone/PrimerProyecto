package Basicos;

import javax.swing.*;

public class Entrada_metodo2 {
    public static void main(String[] args){
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre: ");

        String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
        
        int edad_usuario = Integer.parseInt(edad);

        System.out.println("Hola " + nombre_usuario + ". El siguiente anio tendras " + (edad_usuario+1) + " anios.");
        
    }
}
