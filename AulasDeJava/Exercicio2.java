package AulasDeJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		int anos, meses, dias, idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a idade em dias: ");
		idade = ler.nextInt();
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
				
		
		System.out.println("A idade é : "+anos+" anos "+meses+" meses e "+dias+" dias");
		
	}

}
