package com.cursojava.aula35;

public class TesteRecursivo {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(Recursivo.fibonacci(i) + " ");
		}
		System.out.println();
		
		System.out.println(Recursivo.somatorio(5));
	}

}
