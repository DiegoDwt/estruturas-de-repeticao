import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n, voto, candidato1 = 0, candidato2 = 0, candidato3 = 0;

		System.out.println("Digite o número de votos: ");
		n = entrada.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("Digite o voto: ");
			voto = entrada.nextInt();

			if(voto == 1) {
				candidato1++;
			} else if(voto == 2) {
				candidato2++;
			} else if(voto == 3) {
				candidato3++;
			}
		}

		if(candidato1 > candidato2 && candidato1 > candidato3) {
			System.out.println("Candidato 1 ganhou");
		} else if(candidato2 > candidato1 && candidato2 > candidato3) {
			System.out.println("Candidato 2 ganhou");
		} else if(candidato3 > candidato1 && candidato3 > candidato2) {
			System.out.println("Candidato 3 ganhou");
		} else {
			System.out.println("Empate");
		}

		entrada.close();

	}
}