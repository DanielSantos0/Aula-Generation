package ProgramacaoOrientaObjeto;

public class PessoaPrincipal {
	public static void main(String args[]) {
		
		Pessoa mahomes = new Pessoa("Patrick Mahomes","Kansas City","981728");
		Funcionario kelce = new Funcionario("Travis Kalce","Kansas City","182927",20000,1000);
		
		System.out.println(mahomes.getNome()+"\n"+mahomes.getEndereco()+"\n"+mahomes.getTelefone());
		
		System.out.println();

		System.out.println(kelce.getNome()+"\n"+kelce.getEndereco()+"\n"+kelce.getValorCredito()+"\n"+kelce.getValorDivida()+"\n"+kelce.obterSaldo());
		
		//System.out.println(obterSaldo);
		
	}

}
