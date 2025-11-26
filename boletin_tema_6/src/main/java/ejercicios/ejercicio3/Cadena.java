package ejercicios.ejercicio3;

import java.util.ArrayList;

public class Cadena {
    private ArrayList<Character> cadena = new ArrayList<>();

    public void setCadena(String cad) {
        if (cad == null) {
            throw new IllegalArgumentException("No se puede pasar una cadena null.");
        }

        int inicio = 0;
        int fin = cad.length() - 1;

        while (inicio <= fin && cad.charAt(inicio) == ' ') {
            inicio++;
        }

        while (fin >= inicio && cad.charAt(fin) == ' ') {
            fin--;
        }

        cadena.clear();

        for (int i = inicio; i <= fin; i++) {
            cadena.add(cad.charAt(i));
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < cadena.size(); i++) {
            resultado += cadena.get(i);
        }
        return resultado;
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            throw new IllegalArgumentException("El objeto pasado como parámetro no puede ser null.");
        }

        if (anObject instanceof Cadena) {
            Cadena cad = (Cadena) anObject; // Se hace cast para convertir anObject en cadena
            if (this.cadena.size() != cad.cadena.size()) {
                return false;
            }
            for (int i = 0; i < cadena.size(); i++) {
                if (!this.cadena.get(i).equals(cad.cadena.get(i))) {
                    return false;
                }
            }
            return true;
        } else if (anObject instanceof String) {
            String nuevo = (String) anObject;

            int inicio = 0;
            int fin = nuevo.length() - 1;

            while (inicio <= fin && nuevo.charAt(inicio) == ' ') {
                inicio++;
            }
            while (fin >= inicio && nuevo.charAt(fin) == ' ') {
                fin--;
            }

            if ((fin - inicio + 1) != cadena.size()) {
                return false;
            }

            for (int i = 0; i < cadena.size(); i++) {
                if (!this.cadena.get(i).equals(nuevo.charAt(inicio + i))) {
                    return false;
                }
            }
            return true;
        } else if (anObject instanceof char[]) {
            char[] caracteres = (char[]) anObject;
            if (this.cadena.size() != caracteres.length) {
                return false;
            }
            for (int i = 0; i < cadena.size(); i++) {
                if (!this.cadena.get(i).equals(caracteres[i])) {
                    return false;
                }
            }
            return true;
        }

        throw new IllegalArgumentException("El objeto debe ser de tipo Cadena, String o char[].");
    }

    public int eliminar(char caracter) {
        int cont = 0;
        for (int i = cadena.size() - 1; i >= 0; i--) {
            if (cadena.get(i) == caracter) {
                cadena.remove(i);
                cont++;
            }
        }
        return cont;
    }
}
