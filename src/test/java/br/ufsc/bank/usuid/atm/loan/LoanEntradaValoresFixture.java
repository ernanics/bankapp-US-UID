package br.ufsc.bank.usuid.atm.loan;

import br.ufsc.bank.usuid.LoanFeature;
import br.ufsc.model.Loan;
import net.douglashiura.us.Fixture;

@Fixture("LoanEntradaValoresFixture")
public class LoanEntradaValoresFixture {

	public Loan loan1 = new Loan();
	public Loan loan2 = new Loan();
	public Loan loan3 = new Loan();
	public Loan loan4 = new Loan();
	
	public void toLoanSimulacaoFixture() {
		LoanFeature.loan.add(loan1);
		LoanFeature.loan.add(loan2);
		LoanFeature.loan.add(loan3);
		LoanFeature.loan.add(loan4);
	}
	
	public String getValorFinanciado() {
		return "valor financiado";
	}
	
	public String getPcJuros() {
		return "pc juros";
	}
	
	public String getNuParcelas() {
		return "nu. de parcelas";
	}
	
	public void setValorFinanciado1(String valorFinanciado1) {
		loan1.setAmount(Double.parseDouble(valorFinanciado1));
	}
	
	public void setPcJuros1(String pcJuros1) {
		loan1.setPcOfInterest(Double.parseDouble(pcJuros1));
	}
	
	public void setNuParcelas1(String nuParcelas1) {
		loan1.setNumberOfMontlhyInstalments(Long.parseLong(nuParcelas1));
	}
	
	public void setValorFinanciado2(String valorFinanciado2) {
		loan2.setAmount(Double.parseDouble(valorFinanciado2));
	}
	
	public void setPcJuros2(String pcJuros2) {
		loan2.setPcOfInterest(Double.parseDouble(pcJuros2));
	}
	
	public void setNuParcelas2(String nuParcelas2) {
		loan2.setNumberOfMontlhyInstalments(Long.parseLong(nuParcelas2));
	}
	
	public void setValorFinanciado3(String valorFinanciado3) {
		loan3.setAmount(Double.parseDouble(valorFinanciado3));
	}
	
	public void setPcJuros3(String pcJuros3) {
		loan3.setPcOfInterest(Double.parseDouble(pcJuros3));
	}
	
	public void setNuParcelas3(String nuParcelas3) {
		loan3.setNumberOfMontlhyInstalments(Long.parseLong(nuParcelas3));
	}
	
	public void setValorFinanciado4(String valorFinanciado4) {
		loan4.setAmount(Double.parseDouble(valorFinanciado4));
	}
	
	public void setPcJuros4(String pcJuros4) {
		loan4.setPcOfInterest(Double.parseDouble(pcJuros4));
	}
	
	public void setNuParcelas4(String nuParcelas4) {
		loan4.setNumberOfMontlhyInstalments(Long.parseLong(nuParcelas4));
	}
	
	public void setCalcular(String calcular) {

	}

}
