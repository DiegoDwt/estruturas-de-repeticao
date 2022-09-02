import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int qtdCDs = 0;
		double valorCD = 0;
		double valorTotal = 0;
		double valorMedio = 0;

		System.out.println("Informe a quantidade de CDs: ");
		qtdCDs = entrada.nextInt();

		for (int i = 1; i <= qtdCDs; i++) {
			System.out.println("Informe o valor do CD " + i + ": ");
			valorCD = entrada.nextDouble();
			valorTotal += valorCD;
		}

		valorMedio = valorTotal / qtdCDs;

		System.out.println("Valor total investido: " + valorTotal);
		System.out.println("Valor médio gasto em cada CD: " + valorMedio);

		entrada.close();

	}
}