package br.com.treinar.conta;

import br.com.treinar.servico.Banco;

public class Principal {

	public static void main(String[] args) {
		Banco b = new Banco();
		b.abrir();
		System.out.println("Finalizando");
	}
	
}
