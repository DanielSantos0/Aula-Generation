package ProgramacaoOrientaObjeto;

public class AnimalCachorro extends Animal {

	public AnimalCachorro() {
		super("Maka", 1, "Latir", "Correr");
	}

	@Override
	public void nome() {
		System.out.println(super.nome);		
	}

	@Override
	public void idade() {
		System.out.println(super.idade);	
	}

	@Override
	public void som() {
		System.out.println(super.som);	
	}

	@Override
	public void habilidade() {
		System.out.println(super.habilidade);	
	}

}
