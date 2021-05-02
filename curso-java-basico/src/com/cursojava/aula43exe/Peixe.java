package com.cursojava.aula43exe;

public class Peixe extends Animal{
	
	private String caracteristicas = "Barbatanas e cauda";
	
	public Peixe() {
		this.setAmbiente("Mar");
		this.setCor("Cinzento");
		this.setPatas(0);
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s +="\nCaracteristicas: "+ caracteristicas;
		return s;
	}

	
}
