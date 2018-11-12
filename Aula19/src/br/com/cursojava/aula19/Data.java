package br.com.cursojava.aula19;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Data {

		public static void main(String[] args) throws ParseException {
			//Formatar sinalização por localidade
			NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
			System.out.println(numberFormat.format(13.23));
			//Formatar Cifrão por localidade
			NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());  //para moedas
			System.out.println(moedaFormat.format(13.23));
			//Formatar para porcentagem
			NumberFormat porcentagem = NumberFormat.getPercentInstance();
			System.out.println(porcentagem.format(0.66));
			//Eliminação de casas decimais
			NumberFormat decimal = NumberFormat.getIntegerInstance();
			System.out.println(decimal.format(5.7));

	    }
	}

