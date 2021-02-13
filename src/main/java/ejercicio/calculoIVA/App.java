package ejercicio.calculoIVA;

import ejercicio.helpers.InputsNumbers;

import java.util.logging.SocketHandler;

public class App {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio del producto");

        Calculadora calculadora = new Calculadora(InputsNumbers.pedirDoublePositivo("El precio debe" +
                " ser mayor a O"));

        System.out.println("El precio final de su producto es: " + calculadora.calcularPrecioFinal());

    }


}
