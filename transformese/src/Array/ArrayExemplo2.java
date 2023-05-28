package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExemplo2 {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	double [] notas = new double [4];
	
	for (int i = 0; i <= 3; i++) {
		
		System.out.println("Informe a nota " + i);
		notas[i] = entrada.nextDouble();
	
	}
		
		System.out.println(Arrays.toString(notas));
	
	//System.out.println("Informe o nome");
	//String nome = entrada.next();
	
	//System.out.println("Informe a idade");
	//int idade = entrada.nextInt();


	entrada.close();
}
}
