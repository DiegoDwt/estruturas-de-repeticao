import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, cont = 0;

		System.out.print("Digite um n�mero: ");
		num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
				System.out.println("O n�mero " + num + " � divis�vel por " + i);
			}
		}

		if (cont == 2) {
			System.out.println("O n�mero " + num + " � primo.");
		} else {
			System.out.println("O n�mero " + num + " n�o � primo.");
		}

		entrada.close();

	}
}