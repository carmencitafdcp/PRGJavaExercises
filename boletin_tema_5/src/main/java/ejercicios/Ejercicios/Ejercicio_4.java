package ejercicios.Ejercicios;

public class Ejercicio_4 {// TODO descibir parametros y return
    // TODO Probatr las funciones
    /**
     * Funcion principal desde la que se llaman el resto de funciones
     * 
     * @param args
     */
    public static void main(String[] args) {
        muestraEnLinea("Holabuenas");
        System.out.println("\nEl fragmento es: " + subcadena("holaBuenas", 3, 5));
    }

    /**
     * Esta funcion muestra cada letra en diferentes lineas de la cadena pasada como
     * parámetro
     * 
     * @param cadena cadena de la cual vamos a sacar las letras
     */
    public static void muestraEnLinea(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.printf("%c\n", cadena.charAt(i));
        }
    }

    /**
     * Funcion que muestra el fragmento de la cadena pasada como parametro que se
     * encuentra en la posicion pasada como parametro
     * y que tiene como longitud la posicion desde la que se ha cogido + la cantidad
     * de caracteres.
     * 
     * @param cadena2 Cadena origen
     * @param pos     posicion de inicio a partir de donde se cuentan los caracteres
     * @param charac  cantidad de caracteres a contar
     * @return el fragmento sacado de la cadena de Origen
     */
    public static String subcadena(String cadena2, int pos, int charac) {// TODO sin substring y revisar condición
        if (cadena2 == null || pos < 0 || pos >= cadena2.length() || pos + charac > cadena2.length()) {
            return ""; // No devuelve nada porque directamente no existe dicho fragmento con susodichas
                       // condiciones
        } else {
            String resultado = "";
            for (int i = pos; i < cadena2.length(); i++) {
                resultado += cadena2.charAt(i);
            }
            return resultado;
        }
    }

    /**
     * Funcion que centra el texto en una consola supuestamente de 80 caracteres de
     * ancho.
     * 
     * @param cadena3 cadena a centrar en consola
     */
    public static void muestracentrado(String cadena3) {
        int anchoConsola = 80;
        int longitudTexto = cadena3.length();
        if (longitudTexto >= 80) {
            System.out.println(cadena3);
        } else {
            int espacios = (anchoConsola - longitudTexto) / 2;
            String textoCentrado = repetido(" ", espacios) + cadena3; /*
                                                                       * Repetido mostrará " " la cantidad de veces que
                                                                       * salió de hace (anchoConsola - longitudTexto) /
                                                                       * 2
                                                                       */
            System.out.println(textoCentrado);
        }
    }

    /**
     * Funcion que repite una cadena cierta cantidad de veces, sirve para la funcion
     * de mostrar centrado
     * 
     * @param cadena4  cadena que se concatena a la cadena a centrar, en este caso
     *                 es un espacio
     * @param cantidad cantidad de veces que se va a repetir dicha cadena
     * @return devuelve los espacios repetidos cierta cantidad de veces
     */
    public static String repetido(String cadena4, int cantidad) {
        String repetido = "";
        for (int i = 0; i < cantidad; i++) {
            repetido += cadena4;
        }
        return repetido;
    }

    /**
     * Funcion que convierte una cadena pasada como parámetro a un vector de
     * caracteres
     * 
     * @param cadena5 cadena a convertir
     * @return devuelve el vector de caracteres de la cadena
     */
    public static char[] cadenaAvector(String cadena5) {
        /* Los caracteres de la cadena debo meterlos uno a uno en el vector */
        char[] vector = new char[cadena5.length()];
        // int cont = 0;
        for (int i = 0; i < cadena5.length(); i++) {
            vector[i] = cadena5.charAt(i);
        }
        return vector;
    }

    /**
     * Funcion que devuelve la cadena pasada como parámetro del reves.
     * 
     * @param cadena6 cadena a devolver del reves
     * @return devuelve la cadena del reves
     */
    public static String alreves(String cadena6) {
        String delReves = "";
        for (int i = cadena6.length() - 1; i >= 0; i--) { /*
                                                           * empieza desde cadena.length() -1 porque el ordenador no
                                                           * cuenta las posiciones
                                                           * desde 0 sino desde 1 entonces al final es la longitud menos
                                                           * el 0.
                                                           */
            delReves += cadena6.charAt(i);
        }
        return delReves;
    }

    /**
     * Funcion que pasado un "array" de parámetros de tipo cadena, va comprobando
     * cada caracater de cada cadena para ver si hay guiones bajos
     * o minúsculas, en el caso de los guiones bajos los cambia por espacio y el
     * caso de las minusculas las cambia por mayusculas y al final
     * separa las cadenas convertidas con espacio.
     * 
     * @param cadenas grupo de cadenas a convertir a mayusculas y concatenar
     * @return devuelve las cadenas concatenadas convertidas a mayusculas y con
     *         espacios en vez de guiones
     */
    public static String cadenaAMayusculas(String... cadenas) { // Esto está en el apéndice II, los puntos suspensivos
                                                                // hacen referencia a como si fuera un array de
                                                                // parámetros
        String convertida = "";
        for (String cadena : cadenas) {
            if (cadena != null) {
                for (int i = 0; i < cadena.length(); i++) {
                    char c = cadena.charAt(i);
                    if (c == '_') {
                        convertida += " ";
                    } else if (c >= 'a' && c <= 'z') {
                        convertida += (char) (c - 32);
                    } else {
                        convertida += c;
                    }
                }
                convertida += " "; // Para que en cada iteración separe con espacios las cadenas.
            }
        }
        return convertida;
    }
}
