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
			System.out.println("###########CADASTRO DE VE�CULO##########");
			System.out.println("1- Cadastrar novo ve�culo");
			System.out.println("2- Listar Ve�culos");
			System.out.println("3- Pesquisar ve�culo(Marca)");
			System.out.println("4- Pesqusiar ve�culo(Modelo)");
			System.out.println("5- Pesquisar ve�culo(Placa)");
			System.out.println("6- Pesquisar ve�culo(Ano de Fabrica��o)");
			System.out.println("7- Remover Ve�culo");
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
			System.out.println("N�mero Inv�lido");
			break;
		}
		
	}
	//Pesquisar ve�culos por marca
	private void pesquisarPorMarca(Scanner teclado) {
		ArrayList<Veiculo> veiculos = controle.buscarTodos();
		
	}
	
	//Listagem de todos os ve�culos
	private void listarVeiculos() {
		ArrayList<Veiculo> veiculos = controle.buscarTodos();
		System.out.println("_____________LISTA DE VE�CULOS_____________");
		for(Veiculo veiculo: veiculos) {
			System.out.printf("%d - %s - %s - %s - %d - %d - %s \n", veiculo.getId(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca(), veiculo.getAnoFabricacao(), veiculo.getAnoModelo(), veiculo.getCor());
		}
	}
	//Cadastrar Novo Ve�culo
	private void cadastrarVeiculo(Scanner teclado) {
		System.out.println("_____________CADASTRAR VE�CULO_____________");
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
			System.out.println("Digite o ano de fabrica��o: ");
			af = Integer.parseInt(teclado.nextLine());
			System.out.println("Digite o ano do Modelo: ");
			am = Integer.parseInt(teclado.nextLine());
		}while(!controle.isAnosInvalidos(af, am));
		String cor;
		System.out.println("Digite a cor: ");
		cor = teclado.nextLine();
		boolean ok = controle.adicionarVeiculos(marca, modelo, placa, af, am, cor);
		
		if(ok) {
			System.out.println("Ve�culo adicionado com sucesso");
		}else {
			System.out.println("Erro ao adicionar o ve�culo");
		}
		
	}
	
	
	//Pesquisar ve�culos por modelo
	
	//Pesquisar ve�culo por placa
	
	//Pesquisar ve�culo por ano de fabrica��o 
	
	//Remover ve�culos
}
