import java.util.Scanner;
public class Bol2_Ejer19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        int option;

        System.out.println("Let's draw some stars!!");

        do{
            System.out.println(" MENU");
            System.out.println("------");
            System.out.println("1. Simple line of stars.");
            System.out.println("2. Diagonal line of stars facing right.");
            System.out.println("3. Diagonal line of stars facing left.");
            System.out.println("4. Exit.");
            System.out.println("Please, select an option:");
            option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                System.out.println("Please! Tell me how many stars do you want to draw:");
                n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("This is a simple line of stars.");
                System.out.println();
                    break;
                case 2:
                System.out.println("Please! Tell me how many stars do you want to draw:");
                n = sc.nextInt();
                for (int i = 0; i < n; i++) { //filas, por cada valor de i se dibuja una nueva línea
                    for (int j = 0; j < i; j++) { //Columnas (Se pone i en vez de n porque la cantidad de espacios debe aumentar en función de la línea)
                        //Empieza en la línea 1 sin espacio, en la dos con 1 y así sucesivamente.
                        System.out.print(" "); //En las columnas se escriben los espacios
                    } //Tiene que ser sí o sí, print o printf.
                    System.out.println("*"); //Y en las filas las estrellas
                }
                    break;
                case 3:
                System.out.println("Please! Tell me how many stars do you want to draw:");  
                n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= n-i; j++) { //Es n-i porque el número de espacios disminuye a medida que i aumenta, es decir, 
                        //n es el número total de filas o estrellas y es por ello que a cada vuelta debe disminuir
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                    break;
                case 4:
                    System.out.println("ByeBye!");
                    break;
                default:
                    System.out.println("Ups! Not an option.");
                    break;
            }
        } while(option != 3);
    }
}
