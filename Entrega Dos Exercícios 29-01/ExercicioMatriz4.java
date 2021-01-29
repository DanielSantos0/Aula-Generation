package AulasDeJava;

import java.util.Scanner;

public class ExercicioMatriz4 {
	
	public static void main(String args[]) {
		
		int mat[][] = new int[3][3],i,j,somaMat=0,somaDiagonal=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.println("\nEntre com o valor da matriz: ");
				mat[i][j] = ler.nextInt();
				
				somaMat = somaMat + mat[i][j];
				
				if(i==j) {
					
					somaDiagonal = somaDiagonal + mat[i][j];
				}
			}
		}
		
		System.out.println("O valor do somatório total é:"+somaMat);
		System.out.println("O valor do somatório da diagonal é:"+somaDiagonal);
		
	}

}
