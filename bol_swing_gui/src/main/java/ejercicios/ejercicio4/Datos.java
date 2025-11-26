package ejercicios.ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Datos extends JFrame implements ActionListener {
    private JTextField txfNombre;
    private JLabel lblNombre;
    private JTextField txfEdad;
    private JLabel lblEdad;
    private JTextField txfDir;
    private JLabel lblDireccion;
    private JButton btnGuardar;
    private JButton btnCargar;

    public Datos(){
        super("Validacion de datos");
        this.setLayout(null);

        txfNombre = new JTextField("Escribe aquí tu nombre",10);
        txfNombre.setSize(100, 30);
        txfNombre.setLocation(120, 0);
        this.add(txfNombre);

        lblNombre = new JLabel();
        lblNombre.setSize(100, 30);
        lblNombre.setLocation(10, 0);
        this.add(lblNombre);

        txfEdad = new JTextField("Introduce aquí tu edad", 5);
        txfEdad.setSize(100, 30);
        txfEdad.setLocation(120, 40);
        this.add(txfEdad);

        lblEdad = new JLabel();
        lblEdad.setSize(100, 30);
        lblEdad.setLocation(10, 40);
        this.add(lblEdad);

        txfDir = new JTextField("Escribe aquí tu dirección.", 15);
        txfDir.setSize(100, 30);
        txfDir.setLocation(120, 80);
        this.add(txfDir);

        lblDireccion = new JLabel();
        lblDireccion.setSize(100, 30);
        lblDireccion.setLocation(10, 80);
        this.add(lblDireccion);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setSize(100, 30);
        btnGuardar.setLocation(0,120);
        this.add(btnGuardar);
        btnGuardar.addActionListener(this);

        btnCargar = new JButton("Cargar");
        btnCargar.setSize(100, 30);
        btnCargar.setLocation(120,120);
        this.add(btnCargar);
        btnCargar.addActionListener(this);
    }

    public boolean validarDatos(String nombre, String edad, String direccion){
        int numEdad = 0;
        try {
            numEdad = Integer.parseInt(edad.trim());
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un número, inténtalo de nuevo");
        }

        if (nombre.trim().isEmpty() || edad.trim().isEmpty() || direccion.trim().isEmpty() || numEdad <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void guardarDatos(String nombre, String edad, String direccion) throws IOException{
        FileWriter f = new FileWriter("Datos.txt");
        f.write(nombre + "; " + edad + "; " + direccion);
        f.close();
    }

    public String[] comprobarArchivo() throws FileNotFoundException{
        String cad = "";
        try {
            Scanner sc = new Scanner(new File("Datos.txt"));
            while (sc.hasNextLine()) {
                String cadenaFinal = sc.nextLine();
                cad += cadenaFinal.trim();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: archivo no encontrado.");
        }
        return cad.split(";");
    }

    public static void guardarEnArchivo(){
        
    }



    @Override
    public void actionPerformed(ActionEvent e){

    }
}

