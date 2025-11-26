package ejercicios.Ejercicios;

import java.util.Scanner;

//BIEN
public class Actividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I need you to write 10 numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt(); //no se puede hace foreach para modificar arrays, solo mostrar.
        }
        // for (int i = 0; i < numbers.length; i++) {
        // int item = numbers[i];
        // sum += item;
        // average = sum / numbers.length;
        // }
        // for (int item : numbers) {
        //     sum += item;
        //     average = sum / numbers.length;
        // }
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println("the numbers you wrote are: " + numbers[i]);
        // }
        for (int item : numbers) {
            System.out.println("the numbers you wrote are: " + item);
        }
        System.out.println("The average of these numbers is: " + average(numbers));
        sc.close();
    }

    public static int average(int[] vector){
        int sum = 0;
        int average = 0;
        for (int item : vector) {
            sum += item;
            average = sum / vector.length;
        }
        return average;
    }
}