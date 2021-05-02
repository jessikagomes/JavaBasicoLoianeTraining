package com.cursojava.aula33exe;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrenteExer02 conta = new ContaCorrenteExer02(23458,0654,300.00,100.00,true);
		
		conta.depositarConta(50);
		System.out.println(conta.getSaldo());
		
		conta.sacarConta(30);
		System.out.println(conta.getSaldo());
	}

}
