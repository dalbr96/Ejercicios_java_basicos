package ejercicio.area;

import ejercicio.helpers.Inputs;

public class App {

    public static void main(String[] args) {

        System.out.println("Por favor, ingrese el radio del circulo");

        Circulo circulo = new Circulo(Inputs.pedirDoublePositivo("El radio debe ser mayor a 0"));

        System.out.println("El area del circulo es: "+ circulo.getArea());

    }
}
