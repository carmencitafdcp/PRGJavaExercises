package ejercicios.ejercicio2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ponerTitulo extends JFrame implements ActionListener, ItemListener {
    private JTextField pedirTexto;
    private JButton boton;
    private JCheckBox alreves;
    private JCheckBox habilitar;

    public ponerTitulo(){
        super("cambiar titulo");
        this.setLayout(new FlowLayout());

        pedirTexto = new JTextField("Escribe algo:", 10);
        this.add(pedirTexto);
        pedirTexto.addActionListener(this);

        boton = new JButton("Cambiar texto");
        this.add(boton);
        boton.addActionListener(this);

        alreves = new JCheckBox("Dar la vuelta");
        this.add(alreves);

        habilitar = new JCheckBox("Habilitar area de texto");
        this.add(habilitar);
        habilitar.setSelected(true);
        habilitar.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int respuesta = JOptionPane.showConfirmDialog(this, String.format("¿Quieres poner el título \"%s\"?" , pedirTexto.getText()));
        if(respuesta == JOptionPane.OK_OPTION){
            this.setTitle(pedirTexto.getText());
        }

        if (alreves.isSelected()) {
            String cambiado = "";
            for (int i = pedirTexto.getText().length() -1; i >= 0; i--) {
                cambiado += pedirTexto.getText().charAt(i);
            }
            this.setTitle(cambiado);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent i){
        pedirTexto.setEnabled(habilitar.isSelected());
    }
}
