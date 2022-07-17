package br.com.abn.model;

public class Endereco {

	private String cep;
	private String bairo;
	private String cidade;
	private String estado;
	private String logradouro;
	
	public Endereco() {
		
	}

	public Endereco(String cep, String bairo, String cidade, String estado, String logradouro) {
		this.cep = cep;
		this.bairo = bairo;
		this.cidade = cidade;
		this.estado = estado;
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairo() {
		return bairo;
	}

	public void setBairo(String bairo) {
		this.bairo = bairo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
}
