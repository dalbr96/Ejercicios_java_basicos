package ejercicio.area;

public class Circulo {
    private double radio;
    private double area;

    public Circulo(double radio){
        this.radio = radio;
        this.area = calcularArea();
    }

    public double getArea(){
        return this.area;
    }

    public double calcularArea(){
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }

}
