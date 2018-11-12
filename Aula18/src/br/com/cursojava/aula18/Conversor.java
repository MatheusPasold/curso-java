package br.com.cursojava.aula18;

public class Conversor {

	public double converteCpF(double d) {
		return 1.8 * d + 32;
	}

	public double converteFpC(double d) {
		return (d - 32) / 1.8;
	}
	
	

}
