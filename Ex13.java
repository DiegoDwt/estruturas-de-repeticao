import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int num = entrada.nextInt();
		
		int fim = 1;
		int termino;
		termino = num;
		float resultado;
		resultado = num;
		
		while (termino != fim){
			termino = termino - 1;
			resultado = (resultado * termino);
		}
		
		System.out.println("O fatorial de " + num + " � igual a: " + resultado);
	
		entrada.close();
		
	}
}
