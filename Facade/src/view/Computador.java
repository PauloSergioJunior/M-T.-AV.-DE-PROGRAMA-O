package view;

import controller.Facade;

public class Computador {

	public static void main(String[] args) {
		
		Facade f = new Facade();
		
		f.ligar();
		f.loads();
		f.execute();
		f.escrever();
		
		
	}

}
