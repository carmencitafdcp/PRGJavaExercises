import java.util.Scanner;
public class Bol2_Ejer10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int swapp;

        System.out.println("We are going to make a magic trick!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Tell me a number: ");
        num1 = sc.nextInt();
        System.out.print("Tell me another number: ");
        num2 = sc.nextInt();

        swapp=num1;
        num1=num2;
        num2=swapp;

        System.out.print("Now the first number is: " + num1 + " and the second number: " + num2);

        //BIEN
    }
}   
