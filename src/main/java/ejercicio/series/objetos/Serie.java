package ejercicio.series.objetos;

import ejercicio.series.interfaz.Entregable;

public class Serie implements Entregable {

    private static int TEMPORADAS_DEFAULT = 3;
    private static boolean ENTREGADO_DEFAULT = false;

    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador){

        this(titulo, creador);
        this.numeroDeTemporadas  = numeroDeTemporadas;
        this.genero = genero;

    }

    public Serie(String titulo, String creador){

        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(){

        this.titulo = "";
        this.numeroDeTemporadas = TEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = "";
        this.creador = "";
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre de la serie: '" + titulo + '\'' +
                "\nNumero de temporadas: " + numeroDeTemporadas +
                "\nEntregado: " + entregado +
                "\nGenero='" + genero + '\'' +
                "\nCreador='" + creador + '\'';
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
        boolean valueReturn;
        if(this.getNumeroDeTemporadas() > ((Serie)a).getNumeroDeTemporadas()){
            valueReturn = true;
        }
        else{
            valueReturn = false;
        }

        return valueReturn;
    }
}
