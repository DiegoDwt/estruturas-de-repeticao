import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int turmas, alunos, soma = 0, media = 0;

		System.out.println("Digite o n�mero de turmas: ");
		turmas = entrada.nextInt();

		for (int i = 1; i <= turmas; i++) {
			System.out.println("Digite o n�mero de alunos da turma " + i + ": ");
			alunos = entrada.nextInt();

			while (alunos > 40) {
				System.out.println("N�mero de alunos inv�lido, digite novamente: ");
				alunos = entrada.nextInt();
			}

			soma += alunos;
		}

		media = soma / turmas;

		System.out.println("A m�dia de alunos por turma �: " + media);

		entrada.close();

	}
}