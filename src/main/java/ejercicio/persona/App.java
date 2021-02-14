package ejercicio.persona;


import ejercicio.helpers.Inputs;

public class App {
    private static String nombre;
    private static int edad;
    private static String dni;
    private static char sexo;
    private static double peso;
    private static double altura;

    private static void pedirDatos(){
        System.out.println("Por favor ingresa tu nombre");
        nombre = Inputs.pedirString();
        System.out.println("Por favor ingresa tu edad");
        edad = Inputs.pedirIntPositivo("La edad debe ser positiva");
        System.out.println("Por favor ingresa tu sexo. H - Hombre, M - Mujer");
        sexo = Inputs.pedirChar();
        System.out.println("Por favor ingresa tu altura en metros");
        altura = Inputs.pedirDoublePositivo("La altura debe ser positiva");
        System.out.println("Por favor ingresa tu peso en kilogramos");
        peso = Inputs.pedirDoublePositivo("El peso debe ser positivo");
    }

    private static void nombrarPersona(Persona persona){
        persona.setNombre("Pedro Perez");
        persona.setEdad(12);
        persona.setSexo('H');
        persona.setAltura(1.42d);
        persona.setPeso(40d);
    }

    private static void calcularPesoIdeal(Persona persona){
            switch (persona.calcularIMC()) {
                case -1:
                    System.out.println("Está debajo de su peso ideal");
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    break;
                case 1:
                    System.out.println("Está por encima de su peso ideal");
                    break;
            }

    }

    private static void imprimirMayoriaDeEdad(Persona persona){
        if(persona.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }

    private static void imprimirDatos(Persona persona){
        System.out.println(persona);
        System.out.println("------------------------");
    }

    private static void generarImpresion(Persona[] personas){
        for(Persona persona: personas){

            String inicio = "La persona " + persona.getNombre() + " con DNI: " + persona.getDni() + " ";

            System.out.println(inicio);

            calcularPesoIdeal(persona);

            imprimirMayoriaDeEdad(persona);

            System.out.println("Y sus datos son: ");

            imprimirDatos(persona);
        }
    }

    public static void main(String[] args) {

        pedirDatos();

        Persona primerPersona = new Persona(nombre, edad, sexo, peso,altura);
        Persona segundaPersona = new Persona(nombre, edad, sexo);
        Persona tercerPersona = new Persona();

        nombrarPersona(tercerPersona);

        Persona[] personas = {primerPersona, segundaPersona, tercerPersona};

        generarImpresion(personas);
    }
}
