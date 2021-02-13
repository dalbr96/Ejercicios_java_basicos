package ejercicio.longitud_y_vocales;

import java.util.Locale;

public class GestorFrase {

    String frase;

    int vocalesA;
    int vocalesE;
    int vocalesI;
    int vocalesO;
    int vocalesU;

    public GestorFrase(String frase){
        this.frase = frase;
        this.vocalesA = 0;
        this.vocalesE = 0;
        this.vocalesI = 0;
        this.vocalesO = 0;
        this.vocalesU = 0;
    }

    public void setFrase(String frase){
        this.frase = frase;
    }

    public void setVocalesA(int vocalesA){
        this.vocalesA = vocalesA;
    }

    public void setVocalesE(int vocalesE){
        this.vocalesE = vocalesE;
    }

    public void setVocalesI(int vocalesI){
        this.vocalesI = vocalesI;
    }

    public void setVocalesO(int vocalesO){
        this.vocalesO = vocalesO;
    }

    public void setVocalesU(int vocalesU){
        this.vocalesU = vocalesU;
    }

    public int getVocalesA(){
        return this.vocalesA;
    }

    public int getVocalesE(){
        return this.vocalesE;
    }

    public int getVocalesI() {
        return vocalesI;
    }

    public int getVocalesO() {
        return vocalesO;
    }

    public int getVocalesU() {
        return vocalesU;
    }

    public String getFrase() {
        return frase;
    }

    private void contarVocales(){

        String frase = getFrase();

        for (int i = 0; i < frase.length(); i++) {
            switch (frase.toLowerCase().charAt(i)){
                case 'a':
                    setVocalesA(getVocalesA() + 1);
                    break;
                case 'e':
                    setVocalesE(getVocalesE() + 1);
                    break;
                case 'i':
                    setVocalesI(getVocalesI() + 1);
                    break;
                case 'o':
                    setVocalesO(getVocalesO() + 1);
                    break;
                case 'u':
                    setVocalesU(getVocalesU() + 1);
                    break;
                default:
                    break;
            }
        }
    }

    public void imprimirResultados(){
        this.contarVocales();

        System.out.println("El tamaño de la frase \'" + getFrase() + " \' es: " + getFrase().length());
        System.out.println("Tiene " + getVocalesA() + " a");
        System.out.println("Tiene " + getVocalesE() + " e");
        System.out.println("Tiene " + getVocalesI() + " i");
        System.out.println("Tiene " + getVocalesO() + " o");
        System.out.println("Tiene " + getVocalesU() + " u");

    }
}
