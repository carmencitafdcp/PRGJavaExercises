import java.util.Scanner;
public class Bol3_Ejer1 {
    /**
     * Imprime lineas en blanco
     * @param n Cantidad de líneass
     */
    public static void lineasBlanco(int n) { // No devuelve
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    /**
     * Especifica si es par o impar
     * @param numero Nº a comprobar
     * @return true para par, false para impar
     */
    public static boolean par(int numero) { // Si que devuelve, los métodos que devuelven valores en vez de void
                                            // necesitan el tipo de dato que van a devolver.
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Especifica si es positivo o negativo
     * @param numero Nº a comprobar
     * @return 'P' para positivo o 0, 'N' para negativo
     */
    public static char negativoPositivo(int numero) { // Devuelve un char, pero con ternaria seria void
        char negaposi = numero >= 0 ? 'P':'N';
        return negaposi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Bienvenido! Cómo te llamas?");
        sc.nextLine();
        lineasBlanco(10);
        System.out.println("Dime un número, te diré si es par o impar, positivo o negativo.");
        numero = sc.nextInt();
        System.out.println(par(numero));
        System.out.println(negativoPositivo(numero));
        sc.close();
    }
}

//BIEN