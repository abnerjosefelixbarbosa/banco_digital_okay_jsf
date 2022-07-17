package br.com.abn.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.com.abn.controller.ControleConta;
import br.com.abn.interfaces.InterfaceControleConta;
import br.com.abn.model.Agencia;
import br.com.abn.model.Conta;
import br.com.abn.model.Corrente;

public class VisaoConta {
	
	private InterfaceControleConta controleConta;

	public VisaoConta() {
		controleConta = new ControleConta();
	}

	@Test
	public void acessarConta() {
		String mensagemRetorno = "";
		
		try {			
			Agencia agencia = new Agencia();
			Conta corrente = new Corrente();
			
			agencia.setNumero(1);
			corrente.setNumero(1);
			mensagemRetorno = this.controleConta.acessarConta(agencia, corrente);	
			
		} catch (Exception e) {
			mensagemRetorno = e.getMessage();
		}
		
		assertEquals("Conta acessada!", mensagemRetorno);		
	}
	
}
