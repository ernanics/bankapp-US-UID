package br.ufsc.bank.usuid.loan;

import br.ufsc.bank.usuid.ATMFeature;
import net.douglashiura.us.Fixture;

@Fixture("LoanSetUpFixture")
public class LoanSetUpFixture {
	
	public String nomeCliente;
	public String contaCorrenteCliente;
	public String numeroCartaoCliente;
	public int senhaCartaoCliente;
	public Double saldoContaCorrenteCliente=0.0;
	

	public void SetUpFixture() {
		System.out.println("SetUpFixture");
	}
	
	
	public void setNomeCliente(String nomeCliente) {
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
	

	public void toLoanMenuFixture() {
		ATMFeature.atm.getBank().createBankCustomer(1, this.nomeCliente, this.numeroCartaoCliente, this.senhaCartaoCliente, this.contaCorrenteCliente, this.saldoContaCorrenteCliente);
	
	}
	
}
