package practice;

// import java.awt.BorderLayout;
// import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
// import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Heredamos de la clase JFrame para hacer un formulario a medida
public class FrmPrincipal extends JFrame {
    JLabel lbl;

    public FrmPrincipal() {
        super("imagen");
        setLayout(new FlowLayout());
        lbl = new JLabel();
        lbl.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/imagen.jpg")));
        //La raíz es la raíz del proyecto, el raíz es java.
        add(lbl);
    }

    // Inicializamos la interfaz de usuario en el constructor
    // public FrmPrincipal() {
    // setLayout(new FlowLayout());
    // // Ojo, no ordenaremos así el código, esto es solo como ejemplo
    // JLabel etiqueta1 = new JLabel("Etiqueta Uno");
    // // etiqueta1.setLocation(0, 0);
    // // etiqueta1.setSize(100, 20);
    // etiqueta1.setBounds(0, 0, 100, 20); /*Esto es lo mismo que los otros 2 */
    // this.add(etiqueta1, BorderLayout.NORTH);

    // JLabel etiqueta2 = new JLabel("Etiqueta Dos");
    // etiqueta2.setLocation(100, 0);
    // etiqueta2.setSize(etiqueta2.getPreferredSize());
    // this.add(etiqueta2, BorderLayout.SOUTH);

    // JButton boton1 = new JButton("Aceptar");
    // boton1.setPreferredSize(new Dimension(200, 110));
    // boton1.setLocation(0, 100);
    // boton1.setSize(boton1.getPreferredSize());
    // this.add(boton1, BorderLayout.EAST);

    // JButton boton2 = new JButton("Cancelar");
    // boton2.setLocation(100, 100);
    // boton2.setSize(100, 20);
    // this.add(boton2, BorderLayout.WEST);
}
