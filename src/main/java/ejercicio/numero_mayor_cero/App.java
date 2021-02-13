package ejercicio.numero_mayor_cero;

import ejercicio.helpers.InputsNumbers;

public class App {
    public static void main(String[] args) {

        double numero;
        do{

            System.out.println("Por favor ingrese un numero mayor o igual a 0");
            numero = InputsNumbers.pedirDouble();
            
        }while (numero<0);


        System.out.println("El numero ingresado es: " + numero);

    }
}
