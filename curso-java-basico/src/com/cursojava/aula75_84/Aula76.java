package com.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {

		String curso = "Curso ";
		String java = "Java";
		
		String cursoJava =  curso + java;
		
		System.out.println(cursoJava);
		
		String resultado2Com2 = "Resultad 2 + 2 = " + (2+2);
		System.out.println(resultado2Com2);
		
		String um = String.valueOf(1);
		System.out.println(um);
		
		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " + 
		"labore et dolore magna aliqua. Ut enim ad minim veniam, quis "+
				"nostrud exercitation ullamco laboris nisi ut aliquip ex " + 
		"ea commodo consequat. Duis aute irure dolor in reprehenderit in "+ 
				"voluptate velit esse cillum dolore eu fugiat nulla pariatur. "+
		"Excepteur sint occaecat cupidatat non proident, sunt in culpa "+
				"qui officia deserunt mollit anim id est laborum.";
	
		System.out.println(concatenacao);
		//má pratica
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "; 
		concatenacao2 += "labore et dolore magna aliqua. Ut enim ad minim veniam, quis ";
		concatenacao2 += "nostrud exercitation ullamco laboris nisi ut aliquip ex ";
		concatenacao2 +="ea commodo consequat. Duis aute irure dolor in reprehenderit in ";
		concatenacao2 +="voluptate velit esse cillum dolore eu fugiat nulla pariatur. ";
		concatenacao2 +="Excepteur sint occaecat cupidatat non proident, sunt in culpa ";
		concatenacao2 +="qui officia deserunt mollit anim id est laborum.";
		
		System.out.println(concatenacao2);

	}

}
