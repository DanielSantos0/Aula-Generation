package AulasDeJava;

import java.util.Scanner;

public class Ex1 {
	public static void main(String args[]) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre aqui com a idade do participante: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("A categoria do participante é infantil");	
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("A categoria do participante é juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("A categoria do participante é adulto");
		}
		else {
			System.out.println("Idade do participante inválida...");
		}
		
		
	
	}	

}
