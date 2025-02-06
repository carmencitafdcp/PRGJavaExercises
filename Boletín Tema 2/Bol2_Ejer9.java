import java.util.Scanner;
public class Bol2_Ejer9 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int quantity;
        int number;
        int max = 0;
        int firstnumber;

        System.out.println("In this program we are going to calculate the maximum of some numbers that you're going to write");
        System.out.println("*************************************************************************************************");
        System.out.print("So please... \nTell me how many numbers do you want to introduce: ");
        quantity = sc.nextInt();
        System.out.println("Tell me a number: ");
        max = sc.nextInt();
        for (int i = 1; i < quantity; i++) { //Si empiezas en 1 da una vuelta menos
            System.out.println("Tell me a number: ");
            number = sc.nextInt();
            // max = number; //Te guarda el primer valor introducido y así puedes comparar números negativos
            if(max <= number){ 
                max = number;
                //Compara el valor de max con el último número introducido por el usuario, es decir que, si el número introducido es 
                //mayor que max pues actualiza el valor de max con dicho número, por lo tanto max siempre va a ser el número más grande,
                //porque va número por número actualizando max, pero solo cuando el número introducido es mayor que max, entonces cuando
                //ya no quedan más números por introducir max se queda con el valor más grande introducido.
            }
        }
        
        System.out.println("The biggest number of the introduced ones is: " + max);
        
        //BIEN
    }
}
