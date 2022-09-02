import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;
		double nota, soma = 0, media;

		System.out.print("Quantas notas deseja calcular a média? ");
		n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Digite a nota " + i + ": ");
			nota = entrada.nextDouble();
			soma = soma + nota;
		}

		media = soma / n;

		System.out.println("A média das notas é: " + media);

		entrada.close();

	}
}