package br.com.treinar.conta.tipo;

import br.com.treinar.conta.Conta;

public class ContaSalario extends Conta implements IProduto {

	private int diaPagamento;

	public int getDiaPagamento() {
		return diaPagamento;
	}

	public void setDiaPagamento(int diaPagamento) {
		this.diaPagamento = diaPagamento;
	}

	@Override
	public void depositar(double valor) {
		super.setSaldo(getSaldo() + valor);;
	}
	
	@Override
	public double calcularValor() {
		return 0;
	}
	
}
