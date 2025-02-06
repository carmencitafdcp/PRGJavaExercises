package ejercicios.Ejercicios;

public class Actividad3 {
    public static void main(String[] args) {
        String cadena = "Jar-Jar is the Big Boss";

        System.out.println("Longitud de la cadena: " + cadena.length());

        System.out.println("Primer caracter: " + cadena.charAt(0));
        System.out.println("Último caracter: " + cadena.charAt(cadena.length() - 1)); /*Es .length()-1 porque en .length emoieza a contar
        cero, uno, dos, tres... entonces como cuenta a partir cero el ultimo indice no es realmente el ultimo valor.  */

        if (cadena.length() > 100) {
            System.out.println("Carácter en la posición 100: " + cadena.charAt(100));
        } else {
            System.out.println("La cadena no tiene suficiente longitud para acceder al carácter en la posición 100.");
        }

        String cadenamayus = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + cadenamayus);

        System.out.println("Comparación con equals: " + cadena.equals(cadenamayus)); /*Compara teniendo en cuenta las mayusculas y minusculas
        es decir, compara si el contenido es EXACTAMENTE igual */
        System.out.println("Comparación con equalsIgnoreCase: " + cadena.equalsIgnoreCase(cadenamayus)); /*ignora las mayusculas o minusculas
        y se centra solo en comparar el "contenido" de las cadenas */

        System.out.println("Cadena en minúsculas: " + cadena.toLowerCase());

        System.out.println("¿Termina en 'Boss'?: " + cadena.endsWith("Boss"));
        System.out.println("¿Termina en 'Jar'?: " + cadena.endsWith("Jar"));

        System.out.println("Índice de la primera aparición de 'Jar': " + cadena.indexOf("Jar"));
        System.out.println("Índice de la última aparición de 'Jar': " + cadena.lastIndexOf("Jar"));

        String fragmento = cadena;
        System.out.println("El fragmento es: " + fragmento.substring(7,15));

        System.out.println("La cadena sin espacios: " + fragmento.trim());

        String[] cad = cadena.split("[ -]");
        System.out.println("Palabras separadas: " );
        for (String palabra : cad) {
            System.out.println(palabra);
        }

        for (String palabra : cad) {
            System.out.printf("%-3.3s\n",  palabra);
            //Es la longitud de la palabra mayor que 3? si es mayor hace el substring, si es menor muestra la palabra.
        }
    }
}
