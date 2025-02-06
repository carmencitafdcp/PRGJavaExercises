import java.util.Scanner;
public class Bol2_Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int option; 
        int summ = 0;
        int count = 0;
        double avg; 

        do{
           System.out.println("  OPTIONS: ");
           System.out.println("------------");
           System.out.println("1. Calculate the average.");
           System.out.println("2. Close program.");
           System.out.println("--------------------------");
           System.out.println("Select an option please:");
           option = sc.nextInt();

           switch (option) {
            case 1:
                System.out.println("We are going to calculate the average of some numbers!");

                do{
                    System.out.println("Tell me a number: ");
                    number = sc.nextInt(); //Asks for the number.
                    if(number != 0){ //checks that the numbers aren't 0.
                        summ = summ + number; //stores the previous number in the variable summ and adds it to the newest number;
                        count++; //counts how many numbers the user introduced;
                    }
                } while(number != 0);

                avg = +summ/count; //makes the summatory of all the numbers introduced and divides it with the quantity of numbers in total. 
                System.out.println("The average of these numbers is: " + avg);
            break;
            case 2:
                System.out.println("ByeBye!");
            break;
            default:
                System.out.println("Not a valid option...");
            break;
           }
        } while(option != 2);
        
        //BIEN
    }
}

