package com.cursojava.aula61;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato 1", "1234-5678", "contato1@emai.com");
		int valor = 10;
		
		System.out.println(contato);
		System.out.println(valor);
		
	//	testePassagemValorReferencia(valor, contato);
		testePassagemValorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "2456-7890","contato2@email.com");
	}
	
	private static void testePassagemValorReferencia2(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato " + novoValor);
	}

}
