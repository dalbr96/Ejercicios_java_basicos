package ejercicio.helpers;

import java.util.Scanner;

public class Inputs {

    /**
     * Pide un entero al usuario por consola
     * @return El numero que el usuario metio. null si el input del usuario no es valido.
     */
    public static int PedirInt(){

        Integer numero;

        try{
            System.out.println("Por favor ingrese el numero");
            Scanner in = new Scanner(System.in);
            numero = in.nextInt();
        }catch (Exception e){
            numero = null;
            System.out.println("El dato ingresado debe ser un numero entero");
        }
        return numero;
    }
}
