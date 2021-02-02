package ProgramacaoOrientaObjeto;

public class Cliente {
	
	private String nome;
	private String email;
	private String endereco;
	private int telefone;

	public Cliente (String nome1, String email1, String endereco1, int telefone1) {
		
		this.nome = nome1;
		this.email = email1;
		this.endereco = endereco1;
		this.telefone= telefone1;
	}
	
	public void todosOsDados() {
		
		System.out.println(nome+"\n"+email+"\n"+endereco+"\n"+telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
