package ejercicio.reemplazar_texto;

import ejercicio.helpers.Inputs;

public class App {

    public static void main(String[] args) {

        String fraseQuemada = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println("Por favor ingrese una frase");

        String frase = Inputs.pedirString();

        fraseQuemada = fraseQuemada.replace('a', 'e');

        String fraseConcadenada = fraseQuemada.concat(frase);

        System.out.println(fraseConcadenada);

    }

}
