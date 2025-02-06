package ProyectoEmpresa;
import java.util.Scanner;
public class IUDirectivo {
 
    public Directivo directivo;

    public IUDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    public void mostrar(){
        System.out.println("DIRECTIVO");
        System.out.println("---------");
        System.out.println("Nombre y apellidos Directivo: " + directivo.getNombre() + " " + directivo.getApellidos());
        System.out.println("DNI Directivo: " + directivo.getDni());
        System.out.println("Edad Directivo: " + directivo.getEdad());
        System.out.println("Departamento: " + directivo.getDepartamento());
        System.out.println("Beneficio: " + directivo.getBeneficios());
    }

    public void pedir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DATOS DIRECTIVO");
        System.out.println("---------------");
        System.out.print("Tu nombre: ");
        String nombre = sc.nextLine();
        directivo.setNombre(nombre);
        System.out.println();
        System.out.print("Tus apellidos: ");
        String apellidos = sc.nextLine();
        directivo.setApellidos(apellidos);
        System.out.println();
        System.out.print("Tu DNI: " );
        String dni = sc.nextLine();
        directivo.setDni(dni);
        System.out.println();
        System.out.print("Tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        directivo.setEdad(edad);
        System.out.println();
        System.out.print("Tu departamento: ");
        String departamento = sc.nextLine();
        directivo.setDepartamento(departamento);
        System.out.println();
        System.out.println("Muchas gracias. ¡Hasta pronto!");
    }

    public void mostrar(int campo){
        switch (campo) {
            case 1:
            System.out.println("Nombre y apellidos: " + directivo.getNombre() + " " + directivo.getApellidos());
                break;
            case 2:
            System.out.println("Edad: " + directivo.getEdad() + " años");
                break;
            case 3:
            System.out.println("DNI: " + directivo.getDni());
                break;
            case 4:
            System.out.println("Departamento " + directivo.getDepartamento());
                break;
            case 5:
            System.out.println("Beneficios: " + directivo.getBeneficios() + "%");
                break;

            default:
                break;
        }
    }
}
