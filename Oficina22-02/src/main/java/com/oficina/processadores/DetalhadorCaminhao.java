package com.oficina.processadores;


import com.oficina.dominio.Caminhao;

public class DetalhadorCaminhao extends Detalhador<Caminhao> {

	/*@Override
	public void detalheEspecifico(Veiculo v) {
		Caminhao cm = (Caminhao) v;
		System.out.println("Eixos:" +cm.getEixos());
		
	}
	*/

	@Override
	public void detalheEspecifico(Caminhao t) {
		System.out.println("Eixos:" +t.getEixos());
		
	}
	
	

}
