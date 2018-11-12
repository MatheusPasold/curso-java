package br.com.cursojava.aula20.trabalho;

import java.util.Calendar;

public class CalendarExemple {
		 
		    public static void main(String[] args) {
		        Calendar c = Calendar.getInstance();
		        System.out.println("Data e Hora de agora:" + c.getTime());
		        System.out.println("Data e Hora de agora: "+c.getTime());
		        System.out.println("Ano: "+c.get(Calendar.YEAR));
		        System.out.println("Mês: "+c.get(Calendar.MONTH));
		        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
		        c.set(Calendar.YEAR, 1995); //Personalização do Ano
		        c.set(Calendar.MONTH, Calendar.MARCH); //Personalização do Mês
		        c.set(Calendar.DAY_OF_MONTH, 20); //Personalização do Dia
		        System.out.println("Ano: "+c.get(Calendar.YEAR));
		        System.out.println("Mês: "+c.get(Calendar.MONTH));
		        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
		        int hora = c.get(Calendar.DAY_OF_MONTH);
		        
		        if (hora > 6 && hora < 12) {
					System.out.println("Bom Dia");
				} else if (hora > 12 && hora < 18) {
					System.out.println("Boa Tarde");
				} else {
					System.out.println("Boa Noite");
				}

		        
		}

}
