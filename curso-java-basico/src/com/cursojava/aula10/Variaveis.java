package com.cursojava.aula10;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite seu nome completo: ");
			String nomeCompleto = scan.nextLine();
			System.out.println(nomeCompleto);
			
			System.out.println("Digite seu primeiro nome: ");
			String primeiroCompleto = scan.next();
			System.out.println(primeiroCompleto);
			
			System.out.println("Digite sua idade: ");
			int idade = scan.nextInt();
			System.out.println("Sua idade é: "  + idade);
			
			System.out.println("Digite sua altura: ");
			double altura = scan.nextDouble();
			System.out.println("Sua altura é: "  + altura);
			
			
			int a = 5;
			System.out.println(a);
			System.out.println(++a);
			System.out.println(a);
			
	}

}
