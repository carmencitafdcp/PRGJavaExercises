package ejercicios.Ejercicios.Ejercicio9;

public class ClassRoom {
    private double[][] grades;
    private String[] students;
    private String[] subjects;

    /**
     * Constructor que inicializa las propiedades a los parámetros y el array bidimensional lo inicializa a uno con filas 
     * igual a la cantidad de alumnos y columnas la cantidad de materias y rellena el array de grades con lass notas aleatorias
     * ponderadas
     * @param students alumnos que participan en la clase
     * @param subjects materias que se imparten
     */
    public ClassRoom(String[] students, String[] subjects) {
        this.students = students;
        this.subjects = subjects;
        this.grades = new double[students.length][subjects.length];
        randomGrades();
    }

    /**
     * Constructor que inicializa las propiedades a los parámetros y el array bidimensional lo inicializa a uno con filas 
     * igual a la cantidad de alumnos y columnas la cantidad de materias y rellena el array de grades con lass notas aleatorias
     * ponderadas
     * @param students cantidad de alumnos
     * @param subjects cantidad de materias
     */
    public ClassRoom(int students, int subjects) {
        this.students = new String[students];
        this.subjects = new String[subjects];
        this.grades = new double[students][subjects];
        randomGrades();

        for (int i = 0; i < students; i++) {
            this.students[i] = "SDNT " + (i + 1);
        }
        for (int j = 0; j < subjects; j++) {
            this.subjects[j] = "SJCT " + (j + 1);
        }
    }

    /**
     * Método que devuelve el array de notas
     * @return devuelve el array de notas
     */
    public double[][] getGrades() {
        return grades;
    }

    /**
     * Método que inicializa la propiedad de notas al arrat bidimensional del parámetro
     * @param grades array bidimensional de notas
     */
    public void setGrades(double[][] grades) {
        this.grades = grades;
    }

    /**
     * Método que permite modificar el array introduciendo un valor nuevo en la posicion que los parámetros row y column indican
     * @param row fila donde introducir el valor
     * @param column columna donde introducir el valor
     * @param value valor a introducir
    */
    public void setGrades(int row, int column, int value) {
        if (row >= 0 && row < grades.length && column >= 0 && column < grades[0].length) {
            if (value >= 0 && value <= 10) {
                grades[row][column] = value;
            }
        }
    }

    /**
     * Método que devuelve los estudiantes
     * @return devuelve los estudiantes
     */
    public String[] getStudents() {
        return students;
    }

    /**
     * Método que devuelve las asignaturas 
     * @return devuelve las asignaturas
     */
    public String[] getSubjects() {
        return subjects;
    }

    /**
     * Método que genera aleatoriamente números del 0 al 10 y las pondera a 0, 1 y 2 → 5% cada una; 
     * 3 10%; 4, 5 y 6 → 15% cada una; 7 y 8 → 10% cada una; 9 y 10 → 5% cada una.
     */
    public void randomGrades() {
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                double random = Math.random(); // 0 y 1
                if (random < 0.05) {
                    grades[i][j] = 0; // 5%
                } else if (random < 0.10) {
                    grades[i][j] = 1; // +5% = 10%
                } else if (random < 0.15) {
                    grades[i][j] = 2; // +5% = 15%
                } else if (random < 0.25) {
                    grades[i][j] = 3; // +10% = 25%
                } else if (random < 0.40) {
                    grades[i][j] = 4; // +15% = 40%
                } else if (random < 0.55) {
                    grades[i][j] = 5; // +15% = 55%
                } else if (random < 0.70) {
                    grades[i][j] = 6; // 15% = 70%
                } else if (random < 0.80) {
                    grades[i][j] = 7; // 10% = 80%
                } else if (random < 0.90) {
                    grades[i][j] = 8; // 10% = 90%
                } else if (random < 0.95) {
                    grades[i][j] = 9; // 5% = 95%
                } else {
                    grades[i][j] = 10; // +5% = 100%
                }
            }
        }
    }

    /**
     * Método que devuelve las notas del estudiante de la posición escogida en el parámetro o devuelve null si dicha posicion 
     * no existe
     * @param index posicion del estudiante
     * @return devuelve las notas del estudiante escogido
     */
    public double[] getStudentGrades(int index) {
        if (index < 0 || index >= grades.length) {
            return null;
        }
        return grades[index];
    }

    /**
     * Método que devuelve las notas de la materia de la posición escogida en el parámetro o devuelve null si dicha posicion 
     * no existe
     * @param index posicion de la materia
     * @return devuelve las notas de la materia escogida
     */
    public double[] getSubjectGrades(int index) {
        if (index < 0 || index >= grades[0].length) {
            return null;
        }
    
        double[] subjectGrades = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            subjectGrades[i] = grades[i][index];
        }
    
        return subjectGrades;
    }

    /**
     * Método que calcula la media global de las notas en total
     * @return devuelve la media global
     */
    public double gradesAVG() {
        int sum = 0;
        int cont = 0;
        for (double[] row : grades) {
            for (double value : row) {
                sum += value;
                cont++;
            }
        }
        if (cont == 0) {
            return 0;
        }
        return sum / cont;
    }

    /**
     * Método que calcula la media de las notas de los estudiantes
     * @param index estudiante del que calcular la media de notas
     * @return devuelve la media de las notas del estudiante escogido
     */
    public double studentsAVG(int index) {
        // Index es la posición de la matriz en la que el alumno se encuentra, es decir,
        // las filas
        if (index < 0 || index >= grades.length) {
            return 0;
        }

        int sum = 0;
        int cont = 0;

        // Bucle para recorrer las columnas, es decir, las materias
        for (int j = 0; j < grades[index].length; j++) {
            sum += grades[index][j];
            cont++; // Numero de materias
        }

        if (cont == 0) {
            return 0;
        }

        return sum / cont;
    }

    /**
     * Método que calcula la media de las notas de las materias
     * @param index materia de la que calcular la media de notas
     * @return devuelve la media de las notas de la materia escogida
     */
    public double subjectsAVG(int index) {
        // Index es el índice de las columnas, es decir, las materias
        if (index < 0 || index >= grades[0].length) {
            return 0;
        }

        int sum = 0;

        // Recorro las filas, alumnos
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i][index]; // calculo la suma de las notas en cada materia
        }

        return sum / grades.length;
    }

    /**
     * Método que devuelve la nota máxima de la materia escogida
     * @param index posicion de la materia
     * @return devuelve la nota máxima de susodicha materia
     */
    public double maxSubject(int index) {
        if (index < 0 || index >= grades[0].length) {
            return -1;
        }

        double max = grades[0][index]; // Primera nota de la materia

        for (int i = 0; i < grades.length; i++) {
            if (grades[i][index] > max) {
                max = grades[i][index];
            }
        }

        return max;
    }

    /**
     * Método que devuelve la nota mínima de la materia escogida
     * @param index posicion de la materia
     * @return devuelve la nota mínima de susodicha materia
     */
    public double minSubject(int index) {
        if (index < 0 || index >= grades[0].length) {
            return -1;
        }

        double min = grades[0][index]; // Primera nota de la mateia

        for (int i = 0; i < grades.length; i++) {
            if (grades[i][index] < min) {
                min = grades[i][index];
            }
        }

        return min;
    }
}
