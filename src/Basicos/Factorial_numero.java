package Basicos;

import javax.swing.JOptionPane;

public class Factorial_numero {
    public static void main(String[] args){
        Long factorial = 1L;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero que deseas evaluar: "));

        for(int i = numero; i > 0; i--){
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es igual a " + factorial);
    }
}
