package br.com.cursojava.aula16;

public class App {

	public static void main(String[] args) {
		Funcionario funcio = new Funcionario();
		funcio.setCodigo("FUNC 001");
		funcio.setNome("João da Silva");
		funcio.setSalarioBase(1000);
		
		Vendedor vend = new Vendedor("VEND-0001", "Armed Morramed", 1000);
		vend.setPercentual(0.05);
		vend.setTotalVendas(100000);
		
		FolhaPagamento folha = new FolhaPagamento();
		folha.imprimirFolha(funcio);
		folha.imprimirFolha(vend);
		
		Funcionario f = new Vendedor();
		f.setCodigo("Codigo 132");
		f.setNome("Vendedor");
		f.setSalarioBase(1290);
		if(f instanceof Vendedor) {
			((Vendedor)f).setPercentual(0.10);
			((Vendedor)f).setTotalVendas(200000);
		}
		
		folha.imprimirFolha(f);
		
		/**Vendedor v = new Funcionario();
		v.setPercentual(10);
		Não funciona pois funcionario nao tem metodos da referencia vendedor
		**/
	}
}
