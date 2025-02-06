import java.util.Scanner;

public class Basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre;
        String direccion;
        int edad;

        System.out.println("Bienvenidos a mi superprograma v1.0");
        System.out.println("Ahora unas preguntas:");
        System.out.println("1. Dime tu nombre:");
        nombre = sc.nextLine();
        System.out.println("2. Ahora dime tu dirección: ");
        direccion = sc.nextLine();
        System.out.println("3. Dime tu edad: ");
        edad = sc.nextInt();
        System.out.println("Hola " + nombre  + "! Que guay que vives en " + direccion + " y tienes " + edad + " años");
    }
    
}