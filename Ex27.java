import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int sair = 1;

		do {
			System.out.println("Loja Tabajara");

			int produto = 1;
			double total = 0;
			while (produto != 0) {
				System.out.print("Digite o c�digo do produto: ");
				produto = entrada.nextInt();
				if (produto != 0) {
					System.out.print("Digite o pre�o do produto: ");
					double preco = entrada.nextDouble();
					total += preco;
				}
			}

			System.out.println("Total: " + total);
			System.out.print("Valor pago: ");
			double valorPago = entrada.nextDouble();
			System.out.println("Troco: " + (valorPago - total));

			System.out.println("Deseja sair? 1 - Sim 2 - N�o");
			sair = entrada.nextInt();

		} while (sair != 1);

		entrada.close();

	}
}