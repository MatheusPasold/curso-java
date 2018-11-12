package br.com.cursojava.aula17;

public class Delorian extends Carro implements Turbinar, Voador{

	@Override
	public void acionarTurbo() {
		System.out.println("Acionando turbo...");
	}

	@Override
	public void desligarTurbo() {
		System.out.println("Desligando turbo...");
		
	}

	@Override
	public void voar() {
		System.out.println("Delorian Voando...");
		
	}

}
