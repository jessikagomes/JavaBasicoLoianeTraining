package com.cursojava.aula75_84;

public class Aula83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alfabeto = "";
		String [] letras = {"A", "B","C","D"};

		StringBuffer sb = new StringBuffer();
		for(String letra : letras) {
			sb.append(letra);
		}
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		System.out.println(sb.reverse());

		alfabeto = new String(sb);
		System.out.println(alfabeto);
		


	}

}
