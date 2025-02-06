public class Bol3_Ejer6 {

    /**
     * Calcula la potencia de una base elevada a su exponente
     * @param base numero a calcular potencia
     * @param exponent numero al que se eleva la base
     * @return result
     */
    public static double powersA(double base, int exponent){//TODO falta si exp negativo
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            if (exponent > 0) {
                result = result * base; /* Tiene que ser resultado por base porque en la primera vuelta resultado vale 1 pero 
                en la siguiente en resultado se guardará el valor de la base, es decir, 1 x base = base, entonces en las siguientes
                vueltas está multiplicando base x base "exponente" veces. */
                } else{
                    result = 1/result;
                
            }
        }
        return result;
    }

    /**
     * Calcula las n primeras potencias de a y las muestra
     * @param a numero a calcular las potencias
     * @param n numero máximo del exponente
     */
    public static void powersB(double a, int n){
        for (int i = 1; i <= n; i++) {
            double power = powersA(a, i); /*El exponente es i y no n, porque es i lo que se va incrementando a uno 
            vuelta por vuelta, n es solo el valor máximo al que se debe incrementar i*/
            System.out.println(a + " elevated to " + i + " = " + power);
        }
    }

    /**
     * Suma progresivamente los números menores del resultado de la potencia
     * @param x La base de la potencia
     * @param n Numero hasta el que se sumará
     * @return result
     */
    public static double geometricProgression(double x, double n){
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result = result + powersA(x, i);
        }
        return result;
    }

    public static void main(String[] args) {
       double power = powersA(2, 2);
       System.out.println("The power is: " + power);
       System.out.println();
       powersB(5, 2);
       System.out.println();
       System.out.println("The geometric progression is: " + geometricProgression(2, 4));
    }
}
