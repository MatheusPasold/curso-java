package br.com.cursojava;

import java.util.Arrays;

public class Cor2 {

	public static void main(String[] args) {
		int[][] tabela = {{100,200,150},{75,260,100},{150,200,250},{50,210,240}};
		int total = 0;
		int totalMeias = 0;
		int[] pecasMes = new int[tabela.length];
		int[] camisasCamisetaMes = new int[tabela.length];
		int[] maiorPorMes = new int[tabela.length];
		int meia = 0;
		
		
		for (int mes = 0; mes < tabela.length; mes++) {
			int maior = 0;
			for (int tipo = 0; tipo < tabela[mes].length; tipo++) {
				total += tabela[mes][tipo];
				pecasMes[mes] += tabela[mes][tipo];
				if(tabela[mes][tipo] > tabela[mes][maior]){
					maior = tipo;
				}
				if(tipo == meia){
					totalMeias+= tabela[mes][tipo];
				}else{
					camisasCamisetaMes[mes] += tabela[mes][tipo];
				}
			}
			maiorPorMes[mes] = maior;
		}
		
		System.out.println("Quantidade de peças vendidas: "+total);
		System.out.println("A quantidade de meias vendidas foi: "+totalMeias);
		System.out.println("Total de peças vendidas por mês");
		System.out.println(Arrays.toString(pecasMes));
		System.out.println("Total de Camisas + Camisetas vendidas por mês");
		System.out.println(Arrays.toString(camisasCamisetaMes));
		System.out.println("Produto mais vendido Mês a Mês");
		for (int i = 0; i < maiorPorMes.length; i++) {
			String nome = "";
			switch(maiorPorMes[i]){
			case 0:
				nome = "Meias";
				break;
			case 1:
				nome = "Camisas";
				break;
			case 2:
				nome = "Camisetas";
				break;
			}
			System.out.printf("mês %d => %s\n",i,nome);
			
		}
		
	}
}
