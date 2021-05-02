package com.cursojava.aula33exe;

public class Exer01 {

	public static void main(String[] args) {

		LampadaExer01 lampada = new LampadaExer01(7,3,"Amarela","A60",true);

		lampada.desligar();
		lampada.ligar();
		
		System.out.println(lampada.getGarantia());
		System.out.println(lampada.getCor());
		System.out.println(lampada.getModelo());
		System.out.println(lampada.getPotencia());
		System.out.println(lampada.isLigada());

	}

}
