import java.util.Scanner;

public class Bol2_Ejer16 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;
        int guess;
        boolean playAgain = true;
        int gameplay;
        int selectedNumber = 0;
        int option;

        while (playAgain) {
            int attemps = 5; //Debo iniciarlas aquí para que cada vez que se ejecute el bucle se reinicien los valores
            boolean guessed = false;
            System.out.println("Choose a gameplay mode: ");
            System.out.println("-----------------------");
            System.out.println("1. Player 1 says a number and Player 2 guess it.");
            System.out.println("2. Player 2 says a number and Player 1 guess it.");
            System.out.println("------------------------------------------------");
            gameplay = sc.nextInt();

            if (gameplay == 1) {
                do {
                    System.out.println("Hello Player 1, please select a number between 1 and 100: "); //Bucle para comprobar 
                    //que está en el rango exigido
                    selectedNumber = sc.nextInt();
                    if (selectedNumber < 1 || selectedNumber > 100) {
                        System.out.println("Sorry, your number is not in the range!");
                    }
                } while (selectedNumber < 1 || selectedNumber > 100);

                for (int i = 1; i < 100; i++) {
                    System.out.println(); //Imprime las líneas en blanco, para simular
                    //un borrado de pantalla
                }

                while (attemps > 0 && !guessed) { //Mientras los intentos sean mayores que 0 y guessed sea falso
                    System.out.println("Hello Player 2, please try to guess which number did Player 1 introduce: ");
                    guess = sc.nextInt();

                    if (guess == selectedNumber) {
                        System.out.println("Congratulations Player 2!! You win!");
                        guessed = true;
                    } else if (guess < selectedNumber) {
                        System.out.println("Ups! Your number is smaller.");
                    } else {
                        System.out.println("Ups! Your number is bigger.");
                    }

                    attemps--; //Cada vez que el usuario escribe un número, reduce uno tras uno los intentos que le quedan
                    System.out.println("You have " + attemps + " attemps left.");
                }
            } else if (gameplay == 2){ //Exactamente lo mismo pero al revés
                do {
                    System.out.println("Hello Player 2, please select a number between 1 and 100: ");
                    selectedNumber = sc.nextInt();
                } while (selectedNumber < 1 || selectedNumber > 100);

                for (int i = 1; i < 100; i++) {
                    System.out.println();
                }

                while (attemps > 0 && !guessed) {
                    System.out.println("Hello Player 1, please try to guess which number did Player 2 introduce: ");
                    guess = sc.nextInt();

                    if (guess == selectedNumber) {
                        System.out.println("Congratulations Player 1!! You win!");
                        guessed = true;
                    } else if (guess < selectedNumber) {
                        System.out.println("Ups! Your number is smaller.");
                    } else {
                        System.out.println("Ups! Your number is bigger.");
                    }

                    attemps--;
                    System.out.println("You have " + attemps + " attemps left.");
                }
            } else {
                System.out.println("You didn't select an option.");
            }

            if (!guessed) {
                System.out.println("I'm sorry you wasted your attemps, the number was " + selectedNumber);
            }

            System.out.println("Do you want to play again? (1. Yes // 2. No):");
            option = sc.nextInt();
            if (option == 2) { //Tenía que arreglar aquí, en vez de option != 1, mejor poner Option == 2
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
    }
}
//CORREGIDO