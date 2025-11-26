package ejercicios.ejercicio2.geometria;

import ejercicios.ejercicio2.interfaz.Libreria;

public class Circunferencia extends Figura{
    public double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo.");
        } else {
            this.radio = radio;
        }
    }

    public Circunferencia(Punto punto, double radio) {
        super(punto, "Circunferencia");
        //Constructor de Figura
        setRadio(radio);
    }

    public Circunferencia(){
        this(new Punto(0, 0), 1);
    }

    @Override
    public void pedirDatos(){
        super.pedirDatos();
        System.out.print("Asigna un tamaño al radio: ");
        setRadio(Libreria.pedirReal());
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El radio es: " + getRadio());
    }
}
