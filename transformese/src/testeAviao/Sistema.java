package testeAviao;

public class Sistema {
	
	public static void main(String[] args) {
		
		//System.out.println("Este é o modelo do avião: " + aviao.fabricante);
		//System.out.println("A velocidade do motor é: " + aviao.motor.velocidadeMotor);
		
		Piloto piloto1 = new Piloto();
		System.out.print(piloto1.nome);
		
		piloto1.nome = "Ariel";
		piloto1.sobreNome = "Xavier";
		
		Piloto piloto2 = new Piloto();
		piloto2.nome = "Natan";
		piloto2.sobreNome = "Cordeiro";
		
		Aviao aviao1 = new Aviao();
		aviao1.fabricante = "Embraer";
		aviao1.modelo = "111-AAA";
		aviao1.passageiros = 50;
		aviao1.qtdeMotores = 2;
		aviao1.piloto = piloto1;
		
		Aviao aviao2 = new Aviao();
		aviao2.fabricante = "Embraer";
		aviao2.modelo = "222-BBB";
		aviao2.passageiros = 100;
		aviao2.qtdeMotores = 1;
		aviao2.piloto = piloto2;
		
		System.out.println("Dados do avião 1");
		System.out.println(aviao1.modelo);
		
		System.out.println("Dados do avião 2");
		System.out.println(aviao2.modelo);
		
		Motor motor = new Motor();
	}

}
