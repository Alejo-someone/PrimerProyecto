package Poo;

import java.util.GregorianCalendar;
import java.util.Date;

public class Use_person {
    public static void main(String [] args){
        person [] thepeople = new person[2];

        thepeople[0] = new Empleado2("Luis Conde", 4300, 2009, 10, 04);
        thepeople[1] = new student("Juan Corsa", "Administracion");

        for(person p: thepeople){
            System.out.println(p.giveName() + ", " + p.giveDescription());
        }
    }
}

abstract class person{ 

    public person(String nom){
        name = nom;
    }

    public String giveName(){
        return name;
    }

    public abstract String giveDescription();

    private String name;
}

class Empleado2 extends person{
    public Empleado2(String nom, double sue, int anio, int mes, int dia){

            super(nom);
            sueldo = sue;
            ID = ID_next; 
            ID_next++;

            GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
            altaContrato = calendario.getTime();

    }

    public String giveDescription(){
        return "El empleado tiene un Id "+ID + " con un sueldo de " + sueldo;
    }

    public double dame_sueldo(){ //getter
        return sueldo;
    }

    public Date dame_fecha(){ //getter
        return altaContrato;
    }

    public void aumenta_sueldo(double porcentaje){ //setter
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    private double sueldo;
    private Date altaContrato;
    private int ID;
    private static int ID_next = 1;

}

class student extends person{
    public student(String nom, String carr){
        super(nom);
        carrera = carr;
    }

    public String giveDescription(){
        return "Este alumno esta estudiando la carrera de " +carrera;
    }

    private String carrera;
}