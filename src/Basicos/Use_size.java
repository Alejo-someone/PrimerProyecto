package Basicos;

import java.util.Scanner;

public class Use_size {
    
    enum Talla{

        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private Talla(String abrev){
            this.abrev = abrev;
        }

        public String giveAbrev(){
            return abrev;
        }

        private String abrev;
    }

    public static void main(String [] args){
        Scanner entry = new Scanner(System.in);
        System.out.println("Ingresa la talla que deseas: MINI, MEDIANO, GRANDE, MUY GRANDE");
        String entry_dates = entry.nextLine().toUpperCase();

        Talla theSize = Enum.valueOf(Talla.class, entry_dates);
        System.out.println("Talla = " +theSize);
        System.out.println("Abreviatura = " + theSize.giveAbrev());

    }
}
