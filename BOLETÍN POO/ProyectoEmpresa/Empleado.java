package ProyectoEmpresa;

public class Empleado {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double salarioAnual;
    private double irpf;

    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.edad = 0;
        this.salarioAnual = 0;
        this.irpf = 7.5;
    }

    public Empleado(String nombre, String apellidos, String dni, int edad, double salarioAnual) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDni(dni);
        setEdad(edad);
        setSalarioAnual(salarioAnual);
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

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
        if (salarioAnual < 6000) {
            irpf = 7.5;
        } else if(salarioAnual > 6000 && salarioAnual < 30000){
            irpf = 15;
        } else {
            irpf = 20;
        }
    }

    public double getIrpf() {
       return irpf;
    }

    public double hacienda(){
        double impuesto;
        impuesto = this.salarioAnual * (irpf/100); /*Lo que se lleva hacienda es el salario multiplicado por el irpf que está en porcentaje */
        return impuesto;
    }
}
