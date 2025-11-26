package ejercicios.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isChecked;
        do {
            do {
                isChecked = true;
                try {
                    System.out.println("MENU");
                    System.out.println("*****");
                    System.out.println("1.- Cadena escrita verticalmente. ");
                    System.out.println("2.- Fragmento de una cadena.");
                    System.out.println("3.- Cadena centrada en la consola.");
                    System.out.println("4.- Cadena pasada a vector.");
                    System.out.println("5.- La cadena del revés.");
                    System.out.println("6.- Cadena reformateda a mayúsculas y sin guiones.");
                    System.out.println("7.- Salir.");
                    System.out.print("Escoge una opción por favor: ");
                    option = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out
                    .println("Has introducido una opción que no es un número, por favor introduce un número.");
                    isChecked = false;
                    sc.nextLine();
                }
            } while (!isChecked);
            switch (option) {//TODO gestion de try/cach YA
                case 1:
                    System.out.println("*Cadena en línea*");
                    muestraEnLinea("Holabuenas");
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    boolean isChecked2;
                    String cad = "";
                    int posicion = 0;
                    int cantidad = 0;
                    System.out.println("*Fragmento de cadena*");
                    do {
                        isChecked2 = true;
                        System.out.println("Necesito que me des una cadena, una posición y la cantidad de caracteres a contar.");
                        sc.nextLine(); //Hay que limpiar buffer
                        try {
                            System.out.println("Dame una cadena: ");
                            cad = sc.nextLine();
                            System.out.println("Ahora un número para la posición desde donde contar: ");
                            posicion = Integer.parseInt(sc.nextLine());
                            System.out.println("Por último dame la cantidad de caracteres que quieres sacar: ");
                            cantidad = Integer.parseInt(sc.nextLine());  
                            System.out.println("\nEl fragmento es: " + subcadena(cad, posicion, cantidad));
                        } catch (NumberFormatException e) {
                            System.out.println("Error: No has introducido datos numéricos válidos.");
                            isChecked2 = false;
                        } catch (StringIndexOutOfBoundsException e){
                            System.out.println("Índice no existente para la cadena lanzada.");
                            isChecked2 = false;
                        }
                    } while (!isChecked2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    boolean isChecked3;
                    String cad2 = ""; 
                    System.out.println("*Texto centrado en consola*");
                    do {
                        isChecked3 = true;
                        sc.nextLine();
                        try {
                            System.out.println("Dame una cadena de texto para centrarla en consola.");
                            cad2 = sc.nextLine();
                            muestracentrado(cad2);
                        } catch (StringTooLongException e) {
                            System.out.println("No se puede centrar una cadena tan larga, máximo 80 caracteres.");
                            sc.nextLine();
                            isChecked3 = false;
                        }
                    } while (!isChecked3);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("*Cadena a vector*");
                    System.out.println(cadenaAvector("HolaBuenas"));
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("*Cadena del reves*");
                    System.out.println(alreves("HoalBuenas"));
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("*Cadenas reformateadas*");
                    System.out.println(cadenaAMayusculas("HolaBuenas", "MeLlamoCarmen", "TengoHambre"));
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Byebye!");
                    break;
                default:
                    System.out.println("Invalid option...");
                    break;
            }
        } while (option != 7);
        sc.close();
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
    public static String subcadena(String cadena2, int pos, int charac) { //TODO indicar el valor de los parametros en la excp
        if (cadena2 == null || cadena2.equals("") || pos < 0 || charac < 0) {
            throw new InexistentIndexException(String.format("Parámetros inválidos, la cadena %s, la posición %d y la cantidad %d podrían contener un error.", cadena2, pos, charac));
        } else {
            String resultado = "";
            for (int i = pos; i < pos + charac; i++) {
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
        if (cadena3.length() > 80) {
            throw new StringTooLongException();
            //Aquí muestra "cadena demasiado larga" que está en el constructor de la propia excepción
        }
        int anchoConsola = 80;
        int longitudTexto = cadena3.length();
        if (longitudTexto >= anchoConsola) {
            System.out.println(cadena3);
        } else {
            int espacios = (anchoConsola - longitudTexto) / 2;
            String textoCentrado = repetido(" ", espacios) + cadena3;
            /*
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
        if (cadena4 == null || cadena4.equals("") || cantidad <= 0) {
            throw new IllegalArgumentException(
                    "Parámetros inválidos. Debes introducir una cadena de texto y una cantidad de caracteres válida.");
        }
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
        if (cadena5 == null || cadena5.equals("")) {
            throw new IllegalArgumentException("Parámetro inválido. Debes introducir una cadena de texto.");
        }
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
        if (cadena6 == null || cadena6.equals("")) {
            throw new IllegalArgumentException("Parámetro inválido. Debes introducir una cadena de texto.");
        }
        String delReves = "";
        for (int i = cadena6.length() - 1; i >= 0; i--) {
            /*
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
        if (cadenas == null || cadenas.length == 0) {
            throw new IllegalArgumentException("Cadena inexistente, debes pasar una cadena.");
        }
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
