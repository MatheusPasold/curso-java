package br.com.cursojava.aula20.trabalho;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatExemple {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		Date data = calendar.getTime();
		System.out.println("Data sem formatação: " + data);

		// Formata a data
		DateFormat dataFormatada = DateFormat.getDateInstance();
		System.out.println("Data com formatação: " + dataFormatada.format(data));
		SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String data2 = "08/10/2018 13:00:00";
		Date recebeDataFormatada = null;  
		try{  
			recebeDataFormatada = df2.parse(data2);  
		}catch(ParseException e) {  
		    e.printStackTrace();
		}  
		System.out.println(recebeDataFormatada); 
	}

}
