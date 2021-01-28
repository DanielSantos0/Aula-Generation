package AulasDeJava;

import java.util.Scanner;

public class ExRepeticao5 {
	public static void main(String args[]) {
		int numero, soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Entre aqui com um número qualquer: ");
			numero = ler.nextInt();
			soma = numero + soma;
		}
		
		while(numero != 0); 
			
			System.out.println("A soma dos números digitados é: "+soma);
		
	
	}

}
