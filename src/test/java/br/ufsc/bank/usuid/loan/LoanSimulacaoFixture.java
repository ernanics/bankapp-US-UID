package br.ufsc.bank.usuid.loan;

import java.math.BigDecimal;

import br.ufsc.bank.usuid.LoanFeature;
import net.douglashiura.us.Fixture;

@Fixture("LoanSimulacaoFixture")
public class LoanSimulacaoFixture {
	
	public BigDecimal getLVlParcelas1() {
		return LoanFeature.loan.get(0).getValueOfMontlhyInstalments();
	}
	
	public BigDecimal getLVlParcelas2() {
		return LoanFeature.loan.get(1).getValueOfMontlhyInstalments();
	}
	
	public BigDecimal getLVlParcelas3() {
		return LoanFeature.loan.get(2).getValueOfMontlhyInstalments();
	}
	
	public BigDecimal getLVlParcelas4() {
		return LoanFeature.loan.get(3).getValueOfMontlhyInstalments();
	}
	
	public BigDecimal getValorFinanciadoComJuros1() {
		return LoanFeature.loan.get(0).getLoanAmountWithInterests();
	}
	
	public BigDecimal getValorFinanciadoComJuros2() {
		return LoanFeature.loan.get(1).getLoanAmountWithInterests();
	}
	
	public BigDecimal getValorFinanciadoComJuros3() {
		return LoanFeature.loan.get(2).getLoanAmountWithInterests();
	}
	
	public BigDecimal getValorFinanciadoComJuros4() {
		return LoanFeature.loan.get(3).getLoanAmountWithInterests();
	}
}
