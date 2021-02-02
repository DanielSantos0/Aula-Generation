package ProgramacaoOrientaObjeto;

public class Banco {
	
	public static void main(String args[]) {
		
		ContaBancaria[] usuario = new ContaBancaria[2];
		
		usuario[0] = new ContaBancaria("Bradesco",1987,12342);
		usuario[1] = new ContaBancaria("Santander",7782,88732);
		
		for(int i=0; i < 2; i++) {	
			usuario[i].dadosDoCliente();
			System.out.println();
		}
		
		
		
	}

}
