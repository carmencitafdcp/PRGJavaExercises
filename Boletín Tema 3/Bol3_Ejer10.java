import java.util.Scanner;

public class Bol3_Ejer10 {

    /**
     * Funcion que dependiendo de si flag es true o no, hace el area de un triángulo
     * o del rectángulo.
     * 
     * @param base   Base de la figura
     * @param height altura de la figura
     * @param flag   interruptor que determina si es una figura u otra
     * @return area;
     */
    public static double triRectangle(double base, double height, boolean flag) {
        double area;
        if (!flag) {
            area = (base * height) / 2; // Area del triángulo
        } else {
            area = base * height; // Area del rectángulo
        }
        return area;
    }

    public static double circle(double radio){
        double area;
        area = Math.PI*(radio*radio);
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        double area;
        double base;
        double height;
        double side;
        do {
            System.out.println("AREAS");
            System.out.println("-----");
            System.out.println("1.- Triangle area.");
            System.out.println("2.- Rectangle area.");
            System.out.println("3.- Square area.");
            System.out.println("4.- Circle area.");
            System.out.println("5.- Exit.");
            System.out.print("Select an option please: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("This is the triangle area!");
                    System.out.println("Tell me the size of the base of your triangle:");
                    base = sc.nextDouble();
                    System.out.println("Tell me the height of your triangle:");
                    height = sc.nextDouble();
                    area = triRectangle(base, height, false);
                    System.out.println("The area of your triangle is: " + area);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("This is the rectangle area!");
                    System.out.println("Tell me the lenght of your rectangle: ");
                    base = sc.nextDouble();
                    System.out.println("Ok, now the height please:");
                    height = sc.nextDouble();
                    area = triRectangle(base, height, true);
                    System.out.println("The are of your rectangle is: " + area);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("This is the area of an Square!");
                    System.out.println("Tell me what size do you want your Square to have:");
                    side = sc.nextDouble();
                    area = triRectangle(side, side, true);
                    System.out.println("The area of your Square is: " + area);
                    System.out.println();
                    break;
                case 4:
                    double radio;
                    System.out.println("This is the area of the circle!");
                    System.out.println("Tell me what radio do you want your circle to have:");
                    radio = sc.nextDouble();
                    area = circle(radio);
                    System.out.println("The are of the circle is: " + area);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Byebye!");
                    break;
                default:
                    System.out.println("Invalid option...");
                    break;
            }
        } while (option != 5);

        sc.close();
    }
}