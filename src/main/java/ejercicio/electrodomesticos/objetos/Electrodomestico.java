package ejercicio.electrodomesticos.objetos;

import ejercicio.electrodomesticos.constantes.Color;
import ejercicio.electrodomesticos.constantes.Consumo;

public class Electrodomestico {

    protected final int PESO_DEFAULT = 5;
    protected final Color COLOR_DEFAULT = Color.BLANCO;
    protected final Consumo CONSUMO_DEFAULT = Consumo.F;
    protected final int PRECIOBASE_DEFAULT= 100;


    protected int precioBase;
    protected Color color;
    protected Consumo consumo;
    protected int peso;

    public Electrodomestico(int precioBase, String color, char consumo, int peso){
        this(precioBase, peso);
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
    }

    public Electrodomestico(int precioBase, int peso){
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(){
        this.precioBase = PRECIOBASE_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumo = CONSUMO_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public int getPeso() {
        return peso;
    }


    private Consumo comprobarConsumoEnergetico(char letra){
        Consumo consumo;
        switch (letra){
            case 'A':
            case 'a':
                consumo = Consumo.A;
                break;
            case 'B':
            case 'b':
                consumo = Consumo.B;
                break;
            case 'C':
            case 'c':
                consumo = Consumo.C;
                break;
            case 'D':
            case 'd':
                consumo = Consumo.D;
                break;
            case 'E':
            case 'e':
                consumo = Consumo.E;
                break;
            case 'F':
            case 'f':
            default:
                consumo = Consumo.F;
                break;
        }
        return consumo;
    }

    private Color comprobarColor(String color){
        Color returnColor;
        switch (color.toUpperCase()){
            case "NEGRO":
                returnColor = Color.NEGRO;
                break;
            case "ROJO":
                returnColor = Color.ROJO;
                break;
            case "AZUL":
                returnColor = Color.AZUL;
                break;
            case "GRIS":
                returnColor = Color.GRIS;
                break;
            case "BLANCO":
                returnColor = Color.BLANCO;
                break;
            default:
                returnColor = COLOR_DEFAULT;
                break;
        }
        return returnColor;
    }

    private int getPrecioPeso(){
        int precioPeso;
        int peso = getPeso();
        if(peso < 20){
            precioPeso = 10;
        }else if(peso < 50){
            precioPeso = 50;
        }
        else if(peso < 80){
            precioPeso = 80;
        }
        else{
            precioPeso = 100;
        }
        return precioPeso;
    }
    public int precioFinal(){
        int precioFinal = this.precioBase + this.consumo.getPrecio() + getPrecioPeso();
        return precioFinal;
    }

}
