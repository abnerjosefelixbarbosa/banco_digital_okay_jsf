package br.com.abn.model;

import br.com.abn.interfaces.InterfaceNegocioConta;
import br.com.abn.interfaces.InterfaceRepositorioConta;

public class NegocioConta implements InterfaceNegocioConta {
	
	private InterfaceRepositorioConta repositorioConta;

	public NegocioConta() {
		this.repositorioConta = new RepositorioConta();
	}

	@Override
	public String validarConta(Agencia agencia, Conta conta) {
		String mensagemRetorno = "";	

		if (agencia.getNumero() == 0) mensagemRetorno = "Número da agencia está nulo!";
		else if (conta.getNumero() == 0) mensagemRetorno = "Número da conta está nulo!";
		else mensagemRetorno = this.repositorioConta.procurarConta(agencia, conta);
		
		return mensagemRetorno;
	}
	
}
