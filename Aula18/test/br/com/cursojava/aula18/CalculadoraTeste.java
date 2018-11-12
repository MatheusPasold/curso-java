package br.com.cursojava.aula18;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraTeste {
	private Calculadora calc;
	
	@Before
	public void antesDeCadaTeste() {
		calc = new Calculadora();
	}
	
	@After
	public void depoisDeCadaTest() {
		System.out.println("Terminou mais um teste");
	}

	@Test
	public void testSomarDoisMaisDois() {
		double resultado = calc.somar(2.0, 2.0);
		Assert.assertEquals(4.0, resultado, 0);
	}
	
	@Test
	public void testeSomarDoisMaisTres() {
		double resultado = calc.somar(2.0, 3.0);
		Assert.assertEquals(5.0, resultado, 0);
		
	}
	
	@Test
	public void testeSomarCincoMaisVinte() {
		double resultado = calc.somar(5.0, 20.0);
		Assert.assertEquals(25.0, resultado, 0);
		
	}
	
	@Test
	public void testeSubtraiDoisComDois() {
		double resultado = calc.subtrair(2.0, 2.0);
		Assert.assertEquals(0.0, resultado, 0);	
	}
	
	@Test
	public void testeSubtraiDoisComTres() {
		double resultado = calc.subtrair(2.0, 3.0);
		Assert.assertEquals(-1.0, resultado, 0);
	}
	
	@Test
	public void testeSubtraiSeisComQuatro() {
		double resultado = calc.subtrair(6.0, 4.0);
		Assert.assertEquals(2.0, resultado, 0);
	}
	
}
