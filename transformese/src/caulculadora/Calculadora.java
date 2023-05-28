package caulculadora;

public class Calculadora {

	public int multiplicação(int a, int b) {
		
		return a * b;
	}

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora ();
		
		double resultado = calculadora.multiplicação(5,5);
		
		System.out.println("A multiplicação dos números é igual a: " + resultado );

	}
}
