package Poo;

public class Uso_vehiculo {
    public static void main(String args[]){
        
        Coche micoche1 = new Coche();

        micoche1.definir_color("Verde");
        micoche1.configura_climatizador("Si");

        Furgoneta mifurgo1 = new Furgoneta(5, 580);
        mifurgo1.definir_color("Rojo");
        mifurgo1.configura_asientos("Si");
        mifurgo1.configura_climatizador("SI");

        System.out.println(micoche1.dime_datos_comunes() + "\n" + micoche1.dime_color());
        System.out.println(mifurgo1.dime_datos_comunes() + "\n" + mifurgo1.dameDatosfurgoneta());




    }
}
