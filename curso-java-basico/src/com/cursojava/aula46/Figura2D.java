package com.cursojava.aula46;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial{

	@Override
	public String toString() {
		String s = super.toString();
		s+= "\nCalcularArea: " + calcularArea();
		return s;
	}	

}
