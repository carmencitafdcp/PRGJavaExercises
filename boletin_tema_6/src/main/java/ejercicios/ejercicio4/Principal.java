package ejercicios.ejercicio4;

public class Principal {
    public static void main(String[] args) {
        try {
            Empleado empleado = new Empleado("Fdcp", "Carmen", 21, "77481864-Q", 2000);
            System.out.println("DATOS EMPLEADO");
            System.out.println("--------------");
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellidos: " + empleado.getApellidos());
            System.out.println("DNI: " + empleado.getDni());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("IRPF: " + empleado.calcularIRPF() + " euros de irpf");
            System.out.println(empleado.firmaMail());
            System.out.println();

            Directivo directivo = new Directivo("Jorge", "cr", 21, "12345678-Z", "logística", 10);
            System.out.println("DATOS DIRECTIVO");
            System.out.println("---------------");
            System.out.println("Nombre: " + directivo.getNombre());
            System.out.println("Apellidos: " + directivo.getApellidos());
            System.out.println("DNI: " + directivo.getDni());
            System.out.println("Edad: " + directivo.getEdad());
            System.out.println("Departamento: " + directivo.getDepartamento());
            
            System.out.println("Porcentaje de Beneficios: " + directivo.getBeneficios() + " %");
            String firmaDirectivo = directivo.firmaMail();
            int longitud = firmaDirectivo.length() + 4;
            
            String borde = "*".repeat(longitud);
            System.out.println(borde);
            System.out.println("* " + firmaDirectivo + " *");
            System.out.println(borde);

            //System.out.println("**************************");
            //System.out.println("*" + directivo.firmaMail() + "*");
            //System.out.println("**************************");

        } catch (DniException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


