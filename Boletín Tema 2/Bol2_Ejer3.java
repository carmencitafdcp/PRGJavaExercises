import java.util.Scanner;
public class Bol2_Ejer3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int number;
		int cont = 0;
		int acu = 0;

		System.out.print("Tell me a number: ");
		number = sc.nextInt();

		if (number > 0) {
            while (cont <= number) {
                acu = acu + cont;    
                cont++;
            }
            System.out.println("The result of the summatory of the numbers is: " + acu);
        }

        /* number = 10
           contador    acumulador 
           1            1
           2            1+2
           3            3+3
           4            6+4
           5            10+5
           6            15+6
           7            21+7
           8            28+8
           9            36+9
           10           45+10 = 55
        */
        
        //BIEN
	}
}