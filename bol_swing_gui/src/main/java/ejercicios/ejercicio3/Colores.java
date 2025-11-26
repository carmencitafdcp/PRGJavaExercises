package ejercicios.ejercicio3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Colores extends JFrame implements ActionListener {
    private JButton botonAmarillo;
    private JButton botonAzul;
    private JButton botonAleatorio;

    public Colores() {
        super("Cambiar colores fondo");
        this.setLayout(null);

        botonAmarillo = new JButton("Amarillo");
        botonAmarillo.setSize(100, 50);
        botonAmarillo.setLocation(0, 0);
        this.add(botonAmarillo); 
        botonAmarillo.addActionListener(this); //El botón hace cosas en el frame

        botonAzul = new JButton("Azul");
        botonAzul.setSize(100, 50);
        botonAzul.setLocation(100, 0);
        this.add(botonAzul);
        botonAzul.addActionListener(this);

        botonAleatorio = new JButton("Aleatorio");
        botonAleatorio.setSize(100, 50);
        botonAleatorio.setLocation(200, 0);
        this.add(botonAleatorio);
        botonAleatorio.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAmarillo) {
            this.getContentPane().setBackground(Color.yellow);
            // El contentPane es para cambiar el color solo al contenido del formulario
        } else if (e.getSource() == botonAzul) {
            this.getContentPane().setBackground(Color.blue);
        } else if (e.getSource() == botonAleatorio && (e.getModifiers() & ActionEvent.SHIFT_MASK) == ActionEvent.SHIFT_MASK) {
            //Es necesario poner lo del SHIFT primero porque si se cumple la condicion de e.getSource == botonAleatorio
            //antes que esta otra, pues el programa no pasará por aquí.
            int x = (int) (Math.random() * (getContentPane().getWidth() - botonAleatorio.getWidth()));
            int y = (int) (Math.random() * (getContentPane().getHeight() - botonAleatorio.getHeight()));
            botonAleatorio.setLocation(x, y);
        } else if (e.getSource() == botonAleatorio) {
            int x = (int) (Math.random() * 600 + 1);
            int y = (int) (Math.random() * 400 + 1);
            this.setLocation(x, y);
        }
    }
}
