package Array;
import java.util.Arrays;

public class ArrayExenplo1 {

	public static void main(String[] args) {
		
		// Para criar um array
		int[] idades = new int[4];
		
		//Para atribuir valores
		idades[0] = 5;
		idades[1] = 4;
		idades[2] = 6;
		idades[3] = 6;
		
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		System.out.println(idades[3]);
	
		//5, 4, 6, 6
		
		//Jeito errado
		System.out.println(idades);
		
		//Jeito certo
		//Arrays.toString();
		
		System.out.println(Arrays.toString(idades));
		
		String[] nomes = new String[5];
		
		nomes[0] = "Ana";
		nomes[1] = "João";
		nomes[2] = "Maria";
		nomes[3] = "Carlos";
		nomes[4] = "Joana";
		
		System.out.println(Arrays.toString(nomes));
		
		//Se quisermos ver o tamanho do Array, utilizamos o lenght
		//Arrays.
		
		System.out.println(nomes.length);


	}
	
}
