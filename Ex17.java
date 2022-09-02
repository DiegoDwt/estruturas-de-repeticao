
import java.util.Scanner;

	public class Ex17 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("Digite um número: ");
			int num = entrada.nextInt();
			int div = 0;
			
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					div = div + 1;
				}
			}
			
			if (div==2) {
				System.out.println("É primo!");
			} else {
				System.out.println("Não é primo!");
			}
			
			entrada.close();
	}
}