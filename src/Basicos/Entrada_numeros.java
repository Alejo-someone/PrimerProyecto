package Basicos;

import javax.swing.*;

public class Entrada_numeros {
    public static void main(String[] args){

        String num = JOptionPane.showInputDialog("Introduce un numero: ");
        double num1 = Double.parseDouble(num);


        System.out.print("La raiz de "+ num1 + " es ");
        System.out.printf("%1.2f \n",Math.sqrt(num1));
    }
}
