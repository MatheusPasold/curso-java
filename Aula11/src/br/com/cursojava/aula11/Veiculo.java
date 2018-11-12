package br.com.cursojava.aula11;

public class Veiculo {

	String marca;
	String modelo;
	String cor;
	String anofab;
	String anomod;
	
	void configuraMarca(String marca) {
		this.marca = marca;
	}
	String retornaMarca() {
		return marca;
	}
	
	void configuraModelo(String modelo) {
		this.modelo = modelo;
	}
	String retornaModelo() {
		return modelo;
	}
	
	void configuraCor(String cor) {
		this.cor = cor;
	}
	String retornaCor() {
		return cor;
	}
	
	void configuraAnoFabricacao(String anofab) {
		this.anofab = anofab;
	}
	String retornaAnoFabricacao() {
		return anofab;
	}
	
	void configuraAnoModelo(String anomod) {
		this.anomod = anomod;
	}
	String retornaAnoModelo() {
		return anomod;
	}
	
}
