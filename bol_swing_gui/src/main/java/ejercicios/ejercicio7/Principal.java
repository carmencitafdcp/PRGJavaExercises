package ejercicios.ejercicio7;

import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        CambiarColor colores = new CambiarColor();
        colores.setSize(400, 400);
        colores.setVisible(true);
        colores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
