package com.cursojava.aula50;

import java.util.Scanner;

public class Trows {

	public static void main(String[] args) {
		System.out.println("Entre com um numero decimal");
		try {
			double num = lerNumero();
			System.out.println("Você digitou " + num);
		}catch (Exception e){
			System.out.println("entrada invalida");
			e.printStackTrace();
		}
		
		
	}
	
	public static double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
