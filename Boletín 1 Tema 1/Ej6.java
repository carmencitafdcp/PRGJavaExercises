import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        //REVISAR

        double numero1;
        double numero2;
        int numeroUno;
        int numeroDos;
        double suma;
        double resta;
        double division;
        double multiplicacion;
        int or;
        int and;
        int option;

        do {
                    System.out.println("Dime un número real: ");
                    numero1 = sc.nextDouble();
                    System.out.println("Ahora otro: ");
                    numero2 = sc.nextDouble();
                    suma = numero1 + numero2;
                    System.out.println("Suma: " + suma);
                    resta = numero1 - numero2;
                    System.out.println("Resta: " + resta);
                    if (numero2 == 0) {
                        System.out.println("ERROR");
                    } else {
                        division = numero1 / numero2;
                        System.out.println("División: " + division);
                    }

                    if (numero1 % numero2 == 0) {
                        System.out.println("Los números son múltiplos");
                    } else {
                        System.out.println("No son múltiplos");
                    }

                    if (numero1 > numero2) {
                        System.out.println("El primer numero es mayor que el segundo.");
                    } else {
                        System.out.println("El segundo es mayor que el primero. ");
                    }

                    multiplicacion = numero1 * numero2;
                    System.out.println("Multiplicacion: " + multiplicacion);
                    System.out.println("Dime un número entero: ");
                    numeroUno = sc.nextInt();
                    System.out.println("Ahora otro: ");
                    numeroDos = sc.nextInt();
                    or = numeroUno | numeroDos;
                    System.out.println("El OR de ambos números es: " + or);
                    and = numeroUno & numeroDos;
                    System.out.println("El AND de ambos números es: " + and);

                    System.out.println("Quieres reiniciar el programa? Entonces pulsa 1.\nSi quieres finalizarlo pulsa 2.");
                    option = sc.nextInt();
        } while (option == 1);

        if (option == 2) {
            System.out.println("Has finalizado el programa! Hasta pronto!");

        } else {
            System.out.println("No es un número válido.");
        }
    }
}
