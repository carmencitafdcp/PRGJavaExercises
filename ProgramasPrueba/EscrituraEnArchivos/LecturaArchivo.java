import java.io.File;
import java.util.Scanner;
public class LecturaArchivo{
    public static void main(String[] args) throws Exception{
        Scanner f = new Scanner(new File("prueba.txt"));

        String aux;

        aux = f.nextLine(); //lee el primer print
        System.out.println(aux);

        f.nextLine();
        f.nextLine(); //Lineas en blanco
        
        aux = f.nextLine(); //lee el 3.14
        System.out.println(Double.parseDouble(aux) * 2); //El parse cambia los tipos de datos 
        
        aux = f.nextLine(); //lee los números lineales
        System.out.println(aux);

        f.close();
    }
}