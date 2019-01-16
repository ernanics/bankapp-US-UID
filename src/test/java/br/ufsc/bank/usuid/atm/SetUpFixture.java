package br.ufsc.bank.usuid.atm;

import java.util.ArrayList;
import java.util.Date;

import br.ufsc.bank.usuid.ATMFeature;
import br.ufsc.bank.usuid.SacarFeature;
import br.ufsc.model.PinHistory;
import net.douglashiura.us.Fixture;

@Fixture("SetUpFixture")
public class SetUpFixture {
	
	public String nomeCliente="";
	public String contaCorrenteCliente="";
	public String numeroCartaoCliente="";
	public int senhaCartaoCliente=0;
	public Double saldoContaCorrenteCliente=0.0;
	public int nuErrosSenha=0;
	public int notasDe5=0;
	public int notasDe10=0;
	public int notasDe20=0;
	public int notasDe50=0;
	public int notasDe100=0;
	public int primeiraSenhaErrada=0;
	public boolean isCartaoBloqueado=false;
	
	public String getIniciar() {
		return "iniciar";
	}
	public String getNomeCliente() {
		return "cliente";
	}

	public String getContaCorrenteCliente() {
		return "conta corrente";
	}

	public String getNumeroCartaoCliente() {
		return "numero do cartao";
	}
	
	public String getSenhaCartaoCliente() {
		return "senha do cartao";
	}
	
	public String getSaldoContaCorrenteCliente() {
		return "saldo";
	}
	
	public String getNuErrosSenha() {
		return "numero de vezes que errou a senha nas ultimas 72 horas";
	}
	
	public String getNuErrosSenhaPer() {
		return "numero de vezes que errou a senha no periodo de 72 horas";
	}
	
	public String getHorasAtras() {
		return "horas atras";
	}
	
	public String getIsCartaoBloqueado() {
		return "cartao bloqueado?";
	}
	
	public String getNotasDe5() {
		return "notas de 5";
	}
	public String getNotasDe10() {
		return "notas de 10";
	}
	public String getNotasDe20() {
		return "notas de 20";
	}
	public String getNotasDe50() {
		return "notas de 50";
	}
	public String getNotasDe100() {
		return "notas de 100";
	}
	
	public void setIsCartaoBloqueado(String isCartaoBloqueado) {
		this.isCartaoBloqueado = Boolean.parseBoolean(isCartaoBloqueado);
	}

	
	public void setPrimeiraSenhaErrada(String primeiraSenhaErrada) {
		this.primeiraSenhaErrada = Integer.parseInt(primeiraSenhaErrada);
	}
	
	public String getPrimeiraSenhaErrada() {
		return "O cliente digitou a senha incorretamente pela primeira vez nas ultimas 72 horas";
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setContaCorrenteCliente(String contaCorrenteCliente) {
		this.contaCorrenteCliente = contaCorrenteCliente;
	}

	public void setNumeroCartaoCliente(String numeroCartaoCliente) {
		this.numeroCartaoCliente = numeroCartaoCliente;
	}
	
	public void setSenhaCartaoCliente(String senhaCartaoCliente) {
		this.senhaCartaoCliente = Integer.parseInt(senhaCartaoCliente);
	}
	
	public void setSaldoContaCorrenteCliente(String saldoContaCorrenteCliente) {
		this.saldoContaCorrenteCliente = Double.parseDouble(saldoContaCorrenteCliente);
	}
	
	public void setNuErrosSenha(String nuErrosSenha) {
		this.nuErrosSenha = Integer.parseInt(nuErrosSenha);
	}

	public void setNotasDe5(String notasDe5) {
		this.notasDe5 = Integer.parseInt(notasDe5);
	}

	public void setNotasDe10(String notasDe10) {
		this.notasDe10 = Integer.parseInt(notasDe10);
	}

	public void setNotasDe20(String notasDe20) {
		this.notasDe20 = Integer.parseInt(notasDe20);
	}

	public void setNotasDe50(String notasDe50) {
		this.notasDe50 = Integer.parseInt(notasDe50);
	}

	public void setNotasDe100(String notasDe100) {
		this.notasDe100 = Integer.parseInt(notasDe100);
	}
	
	public void toATMMenuFixture() {
		ATMFeature.atm.getBank().createBankCustomer(1, this.nomeCliente, this.numeroCartaoCliente, this.senhaCartaoCliente, this.contaCorrenteCliente, this.saldoContaCorrenteCliente);
		ATMFeature.atm.chargeBills(this.notasDe5, this.notasDe10, this.notasDe20, this.notasDe50, this.notasDe100);
		SacarFeature.numeroDoCartao = this.numeroCartaoCliente;
		
		try {
			ATMFeature.atm.getBank().getCardByNumber(this.numeroCartaoCliente).setBlocked(this.isCartaoBloqueado);
			if (this.isCartaoBloqueado == false) {
				//Limpar histórico
				ATMFeature.atm.getBank().getCardByNumber(this.numeroCartaoCliente).setPinHistory(new ArrayList<PinHistory>());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i=1; i<=this.nuErrosSenha; i++) {
			try {
				ATMFeature.atm.getBank().getCardByNumber(this.numeroCartaoCliente).insertPinHistory(false, new Date(new Date().getTime()-(this.primeiraSenhaErrada*3600000)));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
