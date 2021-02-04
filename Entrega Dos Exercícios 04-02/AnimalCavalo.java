package ProgramacaoOrientaObjeto;

public class AnimalCavalo extends Animal {
	
	public AnimalCavalo() {
		
		super("Nadine",4,"Relinchar","Trotar");
		
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
	public void habilidade( ) {
		System.out.println(super.habilidade);
	}
}
