package br.com.treinar.conta.tipo;

import br.com.treinar.conta.Conta;

public class ContaPoupanca extends Conta implements IProduto {

	private int taxaRendimento;

	public int getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(int taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void depositar(double valor) {
		super.setSaldo((getSaldo() + valor) + 1);;
	}
	
	@Override
	public double calcularValor() {
		return 0;
	}
	
}
