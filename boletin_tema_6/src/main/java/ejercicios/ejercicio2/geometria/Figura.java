package ejercicios.ejercicio2.geometria;

import java.util.Scanner;

import ejercicios.ejercicio2.interfaz.Libreria;
import ejercicios.ejercicio2.interfaz.InterfazUsuario;

public class Figura implements InterfazUsuario{
    protected Punto origen;
    protected String nombre;

    //Tengo que crear los de origen tambien porque si no el método
    //mostrarDatos() no funciona.
    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre() {
        return nombre;
    }

    public Figura(Punto origen, String nombre) {
        this.origen = origen;
        this.nombre = nombre;
    }

    public Figura() {
        this(new Punto(0, 0), "");
        //Igual, aquí llamo al otro constructor con el this, 
        //el this no necesariamente se refiere a las propias
        //propiedades de la clase, si no que si el this lleva
        //paréntesis en vez de . estás llamando al constructor.
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        System.out.print("¡Hola! Dime tu nombre: ");
        this.nombre = sc.nextLine();
        x = Libreria.pedirReal();
        y = Libreria.pedirReal();
        this.origen = new Punto(x, y);
        sc.close();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Posición: " + getOrigen());
    }
}
