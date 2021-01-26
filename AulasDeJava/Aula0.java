package AulasDeJava;

import java.util.Scanner;

public class Aula0 {
	public static void main(String args[]) {
	
		float n1,n2,n3,media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\nA média foi de : " + media);
		System.out.printf("\nMédia do Aluno: %.2f",media);
	}
}
