package model;

public class EditorApresentacao extends Editores{

	private static EditorApresentacao editorApresentacao;
	
	
	private EditorApresentacao() {}

	@Override
	public String ler(Arquivo arq) {
		// TODO Auto-generated method stub
		return "Você pode visualizar a apresentão: "+arq.getNome()+"."+arq.getPath();
	}

	@Override
	public String escrever(Arquivo arq) {
		// TODO Auto-generated method stub
		return "Você pode editar a apresentão: "+arq.getNome()+"."+arq.getPath();
	}

	public static EditorApresentacao getInstance() {
		 if (editorApresentacao == null) {
	            editorApresentacao = new EditorApresentacao();
	        }
	        return editorApresentacao;
	}
	
}
