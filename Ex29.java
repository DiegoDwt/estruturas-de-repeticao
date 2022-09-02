import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x, n, m, i;

		System.out.print("Digite o valor de x: ");
		x = entrada.nextInt();

		System.out.print("Digite o valor de n: ");
		n = entrada.nextInt();

		do {
			System.out.print("Digite o valor de m: ");
			m = entrada.nextInt();
		} while (m <= n);
			
		for (i = n; i <= m; i++) {
			System.out.println(x + " x " + i + " = " + (x * i));
		}


		entrada.close();
	}

}