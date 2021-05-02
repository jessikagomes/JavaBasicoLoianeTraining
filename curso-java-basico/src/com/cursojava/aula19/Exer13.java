package com.cursojava.aula19;

public class Exer13 {

	public static void main(String[] args) {
		
		int soma=0;
		int[]a = new int[10];
		
		a[0]=9;
		a[1]=10;
		a[2]=7;
		a[3]=6;
		a[4]=5;
		a[5]=4;
		a[6]=3;
		a[7]=2;
		a[8]=25;
		a[9]=15;
		
		for(int i=0; i< a.length; i++) {
			if(a[i]%5==0) {
				soma += a[i];
			}
		}
		
		System.out.println("Soma dos número multiplos de 5: "+ soma);

	}

}
