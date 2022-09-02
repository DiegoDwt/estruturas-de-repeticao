public class Ex15 {

	public static void main(String[] args) {
				
		int n = 37;

		float soma = 0;
		int i = 1;
		int j = n;

		while (i <= n) {
			soma = soma + ((j * (j + 1 )) / (float)i);
			if(i == n)
				System.out.print("("+ j + "*" + (j + 1 ) + ")/" + i);
			else {
				System.out.print("("+ j + "*" + (j + 1 ) + ")/" + i);
				if (i != n) {
					System.out.print(" + ");
				}
				if (i == n) {
					System.out.println(" = ");
				}
			}				
			i++;
			j--;
		}

		System.out.println("\nSoma = "+soma);
	}
}