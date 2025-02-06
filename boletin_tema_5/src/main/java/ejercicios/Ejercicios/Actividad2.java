package ejercicios.Ejercicios;

public class Actividad2 {
       public static double[][] crearBidimensional(int filas, int columnas) {
        double[][] bidi = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                bidi[i][j] = (int) Math.random() * (30 - 20 + 1) + 20;
            }
        }
        return bidi;
    }

    public static void cabeceras(double[][] bidi) {
        System.out.print("    "); //Deja un espacio al principio para que quede bien alineado con la cabecera de las filas
        for (int i = 0; i < bidi[0].length; i++) {
            System.out.printf("%10s", "C: " + i); //El 10s es lo que ocupa cada string, así quedan separados
        }
        System.out.println();

        int fila = 0;
        for (double[] filaArray : bidi) { //Por cada indice del primer "array" (porque son dos en uno) pone un texto delante con formato
            System.out.printf("F: %2d", fila);
            for (double valor : filaArray) { // mostramos cada valor del array interno ahora por eso no lleva corchete y pertenece al array de los indices inicales
                System.out.printf("%10.2f", valor); 
            }
            System.out.println(); //retorno de carro para cada valor, así queda en formato columna
            fila++; //Esto es para que el nº de fila esté bien contado, va de uno en uno
        }
    }

    public static void main(String[] args) {
        // Crear arrays mediante la función
        double[][] vector1 = crearBidimensional(4, 3); //Especificamos el primer vector
        double[][] vector2 = crearBidimensional(3, 4); //Especificamos el segundo
        System.out.println("\nArray 4x3:");
        cabeceras(vector1); //Mostramos los que hemos creado con los encabezadis
        System.out.println("\nArray 3x4:");
        cabeceras(vector2); 
    }
}