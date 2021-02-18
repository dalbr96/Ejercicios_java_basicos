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
    

    public String getFrase() {
        return frase;
    }

    private void contarVocales(){

        String frase = getFrase();

        for (int i = 0; i < frase.length(); i++) {
            switch (frase.toLowerCase().charAt(i)){
                case 'a':
                    this.vocalesA += 1;
                    break;
                case 'e':
                    this.vocalesE += 1;
                    break;
                case 'i':
                    this.vocalesI += 1;
                    break;
                case 'o':
                    this.vocalesO += 1;
                    break;
                case 'u':
                    this.vocalesU += 1;
                    break;
                default:
                    break;
            }
        }
    }

    public void imprimirResultados(){
        this.contarVocales();

        System.out.println("El tamaño de la frase \'" + getFrase() + " \' es: " + getFrase().length());
        System.out.println("Tiene " + this.vocalesA + " a");
        System.out.println("Tiene " + this.vocalesE + " e");
        System.out.println("Tiene " + this.vocalesI + " i");
        System.out.println("Tiene " + this.vocalesO + " o");
        System.out.println("Tiene " + this.vocalesU + " u");

    }
}
