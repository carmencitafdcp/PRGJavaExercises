import java.util.Scanner;

public class Bol2_Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double degrees;
        int option;
        double kelvin;
        double farenheit;

        do {
            System.out.println("1. Convert to Farenheit.");
            System.out.println("2. Convert to Kelvin.");
            System.out.println("3. Salir.");
            System.out.print("Tell me the degrees in Celsius that your city has: ");
            degrees = sc.nextDouble();
            System.out.println("Select an option:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    farenheit = (degrees * 9 / 5) + 32;
                    System.out.printf("The degrees of your city in Farenheit are: %.2f F", farenheit);
                    System.out.println();
                    break;
                case 2:
                    kelvin = degrees + 273.15;
                    System.out.printf("The degrees of your city in Kelvin are: %.2f K", kelvin);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Byebye!");
                    break;
                default:
                    System.out.print("This option is not valid!");
                    break;
            }
        } while (option != 3);

        //BIEN
    }
}
