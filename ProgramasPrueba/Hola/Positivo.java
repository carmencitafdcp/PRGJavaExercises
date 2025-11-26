import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean bandera;

        System.out.print("Dime un número entero: "); //El print es para que no vaya a la siguiente linea.
        numero = sc.nextInt();
        System.out.println(); //Es para dejar una línea en blanco. 

        bandera = numero > 0; //Primero hace la operación lógica y el resultado después se lo asigna a bandera. 
        //Es como hacer bandera = false o bandera = true pero con una operación que lo haga por si misma.

        System.out.println(bandera);

        if (bandera) { //Solo si bandera contiene un true entonces ejecuta la acción, si tiene false no la ejecuta.
            System.out.println("El número es positivo");
        }
    }
}
