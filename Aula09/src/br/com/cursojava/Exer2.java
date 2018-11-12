package br.com.cursojava;

import java.util.Arrays;

public class Exer2 {
	
	public static void main(String[] args) {
		int[][] venda = new int[4][3];
		int pecas = 0;
		int meias = 0;
		int contaMes = 0;
		int camisasCamisetas = 0;
		int[] mesAmes = new int[4];
		int[] maisV = new int[4];
		int mais = 0;
		
		venda[0][0] = 100;
		venda[0][1] = 200;
		venda[0][2] = 150;
		venda[1][0] = 75;
		venda[1][1] = 260;
		venda[1][2] = 100;
		venda[2][0] = 150;
		venda[2][1] = 200;
		venda[2][2] = 250;
		venda[3][0] = 50;
		venda[3][1] = 210;
		venda[3][2] = 240;
		
		for(int i = 0; i < venda.length; i++) {
			for(int j = 0; j < venda[i].length; j++) {
				//coletar por mes
				contaMes += venda[i][j];
				if(j == 0) {
					meias += venda[i][j];
				}
				pecas += venda[i][j];
				if(j != 0) {
					camisasCamisetas += venda[i][j];
				}
				
			}
			mesAmes[i] = contaMes;
			contaMes = 0;
		}
		
		//A quantidade de peças vendidas
		System.out.println("A quantidade de peças vendidas foi de: " + pecas);
		//A quantidade de meias vendidas;
		System.out.println("A quantidade de meias vendidas foi de: "+ meias);
		//A quantidade de peças vendidas mês a mês;
		System.out.println(Arrays.toString(mesAmes));
		//A quantidade de camisas vendidas + a quantidade de camisetas vendidas mês a mês;
		
		//O tipo de peça mais vendida em cada mês;
		
		
	}

}
