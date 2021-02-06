package ProgramacaoOrientaObjeto;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private List<Produto> listaDeItens;
	
	public Estoque() {
		this.listaDeItens = new ArrayList<Produto>();

	}
	
	public void adicionarItens(Produto itens) {
		this.listaDeItens.add(itens);
		
	}
	
	public void removerItens(int id) {
		Produto item = obterItem(id);
		
		this.listaDeItens.remove(item);
	}
	
	public void atualizarItens(String nome,int id) {
		Produto item = obterItem(id);
		
		item.setNome(nome);
	}
	
	 public Produto obterItem(int id) {

	        for (Produto item : this.listaDeItens) {
	            if (item.getId() == id) {
	                return item;
	            }
	        }

	        return null;
	    }
	 
	public List<Produto> obterTodosItens(){
		return this.listaDeItens;
				
	}
	
	

}
