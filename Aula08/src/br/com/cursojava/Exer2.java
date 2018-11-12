package br.com.cursojava;

public class Exer2 {

	public static void main(String[] args) {
		int[] num = { 1, 3, 2 };
		
		for(int atual: num) {
			System.out.print(atual + ", ");
		}
		
		int temp = 0;
		for (int i = 0; i < num.length -1; i++) {
			temp = num[i];
			num[i] = num[i+1];
			num[i+1] = temp;
		}
		System.out.println("");
		for(int atual: num) {
			System.out.print(atual + ", ");
		}
	}
}