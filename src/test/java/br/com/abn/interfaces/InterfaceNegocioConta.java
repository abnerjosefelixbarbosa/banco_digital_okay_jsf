package br.com.abn.interfaces;

import br.com.abn.model.Agencia;
import br.com.abn.model.Conta;

public interface InterfaceNegocioConta {
	String validarConta(Agencia agencia, Conta conta);
}
