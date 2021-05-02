package com.cursojava.aula19;

public class Exer02 {

	public static void main(String[] args) {

		int a[] = new int[8];
		int b[] = new int[8];
		
		a[0]=9;
		a[1]=8;
		a[2]=7;
		a[3]=6;
		a[4]=5;
		a[5]=4;
		a[6]=3;
		a[7]=2;
		
		for(int i=0; i<b.length; i++){
			b[i]=a[i]*2;
		}
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}
	}

}
