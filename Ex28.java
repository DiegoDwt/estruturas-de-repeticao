import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int temperatura, maior = 0, menor = 0, soma = 0, media = 0, cont = 0;
		String resp;

		do{
			System.out.println("Informe a temperatura: ");
			temperatura = entrada.nextInt();

			if(temperatura > maior){
				maior = temperatura;
			}
			if(temperatura < menor){
				menor = temperatura;
			}
			soma += temperatura;
			cont++;

			System.out.println("Deseja continuar? (S/N)");
			resp = entrada.next();

		}while(resp.equalsIgnoreCase("S"));

		media = soma / cont;

		System.out.println("A maior temperatura é: " + maior);
		System.out.println("A menor temperatura é: " + menor);
		System.out.println("A media das temperaturas é: " + media);

		entrada.close();
	}

}