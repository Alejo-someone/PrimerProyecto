package Poo;

public class Pruebas {
    public static void main(String args[]){

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonio");

        trabajador1.cambia_seccion("RRHH");

        System.out.println(trabajador1.devuelve_datos());
        System.out.println(trabajador2.devuelve_datos());
        System.out.println(trabajador3.devuelve_datos());

    }
}

class Empleados{

    private final String nombre;
    private String seccion;
    private int Id;
    private static int id_next = 1;

    public Empleados(String nom){

        nombre = nom;
        seccion = "Administracion";
        Id = id_next;
        id_next++;
    }

    public void cambia_seccion(String seccion){
        this.seccion = seccion;
    }

    public String devuelve_datos(){
        return "El nombre es "+ nombre+ ", su seccion es " +seccion + " y su ID es: " +Id;
    }
}