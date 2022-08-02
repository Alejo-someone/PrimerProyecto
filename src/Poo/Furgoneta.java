package Poo;

public class Furgoneta extends Coche {
    
    private int capacidad_extra;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_extra){
        super(); //llama al constructor de la clase padre, para nuestro caso sera la clase Coche

        this.capacidad_extra = capacidad_extra;
        this.plazas_extra = plazas_extra;
    }

    public String dameDatosfurgoneta(){
        return "La capacidad de carga es: " + capacidad_extra + ", y las plazas son: " + plazas_extra; 
    }
}
