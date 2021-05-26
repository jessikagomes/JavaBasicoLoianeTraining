package com.cursojava.aula56exe;

public class Teste {

	public static void main(String[] args) {

		double x = 2;
		double y = 3;
		
		for(OperacoesMatematicas op : OperacoesMatematicas.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x,y));
		}
	}

}
