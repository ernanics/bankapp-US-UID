package br.ufsc.bank.usuid.atm;

import br.ufsc.bank.usuid.SacarFeature;
import net.douglashiura.us.Fixture;

@Fixture("ATMValorEntradaFixture")
public class ATMValorEntradaFixture {
	
	public void setValorSacar(int valorSacar) {
		SacarFeature.valor = valorSacar;
	}
	
	public void toATMSenhaFixture() {
		
	}
}
