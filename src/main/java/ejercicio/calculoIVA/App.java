package ejercicio.calculoIVA;

import ejercicio.helpers.Inputs;

public class App {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio del producto");

        Calculadora calculadora = new Calculadora(Inputs.pedirDoublePositivo("El precio debe" +
                " ser mayor a O"));

        System.out.println("El precio final de su producto es: " + calculadora.calcularPrecioFinal());

    }


}
