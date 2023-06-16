package cauculos;

import java.util.Scanner;

public class ParOuImpar {
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número informado é par!");
        } else {
            System.out.println("O número informado é ímpar!");
            
            input.close();
        }
    }
}