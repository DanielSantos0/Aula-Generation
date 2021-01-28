package AulasDeJava;

import java.util.Scanner;

public class ExRepeticao2 {
	public static void main (String args[]) {
		int i, par=0, impar=0, num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 10 números: ");

		
		for(i=0;i<10;i++) {
			
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("A quantidade de números pares são: "+par);
		System.out.println("A quantidade de números ímpares são: "+impar);
	}

}
