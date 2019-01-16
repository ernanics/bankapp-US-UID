package br.ufsc.bank.usuid.atm.loan;

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
	
	public String getNuParcelas() {
		return "nu. de parcelas";
	}
	
	public String getPcJuros() {
		return "pc juros";
	}
	
	public String getValorFinanciado() {
		return "valor financiado";
	}
	
	public void setValorFinanciado1(String valorFinanciado1) {
		this.valorFinanciado1 = Double.parseDouble(valorFinanciado1);
	}

	public void setValorFinanciado2(String valorFinanciado2) {
		this.valorFinanciado2 = Double.parseDouble(valorFinanciado2);
	}

	public void setValorFinanciado3(String valorFinanciado3) {
		this.valorFinanciado3 = Double.parseDouble(valorFinanciado3);
	}

	public void setValorFinanciado4(String valorFinanciado4) {
		this.valorFinanciado4 = Double.parseDouble(valorFinanciado4);
	}

	public void setPcJuros1(String pcJuros1) {
		this.pcJuros1 = Double.parseDouble(pcJuros1);
	}

	public void setPcJuros2(String pcJuros2) {
		this.pcJuros2 = Double.parseDouble(pcJuros2);
	}

	public void setPcJuros3(String pcJuros3) {
		this.pcJuros3 = Double.parseDouble(pcJuros3);
	}

	public void setPcJuros4(String pcJuros4) {
		this.pcJuros4 = Double.parseDouble(pcJuros4);
	}

	public void setNuParcelas1(String nuParcelas1) {
		this.nuParcelas1 = Long.parseLong(nuParcelas1);
	}

	public void setNuParcelas2(String nuParcelas2) {
		this.nuParcelas2 = Long.parseLong(nuParcelas2);
	}

	public void setNuParcelas3(String nuParcelas3) {
		this.nuParcelas3 = Long.parseLong(nuParcelas3);
	}

	public void setNuParcelas4(String nuParcelas4) {
		this.nuParcelas4 = Long.parseLong(nuParcelas4);
	}
	
	public void setCalcular(String calcular) {
		
	}
	
	public void toLoanSimulacaoFixture() {
		LoanFeature.loan.add(0,new Loan(this.valorFinanciado1, this.pcJuros1, this.nuParcelas1));
		LoanFeature.loan.add(1,new Loan(this.valorFinanciado2, this.pcJuros2, this.nuParcelas2));
		LoanFeature.loan.add(2,new Loan(this.valorFinanciado3, this.pcJuros3, this.nuParcelas3));
		LoanFeature.loan.add(3,new Loan(this.valorFinanciado4, this.pcJuros4, this.nuParcelas4));
	}
}
