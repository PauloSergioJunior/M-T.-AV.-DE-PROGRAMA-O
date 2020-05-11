package controller;

import model.Cpu;
import model.HardDrive;
import model.Memoria;

public class Facade {

	public void ligar() {
		Cpu cpu = new Cpu();
		System.out.println(cpu.start());
		
	}
	
	public void execute() {
		Cpu cpu = new Cpu();
		System.out.println(cpu.Execute());
		HardDrive hd = new HardDrive();
		System.out.println(hd.read());
	}
	
	public void loads() {
		Memoria m = new Memoria();
		System.out.println(m.load());
		Cpu cpu = new Cpu();
		System.out.println(cpu.load());
	}
	
	public void escrever() {
		HardDrive hd = new HardDrive();
		System.out.println(hd.write());
		
	}

}
