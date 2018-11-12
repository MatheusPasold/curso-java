package br.com.cursojava.aula20.trabalho;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;


public class NumberFormatExemple {
	
	private static final double DOLAR = 0.26;

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		/*//Formatar sinalização por localidade
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		System.out.println(numberFormat.format(13.23));
		//Formatar moeda por localidade
		NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());  //para moedas
		System.out.println(moedaFormat.format(13.23));
		//Formatar para porcentagem
		NumberFormat porcentagem = NumberFormat.getPercentInstance();
		System.out.println(porcentagem.format(0.66));
		//Eliminação de casas decimais
		NumberFormat decimal = NumberFormat.getIntegerInstance();
		System.out.println(decimal.format(5.7));
		*/
		//Exemplo
		System.out.println("Digite um número: ");
		NumberFormat numberBrasil = NumberFormat.getNumberInstance(Locale.getDefault());
		double numero = Double.parseDouble(teclado.nextLine());
		System.out.println(numberBrasil.format(numero));
		
		System.out.println("Digite um valor: ");
		double valor = Double.parseDouble(teclado.nextLine());
		NumberFormat dolar = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Valor em dólar: " + dolar.format(valor*DOLAR));
		
		teclado.close();

    }
}
