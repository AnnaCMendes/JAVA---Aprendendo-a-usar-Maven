package com.oficina.processadores;

import com.oficina.dominio.Carro;

public class DetalhadorCarro extends Detalhador<Carro> {

	@Override
	public void detalheEspecifico(Carro t) {
		System.out.println("Air-bag: " +t.getAirbag());
		System.out.println("Tipo:" + t.getTipo());
		
	}
	
}
	
/*@Override
*public void detalheEspecifico(Veiculo v) {
*Carro c = (Carro) v;
*System.out.println("Air-bag: " +c.getAirbag());
*System.out.println("Tipo:" + c.getTipo());
*}
*/

