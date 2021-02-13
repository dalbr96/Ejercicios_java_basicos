package ejercicio.dias_laborales;

import ejercicio.helpers.Inputs;

import javax.xml.transform.Source;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        boolean validador;
        System.out.println("Por favor ingrese un dia de la semana");
        do {
            String dia = Inputs.pedirString();
            switch (dia.toLowerCase()){
                case "lunes":
                case "martes":
                case "miercoles":
                case "jueves":
                case "viernes":
                    System.out.println("Dia laboral");
                    validador = true;
                    break;
                case "sabado":
                case "domingo":
                    System.out.println("Dia no laboral");
                    validador = true;
                    break;
                default:
                    System.out.println("No ingreso un dia de la semana");
                    System.out.println("Por favor intente de nuevo");
                    validador = false;
                    break;
                }
            }while (!validador);
    }
}
