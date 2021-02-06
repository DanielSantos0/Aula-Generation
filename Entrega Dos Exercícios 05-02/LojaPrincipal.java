package ProgramacaoOrientaObjeto;

import java.util.List;
import java.util.Scanner;

public class LojaPrincipal {

	public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Scanner ler = new Scanner(System.in);

        int opcaoEscolhida;

        do {
            System.out.println("-------------------- Menu --------------------");
			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Remover Produto");
			System.out.println("3 - Atualizar Produto");
			System.out.println("4 - Exibir Todos Produtos");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada:");
            opcaoEscolhida = ler.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Informe um numero identificador para o produto:");
                int idDoItem = ler.nextInt();

                ler.nextLine();	
                System.out.println("Informe o nome do produto:");
                String nomeDoItem = ler.nextLine();

                Produto item = new Produto(nomeDoItem, idDoItem);
                estoque.adicionarItens(item);
                
                System.out.println("Produto cadastrado com sucesso!");
            } else if (opcaoEscolhida == 2) {
                System.out.println("Informe o ID do produto que deseja remover:");
                int idDoItem = ler.nextInt();
               

                estoque.removerItens(idDoItem);
                

                System.out.println("Produto removido com sucesso!");
            } else if (opcaoEscolhida == 3) {
                System.out.println("Informe o ID do produto que deseja atualizar:");
                int idDoItem = ler.nextInt();

                Produto item = estoque.obterItem(idDoItem);

                if (item == null) {
                    System.out.println("O produto que deseja atualizar não foi encontrado!");
                } else {
                    ler.nextLine();

                    System.out.println("Informe o novo nome do produto:");
                    String nomeDoItem = ler.nextLine();

                    estoque.atualizarItens(nomeDoItem, idDoItem);

                    System.out.println("Produto atualizado com sucesso!");
                       
                }
                
            } else if (opcaoEscolhida == 4) {
               List<Produto> todosItens = estoque.obterTodosItens();

                if (todosItens.isEmpty()) {
                    System.out.println("Não há nenhum produto para ser exibido, pois o estoque está vazio!");
                } else {
                    System.out.println("###### Todos os Produtos ######");

                    for (Produto produto : todosItens) {
                        System.out.println(produto.getId() + " - " + produto.getNome());
                    }
                }
            } else if (opcaoEscolhida == 0) {
                System.out.println("Obrigado por utilizar nosso sistema!");
            } else {
                System.out.println("A opção escolhida não existe, tente novamente!");
            }

        } while (opcaoEscolhida != 0);
    }
}
