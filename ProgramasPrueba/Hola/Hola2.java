import java.util.Scanner;

public class Hola2 {
    public static void main(String[] args) {
        // System.out.println("Valores de Pi:");
        // System.out.println("------------------------------\n");
        // System.out.println("El numero Pi es " + Math.PI);
        // System.out.println("Y su doble es " + 2 * Math.PI);





        // int n = 5;
        // int dato = 7;
        // double resultado;

        // //System.out.println((12*n+dato)+3);
        // resultado = (12*n+dato)/3.0; //Para que ponga el resultado real
        // System.out.println(resultado);
        // El % es para que salga el resto de la división. 


        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu edad"); //Con el println pasa a la siguiente linea
        edad = sc.nextInt();
        sc.nextLine(); // Si pides numero antes del nextLine da error poraue coge un retorno de carro así que hay que poner un nextLine
        // para que recoja el retorno de carro guardado en la memoria y así el nextline del nombre no lo coge y funciona bien. 
        System.out.print("Ahora tu nombre: "); //El print es para escribir en la misma linea
        nombre = sc.nextLine();
        System.out.println(nombre + ", Welcome to the Java World");
        System.out.println("Nos vemos, ser humano de " + edad + " años");

        // System.out.println("Hola, \n\testoy en clase de \"programación\" :-( \nUn saludo");
    }

}
