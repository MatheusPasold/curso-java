package br.com.cursojava.aula14;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculo {

	private static final int CAD = 1;
	private static final int LIST = 2;
	private static final int PM = 3;
	private static final int PMO = 4;
	private static final int PP = 5;
	private static final int PAF = 6;
	private static final int REMOV = 7;
	private static final int SAIR = 8;
	private ControleVeiculo controle = new ControleVeiculo();
	//Menu Pricipal
	
	public void menu (Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("###########CADASTRO DE VEÍCULO##########");
			System.out.println("1- Cadastrar novo veículo");
			System.out.println("2- Listar Veículos");
			System.out.println("3- Pesquisar veículo(Marca)");
			System.out.println("4- Pesqusiar veículo(Modelo)");
			System.out.println("5- Pesquisar veículo(Placa)");
			System.out.println("6- Pesquisar veículo(Ano de Fabricação)");
			System.out.println("7- Remover Veículo");
			System.out.println("8- Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		}while (opcao != SAIR);
	}
	private void tratarOpcao(int opcao,Scanner teclado) {
		switch(opcao) {
		case CAD:
			cadastrarVeiculo(teclado);
			break;
		case LIST:
			listarVeiculos();
			break;
		case PM:
			pesquisarPorMarca(teclado);
			break;
		case PMO:
			
			break;
		case PP:
			
			break;
		case PAF:
			
			break;
		case REMOV:
			
			break;
		case SAIR:
			System.out.println("Obrigado por usar nosso Sistema");
			break;
		default:
			System.out.println("Número Inválido");
			break;
		}
		
	}
	//Pesquisar veículos por marca
	private void pesquisarPorMarca(Scanner teclado) {
		ArrayList<Veiculo> veiculos = controle.buscarTodos();
		
	}
	
	//Listagem de todos os veículos
	private void listarVeiculos() {
		ArrayList<Veiculo> veiculos = controle.buscarTodos();
		System.out.println("_____________LISTA DE VEÍCULOS_____________");
		for(Veiculo veiculo: veiculos) {
			System.out.printf("%d - %s - %s - %s - %d - %d - %s \n", veiculo.getId(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca(), veiculo.getAnoFabricacao(), veiculo.getAnoModelo(), veiculo.getCor());
		}
	}
	//Cadastrar Novo Veículo
	private void cadastrarVeiculo(Scanner teclado) {
		System.out.println("_____________CADASTRAR VEÍCULO_____________");
		String marca;
		String modelo;
		do {
		System.out.println("Digite a marca: ");
		marca = teclado.nextLine();
		System.out.println("Digite o modelo: ");
		modelo = teclado.nextLine();
		}while(!controle.isMarcaModeloInvalido(marca, modelo));
		String placa;
		do {
			System.out.println("Digite a placa: ");
			placa = teclado.nextLine();
		}while(!controle.isPlacaInvalido(placa));
		int af = 0;
		int am = 0;
		do {
			System.out.println("Digite o ano de fabricação: ");
			af = Integer.parseInt(teclado.nextLine());
			System.out.println("Digite o ano do Modelo: ");
			am = Integer.parseInt(teclado.nextLine());
		}while(!controle.isAnosInvalidos(af, am));
		String cor;
		System.out.println("Digite a cor: ");
		cor = teclado.nextLine();
		boolean ok = controle.adicionarVeiculos(marca, modelo, placa, af, am, cor);
		
		if(ok) {
			System.out.println("Veículo adicionado com sucesso");
		}else {
			System.out.println("Erro ao adicionar o veículo");
		}
		
	}
	
	
	//Pesquisar veículos por modelo
	
	//Pesquisar veículo por placa
	
	//Pesquisar veículo por ano de fabricação 
	
	//Remover veículos
}
