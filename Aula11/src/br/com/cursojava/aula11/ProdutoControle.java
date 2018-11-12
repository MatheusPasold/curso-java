package br.com.cursojava.aula11;

import java.util.Arrays;

public class ProdutoControle {
	private ProdutoRepositorio repositorio = new ProdutoRepositorio(); 
	private Produto[] filtro;
	public boolean adicionar(String nome, double preco) {
		boolean resultado = false;
		if(nome != null && !"".equals(nome.trim()) && preco >= 0.01) {
			Produto produto = new Produto();
			produto.setNome(nome);
			produto.setPreco(preco);
			resultado = repositorio.inserirProduto(produto);
		}
		return resultado;
	}
	public Produto getProdutoAt(int i) {
		Produto[] produtos = repositorio.buscarTodos();
		Produto resultado = null;
		if(i > -1 && i < produtos.length) {
			resultado = produtos[i];
		}
		return resultado;
	}
	
	public Produto[] listarProdutos() {
		return repositorio.buscarTodos();
	}
	
	public Produto[] listarProdutosPorPrecoMinimo(double precoMinimo) {
		Produto[] lista = repositorio.buscarTodos();
		Produto[] listaComPrecoMinimo = new Produto[lista.length];
		int quantidade = 0;
		for(Produto produto: lista) {
			if(produto.getPreco() >= precoMinimo) {
				listaComPrecoMinimo[quantidade++] = produto;
			}
		}
		listaComPrecoMinimo = Arrays.copyOf(listaComPrecoMinimo, quantidade);
		return listaComPrecoMinimo;
	}
	
	public double somaProdutos() {
		double soma = 0;
		for (Produto produto: repositorio.buscarTodos()) {
			soma += produto.getPreco();
		}
		return soma;
	}
	
	public boolean removerProduto(int i) {
		return repositorio.remover(i);
	}
}
