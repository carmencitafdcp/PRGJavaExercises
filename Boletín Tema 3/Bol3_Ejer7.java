import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Bol3_Ejer7 {

    /**
     * Lee archivo y luego devuelve el contenido separado por retornos de carro
     * @param name nombre del archivo
     * @return content
     * @throws Exception
     */
    public static String loadFile(String name) throws Exception {
        Scanner sc = new Scanner(new File(name)); // Apertura del archivo que quiero leer
        String content = ""; //Variable para guardar el contenido. 
        while (sc.hasNextLine()) { // Si hay lineas que escribir...
            content = content + sc.nextLine() + "\n"; // Escribe el contenido separado por retornos de carro
        }
        sc.close();
        return content;
    }

    /**
     * Lee un archivo y concatena el contenido de dicho archivo con una cadena
     * @param name nombre del archivo
     * @param add cadena a añadir
     * @throws Exception
     */
    public static void appendFile(String name, String add) throws Exception {
        String content = loadFile(name); //Guardamos lo que lea la otra funcion en esta variable
        PrintWriter f = new PrintWriter(name);
        content = content + add + "\n"; //Y entonces concatenamos el contenido de la variable con el String a concatenar
        f.println(content); //Entonces muestra dicha concatenación por pantalla.
        f.close();
    }

    /**
     * Lee un archivo y concatena el contenido de dicho archivo con una cadena
     * @param name nombre archivo
     * @param add cadena a añadir
     * @throws Exception
     */
    public static void appendFile2(String name, String add) throws Exception {
        PrintWriter f = new PrintWriter(new FileWriter(name, true)); //Agrega contenido al final del archivo. 
        f.println(add); //Se muestra por pantalla la cadena.
        f.close();
    }
}
