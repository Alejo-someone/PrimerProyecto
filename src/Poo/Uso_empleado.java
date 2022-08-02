package Poo;

import java.util.*;

public class Uso_empleado {
    public static void main(String args[]){
        
        /*Empleado empleado1 = new Empleado("Juan perez", 450, 2010 , 10, 29);
        Empleado empleado2  = new Empleado("Ana Martinez", 350, 2009 , 3, 19);
        Empleado empleado3 = new Empleado("David Nacimba", 4500, 2022 , 03, 14);

        empleado1.aumenta_sueldo(3);
        empleado2.aumenta_sueldo(6);
        empleado3.aumenta_sueldo(5);

        System.out.println("Nombre: "+empleado1.dame_nombre()+ " Sueldo: "+empleado1.dame_sueldo() + " Fecha de alta: "+ empleado1.dame_fecha());
        System.out.println("Nombre: "+empleado2.dame_nombre()+ " Sueldo: "+empleado2.dame_sueldo() + " Fecha de alta: "+ empleado2.dame_fecha());
        System.out.println("Nombre: "+empleado3.dame_nombre()+ " Sueldo: "+empleado3.dame_sueldo() + " Fecha de alta: "+ empleado3.dame_fecha());*/

        Jefatura jefe_RRHH = new Jefatura("Alejandro", 3402, 2009, 10, 28);
        jefe_RRHH.estableceIncentivo(320);

        Empleado misEmpleados[] = new Empleado[6];

        misEmpleados[0] = new Empleado("Juan Perez", 450, 2010, 10, 29);
        misEmpleados[1] = new Empleado("Ana Martinez", 350, 2009, 3, 19);
        misEmpleados[2] = new Empleado("David Nacimba", 4500, 2022, 3, 14);
        misEmpleados[3] = new Empleado("Olger Noguera");
        misEmpleados[4] = jefe_RRHH;    //Polimorfismo en accion. Principio de sustitucion.
        misEmpleados[5] = new Jefatura("Maria", 45000, 1999, 05, 17);

        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
        jefaFinanzas.estableceIncentivo(54000); 
        System.out.println("El bonus de la jefa de finanzas " + jefaFinanzas.dame_nombre() +  " es : " + jefaFinanzas.getBonus(1500));

        System.out.println(jefaFinanzas.takeDecisitions("dar el dia libre a todo el personal."));

        for(Empleado e: misEmpleados){
            e.aumenta_sueldo(5);    
        }

        Arrays.sort(misEmpleados);

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: "+ e.dame_nombre() + " Sueldo: "+ e.dame_sueldo() + " Fecha de alta: "+ e.dame_fecha());
        }
    }
}

class Empleado implements Comparable, Trabajadores{
    public Empleado(String nom, double sue, int anio, int mes, int dia){

            nombre = nom;
            sueldo = sue;
            ID = ID_next; 
            ID_next++;

            GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
            altaContrato = calendario.getTime();

    }

    public Empleado(String nom){
        this(nom, 3000, 2000, 1, 1);
    }

    public String dame_nombre(){ //getter
        return nombre + " con ID: " + ID;
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

    public int compareTo(Object myobjeto){
        Empleado otherEmpleado = (Empleado) myobjeto;

        if(this.ID < otherEmpleado.ID){
            return -1;
        }
        if(this.ID > otherEmpleado.ID){
            return 1; 
        }
        return 0;
    }

    public double getBonus(double bonus){
        return Trabajadores.bonus_base + bonus;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int ID;
    private static int ID_next = 1;

}

class Jefatura extends Empleado implements Jefes{
    public Jefatura(String nom, double sue, int anio, int mes, int dia){
        super(nom, sue, anio, mes, dia);
    }

    public void estableceIncentivo(double incentivo){
        this.incentivo = incentivo;
    }

    public double dame_sueldo(){
        double sueldoJefe = super.dame_sueldo();
        return sueldoJefe + incentivo;
    }

    public String takeDecisitions(String Decisition){
        return "Un miembro de la direccion ha tomado la decision de: " + Decisition;
    }

    public double getBonus(double bonus){
         double prima = 2000;

         return Trabajadores.bonus_base + prima + bonus;
    }
    private double incentivo;
}
