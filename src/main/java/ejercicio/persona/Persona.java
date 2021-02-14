package ejercicio.persona;

import java.util.Random;

public class Persona {
    public static final char SEXO_DEFAULT = 'H';

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;


    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.dni = generaDNI();
        this.sexo = SEXO_DEFAULT;
        this.peso = 0d;
        this.altura = 0d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int calcularIMC(){
        double imc = getPeso()/Math.pow(getAltura(), 2.0);
        int returnValue ;
        if(imc<20){
            returnValue = - 1;
        }
        else if((imc >= 20) ||(imc <= 25)){
            returnValue = 0;
        }
        else{
            returnValue = 1;
        }
        return returnValue;
    }

    public boolean esMayorDeEdad(){
        boolean returnValue;
        if(getEdad() >= 18){
            returnValue = true;
        }
        else{
            returnValue = false;
        }
        return returnValue;
    }

    private char comprobarSexo(char sexo){
        char returnValue;
        switch (sexo){
            case 'M':
                returnValue = 'M';
                break;
            case 'H':
            default:
                returnValue = 'H';
                break;
        }
        return returnValue;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", DNI=" + dni +
                ", Sexo=" + sexo +
                ", Peso=" + peso +
                ", Altura=" + altura ;
    }

    private String generaDNI(){
        int numero = generarNumeroString();
        char letra = generarLetraDni(numero);
        String dni = numero + "-" +letra;
        return dni;
    }

    private int generarNumeroString(){

        Random generar = new Random();

        int numero = 10000000 + generar.nextInt(90000000);

        return numero;
    }

    private char generarLetraDni(int numero){
        char letra;
        switch (numero%23){
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                letra = ' ';
                break;
        }
        return letra;
    }



}
