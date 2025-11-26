package ejercicios.Ejercicios.Ejercicio8;

import java.time.LocalDate;

public class Videogame {
    private String title;
    private int year;
    private String manufacturer;

    /**
     * Constructor de la clase Videogamae que inicializa las propiedades a valores inexistentes y el año al actual
     * para evitar errores
     */
    public Videogame() {
        this.title = "";
        this.manufacturer = "";
        this.year = LocalDate.now().getYear();
    }

    /**
     * Constructor que inicializa las propiedades a los parámetros
     * @param title Título del juego
     * @param year Año de lanzamineto del juego
     * @param manufacturer Fabricante del juego
     */
    public Videogame(String title, int year, String manufacturer) {
        setTitle(title);
        setManufacturer(manufacturer);
        setYear(year);
    }

    /**
     * Método que guarda título en mayúsculas
     * @param title título del juego
     */
    public void setTitle(String title) {
        this.title = title.toUpperCase();
    }

    /**
     * Método que devuelve el título del juego
     * @return devuelve título del juego
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método que guarda el fabricante en mayúsculas
     * @param manufacturer nombre del fabricante
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer.toUpperCase();
    }

    /**
     * Método que devuelve el nombre del fabricante
     * @return devuelve el fabricante
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Método que guarda el año al parametro si es posterior a 1950 o guarda el año al año actual si es anterior.
     * @param year año al que se inicializa la propiedad año
     */
    public void setYear(int year) {
        if (year < 1950) {
           // System.out.println("Invalid year, it will be updated to the actual year.");
            this.year = LocalDate.now().getYear();
        } else {
            this.year = year;
        }
    }

    /**
     * Método que devuelve el año del juego
     * @return devuelve el año de lanzamiento del juego
     */
    public int getYear() {
        return year;
    }

    /**
     * Método que devuelve la cadena normal si es menor de 23 o cortada a 20 caracteres si es menor de 23
     * @param cadenaOriginal cadena a devolver
     * @return devuelve la cadena sin cortar si tiene menos de 23 caracteres o la cadadena cortada a 20 caracteres 
     * si es mayor de 23 
     */
    public static String stringTruncate(String cadenaOriginal) {
        return cadenaOriginal.length() > 23 ? cadenaOriginal.substring(0, 20) + "..." : cadenaOriginal;
    }

    /**
     * Método que devuelve una cadena con todos los datos del juego agrupados
     * @return devuelve cadena con todos los datos del juego
     */
    public String groupedData() {
        return "Title: " + Videogame.stringTruncate(getTitle()) + ", Manufacturer: "
                + Videogame.stringTruncate(getManufacturer()) + ", Year: " + getYear();
    }
}
