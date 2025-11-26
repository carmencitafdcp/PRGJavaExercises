public class PrincipalPerro {
    public static void main(String[] args) {
        Perro p = new Perro(); //ahora puedo crear tipos perro. Objetos tipo Perro. 
        p.nombre = "Pipa";
        p.raza = "Boxer";
        //Se ha de inicializar la variable Perro, como si fuera un Scanner;
        p.setEdad(5);
        System.out.printf("Tengo un perro que se llama %s, y es de raza %s, y tiene %d años.", p.nombre, p.raza, p.getEdad());

        // Perro p1 = new Perro();
        // Perro p2 = new Perro();
    }   
}
