package com.cursojava.aula33exe;

public class ContaCorrenteExer02 {

	private int num, agencia;
	private double saldo, limite;
	private boolean especial;
	
	
	public ContaCorrenteExer02() {}

	
	public ContaCorrenteExer02(int num, int agencia, double saldo, 
			double limite, boolean especial) {
		this.num = num;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
		this.especial = especial;
	}

	public double depositarConta(double valor) {		
		return saldo = saldo + valor;	
	}
	
	public void sacarConta(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque no valor de R$ " + valor + " realizado com Sucesso!");
		} else {
			System.out.println("Você não tem saldo o suficiente. Seu saldo é: R$ " + saldo);
		}		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}	
	
}
