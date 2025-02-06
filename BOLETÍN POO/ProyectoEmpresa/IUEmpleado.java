package ProyectoEmpresa;
import java.util.Scanner;
public class IUEmpleado { //TODO printf
    public Empleado empleado;

    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void mostrar(){
        System.out.println("EMPLEADO");
        System.out.println("--------");
        System.out.println("Nombre y apellidos Empleado: " + empleado.getNombre() + empleado.getApellidos());
        System.out.println("DNI Empleado: " + empleado.getDni());
        System.out.println("Edad Empleado: " + empleado.getEdad());
        System.out.println("Salario anual: " + empleado.getSalarioAnual());
        System.out.println("IRPF correspondiente: " + empleado.getIrpf());
    }

    public void pedir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DATOS EMPLEADO");
        System.out.println("--------------");
        System.out.print("Tu nombre: ");
        String nombre = sc.nextLine();
        empleado.setNombre(nombre);
        System.out.println();
        System.out.print("Tus apellidos: ");
        String apellidos = sc.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println();
        System.out.print("Tu DNI: " );
        String dni = sc.nextLine();
        empleado.setDni(dni);
        System.out.println();
        System.out.print("Tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        empleado.setEdad(edad);
        System.out.println();
        System.out.print("Tu salario anual: ");
        double salarioAnual = sc.nextDouble();
        empleado.setSalarioAnual(salarioAnual);
        System.out.println();
        System.out.println("Muchas gracias. ¡Hasta pronto!");
    }

    public void mostrar(int campo){
        switch (campo) {
            case 1:
            System.out.println("Nombre y apellidos: " + empleado.getNombre() + empleado.getApellidos());
                break;
            case 2:
            System.out.println("Edad: " + empleado.getEdad() + " años");
                break;
            case 3:
            System.out.println("DNI: " + empleado.getDni());
                break;
            case 4:
            System.out.println("Salario anual: " + empleado.getSalarioAnual() + "€");
                break;
            case 5:
            System.out.println("IRPF correspondiente: " + empleado.getIrpf() + "%");
                break;
            case 6:
                System.out.println("Hacienda: " + empleado.hacienda());
                break;
            default:
                break;
        }
    }
}
