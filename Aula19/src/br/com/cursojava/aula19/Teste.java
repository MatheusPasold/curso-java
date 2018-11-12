package br.com.cursojava.aula19;

public class Teste {

	public static int atributoStatic;
	public int atributo;
	
	public void oi() {
		System.out.println("OI");
		System.out.println("Valor do atributo é " + atributo);
		System.out.println("Valor do atributo estatico é " + atributoStatic);
	}
	
	public static void hello() {
		System.out.println("HELLO");
		//variáveis de instância não podem ser chamadas diretamente em um método estático
		System.out.println("Valor do atributo estatico é " + atributoStatic);
	}
}
