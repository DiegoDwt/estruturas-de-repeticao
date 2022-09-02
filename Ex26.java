import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor do p�o: ");
		float valor = Float.parseFloat(entrada.nextLine());

		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + String.format("%.2f", (i * valor)));
		}

		entrada.close();
	}
}