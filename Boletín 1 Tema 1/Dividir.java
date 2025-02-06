import java.util.Scanner;
public class Dividir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero1;
        int numero2;
        int resultadoSuma; 
        int cociente;
        int resto; 

        System.out.println("¡Ahora vamos a hacer algo más complejo!\nVeremos el cociente y el resto de la división.");
        System.out.println("Dime el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Ahora el segundo número: ");
        numero2 = sc.nextInt();
        resultadoSuma = numero1 + numero2;
        System.out.println("El resultado de la suma de dichos números es..." + resultadoSuma);
        System.out.println("Ahora vamos a conocer cual es el resultado de dividir ambos números!");
        cociente = numero1/numero2; 
        resto = numero1%numero2;
        System.out.println("El cociente de la división de los números es: " + cociente + " Y el resto es: " + resto);
    }
}
