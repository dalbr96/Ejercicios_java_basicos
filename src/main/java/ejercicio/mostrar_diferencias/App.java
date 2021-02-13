package ejercicio.mostrar_diferencias;

import ejercicio.helpers.Inputs;

public class App {

    public static void main(String[] args) {

        int longitudMaxima;
        int longitudMinima;

        System.out.println("Por favor, ingrese la primer palabra");
        String primerPalabra = Inputs.pedirString();

        System.out.println("Por favor, ingrese la segunda palabra");
        String segundaPalabra = Inputs.pedirString();

        //Comparar las longitudes de las palabras para delimitar el ciclo
        if (primerPalabra.length() > segundaPalabra.length()) {
            longitudMaxima = primerPalabra.length();
            longitudMinima = segundaPalabra.length();
        }
        else if (primerPalabra.length() < segundaPalabra.length()) {
            longitudMaxima = segundaPalabra.length();
            longitudMinima = primerPalabra.length();
        }
        else{
                longitudMaxima = segundaPalabra.length();
                longitudMinima = longitudMaxima;
            }

        //Creacion arreglo diferencias
        char[] diferencias = new char[longitudMaxima];

        boolean condicionIndice;
        boolean condicionIgualdad;
        if (!primerPalabra.equalsIgnoreCase(segundaPalabra)) {
            for (int i = 0; i < longitudMaxima; i++) {

                condicionIndice = i >= longitudMinima;
                //Si cualquier palabra es mas grande que la otra, los espacios en blanco se marcan como diferencia
                if (condicionIndice) {
                    diferencias[i] = '-';
                }
                else{
                    condicionIgualdad = primerPalabra.toLowerCase().charAt(i) == segundaPalabra.toLowerCase().charAt(i);
                    //Si las letras son diferentes, se marca como diferencia
                    if (!condicionIgualdad) {
                    diferencias[i] = '-';
                    }
                    else{
                        diferencias[i] = ' ';
                    }
                }
            }
            System.out.println("Las palabras son diferentes. Las diferencias se marcan con un -");
            System.out.println(primerPalabra);
            System.out.println(segundaPalabra);
            System.out.println(diferencias);
        }
        else {
            System.out.println("Las palabras son iguales");
        }
    }

}
