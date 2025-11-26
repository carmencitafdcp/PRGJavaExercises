package ejercicios.ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Tragaperrasv1 extends JFrame implements ActionListener{
    JTextField field1 = new JTextField();
    JTextField field2 = new JTextField();
    JTextField field3 = new JTextField();
    JButton jugar = new JButton("Jugar");
    JLabel info = new JLabel();
    JLabel temporizador = new JLabel("0");
    private Timer tiempo;
    private int cont;
    private int minutos;
    private int segundos;

    public Tragaperrasv1(){
        this.setTitle("Juego Tragaperras");
        this.setLayout(null);

        field1.setEditable(false);
        field1.setSize(50, 50);
        field1.setLocation(25,30);
        this.add(field1);
        field1.addActionListener(this);

        field2.setEditable(false);
        field2.setSize(50, 50);
        field2.setLocation(85, 30);
        this.add(field2);
        field2.addActionListener(this);

        field3.setEditable(false);
        field3.setSize(50, 50);
        field3.setLocation(145, 30);
        this.add(field3);
        field3.addActionListener(this);

        //jugar.setText("Jugar");
        jugar.setSize(100, 50);
        jugar.setLocation(55, 90);
        this.add(jugar);
        jugar.addActionListener(this);

        info.setSize(150, 30);
        info.setLocation(55, 160);
        this.add(info);

        temporizador.setSize(150, 30);
        temporizador.setLocation(55, 200);
        this.add(temporizador);

        cont = 0;
        tiempo = new Timer(1000, this);
        tiempo.start();
    }

    public int numAleatorio(){
        return (int) (Math.random() * 6 + 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jugar) {
            field1.setText(String.format("%d", numAleatorio()));
            field2.setText(String.format("%d", numAleatorio()));
            field3.setText(String.format("%d", numAleatorio()));
            if (field1.getText().equals(field2.getText()) && field1.getText().equals(field3.getText())) {
                info.setText("GANASTE");
            } else {
                info.setText("OH... INTÉNTALO DE NUEVO");
            }
        }

        if(e.getSource() == tiempo){
                cont++;
                minutos = cont / 60;
                segundos = cont % 60;
                temporizador.setText(String.format("%02d : %02d", minutos, segundos));
            }
    }
}
