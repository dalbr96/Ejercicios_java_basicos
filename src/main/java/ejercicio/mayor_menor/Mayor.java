package ejercicio.mayor_menor;

public class Mayor {

    //Crear variables
    private int primerNumero;
    private int segundoNumero;

    public Mayor(int primerNumero, int segundoNumero){
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public int getSegundoNumero(){
        return segundoNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public void compararNumeros(){

        if(getPrimerNumero() > getSegundoNumero()){
            System.out.println("El numero mayor es "+ getPrimerNumero());
        }
        else if(getPrimerNumero() < getSegundoNumero()){
            System.out.println("El numero mayor es "+ getSegundoNumero());
        }
        else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}
