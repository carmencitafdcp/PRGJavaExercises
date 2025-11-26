package ejercicios.ejercicio2.geometria;

import ejercicios.ejercicio2.interfaz.Libreria;

public class Linea extends Figura{
    private Punto puntoFinal;

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        this.puntoFinal = new Punto(Libreria.pedirReal(), Libreria.pedirReal());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Punto final: " + getPuntoFinal());
    }

    public Linea(Punto uno, Punto dos) {
        super(uno, "linea");
        //Esto es un constructor de la clase Figura
        this.puntoFinal = dos;
    }

    public Linea(){
        this(new Punto(0,0), new Punto(1,1));
        //Origen y puntoFinal
    }
}
