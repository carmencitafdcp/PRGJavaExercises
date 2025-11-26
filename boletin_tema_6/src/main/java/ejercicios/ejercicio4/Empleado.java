package ejercicios.ejercicio4;

public class Empleado extends Persona {

    private double salarioAnual;
    private double irpf;

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
        if (salarioAnual < 6000) {
            irpf = 7.5;
        } else if (salarioAnual > 6000 && salarioAnual <= 30000) {
            irpf = 15;
        } else {
            irpf = 20;
        }
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getIrpf() {
        return irpf;
    }
 
    public Empleado() {
        super("", "", 0, "");
        this.salarioAnual = 0;
        this.irpf = 7.5;
    }

    public Empleado(String apellidos, String nombre, int edad, String dni, double salarioAnual) {
        super(nombre, apellidos, edad, dni);
        setSalarioAnual(salarioAnual);
    }

    public double calcularIRPF() {
        return salarioAnual * irpf / 100;
    }

    @Override
    public String firmaMail() {
        return getNombre() + " " + getApellidos();
    }
}
