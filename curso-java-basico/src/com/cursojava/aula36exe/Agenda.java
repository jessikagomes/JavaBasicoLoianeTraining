package com.cursojava.aula36exe;

public class Agenda {
	
	private Contato[] contatos;
	private String nomeAgenda;
	
	
	public Agenda(Contato[] contatos, String nomeAgenda) {
		this.contatos = contatos;
		this.nomeAgenda = nomeAgenda;
	}

	public Agenda() {
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Contato[] getContato() {
		return contatos;
	}

	public void setContato(Contato[] contato) {
		this.contatos = contato;
	}
	
	public String obterInfo() {
		String info = "Agenda " + nomeAgenda + "\n";
		
		if(contatos != null) {
			for(Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		return info;
	}
	

}
