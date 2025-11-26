package practice;

// import java.awt.event.ActionListener;

import javax.swing.*;

public class HolaWin{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Welcome to the Java World",
                "Usando Swing",
                JOptionPane.INFORMATION_MESSAGE);
                /*Information_message es el tipo de mensaje que lanzas
                 * si es error en vez de salir un ! saldrá un x.
                 */

        System.out.println("Hello world!");
    }
}
