package br.com.cursojava.aula15.trabalho;

import java.util.ArrayList;

public class RepositorioCliente {
	
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private static int count = 0;

	public boolean adicionar(Cliente cliente) {
		boolean resultado = false;
		if(cliente != null) {
			cliente.setId(count++);
			resultado = clientes.add(cliente);
		}
		return resultado;
		
	}
}
