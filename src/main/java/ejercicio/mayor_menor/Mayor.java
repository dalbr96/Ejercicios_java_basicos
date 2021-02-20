package ejercicio.mayor_menor;

public class Mayor {

    //Crear variables
    private int primerNumero;
    private int segundoNumero;

    public Mayor(int primerNumero, int segundoNumero){
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }


    public void compararNumeros(){

        if(this.primerNumero > this.segundoNumero){
            System.out.println("El numero mayor es "+ this.primerNumero);
        }
        else if(this.primerNumero < this.segundoNumero){
            System.out.println("El numero mayor es "+ this.segundoNumero);
        }
        else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}
