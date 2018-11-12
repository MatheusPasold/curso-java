package br.com.cursohava;

public class Exer06 {
	
	public static void main(String[] args) {
		int num = 0;
		boolean primo = true;
		do {
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
		}while(num <= 50);
		
		System.out.println(" ");
		System.out.println(" Fim da aplicação ");
	}

}
