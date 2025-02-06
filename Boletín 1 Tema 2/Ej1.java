import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Hola! Dime un número entero: ");
        numero1 = sc.nextInt();
        System.out.print("Ahora otro: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor.");
        } else {
            System.out.println("El segundo es mayor.");
        }

        if (numero1 == numero2) {
            System.out.println("Los números son iguales!");
        } else {
            System.out.println("No son iguales.");
        }

        if (numero1 > 0) {
            System.out.println("Es positivo!");
        } else {
            System.out.println("No es positivo.");
        }

        if (numero1 > 0 & numero1 < 10) {
            System.out.println("El primer número está comprendido entre 1 y 10.");
        } else {
            System.out.println("Está fuera del rango.");
        }

        if (numero2 < 0 | numero2 > 10) {
            System.out.println("El número dos no está comprendido entre 1 ni 10.");
        } else {
            System.out.println("Está comprendido entre 1 y 10.");
        }
    }
}