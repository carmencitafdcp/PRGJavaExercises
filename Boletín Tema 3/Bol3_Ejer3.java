import java.util.Scanner;

public class Bol3_Ejer3 {
    /**
     * Pregunta al usuario por un dato 
     * además comprueba que no sea negativo.
     * @return dato
     */
    public static double askdata() {
        Scanner sc = new Scanner(System.in);
        double dato;
        do {
            System.out.println("Hello! Please tell me a real number:");
            dato = sc.nextDouble();
            if (dato < 0) {
                System.out.println("I'm sorry your number can't be negative...");
            }
        } while (dato < 0);
        sc.close(); //Siempre debe ir antes de los return. 
        return dato;
        
    }

    /**
     * Función que calcula la superficie del cilindro con parámetros radio y altura 
     * @param radio Radio del cilindro
     * @param altura Altura del cilindro
     * @return superficie del cilindro
     */
    public static double cilinderSurface(double radio, double altura) {
        double superficie = 2 * Math.PI * radio * altura;
        return superficie;
    }

    /**
     * Función que concatena un mensaje con un resultado real con dos decimales
     * @param resultado Dato numerico
     * @param cadena Mensaje a mostrar
     */
    public static void showData(double resultado, String cadena) {
        System.out.printf("%s %.3f", cadena, resultado);
    }

    public static void main(String[] args) {
        double radio = askdata();
        double altura = askdata();
        double resultado = cilinderSurface(radio, altura);
        String cadena = "The result is...";
        showData(resultado, cadena);
    }
}

//BIEN