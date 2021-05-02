package com.cursojava.aula43exe;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public void saldo() {
		double saldo = super.getSaldo();
		saldo = saldo - limite;
	}

	public boolean sacar(double n) {
		double saldoComLimite = super.getSaldo() + limite;
		if ((saldoComLimite - n) >= 0) {
			this.setSaldo(this.getSaldo() - n);
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", getLimite()=" + getLimite() + ", getNomeCliente()="
				+ getNomeCliente() + ", getNumConta()=" + getNumConta() + ", getSaldo()=" + getSaldo() + "]";
	}

}
