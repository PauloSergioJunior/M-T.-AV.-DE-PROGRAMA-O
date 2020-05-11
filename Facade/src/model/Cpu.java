package model;

public class Cpu {

	public Cpu () {
		System.out.println("\nCPU");
	}
	
	public String start() {
		return "Cpu startou";
	}
	
	public String Execute() {
		return "Cpu executou";
	}
	
	public String load() {
		return "Cpu estar fazendo o load";
	}
	
	public String free() {
		return "Cpu esta em free";
	}
}
