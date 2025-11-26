package ejercicios.ejercicio6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Operaciones extends JFrame implements ActionListener{
    private JTextField caja1txf;
    private JTextField caja2txf;
    private JLabel lblEtiqueta;
    private JButton botonSuma;
    private JButton botonDivision;
    private JButton botonRaiz;

    public Operaciones(){
        this.setTitle("Operaciones");
        this.setLayout(new FlowLayout());

        caja1txf = new JTextField();
        caja1txf.setPreferredSize(new Dimension(100, 30));
        this.add(caja1txf);
        caja1txf.addActionListener(this);

        caja2txf = new JTextField();
        caja2txf.setPreferredSize(new Dimension(100, 30));
        this.add(caja2txf);
        caja2txf.addActionListener(this);

        lblEtiqueta = new JLabel();
        lblEtiqueta.setPreferredSize(new Dimension (100, 20));
        this.add(lblEtiqueta);
        
        botonSuma = new JButton("Suma");
        botonSuma.setPreferredSize(new Dimension(100, 50));
        this.add(botonSuma);
        botonSuma.addActionListener(this);

        botonDivision = new JButton("Division");
        botonDivision.setPreferredSize(new Dimension(100, 50));
        this.add(botonDivision);
        botonDivision.addActionListener(this);

        botonRaiz = new JButton("Raiz");
        botonRaiz.setPreferredSize(new Dimension(100, 50));
        this.add(botonRaiz);
        botonRaiz.addActionListener(this);
    }

    public double parseInput(String input) throws NumberFormatException{ //Funcion para los decimales
        return Double.parseDouble(input.trim().replace(",", "."));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = parseInput(caja1txf.getText());
            double num2 = parseInput(caja2txf.getText());

            if (e.getSource() == botonSuma) {
                double suma = num1 + num2;
                lblEtiqueta.setText(String.format("%.3f", suma));
            } else if (e.getSource() == botonDivision) {
                if (num2 == 0) {
                    lblEtiqueta.setText("No se puede realizar una división entre 0.");
                    lblEtiqueta.setForeground(Color.RED);
                } else {
                    double division = num1 / num2;
                    lblEtiqueta.setText(String.format("%.3f" , division));
                    lblEtiqueta.setForeground(Color.BLACK);
                }
            } else if (e.getSource() == botonRaiz) {
                if (num1 < 0 ) {
                    lblEtiqueta.setText("No se puede realizar una raiz de num negativo.");
                    lblEtiqueta.setForeground(Color.RED);
                } else {
                    double raiz = Math.sqrt((num1));
                    lblEtiqueta.setText(String.format("%.3f" , raiz));
                    lblEtiqueta.setForeground(Color.BLACK);
                }
            }
        } catch (NumberFormatException n) {
            lblEtiqueta.setText("No has introducido un dato numérico.");
        }
    }
}