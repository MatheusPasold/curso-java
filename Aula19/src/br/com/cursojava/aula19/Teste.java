package br.com.cursojava.aula19;

public class Teste {

	public static int atributoStatic;
	public int atributo;
	
	public void oi() {
		System.out.println("OI");
		System.out.println("Valor do atributo � " + atributo);
		System.out.println("Valor do atributo estatico � " + atributoStatic);
	}
	
	public static void hello() {
		System.out.println("HELLO");
		//vari�veis de inst�ncia n�o podem ser chamadas diretamente em um m�todo est�tico
		System.out.println("Valor do atributo estatico � " + atributoStatic);
	}
}
