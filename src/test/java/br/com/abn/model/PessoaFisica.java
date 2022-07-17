package br.com.abn.model;

public class PessoaFisica extends Cliente {

	private String cnpj;

	public PessoaFisica() {
		
	}

	public PessoaFisica(String cnpj, String nome, String email, String data_nascimento) {
		super(nome, email, data_nascimento);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
