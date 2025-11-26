package ejercicios.Ejercicios.Ejercicio6;

public class Matriz {
    public int[][] matriBidi;

    /**
     * Constructor que inicializa la matriz a NxN y la rellena con números
     * aleatorios del 1 al 10
     * 
     * @param n Tamaño de filas y columnas
     */
    public Matriz(int n) {
        this.matriBidi = new int[n][n];
        for (int i = 0; i < matriBidi.length; i++) {
            for (int j = 0; j < matriBidi[i].length; j++) {
                this.matriBidi[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    /**
     * Función que muestra la matriz en formato de tabla con cabecera de filas y
     * columnas
     * 
     * @param tabla la matriz que se mostrará con dicho formato
     */
    public static void tabla(int[][] tabla) {
        System.out.print("   "); // ----
        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf("%3s", i); // **
        }
        System.out.println();
        System.out.println();
        int cont = 0;
        for (int[] fila : tabla) {
            System.out.printf("%-3d", cont); // ----
            for (int valor : fila) {
                System.out.printf("%3d", valor); // **
            }
            System.out.println();
            cont++;
        }
    }

    /**
     * Función que suma todos los valores de la matriz entre sí
     * 
     * @return el resultado de dicha suma
     */
    public int suma() {
        int resultado = 0;
        for (int i = 0; i < matriBidi.length; i++) {
            for (int j = 0; j < matriBidi[i].length; j++) {
                resultado += matriBidi[i][j];
            }
        }
        return resultado;
    }

    /**
     * Función que suma los valores de la diagonal si se pasa a true y los valores
     * de la matriz sin diagonal si se pasa a false
     * 
     * @param diagonal si la diagonal es true devuelve la suma de la diagonal,
     *                 si es false devuelve la suma de los valores de la matriz sin
     *                 dicha diagonal
     * @return La suma de la diagonal o del resto de valores
     */
    public int suma(boolean diagonal) {
        int resultado = 0;
        for (int i = 0; i < matriBidi.length; i++) { //Solo bucle único.
            if (!diagonal) {
                resultado += matriBidi[i][i];
            } else {
                return suma() - suma(false); 
                //Ahora no uso bucle y uso las otras funciones hechas para asi calcular la sumaTotal
            }
        }
        return resultado;
    }

    /**
     * Función que suma los valores de la fila escogida y devuelve -1 si es que
     * la fila escogida no está en el rango o devuelve el resultado de la suma de
     * todos los elementos de la fila si todo está en perfectas condiciones.
     * 
     * @param n número de fila
     * @return -1 o la suma total de los elementos en la fila escogida
     */
    public int suma(int n) { // n es la fila en la que empieza
        int resultado = 0;
        if (n < 0 || n >= matriBidi.length) {
            return -1;
        } else {
            for (int i = 0; i < matriBidi[n].length; i++) {
                resultado += matriBidi[n][i];
            }
            return resultado;
        } 
        //Tenía el return fuera, tal vez era ese el error...
    }

    /**
     * Función que borra una fila cualquiera a la matriz o devuelve la matriz original
     * si la fila pasada no existe. 
     * 
     * @param n la fila a borrar
     * @return devuelve la matriz con una fila menos
     */
    public int[][] borraFila(int n) {
        if (n < 0 || n >= matriBidi.length) {
            return matriBidi;
        }
        int[][] matrizsinfila = new int[matriBidi.length - 1][matriBidi[0].length];
        // Es la misma matriz pero con una fila menos pero el mismo numero de columnas
        int cont = 0;
        for (int i = 0; i < matriBidi.length; i++) {
            if (i != n) { //Si no es la fila a borrar hace lo siguiente
                for (int k = 0; k < matriBidi[i].length; k++) {
                    matrizsinfila[cont][k] = matriBidi[i][k];
                }
                cont++;
            }
        }
        return matrizsinfila;
    }
}
