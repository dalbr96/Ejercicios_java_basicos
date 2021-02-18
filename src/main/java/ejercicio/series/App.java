package ejercicio.series;

import ejercicio.series.objetos.Serie;
import ejercicio.series.objetos.Videojuego;

public class App {

    private static void llenarSeries(Serie[] series){
        series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        series[1] = new Serie("Game of Thrones", 8, "Fantasy Drama", "David Benioff and D. B. Weiss");
        series[2] = new Serie("The Crown", 4, " Drama", "Peter Morgan");
        series[3] = new Serie("Dark", "Baran bo Odar and Jantje Friese");
        series[4] = new Serie("Altered Carbon", 2, "Cyberpunk", "Laeta Kalogridis");
    }

    private static void llenarJuegos(Videojuego[] videojuegos){
        videojuegos[0] = new Videojuego("Dark Souls", 36, "Fantasia", "FromSoftware");
        videojuegos[1] = new Videojuego("Warcraft III", 20, "Estrategia", "Blizzard");
        videojuegos[2] = new Videojuego("Age Of Empires II: DE", 21, "Estrategia", "Microsoft");
        videojuegos[3] = new Videojuego("Call of Duty", 40);
        videojuegos[4] = new Videojuego("World Of Warcraft", 100, "Fantasia", "Blizzard");

    }

    private static void entregarSeries(Serie[] series){
        series[0].entregar();
        series[3].entregar();
    }

    private static void entregarJuegos(Videojuego[] videojuegos){
        videojuegos[2].entregar();
        videojuegos[1].entregar();
        videojuegos[4].entregar();
    }

    private static void contarSeriesEntregadas(Serie[] series){
        int numeroSeries = 0;
        for(Serie serie : series){
            if(serie.isEntregado()){
                numeroSeries++;
                serie.devolver();
            }
        }
        System.out.println("Hay " + numeroSeries + " series entregadas");
    }

    private static void contarVideojuegosEntregados(Videojuego[] videojuegos){
        int numeroJuegos = 0;

        for(Videojuego juego : videojuegos){
            if(juego.isEntregado()){
                numeroJuegos++;
                juego.devolver();
            }
        }
        System.out.println("Hay " + numeroJuegos + " videojuegos entregados");
    }

    private static void serieMasTemporadas(Serie[] series){
        Serie serieMasTemporadas = new Serie("temporal", 0, "temporal", "temporal");

        for(int i = 0; i < series.length; i++){
            if(series[i].compareTo(serieMasTemporadas)){
                serieMasTemporadas = series[i];
            }
        }
        System.out.println("La serie con mas horas estimadas es: ");
        System.out.println(serieMasTemporadas);
    }

    private static void juegoMasHoras(Videojuego[] videojuegos){
        Videojuego videoJuegoMasHoras = new Videojuego("Temporal", 0);

        for(Videojuego juego : videojuegos){
            if(juego.compareTo(videoJuegoMasHoras)){
                videoJuegoMasHoras = juego;
            }
        }
        System.out.println("El video juego con mas horas estimadas es: ");
        System.out.println(videoJuegoMasHoras);
    }

    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        llenarSeries(series);
        llenarJuegos(videojuegos);

        entregarSeries(series);
        entregarJuegos(videojuegos);

        System.out.println("------------------------");
        contarSeriesEntregadas(series);
        System.out.println("------------------------");
        contarVideojuegosEntregados(videojuegos);

        System.out.println("------------------------");
        serieMasTemporadas(series);
        System.out.println("------------------------");
        juegoMasHoras(videojuegos);

    }

}
