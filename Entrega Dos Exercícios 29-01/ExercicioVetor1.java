package AulasDeJava;

import java.util.Scanner;

//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
public class ExercicioVetor1 {
	public static void main(String args[]) {
	
		int maiorPontuacao, i, num=6;
		int vetor[] = new int[num];
		
		Scanner ler = new Scanner(System.in);
		
		for (i=0;i<5;i++) {
			
			System.out.printf("Entre com %2do. valor: ",(i+1));
			vetor[i] = ler.nextInt();
			
					
		}


		maiorPontuacao = vetor[i];
		for(i=0;i<5;i++) {
			
			if(vetor[i]>maiorPontuacao) {
				
				maiorPontuacao = vetor[i];
			}
			
		}
		for(i=0;i<5;i++) {
		
		System.out.printf("\nvetor[%d] = %2d \n",i,vetor[i]);

		
		}
		
		System.out.println("\nO maior pontua��o �: "+maiorPontuacao);

	}

}
