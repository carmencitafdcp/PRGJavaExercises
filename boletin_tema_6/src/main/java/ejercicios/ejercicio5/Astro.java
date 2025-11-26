package ejercicios.ejercicio5;

public class Astro { //TODO hacer control excepciones
    private String nombre;
    private double radio;

    public String getNombre() {
        return nombre;
    }

    public String getNombre(char separador){
        String separado = "";
        for (int i = 0; i < nombre.length(); i++) {
            separado += nombre.charAt(i);
            if (i < nombre.length() - 1) {
                separado += separador;
            }
        }
        return separado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new RadioNegativoException("Error: El radio no puede ser negativo.");
        }
        this.radio = radio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        } 

        Astro a = (Astro) obj; //Convierto obj a tipo Astro
        return this.nombre != null && this.nombre.equals(a.getNombre());
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Radio: %.2f", nombre, radio);
    }
}
