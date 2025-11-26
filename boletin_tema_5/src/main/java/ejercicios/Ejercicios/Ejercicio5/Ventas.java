package ejercicios.Ejercicios.Ejercicio5;

import java.time.LocalDate;

public class Ventas {
    public int[] ventasMes = new int[12];
    private int año;

    /**
     * Constructor de la clase que inicializa el array de ventasMes con valores aleatorios del 1 al 999
     * @param año parámetro con el cuál se incializa el año
     */
    public Ventas(int año) {
        for (int i = 0; i < ventasMes.length; i++) {
            this.ventasMes[i] = (int) (Math.random() * 1000); //Debe ser por mil porque el math.random nunca llega al número por el que le multiplicas
            //llega solo hasta 999 o hasta numero-1
        }
        setAño(año);
    }
    
    /**
     * Otro constructor sobrecargado que inicializa el array de ventas 
     * @param año para inicializar año
     * @param arrayVentas array para inicializar el array de ventasMes
     */
    public Ventas(int año, int[] arrayVentas){
        setAño(año);
        if (arrayVentas.length == 12) {
            this.ventasMes = arrayVentas; 
        } else {
            for (int i = 0; i < arrayVentas.length; i++) {
                this.ventasMes[i] = (int) (Math.random() * 1000);
            }
        }
    }

    /**
     * Función que inicializa año al parámetro si es menor que la fecha actual, si es mayor inicializa con la fecha anterior
     * @param año año con el que se va a inicializar el año
     */
    public void setAño(int año) {
        int fecha = LocalDate.now().getYear();
        if (año <= fecha) {
            this.año = año; 
        } else {
            this.año = fecha - 1; //Porque es el año pero menos uno, es decir, el año anterior.
        }
    }

    /**
     * Función que devuelve el año
     * @return devuelve el año
     */
    public int getAño() {
        return año;
    }

    /**
     * Función que calcula la media de todos los valores del array de ventasMes
     * @return devuelve susodicha media
     */
    public double media(){
        double acu = 0;
        for (int i = 0; i < ventasMes.length; i++) {
            acu = acu + ventasMes[i]; 
            /*En la primera acu vale 0 + el primer valor del array, en la siguiente acu valdrá ventas[1] + ventas[2] en el siguiente
             * valdrá susodicho resultado más el siguiente valor y así sucesivamente.
             */
        }
        double media = acu / ventasMes.length; //División del resultado total de la suma de los valores entre la cantidad total de valores.
        return media;
        //Ahora la media ya no es entera.
    }

    /**
     * Función que muestra el número de ventas aleatoriamente que ha habido cada año
     */
    public void grafica() {
        System.out.println("Año " + this.año + ": ");
        for (int i = 0; i < ventasMes.length; i++) {
            int mes = i + 1; // Los meses van de 1 a 12
            int ventas = ventasMes[i];
            int numBloques = ventas / 100;
            
            //Construye la cadena de # por eso StringBuilder
            StringBuilder barras = new StringBuilder();
            for (int j = 0; j < numBloques + 1; j++) {
                barras.append("#");
            }
    
            System.out.printf("Mes %2d %4s): %s%n", mes, "("+ventas, barras.toString()); 
            //Ahora sí, bien formateado con el printf 
        }
    }
}
