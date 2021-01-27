package AulasDeJava;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Ex3 {
	public static void main(String args[]) {
		int num1,num2,num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros inteiros: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O maior número é: "+num1);
		}	
		else if (num2>num1 && num2>num3) {
			System.out.println("O maior número é: "+num2);
		}	
		else {
			System.out.println("O maior número é: "+num3);
		}
	}

}
