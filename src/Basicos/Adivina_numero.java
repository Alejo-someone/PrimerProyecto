package Basicos;
import java.util.*;

public class Adivina_numero {
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);

        int tries = 0;
        int random = (int)(Math.random()*100);
        int num = 0;

        while(num != random){
            System.out.println("Ingresa un numero entre 0 y 100: ");

            num = entry.nextInt();

            if(num < random){
                System.out.println("Mas alto");
            }else if(num > random){
                System.out.println("Mas bajo");                
            }

            tries++;
        }

        System.out.println("Lo lograste, y solo te costo " + tries + " intentos.");
        
    }
}
