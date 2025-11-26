package ejercicios_basicos.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Esto es un programa que te permite elegir entre un triángulo o un rectángulo con la
  * propiedad booleana figura. Una vez escogida la figura el programa te muestra los datos
  * de susodicha figura además de unos cálculos básicos como area, perímetro y diagonal.
 */
public class MainGeometria {
    public static void main(String[] args) {//TODO pedir datos al usuario y try/catch
        Scanner sc = new Scanner(System.in);
        Geometría rectangulo = new Geometría(true, 5, 10);
        Geometría triangulo = new Geometría();
        boolean isChecked;
        
        do {
            isChecked = true;
            try {
                System.out.println("¿Qué altura quieres que tenga el triángulo?");
                double altura = sc.nextDouble();
                triangulo.setAltura(altura);
                System.out.println("¿Qué base deseas que tenga el triángulo?");
                double base = sc.nextDouble();
                triangulo.setBase(base);
                isChecked = false;
            } catch (InputMismatchException e) {
                System.out.println("Dato inválido, introduce un número double.");
                sc.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println("No se pueden introducir números negativos.");
                sc.nextLine();
            }
        } while (isChecked);
        

        // triangulo.setAltura(9);
        // triangulo.setBase(14);

        System.out.println("RECTÁNGULO:");
        System.out.println("-----------");
        System.out.println("Esta figura es un: " + rectangulo.tipo());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Diagonal: " + rectangulo.diagonal());
        System.out.println("Perímetro: " + rectangulo.perimeter());
        //
        System.out.println();
        System.out.println("TRIÁNGULO:");
        System.out.println("-----------");
        System.out.println("Esta figura es un: " + triangulo.tipo());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Área: " + triangulo.area());
        System.out.println("Diagonal: " + triangulo.diagonal());
        System.out.println("Perímetro: " + triangulo.perimeter());
    }   
}