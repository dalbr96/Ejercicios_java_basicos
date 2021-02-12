package ejercicio.area;

public class Circulo {
    private double radio;
    private double area;

    public Circulo(double radio){
        this.radio = radio;
        this.area = calcularArea();
    }

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double calcularArea(){
        double area = Math.PI * Math.pow(getRadio(), 2);
        return area;
    }

}
