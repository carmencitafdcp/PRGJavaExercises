import java.util.Scanner;
public class Sumar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero1;
        int numero2;
        int resultado;

        System.out.println("Hoy vamos a realizar nuestra primera suma!");
        System.out.println("Dime  un número: ");
        numero1 = sc.nextInt();
        System.out.println("Ahora dime el otro número: ");
        numero2 = sc.nextInt();
        resultado = numero1 + numero2;
        System.out.println("El resultado de nuestra suma es... \n" + resultado); 
    }
}
