import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idade, soma = 0, cont = 0;
		double media;
		String resposta;

		do {
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();
			soma = soma + idade;
			cont++;
			System.out.println("Deseja continuar? (S/N)");
			resposta = entrada.next();
		} while (resposta.equalsIgnoreCase("S"));

		media = soma / cont;

		if (media >= 0 && media <= 25) {
			System.out.println("Turma jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("Turma adulta");
		} else {
			System.out.println("Turma idosa");
		}

		entrada.close();

	}
}