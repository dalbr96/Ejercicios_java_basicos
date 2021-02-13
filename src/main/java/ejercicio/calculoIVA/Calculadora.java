package ejercicio.calculoIVA;

public class Calculadora {
    private double precio;

    public Calculadora(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(){
        this.precio = precio;
    }

    public double calcularPrecioFinal(){

        double precioFinal = getPrecio()*1.21;
        return precioFinal;
    }
}
