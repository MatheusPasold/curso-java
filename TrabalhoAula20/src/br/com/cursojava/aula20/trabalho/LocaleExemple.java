package br.com.cursojava.aula20.trabalho;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleExemple {

	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();

		Locale brasil = new Locale("pt", "BR");
		Locale eua = Locale.US;
		Locale germany = Locale.GERMANY;
		Locale china = Locale.CHINA;

		DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println("Data e hora brasileira:" + f2.format(data));

		DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, eua);
		System.out.println("Data e hora americana:" + f3.format(data));

		DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, germany);
		System.out.println("Data e hora alemã:" + f4.format(data));
		
		DateFormat f5 = DateFormat.getDateInstance(DateFormat.FULL, china);
		System.out.println("Data e hora chinesa:" + f5.format(data));

		
	}

}
