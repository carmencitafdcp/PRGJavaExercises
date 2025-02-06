public class Principal {
    public static void main(String[] args) {
        Geometría rectangulo = new Geometría(true, 5, 10);
        Geometría triangulo = new Geometría();
        
        triangulo.setAltura(9);
        triangulo.setBase(14);

        System.out.println("RECTÁNGULO:");
        System.out.println("-----------");
        System.out.println("Esta figura es un: " + rectangulo.tipo());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Diagonal: " + rectangulo.diagonal());
        System.out.println("Perímetro: " + rectangulo.perimeter());
        //
        System.out.println("TRIÁNGULO:");
        System.out.println("-----------");
        System.out.println("Esta figura es un: " + triangulo.tipo());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Área: " + triangulo.area());
        System.out.println("Diagonal: " + triangulo.diagonal());
        System.out.println("Perímetro: " + triangulo.perimeter());
    }
}
