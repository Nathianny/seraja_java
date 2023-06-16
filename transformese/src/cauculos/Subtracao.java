package cauculos;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		int numeroUm = entrada.nextInt();
		
		System.out.println("Digite o segundo número");
		int numeroDois = entrada.nextInt();
		
		float subtração = numeroUm - numeroDois;
		
		System.out.println("O resultado da subtração será: " + subtração);
		

		entrada.close();
	}

}
