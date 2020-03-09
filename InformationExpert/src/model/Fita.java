package model;

public class Fita {

	private String t�tulo;
	private Tipo c�digoDePre�o;

	public Fita(String t�tulo, Tipo c�digoDePre�o) {
		this.t�tulo = t�tulo;
		this.c�digoDePre�o = c�digoDePre�o;
	}

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t) {
		this.t�tulo = t;
	}

	public Tipo getC�digoDePre�o() {
		return c�digoDePre�o;
	}

	public void setC�digoDePre�o(Tipo c�digoDePre�o) {
		this.c�digoDePre�o = c�digoDePre�o;
	}

	@Override
	public String toString() {
		return "Fita [t�tulo=" + t�tulo + ", c�digoDePre�o=" + c�digoDePre�o + "]";
	}

}