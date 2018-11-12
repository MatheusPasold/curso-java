package br.com.cursojava.aula15.trabalho;

import java.util.Scanner;

public class CadastroCliente {

	private static final int CAD = 1;
	private static final int LISTA = 2;
	private static final int FILTRO_TIPO = 3;
	private static final int FILTRO_CIDADE = 4;
	private static final int EXCLUIR = 5;
	private static final int SAIR = 6;
	private ControllerCliente controller = new ControllerCliente();
	
	public void menu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("--------------MENU PRINCIPAL---------------");
			System.out.println("1- Cadastrar Cliente");
			System.out.println("2- Listar clientes");
			System.out.println("3- Filtrar Cliente por Tipo");
			System.out.println("4- Filtrar Cliente por Cidade");
			System.out.println("5- Excluir Cliente");
			System.out.println("6- Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case CAD:
			cadastrarCliente(teclado);
			break;
		case LISTA:
			listarCliente();
			break;
		case FILTRO_TIPO:
			filtrarClienteTipo(teclado);
			break;
		case FILTRO_CIDADE:
			filtrarClienteCidade(teclado);
			break;
		case EXCLUIR:
			excluirCliente(teclado);
			break;
		case SAIR:
			System.out.println("Obrigado por usar nosso sistema");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

	// Filtrar por Cidade
	private void filtrarClienteCidade(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	// Exclusão de cliente
	private void excluirCliente(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	// Filtrar por tipo
	private void filtrarClienteTipo(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	// Listar Cliente
	private void listarCliente() {
		// TODO Auto-generated method stub
		
	}

	// Cadastro de cliente
	private void cadastrarCliente(Scanner teclado) {
		System.out.println("____________CADASTRAR CLIENTE___________");
		String nome;
		String 
		do {
			System.out.println("Digite o nome do cliente: ");
			nome = teclado.nextLine();
		}while (!controller.isNomeValido(nome));
		Endereco endereco;
		
		
	}





}
