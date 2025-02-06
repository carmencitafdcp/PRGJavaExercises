import java.util.Scanner;

public class Bol2_Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //TODO corregir el bucle que comprueba que el usuario no ha introducido negativos. 

        int option;
        double euros;
        double pounds;
        double eurToGBP;
        double gbpToEur;

        System.out.println("-This is a converting program that switches pounds to euros and viceversa-");
        System.out.println("--------------------------------------------------------------------------");

        do {
            System.out.println(" OPTIONS");
            System.out.println("---------");
            System.out.println("1. Euros to pounds.");
            System.out.println("2. Pounds to euros.");
            System.out.println("3. Exit.");
            System.out.print("Select an option: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {//TODO revisar bucles
                case 1:
                do {
                    System.out.println("How many euros do you want to exchange? ");
                    euros = sc.nextDouble();
                    if (euros < 0) {
                        System.out.println("Euros can't be negative.");
                    }
                } while (euros < 0);
                        System.out.println("Ok! Calculating...");
                        eurToGBP = euros * 0.83; // The value of 1 euro in pounds is 0,83£ nowadays.
                        System.out.printf("The result of the exchange is: %.2f Pounds", eurToGBP);
                        //En un printf no se concatena como en un print o println, la variable que se desea mostrar se muestra siempre
                        //en el lugar del %.2f. Pero la variable siempre debe ir al final con una coma. 
                    System.out.println();
                    break;
                case 2:
                do {
                    System.out.println("How many pounds do you want to exchange? ");
                    pounds = sc.nextDouble();
                    if (pounds < 0) {
                        System.out.println("Pounds can't be negative.");
                    }
                } while (pounds < 0);
                        System.out.println("Ok! Calculating...");
                        gbpToEur = pounds * 1.20; // The value of 1 pound in euros is 1,20€ nowadays.
                        System.out.printf("The result of the exchange is: %.2f Euros", gbpToEur);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ok! Byebye.");
                    break;
                default:
                    System.out.println("Not a valid option!");
                    break;
            }
        } while (option != 3);
    }
}