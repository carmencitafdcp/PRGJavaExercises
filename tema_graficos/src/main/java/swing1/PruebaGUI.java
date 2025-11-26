package swing1;

import javax.swing.*;

public class PruebaGUI {
  public static void main(String[] args) {
    // FrmPrincipal frame = new FrmPrincipal();

    // Eventos2 frame = new Eventos2();
    // CajasTexto frame = new CajasTexto();
    // Botones frame = new Botones();
    // EventosRaton frame = new EventosRaton();
    // EventosTeclado frame = new EventosTeclado();
    Principal frame = new Principal();
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    System.out.println("El programa sigue");
  }
}
