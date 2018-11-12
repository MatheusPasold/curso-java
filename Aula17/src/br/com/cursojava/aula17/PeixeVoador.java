package br.com.cursojava.aula17;

public class PeixeVoador extends Peixe implements Voador{

	@Override
	public void voar() {
		System.out.println("Peixe Voador...");		
	}

}
