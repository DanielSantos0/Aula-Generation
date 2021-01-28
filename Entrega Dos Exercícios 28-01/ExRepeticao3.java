package AulasDeJava;

import java.util.Scanner;

public class ExRepeticao3 {
	public static void main(String args[]) {
		int idade=0, idadeMaior=0, idadeMenor=0, naoContabilizado=0;
		
		Scanner ler = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
			if(idade < 21){
				idadeMenor++;		
			}
			else if(idade > 50){
				idadeMaior++;
			}
			//Aqui eu só coloquei pra não ficar vazio entre a idade 21 e 50
			else {
				naoContabilizado++;
			}
		}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos são: "+idadeMenor);
		System.out.println("A quantidade de pessoas com mais de 50 anos são: "+idadeMaior);
	}

}
