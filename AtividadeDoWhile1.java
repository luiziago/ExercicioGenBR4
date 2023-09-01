package atividadeLoops;

public class AtividadeDoWhile1 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);
		
		int num;
		int soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			if (num > 0) {
				soma = soma + num;
			}
		} while (num != 0); 
		System.out.println("A soma dos números positivos é: " + soma);
		ler.close();

	}

}
