package com.oficina.dominio;

public class Caminhao extends Veiculo {
	private int eixos;
	
	public Caminhao(String placa, String modelo, String cor, int eixos) {
		super(placa, modelo, cor);
		this.eixos = eixos;
		
	}	
		
	public int getEixos() {
			return eixos;
			
		}
}
