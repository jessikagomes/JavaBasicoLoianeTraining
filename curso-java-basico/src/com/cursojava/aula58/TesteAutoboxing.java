package com.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		//autoboxing
		Float f = Float.valueOf("10");
		System.out.println(f);
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Double num12 = 2.5555;
		Boolean flag2 = true;
		Character b = 'b';
		
		//auto un-boxing
		int num13  = num9; // num.9intvalue();
		//autoboxing em expressões
		num9++;
		System.out.println(num9);	
		//auto unboxing num 9 -> autoboxing num13/num9 -> num14
		Integer num14 = num13/num9;
		
		
	}

}
