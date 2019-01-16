package br.ufsc.bank.usuid.loan;

import br.ufsc.bank.usuid.ATMFeature;
import net.douglashiura.us.Fixture;

@Fixture("LoanSetUpFixture")
public class LoanSetUpFixture {
	
	public String nomeCliente = "";
	public String contaCorrenteCliente = "";
	public String numeroCartaoCliente = "";
	public int senhaCartaoCliente = 0;
	public Double saldoContaCorrenteCliente=0.0;
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setContaCorrenteCliente(String contaCorrenteCliente) {
		this.contaCorrenteCliente = contaCorrenteCliente;
	}

	public void setNumeroCartaoCliente(String numeroCartaoCliente) {
		this.numeroCartaoCliente = numeroCartaoCliente;
	}
	
	public void setSenhaCartaoCliente(String senhaCartaoCliente) {
		this.senhaCartaoCliente = Integer.parseInt(senhaCartaoCliente);
	}
	
	public void setSaldoContaCorrenteCliente(String saldoContaCorrenteCliente) {
		this.saldoContaCorrenteCliente = Double.parseDouble(saldoContaCorrenteCliente);
	}
	
	public String getIniciar() {
		return "iniciar";
	}
	public String getNomeCliente() {
		return "cliente";
	}

	public String getContaCorrenteCliente() {
		return "conta corrente";
	}

	public String getNumeroCartaoCliente() {
		return "numero do cartao";
	}
	
	public String getSenhaCartaoCliente() {
		return "senha do cartao";
	}
	
	public String getSaldoContaCorrenteCliente() {
		return "saldo";
	}
	

	public void toLoanMenuFixture() {
		ATMFeature.atm.getBank().createBankCustomer(1, this.nomeCliente, this.numeroCartaoCliente, this.senhaCartaoCliente, this.contaCorrenteCliente, this.saldoContaCorrenteCliente);
	}
	
}
