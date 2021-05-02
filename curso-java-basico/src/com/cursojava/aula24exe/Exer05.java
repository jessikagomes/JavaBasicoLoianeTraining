package com.cursojava.aula24exe;

public class Exer05 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.agencia = 0254;
		conta.num = 12456-4;
		conta.especial = true;
		conta.limite = 500;
		conta.saldo = -10;
		
		conta.depositarConta(50);
		conta.consultarSaldo();
		
		conta.sacarConta(30);
		conta.consultarSaldo();

	}

}
