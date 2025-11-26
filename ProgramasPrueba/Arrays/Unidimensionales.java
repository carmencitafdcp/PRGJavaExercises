public class Unidimensionales {
    public static void main(String[] args) {
        double[] temperaturas = new double[4];
        temperaturas[0] = 11.5;
        temperaturas[1] = 14.5;
        temperaturas[2] = 18.0;
        temperaturas[3] = 0.0;

        // Rellena un array con valores aleatorios
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * 50 - 25;
        }
        
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]); // Siempre tiene que ser menor que el índice declarado.
        }
    }
}
