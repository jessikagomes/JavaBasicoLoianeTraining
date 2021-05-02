package com.cursojava.aula19;

public class Exer06 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		a[0]=9;
		a[1]=8;
		a[2]=7;
		a[3]=6;
		a[4]=5;
		a[5]=4;
		a[6]=3;
		a[7]=2;
		a[8]=12;
		a[9]=10;
		
		b[0]=9;
		b[1]=8;
		b[2]=7;
		b[3]=6;
		b[4]=5;
		b[5]=4;
		b[6]=3;
		b[7]=2;
		b[8]=12;
		b[9]=10;
		
		for(int i=0; i<c.length;i++) {
			c[i]=a[i]+b[i];
		}
		
		for(int i : c) {
			System.out.println(i);
		}

	}

}
