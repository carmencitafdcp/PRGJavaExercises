package ejercicios.ejercicio1;

public class InexistentIndexException extends StringIndexOutOfBoundsException{
    public InexistentIndexException(String cad) {
        super(cad);
    }
}
