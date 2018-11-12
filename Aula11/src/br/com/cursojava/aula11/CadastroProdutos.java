package br.com.cursojava.aula11;

import java.util.Scanner;

public class CadastroProdutos {

	private static final int SAIR = 5;
	ProdutoControle controle = new ProdutoControle();
	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;

	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;
		do {
			System.out.println("*********MENU PRINCIPAL************");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos ");
			System.out.println("3 - Mostra o valor total dos produtos");
			System.out.println("4 - Filtrar Produto");
			System.out.println("5 - Sair ");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			somarProdutos();
			break;
		case 4:
			filtrarProduto(teclado);
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais.");
			break;
		default:
			System.out.println("Opção inválida");
		}
	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("===========CADASTRAR PRODUTO=============");
		System.out.println("Informe o nome do produto");
		String nome = teclado.nextLine();
		System.out.println("Informe o preço do produto");
		double preco = Double.parseDouble(teclado.nextLine());
		boolean ok = controle.adicionar(nome, preco);
		if(ok) {
			System.out.println("produto adicionado com sucesso");
		}else {
			System.out.println("Não foi possível adicionar o produto");
		}
	}

	private void listarProdutos() {
		System.out.println("--------------- LISTA PRODUTOS----------------------");
		Produto atual = null;
		Produto[] produtos = controle.listarProdutos();
		for (int i = 0; i < produtos.length; i++) {
			atual = produtos[i];
			System.out.printf("%d - %.2f - %s \n", i + 1, atual.getPreco(), atual.getNome());
		}

	}

	private void somarProdutos() {
		double soma = controle.somaProdutos();
		System.out.println("Total: " + soma);
	}

	private void filtrarProduto(Scanner teclado) {
		System.out.println("############FILTRAR PRODUTOS#############");
		System.out.println("Digite um valor mínimo");
		double valor = Double.parseDouble(teclado.nextLine());
		Produto[] produtos = controle.listarProdutosPorPrecoMinimo(valor);
		if (produtos != null && produtos.length > 0) {
			for (Produto atual : produtos) {
				System.out.printf("%.2f - %s \n", atual.getPreco(), atual.getNome());
			}
		} else {
			System.out.println("Não existem produtos com o preço mínimo informado");
		}
	}
}
