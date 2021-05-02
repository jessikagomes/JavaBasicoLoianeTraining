package com.cursojava.aula43exe;

public class TesteContaBancaria {

	public static void main(String[] args) {

		ContaPoupanca contPoup = new ContaPoupanca();
		ContaEspecial contEsp = new ContaEspecial();
		
		contPoup.setSaldo(200.00);
		contPoup.setNomeCliente("Joao");
		contPoup.setNumConta("0800");	
		contPoup.depositar(300);
		contPoup.sacar(50);
		contPoup.setDiaRendimento(27);
		contPoup.calcularNovoSaldo(0.5);
		System.out.println(contPoup);

		System.out.println("------------");

		//contEsp.setSaldo(200);		
		contEsp.setNomeCliente("Maria");
		contEsp.setNumConta("0700");
		contEsp.setLimite(300);
		contEsp.depositar(55);
		contEsp.sacar(50);
		System.out.println(contEsp + "Saldo com limite: " + (contEsp.getSaldo() + contEsp.getLimite()));
		

	}

}
