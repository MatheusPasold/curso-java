package br.com.cursojava.aula22;

import java.util.HashSet;
import java.util.Iterator;

public class ExempleHashSet {

	public static void main(String[] args) {
		HashSet<String> dset = new HashSet<String>();
		dset.add("Maria");
		dset.add("Pedro");
		dset.add("Zé");
		dset.add("Joana");
		dset.add("Marcos");
		System.out.println(dset);
		dset.remove("Maria");
		System.out.println(dset);
		dset.clone();
		System.out.println(dset);
		dset.clear();
		System.out.println(dset);
	}
}
