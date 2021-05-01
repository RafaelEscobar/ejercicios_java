import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo String");

        //Metodo length
        String HOL = "ADSI";
        System.out.println("La cantidad de caracteres de la cadena es: "+HOL.length());

        //Substring
        System.out.println("El caracter de la posición 1 es: "+HOL.substring(1,2));

        //toLowerCase
        String cad = "Hola me llamo Rafael Escobar";
        System.out.println("La frase en minúsculas es: "+cad.toLowerCase()+", y es mayúsculas es: "+cad.toUpperCase());

        //equalsIgnoreCase
        String cad1 = "Hola me llamo Rafael Escobar";
        System.out.println("Son iguales los valores? "+cad.equalsIgnoreCase(cad1));

        // replaceAll
        String cad2 = "Hola, mi nombre es Rafael Escobar";
        System.out.println("El texto a reemplazar es Rafael "+cad2.replaceAll("Rafael", "Eduardo"));

        //String a int

        String let = "45";
        int num = 23;
        int num1 = Integer.parseInt(let);
        System.out.println("La suma de los dos valores es: "+(num+num1));

        //pedir datos
        Scanner edad = new Scanner(System.in);
        System.out.println("Ingrese su edad por favor: ");
        String nueva = edad.nextLine();
        System.out.println("Su edad es: "+nueva);

        
        
    }
}
