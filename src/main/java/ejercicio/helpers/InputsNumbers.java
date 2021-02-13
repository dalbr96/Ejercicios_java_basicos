package ejercicio.helpers;

import java.util.Scanner;

public class InputsNumbers {

    /**
     * Metodo para pedirle un numero entero al usuario. El metodo continua en el bucle hasta que
     * el input del usuario sea valido.
     * @return El numero que dado por el usuario.
     */
    public static int pedirInt(){
        int numero = 0;
        boolean validador = false;
        do {
            try{
                Scanner in = new Scanner(System.in);
                numero = in.nextInt();
                validador = true;
            }catch (Exception e){
                System.out.println("El dato ingresado debe ser un numero entero");
                System.out.println("Por favor intente de nuevo");
            }
        }while(!validador);

        return numero;
    }

    public static double pedirDouble(){
        double numero = 0;
        boolean validador = false;
        do {
            try{
                Scanner in = new Scanner(System.in);
                numero = Double.parseDouble(in.nextLine());
                validador = true;
            }catch (Exception e){
                System.out.println("El dato ingresado debe ser un numero");
                System.out.println("Por favor intente de nuevo");
            }
        }while(!validador);

        return numero;
    }

    public static double pedirDoublePositivo(String mensajeError){
        double numero;
        boolean validador;
        do{
            numero = pedirDouble();
            if(numero > 0){
                validador = true;
            }
            else{
                System.out.println(mensajeError);
                System.out.println("Por favor intente de nuevo");
                validador = false;
            }
        }while (!validador);
        return numero;
    }

}
