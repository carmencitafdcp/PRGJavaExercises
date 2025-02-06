package Ejercicio2;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor dime una fecha: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();
        System.out.println("Ahora por favor, otra fecha: ");
        int dia2 = sc.nextInt();
        int mes2 = sc.nextInt();
        int año2 = sc.nextInt();

        Fecha fecha1 = new Fecha(dia, mes, año);
        Fecha fecha2 = new Fecha(dia2, mes2, año2);

        System.out.println("La primera fecha en formato corto: " + fecha1.fechaFormateada(true));
        System.out.println("La primera fecha en formato largo: " + fecha1.fechaFormateada(false));
        System.out.println("La segunda fecha en formato corto: " + fecha2.fechaFormateada(true));
        System.out.println("La segunda fecha en formato largo: " + fecha2.fechaFormateada(false));

        int diferencia = Fecha.diferenciaFechas(fecha1, fecha2);
        System.out.println("La diferencia entre ambas fechas es " + diferencia);

        sc.close();
    }
}
