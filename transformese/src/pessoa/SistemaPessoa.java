package pessoa;

public class SistemaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Nathianny";
		
		Pessoa pessoa2 = pessoa1;
		Pessoa pessoa3 = pessoa2;
		Pessoa pessoa4 = pessoa3;
		
		System.out.println("Nome pessoa1: " + pessoa1.nome);
		System.out.println("Nome pessoa2: " + pessoa2.nome);
		
		pessoa2.nome = "Nathielly";
		
		System.out.println("Nome pessoa1: " + pessoa1.nome);
		System.out.println("Nome pessoa2: " + pessoa2.nome);
		
		pessoa3.nome = "Natanna";
		
		System.out.println("Nome pessoa1: " + pessoa1.nome);
		System.out.println("Nome pessoa2: " + pessoa3.nome);
		
        pessoa4.nome = "Natan";
		
		System.out.println("Nome pessoa1: " + pessoa1.nome);
		System.out.println("Nome pessoa2: " + pessoa4.nome);
		
		}

}
