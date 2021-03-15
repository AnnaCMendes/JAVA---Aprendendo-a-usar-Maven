package com.oficina.dominio;

public class Carro extends Veiculo {
	private String airbag;
	private String tipo;
	
	public Carro(String placa, String modelo, String cor, String airbag, String tipo) {
		super(placa, modelo, cor);
		this.airbag = airbag;
		this.tipo = tipo; 
	}
	
	public String getAirbag() {
		return airbag;
	}
	
	public String getTipo() {
		return tipo;
	}

}
