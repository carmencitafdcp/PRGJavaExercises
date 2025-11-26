public class Ejer2BASICO {
    public static void main(String[] args) {
        char[][] vector = crearMatriz(4, 5);
        mostrarMatriz(vector);
        // System.out.println("\nMaximo: " + valorMaximo(vector));
        // System.out.println("Minimo: " + valorMinimo(vector));
        System.out.println("\nIntercambio de posiciones: ");
        if (intercambio(vector, 4, 6, 3, 2)) { //si el vector está dentro del rango
            mostrarMatriz(vector); // Muestra el vector intercambiado
        } else {
            System.out.println("Error: índices fuera de rango.");
        }
    }

    public static char[][] crearMatriz(int n, int m) {
        char[][] matriz = new char[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (char) ('A' + (int) (Math.random() * 26)); /*
                                                                           * En cada índice del vector se pondrá una
                                                                           * letra aleatoria
                                                                           */
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(char[][] vector) {
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < vector[0].length; i++) {
            System.out.printf("%5s", "C:" + i); // Aquí estaría la cabecera
        }
        System.out.println();

        int cont = 0;
        for (char[] fila : vector) { // Por cada fila (que es un array)
            System.out.printf("F%d", cont);
            for (char valor : fila) { // Muestra los valores char (que ya no son arrays) fila por fila
                System.out.printf("%4c ", valor);
            }
            System.out.println();
            cont++;
        }

    }

    public static int valorMaximo(int[] vc) {
        int max = vc[0]; /*
                          * Se instancia max al primer valor del vector, por poner cualquiera entonces
                          * así después
                          * se comprueba cada valor del vector uno por uno hasta que haya uno mayor que
                          * max entonces se actualizará el valor de max
                          */
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
                min = item; /* Actualiza valor por valor hasta encontrar el menor de todos */
                /*
                 * cuando ya se ha encontrado el menor ya no hay ningun item que sea menor que
                 * dicho valor así que saldrá de la comprobación.
                 */
            }
        }
        return min;
    }

    public static boolean intercambio(char[][] vcc, int fila1, int fila2, int col1, int col2) {
        // Validar si los índices están dentro del rango de la matriz
        if (fila1 >= 0 && fila1 < vcc.length && fila2 >= 0 && fila2 < vcc.length && col1 >= 0 && col1 < vcc[0].length
                && col2 >= 0 && col2 < vcc[0].length) {
            char temp = vcc[fila1][col1];
            vcc[fila1][col1] = vcc[fila2][col2];
            vcc[fila2][col2] = temp;
            return true;
        }
        return false; // Retornar false si los índices están fuera de rango
    }
}