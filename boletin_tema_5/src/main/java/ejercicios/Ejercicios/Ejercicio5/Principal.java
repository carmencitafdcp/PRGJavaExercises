package ejercicios.Ejercicios.Ejercicio5;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException{
        String nombreArchivo = "ventas.txt";
        if (args.length > 0) {
            nombreArchivo = args[0];
        }

        File archivo = new File(nombreArchivo);
        Ventas ventas;
        
        if (archivo.exists()) {
            Scanner scanner = new Scanner(System.in);
            int año = Integer.parseInt(scanner.nextLine().trim());
            int[] ventasMes = new int[12];
            String[] valores = scanner.nextLine().split(";");
            
            for (int i = 0; i < valores.length && i < 12; i++) {
                ventasMes[i] = Integer.parseInt(valores[i].trim());
            }
            
            ventas = new Ventas(año, ventasMes);
            scanner.close();
        } else {
            int añoAnterior = LocalDate.now().getYear() - 1;
            ventas = new Ventas(añoAnterior);
        }
        
        ventas.grafica();
        System.out.printf("\nMedia de ventas: %.2f\n", ventas.media());
        
        String archivoSalida = "ventas" + ventas.getAño() + ".txt";
        PrintWriter writer = new PrintWriter(new FileWriter(archivoSalida));
        writer.println(ventas.getAño());
        for (int i = 0; i < 12; i++) {
            writer.print(ventas.ventasMes[i]);
            if (i < 11) writer.print(";");
        }
        writer.close();
        System.out.println("Datos guardados en " + archivoSalida);
        
    }
}