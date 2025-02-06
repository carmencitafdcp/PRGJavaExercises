import java.util.Scanner;
public class Bol2_Ejer8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("--- We are going to guess which number of the following numbers is the biggest ---");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Tell me the first number: ");
        num1 = sc.nextInt();
        System.out.println("The second: ");
        num2 = sc.nextInt();
        System.out.println("And the last: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" is the biggest one.");
        } else if(num2 > num3){
            System.out.println("The second number is the biggest one.");
        } else{
            System.out.println("The third number is the biggest one.");
        }

        //BIEN
    }
}
