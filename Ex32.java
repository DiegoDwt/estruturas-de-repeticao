import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int id = 0;
		int veiculos = 0;
		int acidente = 0;
		int idMaiorAcd = 0;
		int idMenorAcd = 0;
		int maiorAcd = 0;
		int menorAcd = 0;
		int totalVeic = 0;
		int totalAcd = 0;
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o id da cidade: ");
			id = entrada.nextInt();
			
			System.out.println("Digite o n�mero de veiculos de passeio: ");
			veiculos = entrada.nextInt();
			
			System.out.println("Digite o n�mero de acidentes de transito com v�timas: ");
			acidente = 0;
			
			if (i == 0) {
				idMaiorAcd = id;
				idMenorAcd = id;
				maiorAcd = acidente;
				menorAcd = acidente;
			}
			
			if (acidente>maiorAcd) {
				maiorAcd = acidente;
				idMaiorAcd = id;
			}else if (acidente<menorAcd) {
				menorAcd = acidente;
				idMenorAcd = id;
			}
			
			
			totalVeic += veiculos;
			
			if (veiculos<2000) {
				totalAcd += acidente;
				count++;
			}
		}
		
		
		System.out.println("Mais acidentes = cidade "+idMaiorAcd+" com "+maiorAcd+" acidentes");
		System.out.println("Menos acidentes = cidade "+idMenorAcd+" com "+menorAcd+" acidentes");
		
		float mediaVeic = totalVeic/5;
		System.out.println("M�dia de ve�culos = "+mediaVeic);
		
		float media2K = totalAcd/count;
		System.out.println("M�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos = "+media2K);
				
	
		entrada.close();

	}
}