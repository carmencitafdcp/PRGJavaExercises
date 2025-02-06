import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bol3_Ejer9 {
    public static void main(String[] args) throws Exception { //La excepcion es para manejar posibles errores
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("PRIME NUMBERS:");
            System.out.println("--------------");
            System.out.println("1.- Primes less than introduced number.");
            System.out.println("2.- Check if numbers in a file are prime.");
            System.out.println("3.- Save prime numbers in other file.");
            System.out.println("4.- Exit.");
            System.out.print("Choose an option please: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Please introduce a number bigger than 2:");
                    int number = sc.nextInt();
                    sc.nextLine(); // Sobra un salto de línea

                    if (number > 2) {
                        for (int i = 2; i < number; i++) { // Cuenta los números menores que number
                            if (Bol3_Ejer8.primeNumber(i)) { // Va comprobando uno a uno que son primos
                                System.out.println(i + " it's prime."); // Y si son primos los escribe
                            }
                        }
                    } else {
                        System.out.println("You have to introduce a number bigger than 2.");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("What file do you want to read?");
                    String file = sc.nextLine();
                    Scanner sn = new Scanner(new File(file)); //Este Scanner te scanea literalmente el archivo, el System.in era para el teclado.
                    int content = 0;
                    while (sn.hasNextInt()) { // Mientras tenga números que escribir...
                        content = sn.nextInt(); // Guarda el contenido que haya en dicho archivo a la variable content
                        if (Bol3_Ejer8.primeNumber(content)) { // Comprueba si dicho contenido guardado en content es primo o no
                            System.out.println(content + " es primo.");
                        } else {
                            System.out.println(content + " no es primo.");
                        }
                    }
                    System.out.println();
                    sn.close();
                    break;
                case 3:
                    int number2;
                    System.out.println("Please introduce a number bigger than 2:");
                    number2 = sc.nextInt();
                    sc.nextLine(); //Comnsumo salto de línea

                    if (number2 > 2) {
                        System.out.println("Which file do you want to verify?");
                        String fileName = sc.nextLine();
                        PrintWriter f = new PrintWriter(fileName); //Para escribir en dicho archivo
                        boolean First = true;
                        for (int i = 2; i <= number2; i++) {
                            if (Bol3_Ejer8.primeNumber(i)) { //Comprueba
                                if (!First) { // Si es el primer número no escribe comas delante de el
                                    f.print("; "); //Si es distinto del primero escribe ; delante
                                }
                                f.print(i); 
                                First = false;
                            }
                        } 
                        f.close();
                    } else {
                        System.out.println("The number cannot be less than 2.");
                    }
                    
                    break;
                case 4:
                    System.out.println("Ok, bye-bye!");
                    break;
                default:
                    System.out.println("Sorry, that's not an option...");
                    break;
            }
        } while (option != 4);

        sc.close();
    }
}
