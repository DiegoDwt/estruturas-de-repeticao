public class Ex25 {

	public static void main(String[] args) {
	
		final float preco = (float) 1.99;
		String resultado="";
		
		System.out.println("Lojas Quase dois - Tabela de preços");
		
		for (int i = 0; i < 50; i++) {
			resultado = String.format("%.2f", preco*(i+1));
			System.out.println((i+1)+" - R$"+resultado);
		}	
	}
}
