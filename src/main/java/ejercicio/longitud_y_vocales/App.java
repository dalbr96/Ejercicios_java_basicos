package ejercicio.longitud_y_vocales;

import ejercicio.helpers.Inputs;

import javax.xml.transform.Source;

public class App {

    public static void main(String[] args) {

        System.out.println("Por favor ingrese una frase");

        GestorFrase frase = new GestorFrase(Inputs.pedirString());

        frase.imprimirResultados();
    }
}
