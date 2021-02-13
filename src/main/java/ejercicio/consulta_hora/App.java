package ejercicio.consulta_hora;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) {

        Calendar calendario = new GregorianCalendar();

        int anho = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);

        String fecha_formateada = "(" + anho + "/" + mes+ "/" + dia + ")";
        String hora_formateada = "(" +hora + ":" + minutos + ":" + segundos+ ")";


        System.out.println("La fecha y actual es: " + fecha_formateada + hora_formateada);
    }
}
