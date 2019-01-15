package br.ufsc.bank.usuid.atm;

import br.ufsc.bank.usuid.ATMFeature;
import br.ufsc.bank.usuid.SacarFeature;
import net.douglashiura.us.Fixture;

@Fixture("ATMRetornoOperacaoFixture")
public class ATMRetornoOperacaoFixture {
	public String getRetornoOperacao() {
		try {
			ATMFeature.atm.withDraw(SacarFeature.numeroDoCartao, SacarFeature.senha, SacarFeature.valor);
			return "Operacao realizada com sucesso! Retire o dinheiro na bandeja.";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
}
