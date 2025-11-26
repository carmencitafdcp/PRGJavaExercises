package ejercicios.Ejercicios;

import java.util.ArrayList;

//BIEN
public class Ejer3BASICO {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = crearArray(10);
        mostrarArray(lista1);
        System.out.println("\nMaximo: " + valorMaximo(lista1));
        System.out.println("Minimo: " + valorMinimo(lista1));
        if (intercambio(lista1, 4, 6)) {
            mostrarArray(lista1);
        } else {
            System.out.println("No se puede realizar este cambio. Indices fuera de rango.");
        }
    }

    public static ArrayList<Integer> crearArray(int n) { // El ArrayList <Integer> es un tipo, como si fuera int o
                                                         // double.
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            lista.add((int) (Math.random() * (5000 - 1000 + 1)) + 1000);
        }
        return lista;
    }

    public static void mostrarArray(ArrayList<Integer> lista) {
        System.out.print("\nLista:  ");
        for (int valores : lista) {
            System.out.println(valores + "  ");
        }
    }

    public static int valorMaximo(ArrayList<Integer> lista) {
        int max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }

    public static int valorMinimo(ArrayList<Integer> lista) {
        int min = lista.get(0);
        for (Integer valor : lista) {
            if (valor < min) {
                min = valor;
            }
        }
        return min;
    }

    public static boolean intercambio(ArrayList<Integer> lista, int uno, int dos) {
        if (uno >= 0 && uno < lista.size() && dos >= 0 && dos < lista.size()) {
            int change = lista.get(uno); // Valor del dato en la posicion uno
            lista.set(uno, lista.get(dos)); // Ahora al dato que estaba en la posicion uno le pone el valor que está en
                                            // la posicion 2
            lista.set(dos, change); /*
                                     * Y ahora el dato de la posición dos que es el que había en la uno es igual a
                                     * change entonces ahora
                                     * el dato que estaba en la posicion uno está en la posicion 2 y viceversa.
                                     */
            return true;
        } else {
            return false;
        }
    }
}
