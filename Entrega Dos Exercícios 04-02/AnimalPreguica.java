package ProgramacaoOrientaObjeto;

public class AnimalPreguica extends Animal {
	
	public AnimalPreguica() {
		
		super("BichoPregui�a",6,"Zzzzzz","Subir em �rvore");
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
	
	

