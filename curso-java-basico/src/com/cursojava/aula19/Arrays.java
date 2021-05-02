package com.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];
		temperaturas[0] = 35;
		temperaturas[1] = 30.5;
		temperaturas[2] = 32.5;
		
		for(int i=0; i<temperaturas.length;i++) {
			System.out.println(temperaturas[i]);
		}
		
		for(double temp : temperaturas) {
			System.out.print(temp);			
		}

	}

}
