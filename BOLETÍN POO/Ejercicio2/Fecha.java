package Ejercicio2;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(){
        this.dia = 5;
        this.mes = 12;
        this.año = 2024;
    }

    public Fecha(int dia, int mes, int año){
        setDia(dia);
        setMes(mes);
        setAño(año);
    }

    public void setDia(int dia) {
        if (this.dia < 1 || this.dia > 31) {
            this.dia = 1;
        } else {
            this.dia = dia;
        }
    }

    public int getDia() {
        return dia;
    }


    public void setMes(int mes) {
        if (this.mes < 1 || this.mes > 12) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public String fechaFormateada(boolean formato){
        if (formato) {
            return this.dia + "/" + this.mes + "/" + this.año;
        } else {
            String mesNombre = "";
            switch (this.mes) {
                case 1:
                    mesNombre = "Enero";
                    break;
                case 2:
                    mesNombre = "Febrero";
                    break;
                case 3:
                    mesNombre = "Marzo";
                    break;
                case 4:
                    mesNombre = "Abril";
                    break;
                case 5:
                    mesNombre = "Mayo";
                    break;
                case 6:
                    mesNombre = "Junio";
                    break;
                case 7:
                    mesNombre = "Julio";
                    break;
                case 8:
                    mesNombre = "Agosto";
                    break;
                case 9:
                    mesNombre = "Septiembre";
                    break;
                case 10:
                    mesNombre = "Octubre";
                    break;
                case 11:
                    mesNombre = "Noviembre";
                    break;
                case 12:
                    mesNombre = "Diciembre";
                    break;
                default:
                    break;
            }

            return this.dia + " de " + mesNombre + " de " + this.año;
        }
    }

    public static int diferenciaFechas(Fecha fecha1, Fecha fecha2){
        int diferencia = 0;
        diferencia = Math.abs(fecha1.getAño()- fecha2.getAño());
        return diferencia;
    }
}
