package br.ufsc.bank.usuid.atm.withdraw;

import br.ufsc.bank.usuid.SacarFeature;
import net.douglashiura.us.Fixture;

@Fixture("ATMValorEntradaFixture")
public class ATMValorEntradaFixture {
	
	public void setValorSacar(String valorSacar) {
		SacarFeature.valor = Integer.parseInt(valorSacar);
	}
	
	public void toATMSenhaFixture() {
		
	}
}
