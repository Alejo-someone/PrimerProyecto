package Basicos;

public class Manipula_cadenasII {
    public static void main(String[] args){
        
        /*String frase = "Este es mi primer dia programando oficialmente en Java";
        String resumen_frase = frase.substring(0,35) + " sobre string.";
        
        System.out.println(resumen_frase);*/

        String persona1, persona2;

        persona1 = "Alejandro";
        persona2 = "alejandro";

        System.out.println(persona1.equals(persona2));

        System.out.println(persona1.equalsIgnoreCase(persona2));
    }
}
