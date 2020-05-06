/**
 * 
 */
package model;

/**
 * @author paulo
 *
 */
public class EditorTexto extends Editores{

	private static EditorTexto editorTexto;
	
	
	private EditorTexto() {}

	@Override
	public String ler(Arquivo arq) {
		// TODO Auto-generated method stub
		return "Você pode ler o texto de: "+arq.getNome()+"."+arq.getPath();
	}

	@Override
	public String escrever(Arquivo arq) {
		// TODO Auto-generated method stub
		return "Você pode editar o texto de: "+arq.getNome()+"."+arq.getPath();
	}

	public static EditorTexto getInstance() {
		 if (editorTexto == null) {
	            editorTexto = new EditorTexto();
	        }
	        return editorTexto;
	}

}
