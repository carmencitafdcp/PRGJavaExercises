package swing1;

import java.awt.event.*;
import javax.swing.*;

public class TimerSwing extends JFrame {
    JLabel tiempo;
    Timer temporizador;
    private int cont;

    public TimerSwing() {
        tiempo = new JLabel("0");
        add(tiempo);

        cont = 100;
        
        temporizador = new Timer(50, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                cont--;
                tiempo.setText(cont + "");
                if (cont == 0) {
                    temporizador.stop();
                }
            }
            
        });
        temporizador.start();
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // cont--;
    // tiempo.setText(cont + "");
    // if (cont == 0) {
    // temporizador.stop();
    // }
    // }
}
