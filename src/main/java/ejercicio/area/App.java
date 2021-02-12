package ejercicio.area;

public class App {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(Inputs.pedirRadio());

        System.out.println("El area del circulo es: "+ circulo.getArea());

    }
}
