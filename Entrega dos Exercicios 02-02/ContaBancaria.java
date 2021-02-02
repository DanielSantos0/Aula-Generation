package ProgramacaoOrientaObjeto;

public class ContaBancaria {
	
	private int conta;
	private int agencia;
	private String banco;
	
	public ContaBancaria(String b, int a, int c) {
		
		this.banco = b;
		this.conta = c;
		this.agencia = a;

	}
	public void dadosDoCliente() {
		
		System.out.println("Segue os dados para deposito: "+banco+" - conta: "+agencia+" - agencia: "+conta);
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
}
