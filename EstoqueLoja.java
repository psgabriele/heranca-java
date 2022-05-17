package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			System.out.println("\n--------------------Menu-------------------");
			System.out.println("\n(1) Incluir produto no estoque da loja");
			System.out.println("\n(2) Remover produto do estoque da loja");
			System.out.println("\n(3) Atualizar produtos do estoque");
			System.out.println("\n(4) Visualizar produtos do estoque");
			System.out.println("\n(0) Finalizar programa");
			System.out.println("\n-------------------------------------------");
			System.out.println("\nEscolha uma opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nEntre com o produto que deseja adicionar: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que deseja remover: ");
				String produtoRemovido = leia.nextLine();
				if(estoque.contains(produtoRemovido)) {
					estoque.remove(produtoRemovido);
				} else {
					System.out.println("\nEste produto não existe no estoque.");
				}
				System.out.println("\nEstoque depois da remoção do produto: ");
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nEntre com o produto que irá entrar no lugar do produto " + verifica + " : ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nEste produto não existe no estoque.");
				}
				break;
			case 4:
				leia.nextLine();
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nPrograma finalizado.");
			default:
				System.out.println("\nOpção inválida.");
			}
		} while(op != 0);

	}

}
