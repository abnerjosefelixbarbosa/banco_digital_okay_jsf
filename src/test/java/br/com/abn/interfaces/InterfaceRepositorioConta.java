package br.com.abn.interfaces;

import br.com.abn.model.Agencia;
import br.com.abn.model.Conta;

public interface InterfaceRepositorioConta {
	String procurarConta(Agencia agencia, Conta conta);
}
