package model;

public abstract class PrototypeArquivo {

	protected String nome;
	protected String path;
	
	public PrototypeArquivo() {}
	
	public abstract PrototypeArquivo clone();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
