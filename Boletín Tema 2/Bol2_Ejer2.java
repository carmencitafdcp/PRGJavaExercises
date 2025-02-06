import java.util.Scanner;
public class Bol2_Ejer2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int number1;
		int number2;

		System.out.print("Tell me the first number: ");
		number1 = sc.nextInt();
		System.out.print("Tell me the next number: ");
		number2 = sc.nextInt();

		if(number1 > number2){
			System.out.println("The first number is greater.");
		} else if(number2 > number1){
			System.out.println("The second number is greater.");
		} else {
			System.out.println("The numbers are equal.");
		} 
		
		
		if(number1 % number2 == 0||number2 % number1 == 0 ){
			System.out.println("The numbers are multiples.");
		}  

		//BIEN
	}
}