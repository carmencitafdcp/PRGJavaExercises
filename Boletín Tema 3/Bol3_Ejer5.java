import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bol3_Ejer5 {
    public static void main(String[] args) throws Exception {
        PrintWriter f = new PrintWriter("Ejercicio4.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce a year: ");
        int year = sc.nextInt();

        if (Bol3_Ejer4.añoBisiesto(year)) {
            f.println(year + " it's a leap-year");
        } else {
            f.println(year + " not a leap-year");
        }

        for (int i = year; i <= 2024; i++) {
            if (Bol3_Ejer4.añoBisiesto(i)) {
                f.println(i);
            }
        }

        f.close();
        sc.close();

        Scanner sn = new Scanner(new File("Ejercicio4.txt"));
        String line;

        sn.nextLine(); // Salta la primera línea, donde especifica si el año es bisiesto o no

        boolean First = true;
        while (sn.hasNextLine()) { /* El hasNextLine() lee todo el archivo entero, entonces si hay lineas que escribir es true
            pero si se ha llegado al final del archivo es false.*/
            line = sn.nextLine();
            if (!First) { // Si no es la primera entrada entonces escribe comas, si es la primera entrada
                          // no escribe ninguna coma
                System.out.print(", ");
            }
            System.out.print(String.format("%6s", line)); // Aquí escribe las entradas con este formato, es decir,
                                                          // ocupando 6 caracteres
            // Y después el string.
            First = false; // Para asegurarse de que después de la primera entrada escriba el resto con comas.
        }

        sn.close();
    }
}
