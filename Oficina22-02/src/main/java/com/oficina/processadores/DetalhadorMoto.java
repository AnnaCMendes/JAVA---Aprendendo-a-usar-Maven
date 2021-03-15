package com.oficina.processadores;

import com.oficina.dominio.Moto;

public class DetalhadorMoto extends Detalhador<Moto> {

	@Override
	public void detalheEspecifico(Moto t) {
		System.out.println("Cilindradas:" +t.getCilindros());
		
	}

	/*@Override
	public void detalheEspecifico(Veiculo v) {
		Moto m = (Moto) v;
		System.out.println("Cilindradas:" +m.getCilindros());
		
	}
	*/
	
	

}
