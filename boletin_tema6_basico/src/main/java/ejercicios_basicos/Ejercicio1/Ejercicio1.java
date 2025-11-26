package ejercicios_basicos.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        double euros;
        double pounds;
        double eurToGBP;
        double gbpToEur;
        boolean isChecked;

        System.out.println("-This is a converting program that switches pounds to euros and viceversa-");
        System.out.println("--------------------------------------------------------------------------");

        do {
            do {
                isChecked = true;
                try {
                    System.out.println(" OPTIONS");
                    System.out.println("---------");
                    System.out.println("1. Euros to pounds.");
                    System.out.println("2. Pounds to euros.");
                    System.out.println("3. Exit.");
                    System.out.print("Select an option: ");
                    option = Integer.parseInt(sc.nextLine());
                    System.out.println();
                    isChecked = false;
                } catch (InputMismatchException e) {
                    System.out.println("Has introducido un dato no numérico, por favor introduce un número.");
                }
            } while (isChecked);
            switch (option) {
                case 1:
                    euros = 0;
                    do {
                        isChecked = true;
                        try {
                            System.out.println("How many euros do you want to exchange? ");
                            euros = Double.parseDouble(sc.nextLine());
                            if (euros < 0) {
                                System.out.println("Euros can't be negative.");
                                isChecked = false;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(
                                    "Has introducido un dato no numérico, por favor introduce un número válido.");
                            isChecked = false;
                        }

                      
                    } while (!isChecked); // Repetir solo si hubo error

                    System.out.println("Ok! Calculating...");
                    eurToGBP = euros * 0.83;
                    System.out.printf("The result of the exchange is: %.2f Pounds%n", eurToGBP);
                    break;
                case 2:
                    pounds = 0;
                    do {
                        isChecked = true;
                        try {
                            System.out.println("How many pounds do you want to exchange? ");
                            pounds = Double.parseDouble(sc.nextLine());
                            if (pounds < 0) {
                                System.out.println("Pounds can't be negative.");
                                isChecked = false;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(
                                    "Has introducido un dato no numérico, por favor introduce un número válido.");
                            isChecked = false;
                        }
                        if (isChecked) {
                            System.out.println("Ok! Calculating...");
                            gbpToEur = pounds * 1.20; // The value of 1 pound in euros is 1,20€ nowadays.
                            System.out.printf("The result of the exchange is: %.2f Euros%n", gbpToEur);
                        }
                    } while (!isChecked);
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
