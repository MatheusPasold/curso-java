package br.com.cursojava.aula18;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorTest {
	private Conversor con;
	
	@Before
	public void Antes() {
		con = new Conversor();
	}
	
	@Test
	public void CincoCelsiusParaFareh() {
		double resultado = con.converteCpF(1.0);
		Assert.assertEquals(41, resultado, 0);
	}
	
	@Test
	public void FarehParaCelsius() {
		double resultado = con.converteFpC(68.0);
		Assert.assertEquals(20, resultado, 0);
	}
}
