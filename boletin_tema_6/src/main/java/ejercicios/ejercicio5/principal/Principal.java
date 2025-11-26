package ejercicios.ejercicio5.principal;

import java.util.ArrayList;
import java.util.Scanner;

import ejercicios.ejercicio5.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> astros = new ArrayList<>();
        int opcion = 0;
        boolean isChecked;
        do {
            System.out.println("1. Añadir planeta.");
            System.out.println("2. Añadir astro.");
            System.out.println("3. Mostrar datos.");
            System.out.println("4. Eliminar repetidos.");
            System.out.println("5. Salir.");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: // TODO hacer try-catch
                    System.out.println("--Vamos a añadir un planeta a nuestra colección--");
                    do {
                        isChecked = true;
                        try {
                            System.out.println("¿El planeta que quieres añadir, es gaseoso? (true/false)");
                            boolean gaseoso = sc.nextBoolean();
                            sc.nextLine();
                            System.out.println("¿Cómo se llama tu planeta?");
                            String nombre = sc.nextLine();
                            System.out.println("¿Cuál es el radio de tu planeta?");
                            double radio = sc.nextDouble();
                            sc.nextLine();
                            Planeta p = new Planeta(nombre, radio, gaseoso);
                            System.out.println("¿Cuántas Lunas quieres añadir?");
                            int cantLunas = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < cantLunas; i++) {
                                System.out.println("Nombre de la luna " + (i + 1) + ": ");
                                String nombreLuna = sc.nextLine();
                                System.out.println("Radio de la luna " + (i + 1) + ": ");
                                double radioLuna = sc.nextDouble();
                                Astro luna = new Astro();
                                luna.setNombre(nombreLuna);
                                luna.setRadio(radioLuna);
                                p.satelites.add(luna);
                            }
                            astros.add(p);
                            astros.addAll(p.satelites);
                        } catch (RadioNegativoException e) {
                            System.out.println("El radio no puede ser negativo!!");
                            sc.nextLine();
                            isChecked = false;
                        }
                    } while (!isChecked);
                    break;
                case 2:
                    System.out.println("-Ahora añadiremos un astro a la coleccion-");
                    System.out.println("Dime el nombre del astro: ");
                    String astroNombre = sc.nextLine();
                    System.out.println("¿Y qué radio quieres que tenga?");
                    double radio = sc.nextDouble();
                    sc.nextLine();
                    do {
                        isChecked = true;
                        try {
                            Astro a = new Astro();
                            a.setNombre(astroNombre);
                            a.setRadio(radio);
                            astros.add(a);
                        } catch (RadioNegativoException e) {
                            System.out.println("El radio no puede ser negativo!!");
                            sc.nextLine();
                            isChecked = false;
                        }
                    } while (!isChecked);
                    break;
                case 3:
                    System.out.println("-Veamos qué Astros hay en tu colección-");
                    for (Astro a : astros) {
                        if (a instanceof Planeta) {
                            Planeta planeta = (Planeta) a;
                            System.out.println("Planeta gaseoso: " + planeta.isGaseoso());
                            if (!planeta.satelites.isEmpty()) {
                                System.out.println("Satélites:");
                                for (Astro sat : planeta.satelites) {
                                    System.out.println("\t" + sat.toString());
                                }
                            } else {
                                System.out.println("No tiene satélites.");
                            }
                        } else {
                            System.out.println(a.toString());
                        }
                    }
                    break;
                case 4:
                System.out.println("-Ahora vamosa eliminar los duplicados-");
                ArrayList <Astro> colSinRepetidos = new ArrayList<>(); //Esta lista está vacía e irá añadiendo
                //Los que no están repetidos
                for (Astro a : astros) { //Comprueba si ya está en la col de no repetidos
                    if (colSinRepetidos.indexOf(a) == -1) { //Si a no está en dicha coleccion, añade "a" a la lista
                        colSinRepetidos.add(a);
                    }
                }
                astros = colSinRepetidos; //Reemplazamos
                System.out.println("Repetidos eliminados.");
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }
}