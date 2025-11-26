package ejercicios.ejercicio2.geometria;

public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this(.0,0.0);
        //Mediante this, estamos llamando al constructor de la clase
        //previamente hecho, el x:0.0, y:0.0 son los parámetros
    }

    @Override
    public String toString() {//TODO 1 decimal
        String result = String.format("(%.3f;.3f)", x, y);
        return result;
        //return "(" + x + "; " + y + ")";
    }
}
