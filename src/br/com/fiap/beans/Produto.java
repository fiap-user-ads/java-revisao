package br.com.fiap.beans;

public class Produto {
	private String nome;
	private String marca;
	private int valor;

	public Produto() {
		super();
	}

	public Produto(String nome, String marca, int valor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
