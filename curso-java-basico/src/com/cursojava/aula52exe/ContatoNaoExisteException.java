package com.cursojava.aula52exe;

public class ContatoNaoExisteException extends Exception{

	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		super();
		this.nomeContato = nomeContato;
	}
	@Override
	public String getMessage() {
		return "Contato "+ nomeContato +"n�o existe na agenda";
	}
	
	

}
