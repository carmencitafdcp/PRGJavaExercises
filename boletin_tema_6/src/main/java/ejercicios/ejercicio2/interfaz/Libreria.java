package ejercicios.ejercicio2.interfaz;

import java.util.*;

public class Libreria {
    public static int pedirEntero() {
        Scanner sc = new Scanner(System.in);
        boolean isChecked;
        int num = 0;
        do {
            isChecked = true;
            System.out.print("Dime un número entero: ");
            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Has introducido un dato no entero.");
                sc.nextLine();
                isChecked = false; //No es correcta así que vuelve al inicio.
            }
        } while (!isChecked); //Se repite mientras la entrada no sea correcta
        return num;
    }

    public static double pedirReal(){
        Scanner sc = new Scanner(System.in);
        boolean isChecked;
        double num = 0;
        do {
            isChecked = true;
            System.out.println("Dime un número con decimales.");
            try {
                num = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Has introducido un dato no decimal.");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        return num;
    }
}
