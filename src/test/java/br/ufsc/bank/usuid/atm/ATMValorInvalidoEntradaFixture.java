package br.ufsc.bank.usuid.atm;

import br.ufsc.bank.usuid.SacarFeature;
import net.douglashiura.us.Fixture;

@Fixture("ATMValorInvalidoEntradaFixture")
public class ATMValorInvalidoEntradaFixture {
	
	public void setValorSacar(String valorSacar) {
		SacarFeature.valor = Integer.parseInt(valorSacar);
	}
	
	public void toATMRetornoOperacaoFixture() {
		
	}
}
