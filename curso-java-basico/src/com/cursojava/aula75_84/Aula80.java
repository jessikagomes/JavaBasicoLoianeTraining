package com.cursojava.aula75_84;

public class Aula80 {

	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		System.out.println(teste);
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10,15));//indice fim não é inclusivo
		
		String espacos = "i s p a ç o";
		System.out.println(espacos);
		String espacosCorrigido = espacos.replace('i', 'E');
		System.out.println(espacosCorrigido);
		espacosCorrigido = espacosCorrigido.replaceAll(" ", "");
		System.out.println(espacosCorrigido);
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());





		
	}

}
