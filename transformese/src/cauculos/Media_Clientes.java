package cauculos;

import java.util.Scanner;

public class Media_Clientes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
					
				System.out.println("Quantidade de clientes no primeiro mês:"); 
				int mes_1 = entrada.nextInt();
				
				System.out.println("Quantidade de clientes no segundo mês:");
				int mes_2 = entrada.nextInt();
				
				System.out.println("Quantidade de clientes no terceiro mês:");
				 int mes_3 = entrada.nextInt();
							
				 double soma= mes_1 + mes_2 + mes_3;
				 double media = soma / 3;
				 
				 
					System.out.println("A média será:" + media);
					
					entrada.close();
			}
		}