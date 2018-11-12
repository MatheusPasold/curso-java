package br.com.cursojava.aula29;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements RepositorioContato{

	@Override
	public List<Contato> buscarTodos() {
		List<Contato> contatos = new ArrayList<>();
		try {
			Connection connection = bancoUtils.getConnection();
			PreparedStatement comando = connection.prepareStatement("select * from contatos");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				contatos.add(carregarContato(cursor));
			}
			comando.close();
			cursor.close();
		} catch (SQLException e) {
			System.out.println("Não possível buscar no banco de dados!");
		} 
		return contatos;
	}

	private Contato carregarContato(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		return new Contato(id, nome, email, telefone);
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {
		List<Contato> contatos = new ArrayList<>();
		if(nome != null) {
		try {
			Connection connection = bancoUtils.getConnection();
			PreparedStatement comando = connection.prepareStatement("select * from contatos where upper(nome) upper(?)");
			comando.setString(1,"%"+ nome+ "%");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				contatos.add(carregarContato(cursor));
			}
		} catch (SQLException e) {
			System.out.println("Não possível buscar o nome no banco de dados!");
		}
		}
		return contatos;
	}

	@Override
	public Contato buscarPorTelefone(String telefone) {
		Contato contatos = null;
		try {
			Connection connection = bancoUtils.getConnection();
			PreparedStatement comando = connection.prepareStatement("select * from contatos where telefone = ?");
			comando.setString(1, telefone);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				contatos = carregarContato(cursor);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possível buscar por telefone no banco de dados");
		}
		return contatos;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		Contato contatos = null;
		try {
			Connection connection = bancoUtils.getConnection();
			PreparedStatement comando = connection.prepareStatement("select * from contatos where id = ?");
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				contatos = carregarContato(cursor);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possível buscar por id no banco de dados");
		}
		return contatos;
	}

	@Override
	public void inserir(Contato contato) {
		if(contato != null) {
			try {
				Connection conexao = bancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("insert into contatos(nome, email, telefone) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if(cursor.next()) {
					Integer id = cursor.getInt("id");
					contato.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível inserir os dados da Pessoa");
			}
		}
	}

	@Override
	public void atualizar(Contato contato) {
		if(contato != null && contato.getId() != null) {
			try {
				Connection conexao = bancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("update pessoas set nome = ? where email = ? where telefone = ?");
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.executeUpdate();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível atualizar");
			}
		}
		
	}

	@Override
	public void remover(Integer id) {
		if(id != null) {
			try {
				Connection conexao = bancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("delete from pessoas where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível remover os dados da Pessoa");
			}
		
		}
		
	}

	@Override
	public int contar(Contato contato) {
		int quantidade = 0;
		try {
			Connection connection = bancoUtils.getConnection();
			PreparedStatement comando = connection.prepareStatement("select count(*) as quantidade from contatos");
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
			comando.close();
		}catch (SQLException e) {
			System.out.println("Não foi possível contar a quantidade de contatos");
		}
		
		return quantidade;
	}

}
