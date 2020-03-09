/**
 * 
 */
package view;

import java.util.ArrayList;
import java.util.Collection;

import controller.Caixa;
import model.Aluguel;
import model.Cliente;
import model.Fita;
import model.Tipo;

/**
 * @author Paulo
 *
 */
public class Locadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fita f = new Fita("mar morto", Tipo.lancamento);
		Fita f1 = new Fita("toy", Tipo.infantil);
		Fita f2 = new Fita("lagoa", Tipo.normal);
		Fita f3 = new Fita("lagoa azul", Tipo.normal);
		Aluguel a = new Aluguel(f, 1);
		Aluguel a1 = new Aluguel(f2, 6);
		Aluguel a2 = new Aluguel(f1, 3);
		Aluguel a3 = new Aluguel(f3, 2);
		Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
		fitasAlugadas.add(a);
		fitasAlugadas.add(a1);
		fitasAlugadas.add(a2);
		fitasAlugadas.add(a3);
		Cliente c = new Cliente("Paulo", 5555, "Rua 0", 0000);
		
		
		Caixa cx = new Caixa(c, fitasAlugadas);
		Caixa cx2 = new Caixa(c, fitasAlugadas);
		
		System.out.println(cx.extrato());
		System.out.println(cx2.extrato());
		
		

	}

}
