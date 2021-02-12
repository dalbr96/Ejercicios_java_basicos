package ejercicio.mayor_menor;

import java.util.Scanner;

public class Interaccion {
    //Declarar variables

    private Mayor numeros;


    public static int pedirNumero(String numeroS){
        int numero = 0;
        boolean validateInput = false;
        do{
            try{
                System.out.println("Por favor ingrese el " + numeroS);
                Scanner in = new Scanner(System.in);
                numero = in.nextInt();
                validateInput = true;
            }catch (Exception e){
                System.out.println("El dato ingresado debe ser un numero entero");
                System.out.println("----------------------------");
            }
        }while (!validateInput);
        return numero;
    }

}
