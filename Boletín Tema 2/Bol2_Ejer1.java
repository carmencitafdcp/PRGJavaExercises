public class Bol2_Ejer1{
	public static void main(String[] args){
		int cont = 0;

		while(cont < 20){
			cont = cont + 1;
			System.out.println("(while): " + cont);
		}
		cont = 0;
		do{
			cont++;
			System.out.println("(do-while): " + cont);
		} while(cont < 20);

		for(cont = 0; cont <= 20; cont++){
			System.out.println("For: " + cont);
		}

		for(cont = 0; cont <= 50; cont+=2){
			System.out.printf("%5d\n",cont);
		}

		// BIEN
	}
}

