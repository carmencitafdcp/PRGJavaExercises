public class Pelota{
    public String tipo;
    private double radio;

    public Pelota(){
        this.tipo = "playa";
        this.radio = 40;
    }

    public Pelota(String tipo, double radio){
        this.tipo = tipo;
        this.radio = radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void inflar(){
        radio = radio + 1;
    }

    public void inflar(int n){
        radio = radio + n;
    }
}