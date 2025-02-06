import java.util.Scanner;

public class Bol2_Ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // El sistem in es el teclado

        int option;

        do {
            int number;
            int multiples = 0;

            do {
                System.out.print("Please introduce a number between 1 and 50: ");
                number = sc.nextInt();
                if (number < 1 || number > 50) {
                    System.out.println("Ups, the number is not in the range.");
                }
            } while (number < 1 || number > 50); /*Debía ser con un OR porque con el AND es como si dijera: "si el número
            es menor que 1 y además es mayor que 50 pues está fuera de rango" está mal porque no tiene sentido, o es menor que 1
            o es mayor que 50 para estar fuera del rango*/

            for (int i = 1; i <= 100; i++) { // Va añadiendo numeros del 1 al 100 de uno en uno
                if (i % number == 0) { // Pero aquí se comprueba si dichos números pueden ser divisibles entre número introducido
                    System.out.println(i); //Te muestra solo los números divisibles por el número introducido
                    multiples = multiples + i; // Calcula el total de sumar los números divisibles del número introducido
                }
            }

            System.out.println("The total of the multiples summatory is: " + multiples);

            System.out.println("Do you want to try again? (1. Yes // 0. No)");
            option = sc.nextInt();
        } while (option != 0); // Si pulsa cualquier numero empieza otra vez, pero si pulsa 0 se acaba el programa.
    }
}
