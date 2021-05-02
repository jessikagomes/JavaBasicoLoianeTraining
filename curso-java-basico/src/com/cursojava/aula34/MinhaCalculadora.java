package com.cursojava.aula34;

public class MinhaCalculadora {
	
	public static int soma(int n1,int n2) {
		return n1 + n2;
	}
	
	public static int subtrair(int n1,int n2) {
		return n1 - n2;
	}
	
	public static int multiplicar(int n1,int n2) {
		return n1 * n2;
	}
	
	public static int dividir(int n1,int n2) {
		return n1 / n2;
	}
	
	public static int fatorial(int n1) {
		
		if (n1==0) {
			return 1;
		}
		int total = 1;
		for(int i=n1; i > 1; i--) {
			total *=i;
		}
		return total;
	}
	
	public static int potencia(int n1) {
		int total = 1;
		for(int i = 1; i <=2; i++) {
			total += n1;
		}
		return total;
	}
}

