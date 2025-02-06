public class Geometría {
    private boolean figura;
    private double altura, base;

    public Geometría() {
        this.figura = false;
        this.altura = 2;
        this.base = 2;
    }

    public Geometría(double altura, double base) {
        this.figura = false;
        this.altura = altura;
        this.base = base;
    }

    public Geometría(boolean figura, double altura, double base) {
        this.figura = figura;
        this.altura = altura;
        this.base = base;
    }

    public boolean getFigura() {
        return figura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public double getBase() {
        return base;
    }

    public double area(){
        double area = 1;
        if (figura) {
            area = this.base * this.altura;
        } else {
            area = (this.base*this.altura)/2;
        }
        return area;
    }

    public double perimeter(){
        double perimeter = 0;
        if (figura) {
            perimeter = (this.base * 2) + (this.altura * 2);
        } else {
            perimeter = this.base+this.altura+diagonal();
        }
        return perimeter;
    }

    public double diagonal(){
        double diagonal = 1;
        diagonal = Math.sqrt((this.altura*this.altura)+(this.base*this.base));
        return diagonal;
    }

    public String tipo(){
        String tipo = "";
        if (figura) {
            tipo = "Rectángulo";
        } else {
            tipo = "Triángulo";
        }
        return tipo;
    }
}