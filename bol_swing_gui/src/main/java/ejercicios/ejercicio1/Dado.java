package ejercicios.ejercicio1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Dado extends JFrame implements ActionListener{
    private JButton boton;
    private JLabel result;
    private JTextField numCaras;

    public Dado(){
        super("Simulación de dado");
        this.setLayout(new FlowLayout());

        numCaras = new JTextField("Introduce el número de caras", 5);
        //El 5 es el tamaño de columnas que tiene el campo de texto
        this.add(numCaras);
        numCaras.setText("");
        numCaras.addActionListener(this);

        boton = new JButton("Lanzar dado");
        this.add(boton);
        //Se añade el boton a la ventana
        boton.addActionListener(this);
        //Se le dice a la ventana que el boton será quien reaccione al evento
        
        result = new JLabel("");
        this.add(result);  
        //Se añade la etiqueta del resultado a la ventana
    }

    public int numAleatorio(String numUsuario){
        //JTextField es un campo de texto por lo que no se pueden meter números
        int numero = 0;
        try {
            numero = Integer.parseInt(numUsuario.trim());
        } catch (NumberFormatException e) {
            System.out.println("Dato introducido inválido.");
        }  
        if (numero < 1) {
            return (int) (Math.random() * 6) + 1;
        } else {
            return (int) (Math.random() * numero) + 1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent event){
        result.setText(String.format("%d", numAleatorio(numCaras.getText())));
    }
}
