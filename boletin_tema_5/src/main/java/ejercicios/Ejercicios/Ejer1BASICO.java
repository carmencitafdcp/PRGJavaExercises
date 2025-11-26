package ejercicios.Ejercicios;

//BIEN
public class Ejer1BASICO {
    public static void main(String[] args) {
        int[] vector = crearVector(10);
        mostrarVector(vector);
        System.out.println("\nMaximo: " + valorMaximo(vector));
        System.out.println("Minimo: " + valorMinimo(vector));
        System.out.println("\nIntercambio de posiciones: ");
        if (intercambio(vector, 4, 6)) { //si el vector está dentro del rango
            mostrarVector(vector); // Muestra el vector intercambiado
        } else {
            System.out.println("Error: índices fuera de rango.");
        }
    }

    public static int[] crearVector(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (5000 - 1000 + 1)) + 1000; /* En cada índice del vector se pondrá un número aleatorio */
        }
        return vector;
    }

    public static void mostrarVector(int[] vector) {
        System.out.print("\nArray:  ");
        for (int item : vector) {
            System.out.print(item + "  ");
            /* El item es como hacer:
             * int item = vector[i];
             * por eso va mostrando los valores que tiene el vector en cada índice
             */
        }
        System.out.println();
    }

    public static int valorMaximo(int[] vc) {
        int max = vc[0]; /* Se instancia max al primer valor del vector, por poner cualquiera entonces así después 
        se comprueba cada valor del vector uno por uno hasta que haya uno mayor que max entonces se actualizará el valor de max */
        for (int i = 0; i < vc.length; i++) {
            if (vc[i] > max) { /* Comprueba cada valor uno por uno a ver si es mayor que max */
                max = vc[i]; /* Actualiza max al verdadero valor maximo del vector */
            }
        }
        return max;
    }

    public static int valorMinimo(int[] vc) {
        int min = vc[0]; /* Se instancia al primer valor, por poner cualquiera */
        for (int item : vc) {
            if (item < min) {
                min = item; /* Actualiza valor por valor hasta encontrar el menor de todos*/
                /* cuando ya se ha encontrado el menor ya no hay ningun item que sea menor que dicho valor así que saldrá de la comprobación.*/
            }
        }
        return min;
    }

    public static boolean intercambio(int[] vcc, int uno, int dos) {
        if (uno >= 0 && uno < vcc.length && dos >= 0 && dos < vcc.length) {
            int change = vcc[uno];
            vcc[uno] = vcc[dos];
            vcc[dos] = change;
            return true;
        }

        return false;
    }
}