package atividade;

public class SistemaVet {
	
	public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Amora";
        cachorro1.raca = "Poodle";
        cachorro1.sexo = "Fêmea";
        cachorro1.idade = 3;
        cachorro1.peso = "2,5 kg";
        cachorro1.tutor = "Nathianny";
        cachorro1.contato = "(00) 00000-0000";
        cachorro1.servico = "Banho + Tosa";


        System.out.println("Ficha de Atendimento" );
        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Raça: " + cachorro1.raca);
        System.out.println("Sexo: " + cachorro1.sexo);
        System.out.println("Idade: " + cachorro1.idade);
        System.out.println("Peso: " + cachorro1.peso);
        System.out.println("Tutor: " + cachorro1.tutor);
        System.out.println("Contato: " + cachorro1.contato);
        System.out.println("Serviço: " + cachorro1.servico);

        double servicoCalculado = cachorro1.servicoPagar(80.00, 70.00);

        System.out.println("VALOR DO SERVIÇO: R$" + servicoCalculado);

    }
}