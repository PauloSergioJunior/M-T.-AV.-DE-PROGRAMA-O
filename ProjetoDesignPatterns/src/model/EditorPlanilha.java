package model;

public class EditorPlanilha extends Editores{

	private static EditorPlanilha editorPlanilha;
	
	
	private EditorPlanilha() {}

	@Override
	public String ler(Arquivo arq) {
		// TODO Auto-generated method stub
		return "Você pode visualizar a planilha: "+arq.getNome()+"."+arq.getPath();
	}

	@Override
	public String escrever(Arquivo arq) {
		// TODO Auto-generated method stub
		return "Você pode editar a planilha: "+arq.getNome()+"."+arq.getPath();
	}

	public static EditorPlanilha getInstance() {
		 if (editorPlanilha == null) {
	            editorPlanilha = new EditorPlanilha();
	        }
	        return editorPlanilha;
	}
	
}
