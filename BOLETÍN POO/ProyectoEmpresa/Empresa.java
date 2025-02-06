package ProyectoEmpresa;

public class Empresa {
    private double ganancias;
    Directivo directivo;
    Empleado empleado1;
    Empleado empleado2;
    IUDirectivo iuDirectivo;
    IUEmpleado iuEmpleado1;
    IUEmpleado iuEmpleado2;

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public double getGanancias() {
        return ganancias;
    }

    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2) {
        this.directivo = directivo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        iuDirectivo = new IUDirectivo(directivo);
        iuEmpleado1 = new IUEmpleado(empleado1);
        iuEmpleado2 = new IUEmpleado(empleado2);
    }

    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2, double ganancias) { //YA
        this.directivo = directivo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.ganancias = ganancias;
        iuDirectivo = new IUDirectivo(directivo);
        iuEmpleado1 = new IUEmpleado(empleado1);
        iuEmpleado2 = new IUEmpleado(empleado2);
    }
}
