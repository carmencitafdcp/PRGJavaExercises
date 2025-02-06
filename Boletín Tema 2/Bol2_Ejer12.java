import java.util.Scanner;
public class Bol2_Ejer12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int option;

        do{
            System.out.println("We are going to create a programm that calculates different things!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("OPTIONS:");
            System.out.println("1. Numbers from 1 to 50.");
            System.out.println("2. Numbers from 50 to 1.");
            System.out.println("3. Even numbers minor than 20.");
            System.out.println("4. Odd numbers between 90 and 130 increasing.");
            System.out.println("5. Multiples of number 5 between 70 and 25 decreasing.");
            System.out.println("6. Exit.");
            System.out.print("Select an option: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    System.out.println("Numbers from 1 to 50: ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~");
                    for (int i = 1; i <= 50; i++) {
                        System.out.println(i);
                    }
                    System.out.println();
                break;
                case 2:
                    System.out.println("Numbers from 50 to 1: ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~");
                    for (int i = 50; i >= 1; i--) {
                        System.out.println(i);
                    }
                    System.out.println();
                break;
                case 3:
                    System.out.println("Even numbers minor than 20:");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    for (int i = 0; i < 20; i = i +2) {
                        System.out.println(i);
                    }
                    System.out.println();
                break;
                case 4:
                    System.out.println("Odd numbers between 90 and 130 increasing:");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    for (int i = 91; i <= 130; i = i+2 ) {
                        System.out.println(i);
                    }
                    System.out.println();
                break;
                case 5:
                    System.out.println("Multiples of number 5 between 70 and 25 decreasing:");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    for (int i = 70; i >= 25; i-=5) {
                        System.out.println(i);
                    }
                    System.out.println();
                    //Si el caso fueran múltiplos de 3, para que saque los números pero de manera decreciente debería poner i--, pero después
                    //Dentro del bucle debería ir comprobando si dichos números son divisibles entre 3, entonces mostraría los números correspondientes. 
                break;
                case 6:
                    System.out.println("Good bye!");
                break;
                default:
                    System.out.println("Not a valid option!");
                break;
            }
        } while(option != 6);

        //BIEN
    }
}
