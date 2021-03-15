package com.oficina.processadores;

import java.util.ArrayList;

import com.oficina.dominio.Caminhao;
import com.oficina.dominio.Carro;
import com.oficina.dominio.Moto;
import com.oficina.dominio.Veiculo;

public class Cadastrador {
	public ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	@SuppressWarnings("rawtypes")
	private Detalhador dt;
	
	// detalhe geral mais aprimorador, mais essa sentença de repetição de IF, pode ser melhorada.
	// vantagem de moficiação, é que mexemos apenas em cada detalhe pode ser modificado especificadamente.
	
	public void DetalharTodos() {
		for (Veiculo v: veiculos) {
			if(v instanceof Carro) {
				dt = new DetalhadorCarro();
			}
			
			if(v instanceof Moto) {
				dt = new DetalhadorMoto();
			}
			
			if(v instanceof Caminhao) {
				dt = new DetalhadorCaminhao();
			}
			
			dt.detalhar(v);
		}
	}

}
