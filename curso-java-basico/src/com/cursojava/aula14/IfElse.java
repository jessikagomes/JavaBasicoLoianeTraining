package com.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >=18) {
			System.out.println("� maior de idade.");
		} else {
			System.out.println("N�o � maior de idade.");
		}

	}
		

}
