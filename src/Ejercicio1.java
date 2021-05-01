import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception{
        //Pedimos el nombre
        System.out.println("Por favor ingrese su nombre: ");

        //Lo guardamos
        Scanner nombre = new Scanner(System.in);
        String nombrein = nombre.nextLine();
        nombre.close();

        //Declaramos variables para comparar y así evitamos problemas con mayúsculas
        String prima = "A";
        String segun = "E";
        String terc = "I";
        String cuart = "O";
        String quint = "U";
Hola 
        //Lo análizamos con condicionales
        //Si el nombre comienza con A o con E mostramos el nombre en consola
        if (nombrein.substring.toLowerCase(1, 1) == prima || nombrein.substring.equalsIgnoreCase(1, 1) == segun){
            System.out.println("Su nombre es: "+nombrein);
        }
        else if(nombrein.substring(1, 1) == "I" || nombrein.substring(1, 1) == "O"){

        }

    }
}
