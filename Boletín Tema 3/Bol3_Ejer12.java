import java.util.Scanner;

public class Bol3_Ejer12 {//TODO docs
    public static char bettingPool(int number) {

        switch (number) {
            case 0:
                return '1';
            case 1:
                return 'x';
            case 2:
                return '2';
            default:
                return ' ';

        }
    }

    public static char weightedPool() {
        int randomNumber = (int) (Math.random() * 100 + 1); /*si voy a poner int, siempre poner al Math.random() entre paréntesis, porque con el int
        ignora los decimales, es decir, si saca un número aleatorio entre 0 y 1, el 1 nunca sale, entonces siempre sale 0.1 0.2.... 0.9 y nunca sale el 1
        entonces si los transformamos a la parte entera siemore va a ser 0 y entonces siempre saldrá 0, si ponemos el Math.random() entre paréntesis
        entonces calculará el número a parte y despues lo convierte a int. */
        if (randomNumber <= 60) {
            return '1';
        } else if (randomNumber <= 85) {
            return 'x';
        } else {
            return '2';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("BETTING POOL!");
            System.out.println("-------------");
            System.out.println("1.- Normal Betting Pool.");
            System.out.println("2.- Weighted Pool.");
            System.out.println("3.- Exit.");
            System.out.print("Select an option please: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                int number = (int) (Math.random() * 3+1);
                    System.out.println("Here you have the results of the pool!");
                    for (int i = 1; i < 15; i++) {
                        char pool = bettingPool(number);
                        System.out.printf("%2d: %c%n", i, pool);
                    }
                    break;
                case 2:
                    System.out.println("Here you have the results of the weighted pool!");
                    for (int i = 1; i < 15; i++) {
                        char pool = weightedPool();
                        System.out.printf("%2d: %c%n", i, pool);
                    }
                    break;
                case 3:
                    System.out.println("Ok! Byebye!");
                    break;
                default:
                    break;
            }
        } while (option != 3);
        sc.close();
    }
}
