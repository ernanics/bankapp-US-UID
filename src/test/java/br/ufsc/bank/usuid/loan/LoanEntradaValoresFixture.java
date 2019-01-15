package br.ufsc.bank.usuid.loan;

import br.ufsc.bank.usuid.LoanFeature;
import br.ufsc.model.Loan;
import net.douglashiura.us.Fixture;

@Fixture("LoanEntradaValoresFixture")
public class LoanEntradaValoresFixture {
	
	public double valorFinanciado1;
	public double valorFinanciado2;
	public double valorFinanciado3;
	public double valorFinanciado4;
	public double pcJuros1;
	public double pcJuros2;
	public double pcJuros3;
	public double pcJuros4;
	public long nuParcelas1;
	public long nuParcelas2;
	public long nuParcelas3;
	public long nuParcelas4;
	
	public void setValorFinanciado1(double valorFinanciado1) {
		this.valorFinanciado1 = valorFinanciado1;
	}

	public void setValorFinanciado2(double valorFinanciado2) {
		this.valorFinanciado2 = valorFinanciado2;
	}

	public void setValorFinanciado3(double valorFinanciado3) {
		this.valorFinanciado3 = valorFinanciado3;
	}

	public void setValorFinanciado4(double valorFinanciado4) {
		this.valorFinanciado4 = valorFinanciado4;
	}

	public void setPcJuros1(double pcJuros1) {
		this.pcJuros1 = pcJuros1;
	}

	public void setPcJuros2(double pcJuros2) {
		this.pcJuros2 = pcJuros2;
	}

	public void setPcJuros3(double pcJuros3) {
		this.pcJuros3 = pcJuros3;
	}

	public void setPcJuros4(double pcJuros4) {
		this.pcJuros4 = pcJuros4;
	}

	public void setNuParcelas1(long nuParcelas1) {
		this.nuParcelas1 = nuParcelas1;
	}

	public void setNuParcelas2(long nuParcelas2) {
		this.nuParcelas2 = nuParcelas2;
	}

	public void setNuParcelas3(long nuParcelas3) {
		this.nuParcelas3 = nuParcelas3;
	}

	public void setNuParcelas4(long nuParcelas4) {
		this.nuParcelas4 = nuParcelas4;
	}
	
	public void toLoanSimulacaoFixture() {
		LoanFeature.loan.add(0,new Loan(this.valorFinanciado1, this.pcJuros1, this.nuParcelas1));
		LoanFeature.loan.add(1,new Loan(this.valorFinanciado2, this.pcJuros2, this.nuParcelas2));
		LoanFeature.loan.add(2,new Loan(this.valorFinanciado3, this.pcJuros3, this.nuParcelas3));
		LoanFeature.loan.add(3,new Loan(this.valorFinanciado4, this.pcJuros4, this.nuParcelas4));
	}
}
