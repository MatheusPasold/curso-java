package br.com.cursojava.lamb;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploComparacaoComLambda {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("p1", 2.00));
		produtos.add(new Produto("p2", 3.00));
		produtos.add(new Produto("p3", 7.00));
		produtos.add(new Produto("p4", 1.00));
		produtos.add(new Produto("p5", 5.00));
		System.out.println(produtos);
		Collections.sort(produtos);
		System.out.println(produtos);
		
		/*produtos.sort((o1, o2) -> {
			if(o1 != null) {
				if(o2 != null) {
					return Double.compare(o1.getPreco(), o2.getPreco());
				}else {
					return -1;
				}
			}
			return 1;
		});*/
		
		produtos.sort((o1, o2) -> {
			if(o1 != null) {
				if(o2 != null) {
					return Double.compare(o2.getPreco(), o1.getPreco());
				}else {
					return -1;
				}
			}
			return 1;
		});
		System.out.println(produtos);
	}
}
