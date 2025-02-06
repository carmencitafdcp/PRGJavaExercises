public class Ej3 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(" "+i);
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(" "+j);
        }
        System.out.println();
        for (int x = 2; x <=20; x = x + 2) {
            System.out.print(" "+x);
        }
        System.out.println();
        for (int a = 1; a <= 20; a++) {
            if (a%2 == 0) {
                System.out.print(" "+a);
            }
        }
        System.out.println();
        for (int m = 0; m <= 20; m++) {
            if (m%2 != 0) {
                System.out.print(" "+m);
            }
        }
        System.out.println();
        for (int e = 10; e <= 50; e = e + 5) {
            System.out.print(" "+e);
        }
        System.out.println();
        for (int p = 100; p >= 0; p = p - 10) {
            System.out.print(" "+p);
        }
    }
}
