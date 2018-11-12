package br.com.cursohava;

public class OperadoresCompostos {
	
	public static void main(String[] args) {
		
		/*
		 * operadores compostos
		 * +=
		 * -=
		 * *=
		 * %=
				 
		 */
		
		System.out.println("_______(+=)____________");
		int num = 10;
		int num2 = 5;
		num += num2;
		System.out.println(num);
		
		System.out.println("_______(+=)____________");
		num -= num2;
		System.out.println(num);
		
		System.out.println("_______(*=)____________");
		num *= num2;
		System.out.println(num);
		
		System.out.println("_______(/=)____________");
		num /= num2;
		System.out.println(num);
		
		System.out.println("_______(%=)____________");
		num %= num2;
		System.out.println(num);
		
		int n1 = 10;
		n1 *= 2 + 8; // n1 = n1 * (2 + 8)
		System.out.println(n1);
	}

}
