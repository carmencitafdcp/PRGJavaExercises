public class Bol3_Ejer11 {

    /**
     * Funcion que calcula el factorial de un número
     * @param number número del cual calcular el factorial
     * @return factorial
     */
    public static double factorial(int number){
        double factorial = 1;
        // if(number == 0){
        //     factorial = 1;
        // }
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    /**
     * Funcion que calcula el coseno de un angulo con Taylor
     * @param angle ángulo a calcular el coseno en radianes
     * @return cos
     */
    public static double coseno(double angle){
        double cos = 1;
        double sign = -1;
        for (int i = 1; i < 10; i+=2) {
            cos += sign * (Bol3_Ejer6.powersA(angle, i)/factorial(i));
            sign*=-1; //Alterna de signo 
        }
        return cos;
    }

    public static void main(String[] args) {
        for (double i = 0.1; i <= 1.0; i += 0.1) { /*Porque si es i++ hará: 0.1 + 0.1 = 0.2 ; 0.2 + 0.2 = 0.4; Y no queremos eso, queremos
            que vaya de 0.1 en 0.1 así que por eso sumamos cada vuelta por 0.1*/
            double resultado = coseno(i);
            System.out.printf("%n The result of the cos is: %08.5f, %n And the obtained error is: %08.5f" , resultado, resultado - Math.cos(resultado));
        }
    }
}
