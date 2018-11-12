package br.com.cursojava.aula11;

public class Produto {

	private String nome;
	private double preco;
	private boolean promocao;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco) {
		if(preco >= 0.01) {
			this.preco = preco ;
		}else {
			System.out.println("Valor inválido para o produto");
		}
	}
	public double getPreco() {
		return preco; 
	}
	
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	public boolean isPromacao() {
		return promocao;
	}
	
	
}
