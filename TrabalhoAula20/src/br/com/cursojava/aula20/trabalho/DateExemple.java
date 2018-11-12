package br.com.cursojava.aula20.trabalho;
import java.util.Date;

public class DateExemple {
	    public static void main(String[] args) {
	        Date data = new Date();
	        System.out.println(data.getTime());
	        System.out.println("Data de Hoje: "+ data);
	        data = new Date(2018, 10, 8);
	        System.out.println(data);
	        System.out.println(data.getDate());
	        }
	
}
