package com.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(1,2,3,4,5,6));

	}

	static int soma(Integer... vetor) {
		int total = 0;
		
		for (int i=0; i<vetor.length; i++) {
			total += vetor [i];
		}
		return total;
	}
}
