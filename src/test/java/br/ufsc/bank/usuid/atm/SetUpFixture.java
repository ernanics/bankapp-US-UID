package br.ufsc.bank.usuid.atm;

import net.douglashiura.us.Fixture;

@Fixture("SetUpFixture")
public class SetUpFixture {
	
	public String nomeCliente;
	public String contaCorrenteCliente;
	public String numeroCartaoCliente;
	public int senhaCartaoCliente;
	public Double saldoContaCorrenteCliente;
	public int nuErrosSenha;
	public int notasDe5;
	public int notasDe10;
	public int notasDe20;
	public int notasDe50;
	public int notasDe100;
	
	public void SetUpFixture() {
		System.out.println("SetUpFixture");
	}
	
	public void setNomeCliente(String nomeCliente) {
		System.out.println("nomeCliente");
		this.nomeCliente = nomeCliente;
	}

	public void setContaCorrenteCliente(String contaCorrenteCliente) {
		this.contaCorrenteCliente = contaCorrenteCliente;
	}

	public void setNumeroCartaoCliente(String numeroCartaoCliente) {
		this.numeroCartaoCliente = numeroCartaoCliente;
	}
	
	public void setSenhaCartaoCliente(int senhaCartaoCliente) {
		this.senhaCartaoCliente = senhaCartaoCliente;
	}
	
	public void setSaldoContaCorrenteCliente(Double saldoContaCorrenteCliente) {
		this.saldoContaCorrenteCliente = saldoContaCorrenteCliente;
	}
	
	public void setNuErrosSenha(int nuErrosSenha) {
		this.nuErrosSenha = nuErrosSenha;
	}

	public void setNotasDe5(int notasDe5) {
		this.notasDe5 = notasDe5;
	}

	public void setNotasDe10(int notasDe10) {
		this.notasDe10 = notasDe10;
	}

	public void setNotasDe20(int notasDe20) {
		this.notasDe20 = notasDe20;
	}

	public void setNotasDe50(int notasDe50) {
		this.notasDe50 = notasDe50;
	}

	public void setNotasDe100(int notasDe100) {
		this.notasDe100 = notasDe100;
	}

	public void toATMFixture() {
		System.out.println("next");
	}
}
