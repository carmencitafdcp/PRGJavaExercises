package ejercicios.ejercicio1;

public class StringTooLongException extends IllegalArgumentException{
    public StringTooLongException() {
        super("Cadena demasiado larga");
    }
}