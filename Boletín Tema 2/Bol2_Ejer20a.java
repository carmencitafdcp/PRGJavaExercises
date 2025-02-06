import java.util.Scanner;
public class Bol2_Ejer20a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Let's make a half piramid!!");
        System.out.println("First of all, tell me how many rows do you want the piramid to have?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) { //Filas
            for (int j = 0; j < i; j++) { //j < i porque j va pintando las columnas en las filas, es decir, va de fila en fila.
                System.out.print("*"); //En vez de pintar espacios, se pintan estrellas, recordar siempre con print o printf
            }
            System.out.println("*");
        }
    }
}
