package ejercicios_basicos.Ejercicio2;


public class Geometría {
    private boolean figura;
    private double altura;
    private double base;

    /**
     * Constructor de la clase Geometría que inicializa las variables a valores escogidos por el programador.
     */
    public Geometría() {
        this.figura = false;
        this.altura = 2;
        this.base = 2;
    }

    /**
     * Constructor de la clase Geometría sobrecargado con 2 parámetros (base y altura).
     * Se inicializan las propiedades con los parámetros, excepto la propiedad figura.
     * Se realiza un control de excepciones para evitar que el programador ponga parámetros inválidos al 
     * utilizar la clase Geometría en otro programa. 
     * @param altura parámetro con el que se inicializa la propiedad altura
     * @param base parámetro con el que se inicializa la propiedad base
     */
    public Geometría(double altura, double base) {
        if (altura < 0 || base < 0) {
            throw new IllegalArgumentException("Parámetros inválidos, no se permiten números negativos.");
        }
        this.figura = false;
        this.altura = altura;
        this.base = base;
    }

    /**
     * Constructor de la clase Geometría sobrecargado con 3 parámetros (figura, altura y base).
     * Se inicializan las propiedades de la clase con los parámetros. 
     * Se realiza un control de excepciones para evitar que al usar la clase Geometría en otro archivo
     * se utilicen los parámetros incorrectos en el constructor.
     * @param figura parámetro con el que se inicializa la propiedad figura.
     * @param altura parámetro con el que se inicializa la propiedad altura.
     * @param base parámetro con el que se inicializa la propiedad base.
     */
    public Geometría(boolean figura, double altura, double base) {
        if (altura < 0 || base < 0) {
            throw new IllegalArgumentException("Parámetros inválidos, se pide true o false y no se permiten números negativos.");
        }
        this.figura = figura;
        this.altura = altura;
        this.base = base;
    }

    public boolean getFigura() {
        return figura;
    }

    /**
     * Función que le asigna el valor del parámetro a la propiedad altura.
     * Además se realiza un control de excepciones para evitar que el valor sea negativo.
     * @param altura valor con el que se inicializa la propiedad altura.
     */
    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Valor inválido. Debe ser positivo.");
        }
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    /**
     * Función que le asigna el valor del parámetro a la propiedad base.
     * Además se realiza un control de excepciones para evitar que el valor sea negativo.
     * @param base valor con el que se inicializa la propiedad base.
     */
    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("Valor inválido. Debe ser positivo");
        }
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    /**
     * Función que calcula el area de un rectángulo o de un tríangulo según se elija. 
     * @return devuelve el area de la figura escogida al utilizar la funcion.
     */
    public double area(){
        double area = 1;
       
        if (figura) {
            area = this.base * this.altura;
        } else {
            area = (this.base*this.altura)/2;
        }
        return area;
    }

    /**
     * Función que calcula el perímetro de un rectángulo o de un triángulo según se elija.
     * @return devuelve el perímetro de la figura escogida al utilizar la función.
     */
    public double perimeter(){
        double perimeter = 0;
       
        if (figura) {
            perimeter = (this.base * 2) + (this.altura * 2);
        } else {
            perimeter = this.base+this.altura+diagonal();
        }
        return perimeter;
    }

    /**
     * Función que calcula la diagonal del rectángulo.
     * @return devuelve el valor de la diagonal de la figura.
     */
    public double diagonal(){
        double diagonal = 1;
       
        diagonal = Math.sqrt((this.altura*this.altura)+(this.base*this.base));
        return diagonal;
    }

    /**
     * Función que asigna un tipo de figura según figura sea false o true.
     * @return devuelve el tipo de figura escogida.
     */
    public String tipo(){
        String tipo = "";
        if (figura) {
            tipo = "Rectángulo";
        } else {
            tipo = "Triángulo";
        }
        return tipo;
    }
}