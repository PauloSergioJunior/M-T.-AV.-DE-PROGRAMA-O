package model;

public class Arquivo extends PrototypeArquivo {

	private String data;
	private String hora;
	private String proprietario;
	private String email;
	private boolean autorizacaoCopia;

	protected Arquivo(Arquivo arquivo) {
		this.nome = arquivo.getNome();
		this.path = arquivo.getPath();
	}

	public Arquivo(String nome, String path) {
		this.nome = nome;
		this.path = path;
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

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAutorizacaoCopia() {
		return autorizacaoCopia;
	}

	public void setAutorizacaoCopia(boolean autorizacaoCopia) {
		this.autorizacaoCopia = autorizacaoCopia;
	}


	public Arquivo clonar() {
		return new Arquivo(this.nome, this.path);
	}

	@Override
	public PrototypeArquivo clone() {
		return new Arquivo(this);
	}

	@Override
	public String toString() {
		return "Arquivo ["+nome+"."+path+"]";
	}


	
	
	

}
