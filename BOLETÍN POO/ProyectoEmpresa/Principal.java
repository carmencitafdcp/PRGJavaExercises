package ProyectoEmpresa;

import java.util.Scanner;

public class Principal {
    public static void sumbenu(Empresa empresa) {
        Scanner sc = new Scanner(System.in);
        int option2;
        do {
            System.out.println("1.- Ver datos de ambos empleados.");
            System.out.println("2.- Ver datos empleado 1.");
            System.out.println("3.- Ver datos empleado 2.");
            System.out.println("4.- Salir.");
            option2 = sc.nextInt();
            switch (option2) {
                case 1:
                    System.out.println("Datos de ambos");
                    System.out.println("--------------");
                    System.out.println("Datos empleado 1: ");
                    empresa.iuEmpleado1.mostrar();
                    System.out.println("Datos empleado 2: ");
                    empresa.iuEmpleado2.mostrar();
                    break;
                case 2:
                    System.out.println("Empleado 1: ");
                    empresa.iuEmpleado1.mostrar();
                    break;
                case 3:
                    System.out.println("Empleado 2: ");
                    empresa.iuEmpleado2.mostrar();
                    break;
                case 4:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida...");
                    break;
            }
        } while (option2 != 4);
    }

    public static void submenu2(Empresa empresa) {
        Scanner sc = new Scanner(System.in);
        int option3;
        do {
            System.out.println("1.- Cambiar datos directivo.");
            System.out.println("2.- Cambiar datos empleado 1.");
            System.out.println("3.- Cambiar datos empleado 2.");
            System.out.println("4.- Salir.");
            option3 = sc.nextInt();
            switch (option3) {
                case 1:
                    System.out.println("Cambiar datos directivo: ");
                    empresa.iuDirectivo.pedir();
                    break;
                case 2:
                    System.out.println("Cambiar datos empleado1: ");
                    empresa.iuEmpleado1.pedir();
                    break;
                case 3:
                    System.out.println("Cambiar datos empleado2: ");
                    empresa.iuEmpleado2.pedir();
                    break;
                case 4:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida...");
                    break;
            }
        } while (option3 != 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // EMPLEADO
        // #region
        Empleado empleado = new Empleado();
        IUEmpleado iuEmpleado = new IUEmpleado(empleado);
        System.out.println("Datos del empleado: ");
        iuEmpleado.pedir();
        System.out.println();
        System.out.println("Datos mostrados automáticamente: ");
        iuEmpleado.mostrar();
        System.out.println();
        System.out.println("Lo que se lleva Hacienda: ");
        iuEmpleado.mostrar(6);
        // // #endregion
        // // DIRECTIVO
        // //// #region
        Directivo directivo = new Directivo();
        IUDirectivo iuDirectivo = new IUDirectivo(directivo);
        System.out.println("Datos del directivo: ");
        iuDirectivo.pedir();
        System.out.println();
        System.out.println("Datos mostrados automáticamente: ");
        iuDirectivo.mostrar();
        System.out.println();
        System.out.println("El beneficio: ");
        iuDirectivo.mostrar(5);
        // #endregion
        // EMPRESA
        // #region
        Directivo directivo2 = new Directivo();
        Empleado empleado1 = new Empleado("Juanjo", "Perez", "77888964J", 26, 30.0000);
        Empleado empleado2 = new Empleado("Jorge", "Ruiz", "94576532A", 30, 50.000);
        Empresa empresa = new Empresa(directivo2, empleado1, empleado2, 1000000);
        int option;
        do {
            System.out.println("1.- Ver datos empleados.");
            System.out.println("2.- Ver datos directivo.");
            System.out.println("3.- Modificar datos.");
            System.out.println("4.- Pagar.");
            System.out.println("5.- Cobrar.");
            System.out.println("6.- Salir.");
            option = sc.nextInt();
            switch (option) {
                case 1:// YA
                       // int option2;
                       // do {
                       // System.out.println("1.- Ver datos de ambos empleados.");
                       // System.out.println("2.- Ver datos empleado 1.");
                       // System.out.println("3.- Ver datos empleado 2.");
                       // System.out.println("4.- Salir.");
                       // option2 = sc.nextInt();
                       // switch (option2) {
                       // case 1:
                       // System.out.println("Datos de ambos");
                       // System.out.println("--------------");
                       // System.out.println("Datos empleado 1: ");
                       // empresa.iuEmpleado1.mostrar();
                       // System.out.println("Datos empleado 2: ");
                       // empresa.iuEmpleado2.mostrar();
                       // break;
                       // case 2:
                       // System.out.println("Empleado 1: ");
                       // empresa.iuEmpleado1.mostrar();
                       // break;
                       // case 3:
                       // System.out.println("Empleado 2: ");
                       // empresa.iuEmpleado2.mostrar();
                       // break;
                       // case 4:
                       // System.out.println("¡Hasta pronto!");
                       // break;
                       // default:
                       // System.out.println("Opción no válida...");
                       // break;
                       // }
                       // } while (option2 != 4);
                    sumbenu(empresa);
                    break;
                case 2:
                    System.out.println("Datos directivo: ");
                    empresa.iuDirectivo.mostrar();
                    System.out.println("Ganancias directivo: ");
                    empresa.iuDirectivo.mostrar(5);
                    break;
                case 3:
                    // int option3;
                    // do {
                    //     System.out.println("1.- Cambiar datos directivo.");
                    //     System.out.println("2.- Cambiar datos empleado 1.");
                    //     System.out.println("3.- Cambiar datos empleado 2.");
                    //     System.out.println("4.- Salir.");
                    //     option3 = sc.nextInt();
                    //     switch (option3) {
                    //         case 1:
                    //             System.out.println("Cambiar datos directivo: ");
                    //             empresa.iuDirectivo.pedir();
                    //             break;
                    //         case 2:
                    //             System.out.println("Cambiar datos empleado1: ");
                    //             empresa.iuEmpleado1.pedir();
                    //             break;
                    //         case 3:
                    //             System.out.println("Cambiar datos empleado2: ");
                    //             empresa.iuEmpleado2.pedir();
                    //             break;
                    //         case 4:
                    //             System.out.println("¡Hasta pronto!");
                    //             break;
                    //         default:
                    //             System.out.println("Opción no válida...");
                    //             break;
                    //     }
                    // } while (option != 5);
                    submenu2(empresa);
                    break;
                case 4:
                    System.out.println("La empresa tenía: " + empresa.getGanancias());
                    System.out.println("Lo que gana el empleado 1: ");
                    double gananciaEmpleado = empresa.empleado1.getSalarioAnual();
                    System.out.println("Lo que gana el empleado 2: ");
                    double gananciaEmpleado2 = empresa.empleado2.getSalarioAnual();
                    System.out.println("Resultado después de pagar: ");
                    empresa.setGanancias(gananciaEmpleado-gananciaEmpleado2);//YA
                    System.out.println("La empresa se queda con: " + empresa.getGanancias());
                    break;
                case 5:
                    System.out.println("Dime una cantidad a cobrar: ");
                    double cobrar = sc.nextDouble();
                    System.out.println("Ganancias antes de cobrar:" + empresa.getGanancias());
                    empresa.setGanancias(empresa.getGanancias()+cobrar);
                    System.out.println("Ganancias después de cobrar: " + empresa.getGanancias());//YA
                    break;
                case 6:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida...");
                    break;
            }
        } while (option != 6);
        // #endregion
        sc.close();
    }
}
