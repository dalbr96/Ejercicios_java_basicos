package ejercicio.numeros_pares_impares_for;

public class App {

    public static void imprimirPares(){

        System.out.println("Numeros pares");
        for(int i  = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void imprimirImpares(){
        System.out.println("Numeros Impares");
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        imprimirImpares();
        System.out.println("---------------------");
        imprimirPares();

    }

}
