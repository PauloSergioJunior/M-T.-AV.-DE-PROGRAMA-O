/**
 * 
 */
package controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import model.Aluguel;
import model.Cliente;
import model.Tipo;

/**
 * @author Paulo
 *
 */
public class Caixa {

	private Cliente cliente;
	private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
	private double valorTotal;

	public Caixa(Cliente cliente, Collection<Aluguel> fitasAlugadas) {
		this.cliente = cliente;
		this.fitasAlugadas = fitasAlugadas;
	}

	public String extrato() {
		final String fimDeLinha = System.getProperty("line.separator");
		valorTotal = 0.0;
		int pontosDeAlugadorFrequente = 0;
		String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;

		for (Aluguel fita : fitasAlugadas) {

			double valorCorrente = 0.0;

			// determina valores dependendo do tipo da fita
			// switch com enum
			switch (fita.getFita().getCódigoDePreço()) {
			case normal:
				valorCorrente += 2;
				if (fita.getDiasAlugada() > 2) {
					valorCorrente += (fita.getDiasAlugada() - 2) * 1.5;
				}
				break;
			case lancamento:
				valorCorrente += fita.getDiasAlugada() * 3;
				break;
			case infantil:
				valorCorrente += 1.5;
				if (fita.getDiasAlugada() > 3) {
					valorCorrente += (fita.getDiasAlugada() - 3) * 1.5;
				}
				break;
			} // switch
				// trata de pontos de alugador frequente
			pontosDeAlugadorFrequente++;
			// adiciona bonus para aluguel de um lançamento por pelo menos 2
			// dias
			if (fita.getFita().getCódigoDePreço() == Tipo.lancamento && fita.getDiasAlugada() == 1) {
				pontosDeAlugadorFrequente++;
			}

			// mostra valores para este aluguel
			resultado += "\t" + fita.getFita().getTítulo() + "\t" + valorCorrente + fimDeLinha;
			valorTotal += valorCorrente;
			cliente.setPontosAcumulados(pontosDeAlugadorFrequente);
		} // while
			// adiciona rodapé
		resultado += "Valor total devido: " + valorTotal + fimDeLinha;
		resultado += "Voce acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente" + fimDeLinha;
		resultado += "Seu total de pontos acumulados é de : " + cliente.getPontosAcumulados() + fimDeLinha;
		return resultado;
	}

}
