package ejercicios.Ejercicios.Ejercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz m = new Matriz(10);
        int option = 0;
        do {
            System.out.println("*MENU*");
            System.out.println("1.- Mostrar la matriz.");
            System.out.println("2.- Suma de todos los elementos de dicha matriz.");
            System.out.println("3.- Suma de los elementos de la diagonal.");
            System.out.println("4.- Suma de todos los elementos excepto la diagonal");
            System.out.println("5.- Suma elementos de una fila escogida por ti.");
            System.out.println("6.- Mostrar matriz con una fila menos.");
            System.out.println("7.- Salir -->");
            System.out.print("Selecciona una opción por favor: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("**Mostrar la matriz**");
                    Matriz.tabla(m.matriBidi);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("**Suma de todos los elementos de la matriz**");
                    System.out.println("La suma es: " + m.suma());
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("**Suma de los elementos de la diagonal**");
                    System.out.println("La suma es: " + m.suma(false));
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("**Suma de los elementos sin diagonal**");
                    System.out.println("La suma es: " + m.suma(true));
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("**Suma elementos fila escogida**");
                    System.out.println("La suma es: " + m.suma(3));
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("**Matriz con fila menos**");
                    int[][] matrizFilaMenos = m.borraFila(4);
                    Matriz.tabla(matrizFilaMenos);
                    System.out.println();
                    break;
                case 7:
                    System.out.println();
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("¡Ups! Opción no válida, debe escoger una de las disponibles.");
                    break;
            }
        } while (option != 7);
        sc.close();
    }
}
