package ejercicios.ejercicio1;

import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        Dado dado = new Dado();
        dado.setSize(250,100);
        dado.setVisible(true);
        dado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
