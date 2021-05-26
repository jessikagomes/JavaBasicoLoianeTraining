package com.cursojava.aula56exe;

public enum OperacoesMatematicas {
	
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x+y;
		}
	},SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
		}
	},MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x*y;
		}
	},DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x/y;
		}
	};

	private String simbolo;

	OperacoesMatematicas(String simbolo) {
		this.simbolo = simbolo;
	}

	public abstract double executarOperacao(double x, double y);

	public String toString() {
		return this.simbolo;
	}

}
