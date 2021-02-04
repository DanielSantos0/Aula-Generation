package ProgramacaoOrientaObjeto;

import java.util.Scanner;

public class AnimalFinal {
	
	public static void main(String args[]) {
		
		AnimalCachorro cachorro =  new AnimalCachorro();
		AnimalCavalo cavalo = new AnimalCavalo();
		AnimalPreguica preguica = new AnimalPreguica();
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Escolha o tipo de animal que você quer saber o som: ");
		System.out.println("\n1 - Cavalo\n2 - Cachorro\n3 - Preguiça");
		
		n = ler.nextInt();
		
		if(n == 1) {
			cavalo.som();
		}
		else if(n == 2) {
			cachorro.som();
		}
		else if(n == 3) {
			preguica.som();
		}
		else {
			System.out.println("Numero inválido....Reinicie o sistema");
		}

	}

}
