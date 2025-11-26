package ejercicios.ejercicio2;

import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        ponerTitulo titulo = new ponerTitulo();
        titulo.setSize(400, 300);
        titulo.setVisible(true);
        titulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
