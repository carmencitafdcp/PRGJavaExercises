package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerSwing extends JFrame implements ActionListener {
    JLabel tiempo;
    Timer temporizador;
    private int cont;

    public TimerSwing() {
        tiempo = new JLabel("0");
        add(tiempo);
        cont = 0;
        temporizador = new Timer(1000, this);
        temporizador.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cont++;
        tiempo.setText(cont + "");
        if (cont == 10) {
            temporizador.stop();
        }
    }
}
