package ejercicios.Ejercicios.Ejercicio8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
    private ArrayList<Videogame> videogames = new ArrayList<>(); // Como es privada necesita getters y setters

    /**
     * Método que devuelve los juegos de la coleccion de videojuegos
     * @return devuelve los videojuegos de la coleccion
     */
    public ArrayList<Videogame> getVideogames() {
        return videogames;
    }

    /**
     * Método que inicializa los videojuegos de la coleccion a los videojuegos de la coleccion del parametro
     * @param videogames videojuegos de la coleccion del parametro
     */
    public void setVideogames(ArrayList<Videogame> videogames) {
        this.videogames = videogames;
    }   

    /**
     * Método que crea un menú con todas las opciones disponibles para insertar, ver, buscar y borrar videojuegos
     * de la coleccion de videojuegos
     * @throws IOException excepcion necesaria que se debe lanzar para poder hacer el prinwritter
     */
    public void menu() throws IOException { //Necesario el throws para el case 6
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1.- Insert new game.");
            System.out.println("2.- See the list of games.");
            System.out.println("3.- Search a videogame.");
            System.out.println("4.- Delete a videogame by it's position.");
            System.out.println("5.- Delete videogames by their launch year.");
            System.out.println("6.- Salir.");
            System.out.print("Choose an option please: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Videogame newGame = new Videogame();
                    System.out
                            .println("Which videogame do you want to add? Write title, manufacturer and launch year.");
                    sc.nextLine();
                    String gameName = sc.nextLine();
                    newGame.setTitle(gameName);
                    String gameManufacturer = sc.nextLine();
                    newGame.setManufacturer(gameManufacturer);
                    int launchYear = sc.nextInt();
                    newGame.setYear(launchYear);
                    sc.nextLine();
                    System.out.println("Do you want to save it at the beginning(1) or at the end(2) of the colection?");
                    int position = sc.nextInt();
                    if (position == 1) {
                        this.videogames.add(0, newGame);
                    } else if (position == 2) {
                        this.videogames.add(newGame);
                    } else {
                        System.out.println("You didn't choose the right option. You migth choose 1 or 2.");
                    }
                    break;
                case 2:
                    // Para títulos más cortos queda un poco feo este formato...
                    int cont = 1;
                    for (Videogame videogame : getVideogames()) {
                        if (videogame.getTitle().length() > 23 || videogame.getManufacturer().length() > 23) {
                            System.out.printf("%4d title: %20s..., manufacturer: %-20s..., year: %-4d\n", cont,
                                    videogame.getTitle(), videogame.getManufacturer(), videogame.getYear());
                        } else {
                            System.out.printf("%4d title: %23s, manufacturer: %-23s, year: %-4d\n",
                                    cont, videogame.getTitle(), videogame.getManufacturer(), videogame.getYear());
                        }
                        cont++;
                    }
                    break;
                case 3:
                    System.out.println("Which videogame do you want to search? Start writing the title.");
                    sc.nextLine(); // Consume el salto de línea sobrante
                    String searchTitle = sc.nextLine();
                    boolean found = false;
                    for (Videogame videogame : videogames) {
                        if (videogame.getTitle().startsWith(searchTitle.toUpperCase())) {
                            System.out.println("These coincide: \n" + videogame.getTitle());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Title not found, please try again.");
                    }

                    break;
                case 4:
                    System.out.println("Introduce a number. The videogame in that position will be deleted.");
                    int index = sc.nextInt();
                    if (index >= videogames.size() || index < 0) {
                        System.out.println("Position not valid, please try another position.");
                    } else {
                        String titleToDelete = videogames.get(index).getTitle();
                        videogames.remove(index);
                        sc.nextLine();
                        System.out.printf("Game: %23s had been deleted.\n", titleToDelete);
                    }
                    break;
                case 5:
                    System.out.println("Which launch year do you want to delete? Games of that year will be deleted.");
                    System.out.println("Which launch year do you want to delete? Games of that year will be deleted.");
                    int yearToDelete = sc.nextInt();
                    boolean found2 = false;

                    for (int i = videogames.size() - 1; i >= 0; i--) { // Recorremos de atrás hacia adelante
                        if (videogames.get(i).getYear() == yearToDelete) {
                            String titleToDelete = videogames.get(i).getTitle();
                            videogames.remove(i);
                            System.out.printf("Game: %23s had been erased\n", titleToDelete);
                            found2 = true;
                        }
                    }

                    if (!found2) {
                        System.out.println("There are no games launched on that year, please try again.");
                    }
                    break;
                case 6:
                    System.out.println("Bye-Bye!");
                    PrintWriter f = new PrintWriter(new FileWriter("videojuegos.txt"));
                    for (Videogame videogame : videogames) {
                        f.println(videogame.groupedData());
                    }
                    f.close();
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (option != 6);
        sc.close();
    }
}
