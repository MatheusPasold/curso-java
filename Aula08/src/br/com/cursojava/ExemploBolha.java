package br.com.cursojava;

import java.util.Arrays;

public class ExemploBolha {
	
	public static void main(String[] args) {
		int[] num = {3,2,5,1,4};
		int temp = 0;
		for(int i = 0; i < num.length -1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		}
	}