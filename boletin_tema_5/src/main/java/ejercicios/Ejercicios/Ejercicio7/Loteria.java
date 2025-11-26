package ejercicios.Ejercicios.Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Ahora sin cerrar los sc.
        int[] aciertos = new int[7];
        System.out.println("Introduce 6 números entre 1 y 49 separados por comas.");
        ArrayList<Integer> numeros = pedirYcomprobar();
        ArrayList<Integer> numerosLoteria = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            rellenaCol(numerosLoteria);
            int coincidencias = compara(numeros, numerosLoteria);
            aciertos[coincidencias]++;
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < aciertos.length; i++) {
            System.out.println(i + " aciertos: " + aciertos[i]);
        }
    }
    
    /**
     * Rellena una coleccion con números aleatorios entre 1 y 49
     * @param coleccion Coleccion a rellenar
     * @return La coleccion rellenada con los números
     */
    public static ArrayList<Integer> rellenaCol(ArrayList<Integer> coleccion){
        if (coleccion.size() != 0) { //Comprueba que la coleccion no esté vacía para así limpiarla
            coleccion.clear();
        }

        for (int i = 0; i <= 6; i++) {
            coleccion.add((int) (Math.random() * 49) + 1);
        }
        return coleccion;
    }

    /**
     * Compara las colecciones pasadas como parámetros y comprueba si comparten valores
     * si hay valores compartidos el contador se incrementa en uno por cada valor
     * @param col1 Primera colección a comparar
     * @param col2 Segunda colección a comparar
     * @return La cantidad de valores compartidos
     */
    public static int compara(ArrayList<Integer> col1, ArrayList<Integer> col2){
        int igual = 0; 
        for (int valor : col1) {
            if (col2.contains(valor)) {
                igual++;
            }
        }
        return igual;
    }

    /**
     * Recoge los números que el usuario introduce y comprueba si están separados por comas, 
     * si están dentro del rango o si en la coleccion ya existe el número introducido entonces
     * lanza una excepcion.
     * @return Devuelve la colección con los números que sí que son válidos. 
     */
    public static ArrayList<Integer> pedirYcomprobar(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String numsUser = sc.nextLine();
            String[] str = numsUser.split(",");
            ArrayList<Integer> validos = new ArrayList<>();

            try {
                for (String numero : str) {
                    int num = Integer.parseInt(numero);
                    if (num < 1 || num > 49 || validos.contains(num)) {
                        throw new NumberFormatException();
                    }
                    validos.add(num);
                }

                if (validos.size() == 6) {
                    return validos;
                } else {
                    System.out.println("Debes introducir solo 6 números entre 1 y 49.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Has introducido algo mal, introduce 6 números separados por comas.");
            }
        }
    }
}