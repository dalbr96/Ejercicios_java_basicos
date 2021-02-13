package ejercicio.eliminar_espacios;

import ejercicio.helpers.Inputs;

public class App {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese una frase");

        String frase = Inputs.pedirString();

        frase = frase.replace(" ", "");

        System.out.println(frase);
    }
}
