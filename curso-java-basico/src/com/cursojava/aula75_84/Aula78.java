package com.cursojava.aula75_84;

public class Aula78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ola = "Ol�";
		String ola2 = "OL�";
		String ola3 = "Ol�";

		System.out.println(ola.equals(ola2));
		System.out.println(ola.equals(ola3));
		System.out.println(ola.equalsIgnoreCase(ola2));

		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		
		System.out.println("Existe ana em banana? " + banana.regionMatches(1, ana, 0, 3));
		System.out.println("Existe an em banana? " + banana.regionMatches(1, ana, 0, 2));
		System.out.println("Existe Ban em banana? " + banana.regionMatches(true, 0, ban, 0, 3));
		System.out.println("banana termina com ana? " + banana.endsWith(ana));
		System.out.println("banana come�a com Ban? " + banana.startsWith(ban));
		
		


	}

}
