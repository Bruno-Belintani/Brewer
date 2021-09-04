package com.algaworks.brewer.model;

public enum Sabor {
	
	Adocicada("Adocicada"),
	Amarga("Amarga"),
	Forte("Forte"),
	Frutada("Frutada"),
	Suave("Suave");
	
	private String descricao;
	
	Sabor(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
