package br.com.abn.model;

public class PessoaJuridica extends Cliente {

	private String cpf;

	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String cpf,String nome, String email, String data_nascimento) {
		super(nome, email, data_nascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
