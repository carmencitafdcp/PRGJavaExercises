package principal;

class Perro extends Animal {
    public String raza;
    public String nombreHumano;

    public Perro() {
        this(0, "", "");
        // this.setEdad(0);
        // this.raza = "";
        // this.nombreHumano = "";
        // this.nombreCientifico = "";
    }

    public Perro(int edad, String raza, String nombreHumano) {
        this.setEdad(edad);
        this.raza = raza;
        this.nombreHumano = nombreHumano;
        this.nombreCientifico = "Canis Familiaris";
    }

    public void ladrar() {
        System.out.println("GUAU!!!");
    }
}