import java.util.Scanner;

public class Bol2_Ejer20b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Now let's make a full piramid!!");
        System.out.println("You may tell me how many rows do you want it to have: ");
        n = sc.nextInt();

        //i = filas, j = columnas
        for (int i = 1; i <= n; i++) { //Cada vuelta corresponde a una fila
            for (int j = 1; j <= n - i; j++) { //Determina los espacios en blanco que preceden a los asteriscos,
                //Para la fila 1 (i = 1) este bucle pintará n-1 espacios, es decir, en la primera imprimirá 9 espacios
                // Para la segunda fila (i = 2) j pintará n-2 espacios, es decir, 8 espacios.
                //Va recorriendo tanto j como i, es por ello que va, n-1 en la primera fila, n-2 en la segunda, n-3 en la tercera... 
                //Y en la última habrá n-10 y n ya es 10 así que ya no imprimirá ningun espacio
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= (i * 2) - 1; j2++) { //Se encarga de imprimir los asteriscos en cada fila, en la primera fila (i = 1)
                //Se imprimen (1*2)-1 asteriscos es decir, 1, en la segunda imprimirá (2*2)-1 es decir, 3 y así sucesivamente. 
                System.out.print("*");
            }
            System.out.println(); //Esta se encarga de que cuando ya se ha terminado cada vuelta en cada bucle pues pasa a la siguiente linea.
        }
    }
}
