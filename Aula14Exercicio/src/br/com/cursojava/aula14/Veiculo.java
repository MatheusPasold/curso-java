package br.com.cursojava.aula14;

public class Veiculo {
	
	private Integer id;
	private String marca;
	private String modelo;
	private String placa;
	private int anoFabricacao;
	private int anoModelo;
	private String cor;
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return placa;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}

}
