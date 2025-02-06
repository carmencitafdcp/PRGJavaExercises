public class Principal {
    public static void main(String[] args) {
        Pelota p = new Pelota();

        p.tipo = "baloncesto";
        p.setRadio(20);

        System.out.printf("Tengo una pelota de %s y de radio %.2f ", p.tipo, p.getRadio());

        Pelota p1 = new Pelota();
        Pelota p2 = new Pelota("fútbol", 20);

        System.out.println(); //Hacer retorno de carro. 

        System.out.printf("Tengo una pelota de %s y de radio %.2f %nY tengo otra de %s y de radio %.2f"
        , p1.tipo, p1.getRadio(), p2.tipo, p2.getRadio());

        p1.inflar();
        p2.inflar(10);

        System.out.printf("La pelota 1 tiene de radio %.2f y la 2 tiene de radio %.2f", p1.getRadio(), p2.getRadio());

        intercambiaRadios(p1, p2);
        System.out.printf("El radio de la primera pelota es: %.2f, y el radio de la segunda es %.2f", p1.getRadio(), p2.getRadio());
    }

    public static void intercambiaRadios(Pelota pelota, Pelota pelota2){
        double intercambio = pelota.getRadio();
        pelota.setRadio(pelota2.getRadio());     
        pelota2.setRadio(intercambio); 
    }
}
