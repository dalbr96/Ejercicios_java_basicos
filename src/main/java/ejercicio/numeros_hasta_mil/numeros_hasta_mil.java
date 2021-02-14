package ejercicio;

import ejercicio.helpers.Inputs;

public class numeros_hasta_mil {

    public static void main(String[] args) {
        //Declarar variable
        int numero = 0;

        System.out.println("Ingrese un numero");

        //Si el numero es mayor a 1000, se le pide al usuario ingresar otro numero
        do{
            if ((numero > 1000)) {
                System.out.println("El numero debe ser mayor a 1000");
            }
            numero = Inputs.pedirInt();

        }while (numero > 1000);

        for (int i = numero; i <= 1000; i+=2) {
            System.out.println(i);
        }
    }

}
