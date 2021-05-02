package com.cursojava.aula35;

public class Recursivo {

	public static int fatorialnaoRecursivo(int n1) {

		if (n1 == 0) {
			return 1;
		}
		int total = 1;
		for (int i = n1; i > 1; i--) {
			total *= i;
		}
		return total;
	}

	/*
	 * fatorial(5) = 5 * fatorial(4) fatorial(4) = 4 * fatorial(3) fatorial(3) = 3 *
	 * fatorial(2) fatorial(2) = 2 * fatorial(1) fatorial(1) = 1 * fatorial(0)
	 * fatorial(0) = 1;
	 */

	public static int fatorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fatorial(num - 1);
	}

	public static int fibonacci(int num) {
		if (num < 2) {
			return 1;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static int somatorio(int num){
		if(num==1) {
			return 1;
		}	
		return num + somatorio(num-1);	
	}

}
