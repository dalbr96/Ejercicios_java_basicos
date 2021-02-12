package ejercicio.mayor_menor;

public class App {
    private static void primerEjercicio(){
        System.out.println("Primer Ejercicio: valores quemados");
        Mayor primerPunto = new Mayor(4, 34);
        primerPunto.compararNumeros();
    }

    private static void segundoEjercicio(){
        System.out.println("Segundo Ejercicio: valores por consola");
        Mayor segundoPunto = new Mayor(Interaccion.pedirNumero("Primer numero"),
                Interaccion.pedirNumero("Segundo numero"));
        segundoPunto.compararNumeros();
    }

    public static void main(String[] args) {

        App.primerEjercicio();

        System.out.println("***************************************");

        App.segundoEjercicio();
    }
}
