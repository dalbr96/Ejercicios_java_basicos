package ejercicio.calculoIVA;

public class Calculadora {
    private double precio;

    public Calculadora(double precio){
        this.precio = precio;
    }

    public double calcularPrecioFinal(){

        double precioFinal = this.precio*1.21;
        return precioFinal;
    }
}
