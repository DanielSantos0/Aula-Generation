package ProgramacaoOrientaObjeto;

public class AnimalPreguica extends Animal {
	
	public AnimalPreguica() {
		
		super("BichoPreguiça",6,"Zzzzzz","Subir em árvore");
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
	
	

