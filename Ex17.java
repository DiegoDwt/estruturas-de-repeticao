
import java.util.Scanner;

	public class Ex17 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("Digite um n�mero: ");
			int num = entrada.nextInt();
			int div = 0;
			
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					div = div + 1;
				}
			}
			
			if (div==2) {
				System.out.println("� primo!");
			} else {
				System.out.println("N�o � primo!");
			}
			
			entrada.close();
	}
}