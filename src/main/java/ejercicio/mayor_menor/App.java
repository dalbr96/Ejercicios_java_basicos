package ejercicio.mayor_menor;

import ejercicio.helpers.Inputs;

public class App {
    private static void primerEjercicio(){
        System.out.println("Primer Ejercicio: valores quemados");
        Mayor primerPunto = new Mayor(4, 34);
        primerPunto.compararNumeros();
    }

    private static void segundoEjercicio(){
        int primerNumero;
        int segundoNumero;
        System.out.println("Segundo Ejercicio: valores por consola");
        System.out.println("Por favor, ingrese el primer numero");
        primerNumero = Inputs.pedirInt();
        System.out.println("Por favor, ingrese el segundo numero");
        segundoNumero = Inputs.pedirInt();
        Mayor segundoPunto = new Mayor(primerNumero,segundoNumero);
        segundoPunto.compararNumeros();
    }

    public static void main(String[] args) {

        App.primerEjercicio();

        System.out.println("***************************************");

        App.segundoEjercicio();
    }
}
