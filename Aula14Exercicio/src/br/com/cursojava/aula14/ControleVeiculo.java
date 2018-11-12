package br.com.cursojava.aula14;

import java.util.ArrayList;

public class ControleVeiculo {

	private RepositorioVeiculo repositorio = new RepositorioVeiculo();
	public boolean isMarcaModeloInvalido(String marca, String modelo) {
		boolean resultado = marca != null && !"".equals(marca.trim()) && marca.length() >= 3 && modelo != null && !"".equals(modelo.trim()) && modelo.length() >= 3;
		return resultado;
	}

	public boolean isPlacaInvalido(String placa) {
		boolean resultado = placa != null && placa.length() >= 7 && !"".equals(placa.trim());
		return resultado;
	}

	public boolean isAnosInvalidos(int af,int am) {
		boolean resultado = af >= 2000 && am > af;
		return resultado;
	}

	public boolean adicionarVeiculos(String marca, String modelo, String placa, int af, int am, String cor) {
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setPlaca(placa);
		veiculo.setAnoFabricacao(af);
		veiculo.setAnoModelo(am);
		veiculo.setCor(cor);
		return repositorio.adicionarVeiculo(veiculo);
	}

	public ArrayList<Veiculo> buscarTodos() {
		return repositorio.buscarTodos();
	}
	
	
}
