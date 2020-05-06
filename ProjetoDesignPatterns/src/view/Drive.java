package view;

import javax.swing.JOptionPane;

import controller.FactoryEditores;
import model.Arquivo;
import model.PrototypeArquivo;

public class Drive {

	public static void main(String[] args) {

		FactoryEditores fE = new FactoryEditores();
		
		String path;
		
		// Forçar que o usuario informe uma formato valido
		do {
			
			path = JOptionPane
					.showInputDialog(
							"Digite o tipo de arquivo:\n PPT para Apresentação \n " + "DOC para Texto\n XML para Planilha")
					.trim().toLowerCase();
			
		}while(fE.getEditores(path) == null);
		
		
		//Construção do arquivo
		String nomeArquivo = JOptionPane.showInputDialog("Digite o nome para arquivo:").trim();

		Arquivo arq = new Arquivo(nomeArquivo, path);
		
		//Permissão para criar uma copia do arquivo
		int permissao = JOptionPane.showConfirmDialog(null, "Deseja autorizar a copia desse arquivo?", "Permissões", 0);
		
		if(permissao == 0) {
			arq.setAutorizacaoCopia(true);
			JOptionPane.showMessageDialog(null, "Copia libera para uso");
			PrototypeArquivo pA = arq.clonar();
			System.out.println(pA);
		}
		 
		// Verificação para a chamada das ações para o arquivo (Ler e Escrever).
		String acao = JOptionPane.showInputDialog("Digite o tipo de ação que deseja fazer com o arquivo:\n"
					+ nomeArquivo + "." + path + "\n\n Ler \n " + "Escrever\n").trim().toLowerCase();

			if (acao.equals("ler")) {
				JOptionPane.showMessageDialog(null, fE.getEditores(arq.getPath()).ler(arq));
			}
			else if (acao.equals("escrever")) {
				JOptionPane.showMessageDialog(null, fE.getEditores(arq.getPath()).escrever(arq));		
			}
			else {
				JOptionPane.showMessageDialog(null, "A ação não aceita!");				
			}
		

	}

}
