package atividadeLoops;

public class AtividadeDoWhile2 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);

		int num;
		int soma = 0;
		int contador = 0;

		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();

			if (num != 0 && num % 3 == 0) {
				soma = soma + num;
				contador++;
			}
		} while (num != 0);

		if (contador > 0) {
			double media = (double) soma / contador;
			System.out.println("A média dos números múltiplos de 3 é: " + media);
		} else {
			System.out.println("Nenhum número múltiplo de 3 foi digitado.");
		}
		ler.close();
	}
}
