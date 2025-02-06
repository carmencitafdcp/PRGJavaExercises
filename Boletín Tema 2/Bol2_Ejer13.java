import java.util.Scanner;
public class Bol2_Ejer13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int option;
        int N;
        int addition = 0;
        int additionEven = 0;
        int additionOdd = 0;

        do {
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("~~~~~~~~~~~~~~~~");
            System.out.println("1. Addition of even numbers from 0 to N (Selected by you).");
            System.out.println("2. Addition of odd numbers from 0 to N (Selected by you).");
            System.out.println("3. Addition of even or odd numbers from 0 to N (Selected by you).");
            System.out.println("4. Exiting.");
            System.out.println("Select an option please: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    System.out.println("We are going to make a summatory of even numbers from 0 to any number you desire!");
                    System.out.println("Tell me a number:");
                    N = sc.nextInt();
                    for (int i = 0; i <= N; i++) {
                        if(i % 2 == 0){ //Es más fácil comprobar si los números son pares antes que ir de 2 en dos en el bucle. 
                            addition = addition + i;
                        } 
                    }
                    System.out.println("The result is: " + addition);
                    System.out.println();
                break;
                case 2:
                    System.out.println("We are going to make a summatory of odd numbers from 0 to any number you want!");
                    System.out.println("Tell me a number:");
                    N = sc.nextInt();
                    for (int i = 1; i <= N; i++) {
                        if (i % 2 != 0) { //Si al dividir entre 2 no es 0 pues es impar.
                            addition = addition + i;
                        }
                    }
                    System.out.println("The result is: " + addition);
                    System.out.println();
                break;
                case 3:
                    System.out.println("We are going to make the summatory of even numbers from one side or odd numbers from other side!");
                    System.out.println("Tell me any number you want: ");
                    N = sc.nextInt();
                    for (int i = 0; i < N; i++) {
                        if (i % 2 == 0) {
                            additionEven = additionEven + i; //Si es par, entonces mostrará el resultado de la suma par.
                        } else {
                            additionOdd = additionOdd + i; //Al contrario es impar entonces mostrará el resultado impar.
                        } 
                    }
                    System.out.println("The result of even numbers is: " + additionEven);
                    System.out.println("The result of odd numbers is: " + additionOdd);
                break;
                case 4:
                    System.out.println("Bye-Bye! I hope you found this program useful!");
                break;
                default:
                    System.out.println("Ups! Not an option.");
                break;
            }
        } while (option != 4);
    }
}
//BIEN
