package ProgramacaoOrientaObjeto;

public class CadatroDoCliente {
	public static void main(String args[]) {
		
		Cliente[] novoCliente = new Cliente[2];
		
		novoCliente[0] = new Cliente("Daniel Santos","danielsantos@generation.com","Rua da Paz",912345678);
		novoCliente[1] = new Cliente("Douglas Santos","douglassantos@generation.com","Rua da Paz",987654321);
		
		
		for(int i=0;i<2;i++) {
			novoCliente[i].todosOsDados();
			System.out.println();

		}
	
		
		//System.out.println(novoCliente);
	}
}
