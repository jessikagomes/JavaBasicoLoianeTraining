package com.cursojava.aula43exe;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public void saldo() {
	}
	
	public boolean sacar(double n) {
		if ((saldo - n) >= 0) {
			saldo -= n;
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}	
	}
	
	public void depositar(double n) {
		saldo += n;	
	}
	
	public ContaBancaria() {}
	
	public ContaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + 
				", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

}
