import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        String nombre;
        Double temperatura;
        
        System.out.println("Dime tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();
        System.out.println("¿Qué temperatura hay? ");
        temperatura = sc.nextDouble();
        System.out.println("Hola, me llamo " + nombre + "\ny tengo " + edad + "\ny ahora mismo hay " + temperatura + "ºC");
    }
}
