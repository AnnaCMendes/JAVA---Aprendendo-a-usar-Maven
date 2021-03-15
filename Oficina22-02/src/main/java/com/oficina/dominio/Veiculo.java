package com.oficina.dominio;

public class Veiculo {
	private String placa;
	private String modelo;
	public String cor;
	
	public Veiculo(String placa, String modelo, String cor) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		
	}
	
	public String getPlaca() {
		return placa;
		
	}
	
	public String getModelo() {
		return modelo;
		
		
	}
}
