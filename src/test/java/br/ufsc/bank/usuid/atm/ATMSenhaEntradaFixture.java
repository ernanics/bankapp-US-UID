package br.ufsc.bank.usuid.atm;

import br.ufsc.bank.usuid.SacarFeature;
import net.douglashiura.us.Fixture;

@Fixture("ATMSenhaEntradaFixture")
public class ATMSenhaEntradaFixture {
	public void setSenhaInformada(int senhaInformada) {
		SacarFeature.senha = senhaInformada;
	}
	
	public void toATMRetornoOperacaoFixture() {
		
	}
}
