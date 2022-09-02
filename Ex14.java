import java.util.Scanner;

	public class Ex14 {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
		
			System.out.print("Informe quantos termos terá a sequência: ");
			int num = entrada.nextInt();
			int m = 1;
			int aux = 0;
			
			for (int i = 0; i < num; i++) {
				aux = aux+1;
				System.out.print(aux + "/" + m);
				if (i != num-1) {
					System.out.print(" , ");
				}
				if (i == num-1) {
					System.out.print("...");
				}
				m = m + 2;
			}
			
			entrada.close();
		
	}

}