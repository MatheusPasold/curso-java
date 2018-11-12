package br.com.cursojava.aulaembratel;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ExemploExcessaoChecada {

	public static void main(String[] args) {
		boolean ok = usaImprimirRange();
		if(ok) {
			System.out.println("Range impresso com sucesso");
		}
	}
	
	private static boolean usaImprimirRange() {
		boolean ok = true;
		int inicio = 11;
		int fim = 10;
		try {
			imprimirRange(inicio, fim);
			return ok;
		}catch(RangeInvalidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Fiz alguns tratamentos");
			ok = false;
			return ok;
			//throw new RuntimeException(e);
		}finally {
			System.out.println("finally executado");
		}
		
	}
	
	private static void imprimirRange(int inicio, int fim) throws RangeInvalidoException{
		if(fim <= inicio) {
			throw new RangeInvalidoException("Fim deve ser maior que o início");
		}else {
			for(int i = inicio; i <= fim; i++) {
				System.out.printf("%d ", i);
			}
			System.out.println("");
		}
	}
}
