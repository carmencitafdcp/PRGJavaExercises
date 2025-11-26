package practice;

import javax.swing.*;


public class pruebaGUI {
    public static void main(String[] args) {
        //FrmPrincipal frame = new FrmPrincipal();
        //Eventos2 frame = new Eventos2();
        //CajasTexto frame = new CajasTexto();
        //Botones frame = new Botones();
        TimerSwing frame = new TimerSwing();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // FrmPrincipal frame2 = new FrmPrincipal();
        // frame2.setSize(100,200);
        // frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame2.setVisible(true);

        // // Creamos la ventana con un título a través del constructor
        // JFrame frame = new JFrame();
        // frame.setTitle("Hola"); //Esto sería una sobrecarga

        // JLabel lbl = new JLabel("SuperAplicación"); 
        // frame.add(lbl);
        // //El add es como un getContentPane()
        // lbl.setToolTipText("Esto es un ejemplo de tooltip");
        // //El toolTip es el cuadrito con info que te sale al poner el cursor encima de un elemento.

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // /*Esta función maneja el funcionamiento del botón de close. */

        // frame.setSize(300, 100);

        // frame.setVisible(true);
    }
}
