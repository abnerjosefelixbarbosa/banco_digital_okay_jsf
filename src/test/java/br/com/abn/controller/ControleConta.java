package br.com.abn.controller;

import br.com.abn.interfaces.InterfaceControleConta;
import br.com.abn.interfaces.InterfaceNegocioConta;
import br.com.abn.model.Agencia;
import br.com.abn.model.Conta;
import br.com.abn.model.NegocioConta;

public class ControleConta implements InterfaceControleConta {
	
	private InterfaceNegocioConta negocioConta;
	
	public ControleConta() {
		this.negocioConta = new NegocioConta();
	}

	@Override
	public String acessarConta(Agencia agencia, Conta conta) {
		return negocioConta.validarConta(agencia,conta);
	}
}
