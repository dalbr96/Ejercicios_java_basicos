package ejercicio.electrodomesticos;

import ejercicio.electrodomesticos.objetos.Electrodomestico;
import ejercicio.electrodomesticos.objetos.Lavadora;
import ejercicio.electrodomesticos.objetos.Televisor;


public class App {



    private static void llenarArreglo(Electrodomestico[] electrodomesticos){
        electrodomesticos[0] = new Televisor(200, "Blanco", 'D', 20, 46, true);
        electrodomesticos[1] = new Televisor(300,  80);
        electrodomesticos[2] = new Televisor(600, "Azul", 'A', 20, 46, false);
        electrodomesticos[3] = new Lavadora(200, "Gris", 'D', 20, 46);
        electrodomesticos[4] = new Lavadora(200, 80);
        electrodomesticos[5] = new Lavadora();
        electrodomesticos[6] = new Televisor();
        electrodomesticos[7] = new Electrodomestico(200, "Rojo", 'D', 100);
        electrodomesticos[8] = new Electrodomestico(800, 20);
        electrodomesticos[9] = new Electrodomestico();
    }

    private static int[] calcularPrecioFinal(Electrodomestico[] electrodomesticos){
        int precioTV = 0;
        int precioLavadora = 0;
        int precioTotal = 0;
        int[]totales = new int[3];

        for(Electrodomestico electrodomestico : electrodomesticos){
            if(electrodomestico instanceof Televisor){
                precioTV += electrodomestico.precioFinal();
            }
            else if(electrodomestico instanceof Lavadora){
                precioLavadora += electrodomestico.precioFinal();
            }
            precioTotal += electrodomestico.precioFinal();
        }

        totales[0] = precioTV;
        totales[1] = precioLavadora;
        totales[2] = precioTotal;

        return totales;
    }

    public static void main(String[] args) {

        int precioTelevisores;
        int precioLavadoras ;
        int precioElectrodomesticos;

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        llenarArreglo(electrodomesticos);

        precioTelevisores = calcularPrecioFinal(electrodomesticos)[0];
        precioLavadoras = calcularPrecioFinal(electrodomesticos)[1];
        precioElectrodomesticos = calcularPrecioFinal(electrodomesticos)[2];

        System.out.println("El precio total de los electrodomesticos es: " + precioElectrodomesticos);
        System.out.println("El precio total de los televisores es: " + precioTelevisores);
        System.out.println("El precio total de las lavadoras es: " + precioLavadoras);

    }

}
