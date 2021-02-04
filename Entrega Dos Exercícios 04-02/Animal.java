package ProgramacaoOrientaObjeto;

public abstract class Animal {
	
	protected String nome;
	protected int idade;
	protected String som;
	protected String habilidade;

	public Animal(String nome, int idade, String som, String habilidade) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.habilidade = habilidade;
	}
	
	abstract public void nome();
	abstract public void idade();
	abstract public void som();
	abstract public void habilidade();
}
