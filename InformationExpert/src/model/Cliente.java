package model;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
	private String nome;
	private int telefone;
	private String endereco;
	private int rg;
	private int pontosAcumulados;

	public Cliente(String nome, int telefone, String endereco, int rg) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getPontosAcumulados() {
		return pontosAcumulados;
	}

	public void setPontosAcumulados(int pontosAcumulados) {
		this.pontosAcumulados = pontosAcumulados;
	}

}