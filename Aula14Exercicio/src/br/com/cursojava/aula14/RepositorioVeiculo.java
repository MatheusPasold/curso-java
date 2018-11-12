package br.com.cursojava.aula14;

import java.util.ArrayList;

public class RepositorioVeiculo {

	Veiculo veiculo = new Veiculo();
	private static int count = 0;
	private static ArrayList<Veiculo> veiculos = new ArrayList<>();
	
	public boolean adicionarVeiculo(Veiculo veiculo) {
		boolean resultado = false;
		if(veiculo != null) {
			veiculo.setId(count++);
			resultado = veiculos.add(veiculo);
		}
		return resultado;
	}

	public ArrayList<Veiculo> buscarTodos() {
		return veiculos;
	}
}
