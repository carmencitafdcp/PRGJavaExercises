import java.util.Scanner;

public class Bol2_Ejer18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO arreglar el hecho de que al repetir el programa da el resultado mal
        // inicializar factorial
        // Preguntar por qué sucede eso, no lo entiendo.

        int number;
        long factorial;
        int option;

        System.out.println("This is a program to calculate factorials.");
        System.out.println("******************************************");

        do {
            System.out.println(" MENU");
            System.out.println("******");
            System.out.println("1. \"for\" loop.");
            System.out.println("2. Do-while loop.");
            System.out.println("3. While loop.");
            System.out.println("4. Exit.");
            System.out.println("Select an option please! ");
            option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Tell me a number: ");
                    number = sc.nextInt();

                    factorial = 1;
                    for (int i = 1; i <= number; i++) { // No puede empezar con 0, porque si no se multiplica por 0
                        factorial *= i;
                    }
                    System.out.println("The factorial is: " + factorial);
                    System.out.println();
                    break;
                case 2:
                    int i = 1;
                    System.out.print("Tell me a number: ");
                    number = sc.nextInt();
                    factorial = 1;
                    do {
                        factorial *= i;
                        i++; // Si lo pones antes te cuenta una vuelta más
                    } while (i <= number);
                    System.out.println("The factorial is: " + factorial);
                    System.out.println();
                    break;
                case 3:
                    int j = 1;
                    System.out.print("Tell me a number: ");
                    number = sc.nextInt();
                    factorial = 1;
                    while (j <= number) {
                        factorial *= j;
                        j++;
                    }
                    System.out.println("The factorial is: " + factorial);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Byebye!");
                    break;
                default:
                    System.out.println("Ups! Not a valid option.");
                    break;
            }
        } while (option != 4);
    }
}
