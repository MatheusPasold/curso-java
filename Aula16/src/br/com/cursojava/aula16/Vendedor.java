package br.com.cursojava.aula16;

public class Vendedor extends Funcionario{

	private double percentual;
	private double totalVendas = 10;
	{
		System.out.println("Oi eu sou o Goku");
	}
	
	public Vendedor() {
	}
	
	public Vendedor(String codigo, String nome, double salarioBase) {
		super(codigo, nome, salarioBase); //Ou super();
		System.out.println("Primeira linha depois do super");
		System.out.println(totalVendas);
	}
	
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual > 1 ? percentual/100 : percentual;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	@Override
	public double salarioLiquido() {
		double acresimo = 0;
		if(totalVendas >= 20000) {
			acresimo = totalVendas * getPercentual();
		}
		double salario = (getSalarioBase() + acresimo) * (1 - 0.11);
		return salario;
	}
	
	public double salarioLiquido(int desconto) {
		return salarioLiquido();
	}
}