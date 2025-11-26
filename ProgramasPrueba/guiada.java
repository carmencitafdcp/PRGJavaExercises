import java.util.Scanner;
public class guiada{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age;
		int license;
		int price = 0;
		int basePrice = 300;

		System.out.print("How old are you? ");
		age = sc.nextInt();
		System.out.print("Tell me how many years of license do you have: ");
		license = sc.nextInt();

		if(age < 21){
			price = basePrice + 100;
		} else if (license <= 10){
			price = basePrice;
		} else if (license > 10){
			price = basePrice - 30;
		}

		System.out.println("You have to pay: " + price + "Euros");
	}
}