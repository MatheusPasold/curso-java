package br.com.cursojava.aula15.trabalho;

public class ControllerCliente {
	
	private RepositorioCliente repositorio = new RepositorioCliente();
	
	public boolean adicionarCliente(String nome, String email, String telefone, Endereco endereco, String tipo) {
		Cliente clientes = new Cliente();
		clientes.setNome(nome);
		clientes.setEmail(email);
		clientes.setTelefone(telefone);
		clientes.setEndereco(endereco);
		clientes.setTipo(tipo);
		return repositorio.adicionar(clientes);
	}

	public boolean isNomeValido(String nome) {
		boolean resultado = (nome != null && !"".equals(nome.trim()) && nome.length() >= 3);
		return resultado;
	}

}
