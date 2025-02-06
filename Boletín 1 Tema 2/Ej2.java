import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Hola! Dime un número de la semana.");
        numero = sc.nextInt();

        switch (numero) {
            case 1:
            System.out.println("Lunes");
                break;
            case 2:
            System.out.println("Martes");
                break;
            case 3:
            System.out.println("Miércoles");
                break;
            case 4:
            System.out.println("Jueves");
                break;
            case 5:
            System.out.println("Viernes");
                break;
            case 6:
            System.out.println("Sábado");
                break;
            case 7:
            System.out.println("Domingo");
                break;
            default:
                break;
        }
    }
}
