package pessoa;

import java.util.Scanner;

public class Coleta_Dados {

public static void main(String[] args) {
				
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Informe seu nome:");
			String nome = entrada.nextLine();
			
			System.out.println("Informe seu sobrenome:");
			String sobreNome = entrada.nextLine();
			
			System.out.println("Informe sua idade:");
			String idade = entrada.nextLine();
			
			System.out.println("Informe sua cidade:");
			String cidade = entrada.nextLine();
			
			System.out.println("Informe seu time:");
			String time = entrada.nextLine();
			
			System.out.println("A cliente se chama " + nome + " " + sobreNome + ", tem " + idade + " anos, mora em " + cidade + " e torce para o " + time);
			
			entrada.close();
}
}