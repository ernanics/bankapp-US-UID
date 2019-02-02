package br.ufsc.bank.usuid.atm.withdraw;

import br.ufsc.bank.usuid.ATMFeature;
import br.ufsc.bank.usuid.SacarFeature;
import net.douglashiura.us.Fixture;

@Fixture("ATMRetornoOperacaoFixture")
public class ATMRetornoOperacaoFixture {
	public String getRetornoOperacao() {
		try {
			ATMFeature.atm.withDraw(SacarFeature.numeroDoCartao, SacarFeature.senha, SacarFeature.valor);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Operacao realizada com sucesso! Retire o dinheiro na bandeja.";
	}
}
