import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception{
        //Pedimos el nombre
        System.out.println("Por favor ingrese su nombre: ");

        //Lo guardamos
        Scanner nombre = new Scanner(System.in);
        String nombrein = nombre.nextLine();
        nombre.close();
        

        //Lo análizamos con condicionales
        //Si el nombre comienza con A o con E mostramos el nombre en consola
        if (nombrein.startsWith("A") || nombrein.startsWith("E")){
            System.out.println("Su nombre es: "+nombrein);
        }
        else if(nombrein.substring(1, 1) == "I" || nombrein.substring(1, 1) == "O"){

        }

    }
}
