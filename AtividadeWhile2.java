package atividadeLoops;

public class AtividadeWhile2 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);

		int backend = 0;
		int frontendMulher = 0;
		int homemMobile40 = 0;
		int mulherFullstack30 = 0;
		char continuar = 'S';

		while (continuar == 'S') {
			System.out.println("Digite a Idade: ");
			int idade = ler.nextInt();

			System.out.println("Digite o Sexo:  (1 - Masculino, 2 - Feminino, 3 - Outros): ");
			int sexo = ler.nextInt();

			System.out.println(
					"Digite a categoria do colaborador (1 - Backend, 2 - Frontend, 3 - Mobile, 4 - FullStack): ");
			int categoria = ler.nextInt();

			if (categoria == 1) {
				backend++;
			} else if (categoria == 2 && sexo == 2) {
				frontendMulher++;
			} else if (categoria == 3 && sexo == 1 && idade > 40) {
				homemMobile40++;
			} else if (categoria == 4 && sexo == 2 && idade < 30) {
				mulherFullstack30++;
			}

			System.out.print("Deseja continuar (S/N)? ");
			continuar = ler.next().charAt(0);
		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontendMulher);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + homemMobile40);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulherFullstack30);

		ler.close();
	}
}