package ejercicios_basicos.Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Función que pide de manera robusta un número entero al usuario, dicho número debe estar dentro de un rango.
     * @param mensaje Mensaje que se lanza para pedir el dato al usuario
     * @param min parte mínima del rango
     * @param max parte máxima del rango
     * @return devuelve el número escogido por el usuario.
     */
    public static int pedir(String mensaje, int min, int max){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isChecked = false;

        if (mensaje == null || mensaje.equals("") || (max - min) <= 2) {
            throw new IllegalArgumentException("Parámetros inválidos. Debes introducir un mensaje y el rango debe tener al menos 2 valores intermedios.");
        }
    
        do {
            System.out.println(mensaje + " (Entre " + min + " y " + max + "):");
            try {
                numero = sc.nextInt();
                if (numero >= min && numero <= max) {
                    isChecked = true;
                } else {
                    System.out.println("El número debe estar entre " + min + " y " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debe ingresar un número entero.");
                sc.nextLine(); //Recoge retorno de carro
            }
        } while (!isChecked);
        return numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimo;
        do {
            try {
                System.out.println("Escribe un mensaje inicial: ");
                String mensaje = sc.nextLine();
                System.out.println("Introduce el valor mínimo del rango: ");
                minimo = sc.nextInt();
                System.out.println("Introduce el valor máximo del rango: ");
                int maximo = sc.nextInt();
                sc.nextLine(); //Recoger retorno de carro
                pedir(mensaje, minimo, maximo);
            } catch (IllegalArgumentException i) {
                System.out.println("Parámetros no válidos");
                sc.nextLine();                minimo = 0;
            } catch (InputMismatchException e) {
                System.out.println("Parámetros no válidos");
                sc.nextLine();
                minimo = 0; 
                // Si mínimo sigue siendo 0 el bucle se repite, si mínimo deja de ser 0, ya no se repite.
            }
        } while (minimo == 0);
        sc.close();
    }
}