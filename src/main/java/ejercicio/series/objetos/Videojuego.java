package ejercicio.series.objetos;

import ejercicio.series.interfaz.Entregable;

public class Videojuego implements Entregable {

    private static int HORAS_DEFAULT = 10;
    private static boolean ENTREGADO_DEFAULT = false;


    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;


    public Videojuego(String titulo, int horas, String genero, String compañia){

        this(titulo, horas);
        this.genero = genero;
        this.compañia = compañia;

    }

    public Videojuego(String titulo, int horas){

        this();
        this.titulo = titulo;
        this.horasEstimadas = horas;

    }

    public Videojuego(){

        this.titulo = "";
        this.horasEstimadas = HORAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = "";
        this.compañia = "";

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Titulo del Videojuego: '" + titulo + '\'' +
                "\nHoras Estimadas: " + horasEstimadas +
                "\nEntregado: " + entregado +
                "\nGenero: '" + genero + '\'' +
                ",\nCompañia: '" + compañia + '\'';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean returnValue;

        if(this.horasEstimadas > ((Videojuego)a).horasEstimadas){
            returnValue = true;
        }else{
            returnValue = false;
        }
        return returnValue;
    }
}
