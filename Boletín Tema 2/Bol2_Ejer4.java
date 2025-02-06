import java.util.Scanner;
public class Bol2_Ejer4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int number;
		double realnumber;

		System.out.print("Tell me a normal number: ");
		number = sc.nextInt();
		System.out.print("Tell me a real number: ");
		realnumber = sc.nextDouble();

		System.out.printf("The integer: \n %d \n %05o \n %X \n %7.3f ", number, number, number, realnumber);

		//BIEN

	}
}