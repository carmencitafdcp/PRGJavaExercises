import java.util.Scanner;

public class Bol3_Ejer4 {

    /**
     * Calcula si un año es bisiesto o no lo es
     * @param año año a compro
     * @return true si es bisiesto
     * @return false si no es bisiesto
     */
    public static boolean añoBisiesto(int año) {
        /*No puede ser todo OR o AND ya que en las condiciones no se puede ir por separado o juntarlas todas
         * si es multiplo de 4 entonces no es divisible entre 100 por eso &&, si es divisible entre 400 entonces
         * directamente no lo es por 100. 
         */
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Introduce some years:");
        System.out.println("To stop introducing years, pulse 0.");
        do {
            año = sc.nextInt();
            if (añoBisiesto(año)) {
                System.out.println("This is a leap-year.");
            } else{
                System.out.println("Not a leap-year...");
            }
        } while (año != 0);
        
        sc.close();
    }
}

//BIEN