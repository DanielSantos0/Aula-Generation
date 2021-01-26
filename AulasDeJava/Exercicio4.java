package AulasDeJava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String args[]) {
		double a,b,c,s,d,r, potenciaA, potenciaB, potenciaC;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com os valores: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		//Math.pow(a, 2);
		//Math.pow(b, 2);
		//Math.pow(c, 2);
		
		s = (Math.pow(b, 2)+Math.pow(c, 2));
		System.out.println("O resultado de s é: "+s);
		r = (Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("O resultado de r é: "+r);
		
		d = (r+s)/2;
		System.out.println("O resultado de d é: "+d);
		
		
	}

}
