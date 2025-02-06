import java.util.Scanner;
public class Bol2_Ejer11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int summatory = 1; //Variable donde se va guardando el valor de la suma, comienza en 1 y se va sumando de uno en uno. 

        while(summatory <= 10000){ //Este bucle se va a ejecutar siempre y cuando la suma sea menor que 10000 cuando sea mayor para.
            //Cada vez que el bucle sumas un nuevo número en la variable summatory, es decir n, que cada vuelta tiene +1, así que
            //en summatory se va guardando el total de la suma acumulada de los números. 
            n++; //En cada vuelta del bucle n incrementa +1 entonces vas sumando, 1+2+3... así hasta que el resultado de la suma sea 10000,
            summatory = summatory + n; //la suma va aumentando sumando el valor de n
            //entonces el bucle para con el resultado de N que ha "Conseguido" que la suma haya superado a 10000
            //El numero 142, que es el resultado, es el número que al sumar 1+2+3+4...+142 da mayor que 10000.  
        }

        System.out.println("The value of n is: " + n);

        //BIEN
    }
}
