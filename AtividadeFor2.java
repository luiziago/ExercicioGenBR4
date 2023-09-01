package atividadeLoops;

public class AtividadeFor2 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for (int contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite o " + contador + "° número: ");
			int numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		}
		ler.close();
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
	}

}
