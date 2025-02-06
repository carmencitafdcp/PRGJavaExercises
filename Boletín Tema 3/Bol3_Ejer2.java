import java.io.PrintWriter;
import java.util.Scanner;
public class Bol3_Ejer2 {
    /**
     * Escribe los resultados del ejercicio 1 en un archivo txt 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        PrintWriter f = new PrintWriter("Ejercicio2.txt");
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numero;
        System.out.println("Bienvenido! Cómo te llamas?");
        nombre = sc.nextLine();
        f.println(nombre);
        System.out.println("Dime un número, te diré si es par o impar, positivo o negativo.");
        numero = sc.nextInt();
        f.println(numero);
        String parImpar = numero % 2 == 0 ? "Par":"Impar";
        String negatiposi = numero >= 0 ? "Positivo":"Negativo";
        f.print("El nº es " +  parImpar + " y " + negatiposi);
        f.close();
        sc.close();
        Bol3_Ejer7.loadFile(negatiposi);
    }
}

//BIEN