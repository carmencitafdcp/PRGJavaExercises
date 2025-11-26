package ejercicios.ejercicio5;

import java.util.ArrayList;

public class Planeta extends Astro{
    private boolean gaseoso;
    public ArrayList <Astro> satelites;

    public boolean isGaseoso() {
        return gaseoso;
    }
    public void setGaseoso(boolean gaseoso) {
        this.gaseoso = gaseoso;
    }

    public Planeta(String nombre, double radio, boolean gaseoso) {
        setNombre(nombre);
        setRadio(radio);
        setGaseoso(gaseoso);
        this.satelites = new ArrayList<>();
    }

    public Planeta(){
        this("", 0.0, false);
        //Pensé que había que inicializar satélites aquí también...
    }
}
