package br.com.cursojava.aula11;

public class ProdutoRepositorio {

	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;
	public boolean inserirProduto(Produto produto) {
		boolean resultado = false;
		//para ver se tem um produto ou não
		if (produto != null) {
			//para não passar do limite do array
			if (quantidade < produtos.length) {
				produtos[quantidade++] = produto;
				resultado = true;
			}
		}
		//se conseguiu cadastrar ou não
		return resultado;
	}
	
	public Produto[] buscarTodos() {
		//Criar um novo array para adicionar os produtos
		Produto[] resultado = new Produto[quantidade];
		//percorrer o array
		for(int i = 0; i < quantidade; i++) {
			//adiciona na posição do array os objetos do outro array
			resultado[i] = produtos[i];
		}
		return resultado;
	}
	
	public boolean remover(int i) {
		boolean resultado = false;
		if(i < quantidade && i > -1) {
			produtos[i] = null;
			resultado = true;
		}
		return resultado;
	}
}
