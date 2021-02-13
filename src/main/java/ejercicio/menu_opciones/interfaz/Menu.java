package ejercicio.menu_opciones.interfaz;

import ejercicio.helpers.Inputs;

public class Menu {

    private static void mostrarMenu(){
        String menu = "****** GESTION CINEMATOGRÁFICA ********\n1-NUEVO ACTOR\n2-BUCAR ACTOR\n3-ELIMINAR ACTOR" +
                "\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR";
        System.out.println(menu);
    }

    public static void menu(){
        boolean validator = false;
        int numero;
        do {
            mostrarMenu();
            numero = Inputs.pedirInt();
            switch (numero){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 8:
                    validator = true;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;

            }

        }while (!validator);
    }

    public static void main(String[] args) {
        menu();
    }
}
