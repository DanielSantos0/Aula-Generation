package AulasDeJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		int dias, mes, ano;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de anos: ");
		ano = ler.nextInt();
		System.out.println("Entre com a quantidade de meses: ");
		mes = ler.nextInt();
		System.out.println("Entre com a quantidade de dias: ");
		dias = ler.nextInt();
		
		System.out.println("A quantidade de dias é: " + ((ano*365)+(mes*30)+dias));
		
	}

}
