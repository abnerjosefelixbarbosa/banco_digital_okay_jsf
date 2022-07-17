package br.com.abn.model;

public class Extrato {
	
	private long id;
	private String data;
	private String hora;
	private String descricao;
	private double valor;
	
	public Extrato() {
		
	}

	public Extrato(long id, String data, String hora, String descricao, double valor) {
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
		this.valor = valor;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
