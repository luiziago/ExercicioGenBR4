package atividadeLoops;

public class AtividadeFor1 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);
		
		int n1, n2, contador;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = ler.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		n2 = ler.nextInt();
		
		ler.close();
		
		if (n1 >= n2) {
			System.out.println("Intervalo Inválido!");	
		}
		else {
			System.out.println("No intervalo entre " + n1 + " e " + n2 + ":");
			for (contador = n1; contador <= n2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é multiplo de 3 e 5");				
				}
			}
		}		
	}

}
