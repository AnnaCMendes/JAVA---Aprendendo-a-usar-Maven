package com.oficina.dominio;

public class Moto extends Veiculo {
	private String cilindros;
	
	public Moto(String placa, String modelo, String cor, String cilindros) {
		super(placa, modelo, cor);
		this.cilindros = cilindros;
		
	}
	
	public String getCilindros() {
		return cilindros;
		
	}
	
}
