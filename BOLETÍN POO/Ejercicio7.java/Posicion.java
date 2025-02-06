public class Posicion {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverA(){
        this.x = 10;
        this.y = 5;
    }

    public void desplazar(int xx, int yy) {
        this.x += xx;
        this.y += yy;
    }
    
}
