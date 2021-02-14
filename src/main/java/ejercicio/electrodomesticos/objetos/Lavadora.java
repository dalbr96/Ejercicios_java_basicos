package ejercicio.electrodomesticos.objetos;

public class Television extends Electrodomestico{

    private final int CARGA_DEFAULT = 5;

    private int carga;

    public Television(int precioBase, String color, char consumo, int peso, int carga){
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Television(int precio, int peso){
        super(precio, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Television(){
        super();
        this.carga = CARGA_DEFAULT;
    }

    public int getCarga() {
        return carga;
    }

    private int precioCarga(){
        int precio = 0;
        if(getCarga() > 30){
            precio = 50;
        }
        return precio;
    }

    @Override
    public int precioFinal() {
        return super.precioFinal() + this.precioCarga();
    }
}
