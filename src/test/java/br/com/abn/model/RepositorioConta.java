package br.com.abn.model;

import br.com.abn.interfaces.InterfaceRepositorioConta;

public class RepositorioConta implements InterfaceRepositorioConta {

	@Override
	public String procurarConta(Agencia agencia, Conta conta) {
		String mensagemRetorno = "Conta acessada!";
		return mensagemRetorno;
	}
}
