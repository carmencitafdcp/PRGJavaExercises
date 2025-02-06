package ProyectoEmpresa;

public class Directivo {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String departamento;
    private double beneficios;

    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double beneficios) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        setDepartamento(departamento); //YA
        setBeneficios(beneficios); //YA
    }

    public Directivo(){
        this.nombre = "";
        this.apellidos= "";
        this.edad = 0;
        this.departamento = "";
        this.beneficios = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDepartamento() {
        return "\"" + departamento + "\"";
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento.toUpperCase();
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

    public double beneficioGlobal(double beneficios){
        if (this.beneficios > 0) {
            return beneficios * (this.beneficios/100);
        } else {
            return 0;
        }

    }
}
