import java.util.Scanner;

public class Bol2_Ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int negative = 0;
        int total = 0;

        System.out.println("Introduce some numbers, there are no restrictions of negative or positive!");
        System.out.println("To stop introducing numbers pulse 0.");

        do {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n < 0) {
                negative++; // Si el número es menor que 0 lo cuenta como negativo y va contando negativo
                            // tras negativo
            }
            if (n != 0) { //Con esta condición solo contará los números que no son 0. 
                total++; // Si no es negativo pues cuenta todos los números positivos incluído el 0.
                // Va sumándose de uno en uno y cuando acaba el bucle muestra el último número
                // guardado en la variable.
            }
        } while (n != 0);

        System.out.println("You introduced " + negative + " negative numbers and " + total + " numbers in total");
    }
}

//CORREGIDO