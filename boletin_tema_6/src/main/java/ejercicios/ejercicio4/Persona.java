package ejercicios.ejercicio4;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public void setNombre(String nombre) {
        if (nombre.equals(" ")) {
            throw new IllegalArgumentException("El nombre no puede ser inexistente.");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        if (apellidos.equals(" ")) {
            throw new IllegalArgumentException("El apellido no puede ser inexistente.");
        }
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new NumberFormatException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        dni = dni.replace("-", "");
        if (dni.length() != 9) {
            throw new DniException("El DNI debe tener 8 números y 1 letra.");
        }
        String numeros = dni.substring(0, 8);
        char letra = Character.toUpperCase(dni.charAt(8));
        int numero;
        try {
            numero = Integer.parseInt(numeros);
        } catch (NumberFormatException e) {
            throw new DniException("Números del DNI no correctos, por favor introduce 8 números válidos.");
        }
        char letraAsignada = letrasDNI.charAt(numero % 23);
        if (letra != letraAsignada) {
            throw new DniException("La letra que has introducido no corresponde con el DNI.");
        }
        this.dni = numeros + letra;
    }

    public String getDni() {
        return dni;
    }

    public Persona(String nombre, String apellidos, int edad, String dni) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }

    public abstract String firmaMail();
}
