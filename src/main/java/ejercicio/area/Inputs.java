package ejercicio.area;

import java.util.Scanner;

public class Inputs {

    public static double pedirRadio(){
        double numero = 0;
        boolean validateInput = false;
        do{
            try{
                System.out.println("Por favor ingrese el radio");
                Scanner in = new Scanner(System.in);
                numero = in.nextDouble();
                if (numero > 0f) {
                    validateInput = true;
                }
                else{
                    validateInput = false;
                    System.out.println("El radio debe ser mayor a 0");
                    System.out.println("----------------------------");
                }
            }catch (Exception e){
                System.out.println("El dato ingresado debe ser un numero");
                System.out.println("----------------------------");
            }
        }while (!validateInput);
        return numero;
    }
}
