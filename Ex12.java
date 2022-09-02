import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
       
    	Scanner entrada = new Scanner(System.in);

        int ant = 0;
        int atual = 1;
        int aux = 0;
        
        System.out.println("**Sequência de Fibonacci**");
        System.out.println("Até qual elemento da sequência deseja ver? ");
        
        double num = entrada.nextDouble();
        
        for (int i = 0; i < num; i++) {
        	
        	if (i == 0) {
        		System.out.print(atual + " , ");
        	}

            System.out.print(ant + atual);
            
            if (i < num - 1) {
            	System.out.print(" , ");
            }
            if (i == num - 1) {
            	System.out.print("...");
            }

            aux = ant;
            ant = atual;
            atual = atual + aux;
            
            if (i % 15 == 0 && i != 0) {
            	System.out.println();
            }
            
            entrada.close();
        }
    }
}