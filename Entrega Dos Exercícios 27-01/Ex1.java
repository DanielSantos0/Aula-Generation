package AulasDeJava;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class Ex3 {
	public static void main(String args[]) {
		int num1,num2,num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros inteiros: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O maior n�mero �: "+num1);
		}	
		else if (num2>num1 && num2>num3) {
			System.out.println("O maior n�mero �: "+num2);
		}	
		else {
			System.out.println("O maior n�mero �: "+num3);
		}
	}

}
