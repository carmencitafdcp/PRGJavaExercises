package ejercicios.ejercicio7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class CambiarColor extends JFrame implements ActionListener, KeyListener{
    private JTextField txfR;
    private JTextField txfG;
    private JTextField txfB;
    private JTextField txfImagen;
    private JButton btnColor;
    private JLabel lblImagenPath;

    public CambiarColor() {
        this.setTitle("Cambiar colores ventana");
        this.setLayout(new FlowLayout());

        txfR = new JTextField(5);
        txfR.setToolTipText("Introduce valor Rojo (0-255)");
        this.add(txfR);

        txfG = new JTextField(5);
        txfR.setToolTipText("Introduce valor Verde (0-255)");
        this.add(txfG);

        txfB = new JTextField(5);
        txfR.setToolTipText("Introduce valor Azul (0-255)");
        txfB.addKeyListener(this);
        this.add(txfB);

        txfImagen = new JTextField(5);
        txfImagen.addKeyListener(this);
        this.add(txfImagen);

        btnColor = new JButton("Cambiar");
        btnColor.setToolTipText("Pulsa para cambiar de color, CTRL para cambiar solo el texto.");
        this.add(btnColor);
        btnColor.addActionListener(this);

        lblImagenPath = new JLabel();
        lblImagenPath.setPreferredSize(new Dimension(300, 200));
        this.add(lblImagenPath);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int r = Integer.parseInt(txfR.getText());
            int g = Integer.parseInt(txfG.getText());
            int b = Integer.parseInt(txfB.getText());

            if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255)
                throw new NumberFormatException("No existen colores en dichos rangos.");

            Color color = new Color(r, g, b);

            if ((e.getModifiers() & ActionEvent.CTRL_MASK) != 0) {
                btnColor.setForeground(color);
            } else {
                btnColor.setBackground(color);
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Introduce valores válidos para los colores.");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == txfImagen && e.getKeyCode() == KeyEvent.VK_ENTER) {
            String path = txfImagen.getText();
            ImageIcon icon = new ImageIcon(path);
            lblImagenPath.setIcon(icon);
        }

        if (e.getSource() == txfB && e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                int r = Integer.parseInt(txfR.getText());
                int g = Integer.parseInt(txfG.getText());
                int b = Integer.parseInt(txfB.getText());

                if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255)
                    throw new NumberFormatException("Colores no existentes.");

                Color color = new Color(r, g, b);
                btnColor.setBackground(color);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Introduce valores válidos para los colores.");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}