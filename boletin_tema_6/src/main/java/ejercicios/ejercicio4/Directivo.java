package ejercicios.ejercicio4;

public class Directivo extends Persona {

    private String departamento;
    private double beneficios;

    public void setDepartamento(String departamento) {
        if (departamento == "") {
            throw new IllegalArgumentException("No has introducido un departamento.");
        }
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setBeneficios(double beneficios) {
        if (this.beneficios < 0 || this.beneficios > 100) {
            this.beneficios = 0;
        } else {
            this.beneficios = beneficios;
        }
    }

    public double getBeneficios() {
        return beneficios;
    }

    public Directivo() {
        super("", "", 0, "");
        this.departamento = "";
        this.beneficios = 0;
    }

    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double beneficios) {
        super(nombre, apellidos, edad, dni);
        setDepartamento(departamento);
        setBeneficios(beneficios);
    }

    @Override
    public String firmaMail() {
        return getNombre() + " " + getApellidos() + ", el directivo de " + getDepartamento();
    }
}

