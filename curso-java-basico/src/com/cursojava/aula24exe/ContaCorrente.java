package com.cursojava.aula24exe;

public class ContaCorrente {
	
	int num, agencia;
	double saldo, limite;
	boolean especial;
	
	double depositarConta(double valor) {		
		return saldo = saldo + valor;	
	}
	
	void sacarConta(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque no valor de R$ " + valor + " realizado com Sucesso!");
		} else {
			System.out.println("Você não tem saldo o suficiente. Seu saldo é: R$ " + saldo);
		}		
	}
	
	void consultarSaldo() {
		System.out.println("Seu saldo atual é R$"+ saldo);
	}
	
}
