import java.util.Scanner;

public class Bol3_Ejer8 {

    /**
     * verifica si el numero introducido es primos o no
     * @param number numero a verificar
     * @return true o false
     */
    public static boolean primeNumber(int number){
        if (number < 2) {
            return false; /*Si es menor que dos no es primo así que directamente lanzará false */
        } 
        
        for (int i = 2; i < number; i++) { //Bucle que verifica si los números menores que number son primos o no
            if (number % i == 0) { /*Los comprueba aquí, si número divisible entre cada uno de esos números da 0 entonces no es primo */
                return false;
            }
        }

        return true; //devuelve que es primo si numero dividido por esos números el resto no es 0
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please introduce a number bigger than 2:");
            number = sc.nextInt();
            if (primeNumber(number)) {
                System.out.println("The number " + number + " it's prime."); 
            } else{
                System.out.println("Not prime.");
            }
            for (int i = 2; i <= number; i++) { //Va poniendo los números menores consecutivamente
                if (primeNumber(i)) {
                    System.out.println("Prime: " + i);
                }
            }
            if (number < 2) {
                System.out.println("You have to introduce a number bigger than 2.");
            }
        } while (number < 2); //Comprobamos que sea mayor que 2

        sc.close();
    }
}
