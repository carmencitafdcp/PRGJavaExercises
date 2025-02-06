import java.util.Scanner;

public class Bol2_Ejer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asterisk;

        System.out.println("Tell me the quantity of asterisks that you want:");
        asterisk = sc.nextInt();

        for (int n = 0; n <= asterisk; n++) {
            for (int a = 0; a < n; a++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int n = 1; n <= asterisk; n++) { 
            for (int a = 1; a <= asterisk - n; a++) {
                System.out.print("0");
            }
            for (int b = 1; b <= (n * 2) - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        String ast="*";
        for (int n = 1; n <= asterisk; n++) {
            for (int a = 1; a <= asterisk - n; a++) {
                System.out.print(" ");
            }
            System.out.println(ast);
            ast=ast+"**";
        }
    }
}
