package com.oficina.processadores;

import com.oficina.dominio.Veiculo;


// Generico que serve para tipar variaveis em tempo de execu��o

// as vezes quando estamos trabalhando em JAVA topamos com <T> ou <T,X>, que se chama tipagem generica

// como criar os detalhes de ve�culos e trabalhar com polimorfismo - existem detalhes que s�o gerais e outros especificos

// como chamar o m�todo para resolver isso = a forma que encontramos, foi utilizar o generico


// extens (que herda)



public abstract class Detalhador<T extends Veiculo> {
	
	// detalhador recebe um tipo T - preencho o detalhe especifico abaixo no mesmo momento
	
	// preciso dizer que este T, est� relacionado a ve�culos
	
	// detalhador especifico para que cada ve�culo se comporte da maneira que eu preciso
	
	
	public abstract void detalheEspecifico(T t);
	
	// deixando em branco por enquanto para que ele se comporte de maneira especial. 
	// faremos ele se comportar de maneira especial quando for implementar o funcionamento do m�todo.
	
	@SuppressWarnings("unchecked")
	public void detalhar(Veiculo v) {
		System.out.println("----------------------------");
		System.out.println("Placa:" +v.getPlaca());
		System.out.println("Cor:" +v.cor);
		System.out.println("Modelo:" +v.getModelo());
		// colocando T - o veiculo que vier em cima, pede que seja encontrado o veiculo especifico. 
		// T � o detalhador, que herda as propiedades especificas de veiculo
		detalheEspecifico ((T) v);
		System.out.println("----------------------------");
		

	}
}



