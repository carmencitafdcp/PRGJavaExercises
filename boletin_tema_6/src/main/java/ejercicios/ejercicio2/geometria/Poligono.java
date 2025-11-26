package ejercicios.ejercicio2.geometria;

import ejercicios.ejercicio2.interfaz.Libreria;

public class Poligono extends Figura {
    public Punto[] puntos;

    public Poligono(String nombre, Punto origen, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("No puede haber 0 puntos, debe haber una cantidad existente.");
        }
        setNombre(nombre);
        setOrigen(origen);
        puntos = new Punto[cantidad];//Aquí le atribuyo la cantidad de puntos
        //al tamaño del array
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto(Math.random(), Math.random());
        }
    }

    public Poligono() {
        this("Triangulo", new Punto(0, 0), 3);
        //La cantidad es 3 porque literalmente el triangulo solo tiene 3 puntos.
        new Punto(0, 0);//TODO guardar los puntos
        new Punto(1, 1);
        new Punto(1, 0);
    }

    @Override
    public void pedirDatos() {
        //Hay que pedir los puntos
        super.pedirDatos();
        double x;
        double y;
        for (int i = 0; i < puntos.length; i++) {
            System.out.print("En el eje x, escoge un punto: ");
            x = Libreria.pedirReal();
            System.out.print("En el eje y, escoge un punto: ");
            y = Libreria.pedirReal();
            puntos[i] = new Punto(x, y);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (Punto punto : puntos) {
            System.out.println(punto.toString());
        }
    }
}
