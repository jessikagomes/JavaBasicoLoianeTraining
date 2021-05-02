package com.cursojava.aula19;

public class Exer01 {

	public static void main(String[] args) {

		int[]a = new int[5];
		int[]b = new int[5];
		
		a[0]=10;
		a[1]=9;
		a[2]=8;
		a[3]=7;
		a[4]=6;
		
		for(int i=0;i<a.length; i++) {
			b[i]=a[i];
		}

		for(int i=0;i<a.length; i++) {
			System.out.println("A: "+ a[i]);
		}
		
		for(int i=0;i<b.length; i++) {
			System.out.println("B: "+ b[i]);
		}
	}

}
