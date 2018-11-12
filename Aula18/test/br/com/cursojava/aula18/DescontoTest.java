package br.com.cursojava.aula18;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DescontoTest {

	private Desconto desc;
	
	@Before
	public void antes() {
		desc = new Desconto();
	}
	
	@Test
	public void negativo() {
		double resultado =  desc.valorNegativo(-10);
		Assert.assertEquals(0, resultado, 0);
	}
	
	@Test
	public void valorAteMilOitocentos() {
		double resultado =  desc.valorPositivo(1800);
		Assert.assertEquals(1800, resultado, 0);
	}
	
	@Test
	public void minimoValorPositivoAteDoisMilEQuatrocentos() {
		double resultado =  desc.valorPositivoMilOitocentos(1800.01);
		Assert.assertEquals(1710.00, resultado, 0);
	}
	
	@Test
	public void maximoValorPositivoAteDoisMilEQuatrocentos() {
		double resultado =  desc.valorPositivoMilOitocentos(2400);
		Assert.assertEquals(2280.0, resultado, 0);
	}
	
	@Test
	public void minimoValorPositivoAteTresMilQuinhentosENoventaENove() {
		double resultado =  desc.valorPositivoDoisQuatrocentos(2400.01);
		Assert.assertEquals(1872.01, resultado, 0);
	}
	
	@Test
	public void maximoPositivoAteTresMilQuinhentosENoventaENove() {
		double resultado =  desc.valorPositivoDoisQuatrocentos(3599.99);
		Assert.assertEquals(2807.99, resultado, 0);
	}
	
	@Test
	public void minimoPositivoAcimaTreSeicentos() {
		double resultado =  desc.valorPositivoTresMilSeicentos(3600.01);
		Assert.assertEquals(2448.00, resultado, 0);
	}
	
	@Test
	public void positivoAcimaTreSeicentos() {
		double resultado =  desc.valorPositivoTresMilSeicentos(10000.00);
		Assert.assertEquals(6800.00, resultado, 0);
	}
}
