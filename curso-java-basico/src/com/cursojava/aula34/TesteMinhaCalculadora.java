package com.cursojava.aula34;

public class TesteMinhaCalculadora {

	public static void main(String[] args) {

		System.out.println("Valor da adição é " + MinhaCalculadora.soma(2, 3));
		System.out.println("Valor da divisão é " + MinhaCalculadora.dividir(2, 3));
		System.out.println("Valor da multiplicação é " + MinhaCalculadora.multiplicar(2, 3));
		System.out.println("Valor da subtração é " + MinhaCalculadora.subtrair(2, 3));
		System.out.println("Valor fatorial é " + MinhaCalculadora.fatorial(5));
		System.out.println("Valor da potencia é " + MinhaCalculadora.potencia(3));

	}

}
