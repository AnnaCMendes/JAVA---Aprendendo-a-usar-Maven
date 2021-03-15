package com.oficina;

import com.oficina.dominio.Caminhao;
//import com.google.gson.Gson;
import com.oficina.dominio.Carro;
import com.oficina.dominio.Moto;
import com.oficina.dominio.Veiculo;
import com.oficina.processadores.Cadastrador;

public class App {

	public static void main(String[] args) {
		Veiculo cr = new Carro("ABC-2030", "Corsa", "Azul", "Sem-airbag", "Sedan");
		// json - é um objeto para linguagem java script
		// antigamente trocava-se informações por xml
		// json - parece uma istinha de python aberta por chaves {placa:"ABC - 3020"}
		
		Veiculo m = new Moto("DFE-1030", "Honda", "Verde", "125cc");
		
		Veiculo cm = new Caminhao("WDR-4050", "Volvo", "Vermelho", 3);
		
		
		//Gson gs = new Gson();
		
		//String json = gs.toJson(v);
		
		//System.out.println(json);
		
		//Detalhador dt = new Detalhador();
		//dt.detalhar(cm);
		
		Cadastrador cd = new Cadastrador();
		cd.veiculos.add(cr);
		cd.veiculos.add(m);
		cd.veiculos.add(cm);
		cd.DetalharTodos();
		
		
		
	}

}
