package br.com.treinar.servico;

import java.util.Scanner;

import br.com.treinar.conta.Conta;
import br.com.treinar.conta.tipo.ContaCorrente;
import br.com.treinar.conta.tipo.ContaPoupanca;
import br.com.treinar.conta.tipo.ContaSalario;

public class Banco {

	private Conta[] contas;
	private Scanner teclado;
	
	public Banco(int quantidadeContas) {
		contas = new Conta[quantidadeContas];
	}
	
	public Banco() {
		teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de contas o banco possui: ");
		int quantidade = teclado.nextInt();
		contas = new Conta[quantidade];
	}

	private void criarConta(Conta conta) {
		System.out.print("Infome o número da conta: ");
		conta.setNumero(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Informe o nome do cliente: ");
		conta.setCliente(teclado.nextLine());
	}
	
	private Conta criarConta() {
		
		Conta c = null;
		String menu = "Digite:\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Conta Salario\n=> ";
		System.out.print(menu);
		int tipoConta = teclado.nextInt();
		teclado.nextLine();
		switch (tipoConta) {
		case 1:
			c = new ContaCorrente();
			criarConta(c);
			System.out.print("Informe o valor de taxa da manutenção: ");
			((ContaCorrente) c).setTaxaManutencao(teclado.nextInt());
			break;
		case 2:
			c = new ContaPoupanca();
			criarConta(c);
			System.out.print("Informe o valor de taxa da rendimento: ");
			((ContaPoupanca) c).setTaxaRendimento(teclado.nextInt());
			break;
		case 3:
			c = new ContaSalario();
			criarConta(c);
			System.out.print("Informe o dia do pagamento: ");
			((ContaSalario) c).setDiaPagamento(teclado.nextInt());
			break;
		default:
			System.out.println("Conta Inválida");
			break;
		}
		return c;
	}
	
	
	public void abrir() {
		int index = 0;
		int opcao = 0;
		String menu = "Digite:\n\t0 - Sair\n\t1 - Criar conta\n\t2 - Depositar\n\t3 - Sacar\n\t4 - Exibir Saldo\n=> ";
		
		do {
			System.out.print(menu);
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				contas[index++] = criarConta();
				break;
			case 2:
				depositar();
				break;
			case 3:
				sacar();
				break;
			case 4:
				exibirSaldo();
				break;
			case 0:
				System.out.println("SAIR");
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}
		} while (opcao != 0);
	}

	private void exibirSaldo() {
		Conta c = recuperarConta("Infome o número da conta que deseja exibir o saldo: ");
		if (c != null) {
			System.out.println(c.getSaldo());
		} else {
			System.out.println("Conta inexistente!");
		}
	}

	private void sacar() {
		System.out.print("Infome o valor do saque: ");
		double valorSaque = teclado.nextDouble();
		Conta c = recuperarConta("Infome o número da conta que deseja sacar: ");
		if (c != null) {
			c.sacar(valorSaque);
		} else {
			System.out.println("Conta inexistente!");
		}
	}

	private void depositar() {
		System.out.print("Infome o valor do depósito: ");
		double valorDeposito = teclado.nextDouble();
		Conta c = recuperarConta("Infome o número da conta que deseja depositar: ");
		if (c != null) {
			c.depositar(valorDeposito);
		} else {
			System.out.println("Conta inexistente!");
		}
	}

	private Conta recuperarConta(String mensagem) {
		System.out.print(mensagem);
		int numeroConta = teclado.nextInt();
		Conta c = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumero() == numeroConta) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

}
