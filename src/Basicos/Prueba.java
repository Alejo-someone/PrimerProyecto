package Basicos;
//import java.util.*;         Este modo importa todas las clases de java.util
import java.util.Scanner;       //Este modo importa solo la clase necesaria

public class Prueba {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();


        System.out.println("Hola " + nombre_usuario + " . El anio que viene tendras " + (edad+1) + " anios.");

    }
}
