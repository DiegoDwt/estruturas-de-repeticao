import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da d�vida");
		float divida = entrada.nextFloat();
		
		float juros = 0;
		int parcela = 1;
		
		for (int i = 0; i < 5; i++) {
			if (i==0) {
				System.out.println("Valor da d�vida| Valor dos juros| QTD de parcelas| Valor da parcela");
				System.out.println(divida+"         |"+juros*100+"%              |"+(i+1)+"               |"+(divida+(divida*juros))/(i+1));
				parcela = parcela+2;
				juros = (float) 0.1;
			}else {
				System.out.println("Valor da d�vida| Valor dos juros| QTD de parcelas| Valor da parcela");
				System.out.println(divida+"         |"+juros*100+"%              |"+(parcela)+"               |"+(divida+((float)divida*juros))/parcela);
				parcela = parcela+3;
				juros = (float) (juros+0.05);
			}
		}
		
		entrada.close();

	}

}