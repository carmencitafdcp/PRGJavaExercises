package ejercicios.Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Menu {
    private ClassRoom c; // Me impide poner class así que se queda como c

    /**
     * Constructor de la clase Menu que crea un objeto de la clase ClassRoom con el
     * constructor de dicha clase
     * donde se pasan la cantidad de estudiantes y la cantidad de materias.
     * Además de que establece la cantidad de estudiantes y de materias.
     */
    public Menu() {
        // Crear un objeto ClassRoom con nombres automáticos
        int numberOfStudents = 20; // Número de alumnos
        int numberOfSubjects = 6; // Número de materias
        this.c = new ClassRoom(numberOfStudents, numberOfSubjects);
    }

    /**
     * Método que crea un menú con las debidas opciones para ver la tabla de notas,
     * las notas de los estudiantes,
     * las notas de las asignaturas, la media global de notas, la media de cada
     * alumno, la media de cada asignatura,
     * y las notas mínimas y máximas de una materia.
     */
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Show grades table");
            System.out.println("2. Show students grades");
            System.out.println("3. Show subjects grades");
            System.out.println("4. Show global average of grades");
            System.out.println("5. Show average of grades by students");
            System.out.println("6. Show average of grades by subjects");
            System.out.println("7. Show max and min grade of each subject");
            System.out.println("8. Modify grades");
            System.out.println("9. Exit");
            System.out.print("Please, choose an option: ");
            option = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.println("\n--- GRADES TABLE ---\n");
                    showTable();
                    /*
                     * He decidido poner la función en esta misma clase para evitar poner
                     * interfaz en la otra clase.
                     */
                    break;
                case 2:
                    System.out.println("\n--- STUDENTS GRADES ---");
                    System.out.print("\nWhich student's grades do you want to see?: ");
                    int index = sc.nextInt() - 1; /*
                                                   * El -1 es para que el indice que el usuario escribe coincida bien
                                                   * con
                                                   * el índice del estudiante que quiere escoger, porque los usuarios no
                                                   * suelen saber que los indices empiezan en
                                                   * 0...
                                                   */
                    if (index >= 0 && index < c.getStudents().length) {
                        double[] grades = c.getStudentGrades(index);
                        System.out.println("Grades of " + c.getStudents()[index]);
                        // Imprime los nombres de las materias desde c.getSubjects()
                        for (String subject : c.getSubjects()) {
                            System.out.printf("%-10s", subject); // Formatea como en la tabla
                        }
                        System.out.println();
                        for (double grade : grades) {
                            System.out.printf("%-10s", grade + "  ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("This student doesn't study here.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- SUBJECTS GRADES ---");
                    System.out.print("\nWhich subject's grades do you want to see?: ");
                    int subjectNumber = sc.nextInt() - 1;
                    if (subjectNumber >= 0 && subjectNumber < c.getSubjects().length) {
                        double[] grades2 = c.getSubjectGrades(subjectNumber);
                        System.out.println("Grades of " + c.getSubjects()[subjectNumber]);
                        for (int i = 0; i < c.getStudents().length; i++) {
                            System.out.printf("%-10s %-5d\n", c.getStudents()[i], grades2[i]);
                        }
                    } else {
                        System.out.println("This subject doesn't exist.");
                    }
                    break;
                case 4:
                    System.out.println("\n--- GLOBAL GRADES AVERAGE ---");
                    System.out.printf("\nGlobal grades avg: %.2f", c.gradesAVG());
                    break;
                case 5:
                    System.out.println("\n--- STUDENTS GRADES AVERAGE ---");
                    System.out.print("\nWhich student's grades do you want to see?: ");
                    int studentNumber = sc.nextInt() - 1;
                    if (studentNumber >= 0 && studentNumber < c.getStudents().length) {
                        double average = c.studentsAVG(studentNumber);
                        System.out.printf("Grades average of %d  %.2f", c.getStudents()[studentNumber], average);
                    } else {
                        System.out.println("This student doesn't have grades.");
                    }
                    break;
                case 6:
                    System.out.println("\n--- SUBJECTS GRADES AVERAGE ---");
                    System.out.print("\nWhich subject's grades do you want to see?: ");
                    int subjectIndex = sc.nextInt() - 1;
                    if (subjectIndex >= 0 && subjectIndex < c.getSubjects().length) {
                        double avg = c.subjectsAVG(subjectIndex);
                        System.out.printf("Grades average of %d   %.2f", c.getSubjects()[subjectIndex], avg);
                    } else {
                        System.out.println("This subject doesn't have grades.");
                    }
                    break;
                case 7:
                    System.out.println("\n--- MIN AND MAX GRADES ---");
                    System.out.print("\nWhich subject's higher/lower grade do you want to see?: ");
                    int index2 = sc.nextInt() - 1;
                    if (index2 >= 0 && index2 < c.getSubjects().length) {
                        double max = c.maxSubject(index2);
                        double min = c.minSubject(index2);
                        System.out.println("Higher grade of subject " + c.getSubjects()[index2] + ": " + max);
                        System.out.println("Lower grade of subject " + c.getSubjects()[index2] + ": " + min);
                    } else {
                        System.out.println("You didn't choose an existing subject.");
                    }
                    break;
                case 8:
                    System.out.println("\n--- MODIFY GRADES ---");
                    boolean validGrade = false;
                    int studentIndex = 0;
                    int subject = 0;
                    int newGrade = 0;
                    System.out.print("\nWhich student's grades you want to modify?: ");
                    studentIndex = sc.nextInt() - 1;
                    System.out.print("Which subject's grades you want to modify?: ");
                    subject = sc.nextInt();
                    if (studentIndex >= 0 && studentIndex < c.getStudents().length && subject >= 0 && subject < c.getSubjects().length) {
                        while (!validGrade) {
                            System.out.print("Add the new grade: ");
                            newGrade = sc.nextInt();
                            if (newGrade >= 0 && newGrade <= 10) {
                                c.setGrades(studentIndex, subject, newGrade);
                                System.out.println("New grade set successfully.");
                                validGrade = true;
                            } else {
                                System.out.println("Invalid grade. Please enter a grade between 0 and 10.");
                            }
                        }
                    } else {
                        System.out.println("Invalid student or subject index.");
                    }
                    break;
                case 9:
                    System.out.println("Bye-Bye!");
                    return;
                default:
                    System.out.println("Ups! Unvalid option.");
            }
        } while (option != 9); // Cambiado a option != 9
    }

    /**
     * Método que muestra la tabla correctamente formateada
     */
    public void showTable() {
        // Encabezado
        System.out.printf("%-15s", "Sdnt\\Sjct");
        for (String subject : c.getSubjects()) { // Por cada asignatura...
            System.out.printf("%-10s", subject); // Imprime en encabezado de las materias (columnas)
        }
        System.out.println();

        for (int i = 0; i < c.getSubjects().length; i++) {
            System.out.printf("%-15s", c.getStudents()[i]); // Encabezado de las filas
            for (int j = 0; j < c.getSubjects().length; j++) {
                System.out.printf("%-10.2f", c.getGrades()[i][j]); // Formateo para las notas
            }
            System.out.println();
        }
    }
}