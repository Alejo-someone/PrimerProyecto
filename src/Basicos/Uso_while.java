package Basicos;

import javax.swing.*;

public class Uso_while {
    public static void main(String[] args){

        String password = "Alejandro";
        String pass = "";

        while(password.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introduce la contrasenia: "); 

            if( password.equals(pass) == false){
                System.out.println("Contrasenia incorrecta");
            }
        }

        System.out.println("Contrasenia correcta\nBIENVENIDO!!!!!!!!!");
    }
}
