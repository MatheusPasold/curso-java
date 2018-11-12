package br.com.cursojava.aula18;

public class Desconto {

	public double valorNegativo(double i) {
		return 0;
	}

	public double valorPositivoMilOitocentos(double i) {
		double v = 0;
		if(i > 1800.00 && i < 2400.01) {
			v = i - (i * 0.05);
		}
		return v;
		
	}

	public double valorPositivoDoisQuatrocentos(double d) {
		double v = 0;
		if(d > 2400 && d < 3600) {
			v = d - (d * 0.22);			
		}
			return v;
	}

	public double valorPositivoTresMilSeicentos(double d) {
		if(d > 3600) {
			return d - (d * 0.32);			
		}else {
			return 0;
		}
	}

	public double valorPositivo(double i) {
		if(i <= 1800) {
			return i;
		}else {
			return 0;
		}
		
	}

	
}
