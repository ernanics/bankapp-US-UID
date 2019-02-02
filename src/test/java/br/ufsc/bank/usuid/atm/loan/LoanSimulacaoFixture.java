package br.ufsc.bank.usuid.atm.loan;

import java.text.DecimalFormat;

import br.ufsc.bank.usuid.LoanFeature;
import net.douglashiura.us.Fixture;

@Fixture("LoanSimulacaoFixture")
public class LoanSimulacaoFixture {
	
	public DecimalFormat format1 = new DecimalFormat("###.00");
	public DecimalFormat format2 = new DecimalFormat("##0.0000");
	
	public String getResultadoSimulacoes() {
		return "Resultado das Simulacoes";
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
	
	public String getVlParcelas() {
		return "valor das parcelas";
	}
	
	public String getValorFinanciadoComJuros() {
		return "valor total financiado com juros";
	}
	
	public String getValorFinanciado1() {
		return format1.format(LoanFeature.loan.get(0).getAmount()).replace(',', '.');
	}
	
	public String getPcJuros1() {
		return format2.format(LoanFeature.loan.get(0).getPcOfInterest()).replace(',', '.');
	}
	
	public String getNuParcelas1() {
		return LoanFeature.loan.get(0).getNumberOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas1() {
		return format1.format(LoanFeature.loan.get(0).getValueOfMontlhyInstalments()).replace(',', '.');
	}
	
	public String getValorFinanciadoComJuros1() {
		return format1.format(LoanFeature.loan.get(0).getLoanAmountWithInterests()).replace(',', '.');
	}
	
	public String getValorFinanciado2() {
		return format1.format(LoanFeature.loan.get(1).getAmount()).replace(',', '.');
	}
	
	public String getPcJuros2() {
		return format2.format(LoanFeature.loan.get(1).getPcOfInterest()).replace(',', '.');
	}
	
	public String getNuParcelas2() {
		return LoanFeature.loan.get(1).getNumberOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas2() {
		return LoanFeature.loan.get(1).getValueOfMontlhyInstalments().toString();
	}
	
	public String getValorFinanciadoComJuros2() {
		return format1.format(LoanFeature.loan.get(1).getLoanAmountWithInterests()).replace(',', '.');
	}
	
	public String getValorFinanciado3() {
		return format1.format(LoanFeature.loan.get(2).getAmount()).replace(',', '.');
	}
	
	public String getPcJuros3() {
		return format2.format(LoanFeature.loan.get(2).getPcOfInterest()).replace(',', '.');
	}
	
	public String getNuParcelas3() {
		return LoanFeature.loan.get(2).getNumberOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas3() {
		return format1.format(LoanFeature.loan.get(2).getValueOfMontlhyInstalments()).replace(',', '.');
	}
	
	public String getValorFinanciadoComJuros3() {
		return format1.format(LoanFeature.loan.get(2).getLoanAmountWithInterests()).replace(',', '.');
	}
	
	public String getValorFinanciado4() {
		return format1.format(LoanFeature.loan.get(3).getAmount()).replace(',', '.');
	}
	
	public String getPcJuros4() {
		return format2.format(LoanFeature.loan.get(3).getPcOfInterest()).replace(',', '.');
	}
	
	public String getNuParcelas4() {
		return LoanFeature.loan.get(3).getNumberOfMontlhyInstalments().toString();
	}
	
	public String getVlParcelas4() {
		return format1.format(LoanFeature.loan.get(3).getValueOfMontlhyInstalments()).replace(',', '.');
	}
	
	public String getValorFinanciadoComJuros4() {
		return format1.format(LoanFeature.loan.get(3).getLoanAmountWithInterests()).replace(',', '.');
	}
}
