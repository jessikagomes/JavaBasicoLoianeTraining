package com.cursojava.aula19;

public class Exer14 {

	public static void main(String[] args) {
		
		int soma=0;
		int mediaImpar=0;
		int qtd = 0;
		int[]a = new int[10];
		
		a[0]=9;
		a[1]=13;
		a[2]=7;
		a[3]=6;
		a[4]=5;
		a[5]=4;
		a[6]=3;
		a[7]=2;
		a[8]=25;
		a[9]=15;
		
		for(int i=0; i< a.length; i++) {
			if(a[i]%2==1) {
				soma += a[i];
				qtd = qtd + 1;	
			}
		}
		
		mediaImpar = soma/qtd;
		System.out.println("Média dos número ímpares: "+ mediaImpar);

	}

}
