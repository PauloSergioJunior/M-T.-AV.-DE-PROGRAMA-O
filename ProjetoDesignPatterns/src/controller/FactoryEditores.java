package controller;

import javax.swing.JOptionPane;

import model.EditorApresentacao;
import model.EditorPlanilha;
import model.EditorTexto;
import model.Editores;

public class FactoryEditores {

	public FactoryEditores(){}
	
	
	public Editores getEditores(String arquivo){
		if (arquivo.equals("doc")) {
			return EditorTexto.getInstance();
		}
		else if (arquivo.equals("xml")) {
			return EditorPlanilha.getInstance();
		}
		else if (arquivo.equals("ppt")) {
			return EditorApresentacao.getInstance();
		}
		else { 
			JOptionPane.showMessageDialog(null, "O formato do arquivo não é aceito!");
			return null;
			}
			
	}
	
}
