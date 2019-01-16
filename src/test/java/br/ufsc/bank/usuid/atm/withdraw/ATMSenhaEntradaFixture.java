package br.ufsc.bank.usuid.atm.withdraw;

import br.ufsc.bank.usuid.SacarFeature;
import net.douglashiura.us.Fixture;

@Fixture("ATMSenhaEntradaFixture")
public class ATMSenhaEntradaFixture {
	public void setSenhaInformada(String senhaInformada) {
		SacarFeature.senha = Integer.parseInt(senhaInformada);
	}
	
	public void toATMRetornoOperacaoFixture() {
		
	}
}
