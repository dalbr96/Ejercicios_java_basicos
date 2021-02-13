package ejercicio.numeros_pares_impares_while;

public class App {

    public static void imprimirPares(){
        System.out.println("Numeros pares");
        int i = 1;
        while (i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void imprimirImpares(){
        System.out.println("Numeros Impares");
        int i = 1;
        while (i <= 100){
            if(i % 2 == 1){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        App.imprimirImpares();

        System.out.println("---------------------------------");

        App.imprimirPares();
    }
}
