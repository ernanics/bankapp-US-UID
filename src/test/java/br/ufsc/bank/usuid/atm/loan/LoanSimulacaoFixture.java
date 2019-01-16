package br.ufsc.bank.usuid.atm.loan;

import java.math.BigDecimal;

import br.ufsc.bank.usuid.LoanFeature;
import net.douglashiura.us.Fixture;

@Fixture("LoanSimulacaoFixture")
public class LoanSimulacaoFixture {
	
	public String getResultadoSimulacoes() {
		return "Resultado das Simulacoes";
	}
	public String getNuParcelas() {
		return "nu. de parcelas";
	}
	
	public String getPcJuros() {
		return "pc juros";
	}
	
	public String getValorFinanciado() {
		return "valor financiado";
	}
	
	public String getVlParcelas() {
		return "valor das parcelas";
	}
	
	public String getValorFinanciadoComJuros() {
		return "valor total financiado com juros";
	}
	
	public String getValorFinanciado1() {
		return new BigDecimal(LoanFeature.loan.get(0).getAmount()).setScale(2).toString();
	}

	public String getValorFinanciado2() {
		return new BigDecimal(LoanFeature.loan.get(1).getAmount()).setScale(2).toString();
	}

	public String getValorFinanciado3() {
		return new BigDecimal(LoanFeature.loan.get(2).getAmount()).setScale(2).toString();
	}

	public String getValorFinanciado4(){
		return new BigDecimal(LoanFeature.loan.get(3).getAmount()).setScale(2).toString();
	}

	public String getPcJuros1() {
		return LoanFeature.loan.get(0).getPcOfInterest().toString();
	}

	public String getPcJuros2(){
		return LoanFeature.loan.get(1).getPcOfInterest().toString();
	}

	public String getPcJuros3() {
		return new BigDecimal(LoanFeature.loan.get(2).getPcOfInterest()).setScale(4).toString();
	}

	public String getPcJuros4(){
		return LoanFeature.loan.get(3).getPcOfInterest().toString();
	}

	public String getNuParcelas1() {
		return LoanFeature.loan.get(0).getNumberOfMontlhyInstalments().toString();
	}

	public String getNuParcelas2() {
		return LoanFeature.loan.get(1).getNumberOfMontlhyInstalments().toString();
	}

	public String getNuParcelas3() {
		return LoanFeature.loan.get(2).getNumberOfMontlhyInstalments().toString();
	}

	public String getNuParcelas4() {
		return LoanFeature.loan.get(3).getNumberOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas1() {
		return LoanFeature.loan.get(0).getValueOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas2() {
		return LoanFeature.loan.get(1).getValueOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas3() {
		return LoanFeature.loan.get(2).getValueOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas4() {
		//System.out.println(LoanFeature.loan.get(3).getValueOfMontlhyInstalments().toString());
		return LoanFeature.loan.get(3).getValueOfMontlhyInstalments().toString();
	}
	
	public String getValorFinanciadoComJuros1() {
		return LoanFeature.loan.get(0).getLoanAmountWithInterests().toString();
	}
	
	public String getValorFinanciadoComJuros2() {
		//System.out.println(LoanFeature.loan.get(1).getLoanAmountWithInterests().toString());
		return LoanFeature.loan.get(1).getLoanAmountWithInterests().toString();
	}
	
	public String getValorFinanciadoComJuros3() {
		return LoanFeature.loan.get(2).getLoanAmountWithInterests().toString();
	}
	
	public String getValorFinanciadoComJuros4() {
		return LoanFeature.loan.get(3).getLoanAmountWithInterests().toString();
	}
}
