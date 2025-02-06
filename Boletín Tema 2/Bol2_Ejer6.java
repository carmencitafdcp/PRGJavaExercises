import java.util.Scanner;
public class Bol2_Ejer6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int option;
		double realnumber;
		double Square;
		double number;
		double inverted;
		double number2;
		double squareroot2;
		int num1;
		int num2;
		int and;
		int nnn1;
		int nnn2;
		int or;
		
		do{
			System.out.println("1. Real number square.");
			System.out.println("2. Inverted number.");
			System.out.println("3. Normal number squareroot.");
			System.out.println("4. AND operation.");
			System.out.println("5. OR operation.");
			System.out.println("6. End.");
			System.out.print("Select an option: ");
			option = sc.nextInt();
			switch(option){
				case 1:
				    System.out.println();
					System.out.println();
					System.out.print("Tell me a real number: ");
					realnumber = sc.nextDouble();
					Square = realnumber * realnumber;
					System.out.printf("Squareroot: %.2f ", Square);
					System.out.println();
					System.out.println();
				break;
				case 2:
					System.out.println();
					System.out.print("Tell me an integer number: ");
					number = sc.nextDouble();
					while(number == 0){
						System.out.print("Tell me an integer number: ");
						number = sc.nextDouble();
					}
					inverted = 1/number; //Para que sea invertido ha de ser double, o bien pongo el double numbero o bien pongo el 1.0
					System.out.printf("Inverted: %.4f", inverted);
					System.out.println();
					System.out.println();
				break;
				case 3:
					System.out.println();
					System.out.print("Tell me a number: ");
					number2 = sc.nextDouble();
					while(number2 < 0){
						System.out.print("Tell me a number: ");
						number2 = sc.nextDouble();
					}
					squareroot2 = Math.sqrt(number2);
					System.out.printf("Squareroot: %.3f", squareroot2);
					System.out.println();
					System.out.println();
				break;
			 	case 4:
			 		System.out.println();
			 		System.out.println("Tell me a number: ");
			 		num1 = sc.nextInt();
			 		System.out.println("Tell me another number: ");
			 		num2 = sc.nextInt();
			 		and = num1&num2;
			 		System.out.printf("AND result: %x", and);
			 		System.out.println();
					System.out.println();
			 	break;
			 	case 5:
			 		System.out.println();
			 		System.out.println("Tell me a number: ");
			 		nnn1 = sc.nextInt();
			 		System.out.println("Tell me another number: ");
			 		nnn2 = sc.nextInt();
			 		or = nnn1|nnn2;
			 		System.out.printf("AND result: %x", or);
			 		System.out.println();
					System.out.println();
			 	break;
			 	case 6:
			 		System.out.println();
			 		System.out.println("Byebye!!");
			 	break;
			   	default:
			   		System.out.println("Not an option...");
			   	break;
			}
		} while(option != 6);

		//BIEN
	}
}
