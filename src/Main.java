public class Main {

    public static void imprimirEstacion(String estacion) {
        System.out.println("La estacion es " + estacion);
    }

    public static void main(String[] args) {
        int numerolf = -1;
        if (numerolf < 0) {
            System.out.println("Ejercicio If: El numero es negativo");
        }
        if (numerolf > 0) {
            System.out.println("Ejercicio If: El numero es positivo");
        }
        if (numerolf == 0) {
            System.out.println("Ejercicio If: El numero es cero");
        }

        var numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("Ejercicio While: El numero es " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        int numeroDo = 2;
        do {
            System.out.println("Ejercicio Do: El numero es " + numeroDo);
            numeroDo = numeroDo + 1;
        } while (numeroDo < 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Ejercicio For: El numero es " + numeroFor);
        }

        var estacion = "paraguas";
        switch (estacion.toLowerCase()) {
            case "invierno":
                imprimirEstacion(estacion.toLowerCase());
                break;
            case "primavera":
                imprimirEstacion(estacion.toLowerCase());
                break;
            case "verano":
                imprimirEstacion(estacion.toLowerCase());
                break;
            case "otoño":
                imprimirEstacion(estacion.toLowerCase());
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}