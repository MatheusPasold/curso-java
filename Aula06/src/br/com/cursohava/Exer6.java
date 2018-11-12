package br.com.cursohava;

public class Exer6 {
	
	public static void main(String[] args) {
		int num = 0;
		boolean primo = true;
		while(num <= 50) {
			int divisor = 2;
			primo = true;
			while(divisor <= num) {
				if(num % divisor == 0 && divisor != num) {
					primo = false;
					break;
				}
				divisor++;
			}
			if(primo) {
				System.out.println(num + ", ");
			}
			num++;
		}
		System.out.println(" ");
		System.out.println(" Fim da aplicação ");
	}

}