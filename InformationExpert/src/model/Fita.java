package model;

public class Fita {

	private String título;
	private Tipo códigoDePreço;

	public Fita(String título, Tipo códigoDePreço) {
		this.título = título;
		this.códigoDePreço = códigoDePreço;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String t) {
		this.título = t;
	}

	public Tipo getCódigoDePreço() {
		return códigoDePreço;
	}

	public void setCódigoDePreço(Tipo códigoDePreço) {
		this.códigoDePreço = códigoDePreço;
	}

	@Override
	public String toString() {
		return "Fita [título=" + título + ", códigoDePreço=" + códigoDePreço + "]";
	}

}