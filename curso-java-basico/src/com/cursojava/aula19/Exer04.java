package com.cursojava.aula19;

public class Exer04 {

	public static void main(String[] args) {
		
		
		int a[] = new int[15];
		int b[] = new int[15];
		
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
		a[10]=11;
		a[11]=13;
		a[12]=20;
		a[13]=21;
		a[14]=19;
		
		for(int i=0; i<b.length; i++){
			b[i]= (int) Math.sqrt(a[i]);
		}
		System.out.println("Array A");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("Array B");
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}

	}

}
