package ejercicio.personas.objetos;

public class Persona {
    public static final char SEXO_DEFAULT = 'H';

    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;


    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura){
        this(nombre, edad, sexo);
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.dni = 0;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
        double imc = getPeso()/Math.pow(getAltura(), 2);
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

}
