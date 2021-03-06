package com.cursojava.aula48;

public class TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {4,8,16,32,64,128};
		int[] demon= {2,0,4,8,0};
		
		for (int i=0; i<numeros.length; i++) {
			try{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Ocorreu um erro.");
			}
			finally {
				System.out.println("Linha finally, impressa ap?s o Try ou Catch.");
				System.out.println();

			}
		}

	}

}
