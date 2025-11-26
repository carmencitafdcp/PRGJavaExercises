package ejercicios.ejercicio2.principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import ejercicios.ejercicio2.geometria.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<>();
        int option = 0;
        boolean isChecked;
        do {
            do {
                isChecked = true;
                try {
                    System.out.println("1.- Insertar linea, triangulo, cuadrado o circunferencia");
                    System.out.println("2.- Mostrar elementos de la colección (solo nombre y radio)");
                    System.out.println("3.- Mostrar datos de un elemento en específico de la colección");
                    System.out.println("4.- Borrar elementos de un tipo");
                    System.out.println("5.- Salir");
                    System.out.print("Escoge una opción: ");
                    option = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Has introducido una opción que no es un númerom, inténtalo de nuevo.");
                    isChecked = false;
                    sc.nextLine();
                }
            } while (!isChecked);
            switch (option) {
                case 1:
                    int option2 = 0;
                    do {
                        isChecked = true;
                        try {
                            System.out.println("1. Línea");
                            System.out.println("2. Triángulo");
                            System.out.println("3. Cuadrado");
                            System.out.println("4. Circunferencia");
                            System.out.print("Escoge una figura: ");
                            option2 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Dato no válido, introduzca un número.");
                            isChecked = false;
                            sc.nextLine();
                        }
                    } while (!isChecked);
                    switch (option2) {
                        case 1:
                            figuras.add(new Linea());
                            break;
                        case 2:
                            figuras.add(new Poligono()); // El constructor de Polígono ya hace un triángulo
                            break;
                        case 3:
                            figuras.add(new Poligono("Cuadrado", new Punto(), 4));
                            break;
                        case 4:
                            figuras.add(new Circunferencia(new Punto(0, 0), 4));
                            break;
                        default:
                            System.out.println("Opción inexistente.");
                    }
                    break;
                case 2:
                    for (Figura figura : figuras) {
                        System.out.println(figura.getNombre());
                        if (figura.getClass() == Circunferencia.class) {
                            //En caso de circunferencia...
                            System.out.println(((Circunferencia) figura).getRadio());
                            // Esto es un casting, circunferencia referencia a un objeto de tipo Figura.
                        }  
                    }
                    break;
                case 3://TODO pedir indice y llamar a mostrar
                    for (Figura figura : figuras) {
                        System.out.println(figura.getNombre());

                        if (figura.getClass() == Circunferencia.class) {
                            // Si el objeto es de tipo circunferencia...
                            System.out.println(((Circunferencia) figura).getRadio());
                        } else {
                            System.out.println(figura.getOrigen());
                        }
                    }
                    break;
                case 4:
                    System.out.println("¿Qué figura deseas borrar? Introduce su nombre: ");
                    String nombre = "";
                    do {
                        isChecked = true;
                        try {
                            nombre = sc.nextLine().toUpperCase();
                        } catch (InputMismatchException e) {
                            System.out.println("Has introducido algo que no es una cadena de texto.");
                            isChecked = false;
                            sc.nextLine();
                        } catch (IllegalArgumentException e){
                            System.out.println("Has introducido una cadena no válida.");
                            isChecked = false;
                            sc.nextLine();
                        }
                        
                    } while (!isChecked);
                    
                    for (int i = figuras.size() - 1; i >= 0; i--) {//TODO se pedia borrar por tipo no por nombre
                        if (figuras.get(i).getNombre().equals(nombre)) {
                            figuras.remove(i);
                        }
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inexistente.");
                    break;
            }
        } while (option != 5);
    }
}
