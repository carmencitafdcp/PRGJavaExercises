package ejercicios.Ejercicios;

import java.time.LocalDate;

public class Ventas {
    public int[] ventasMes = new int[12];
    private int año;

    public Ventas(int año) {
        for (int i = 0; i < ventasMes.length; i++) {
            this.ventasMes[i] = (int) Math.random() * 1000; //Debe ser por mil porque el math.random nunca llega al número por el que le multiplicas
            //llega solo hasta 999 o hasta numero-1
        }
        setAño(año);
    }
    
    public Ventas(int año, int[] arrayVentas){
        setAño(año);
        if (arrayVentas.length == 12) {
            this.ventasMes = arrayVentas; 
        } else {
            for (int i = 0; i < arrayVentas.length; i++) {
                this.ventasMes[i] = (int) Math.random() * 1000;
            }
        }
    }
    public void setAño(int año) {
        int fecha = LocalDate.now().getYear();
        if (año <= fecha) {
            this.año = año; 
        } else {
            this.año = fecha - 1; //Porque es el año pero menos uno, es decir, el año anterior.
        }
    }

    public int getAño() {
        return año;
    }
}
