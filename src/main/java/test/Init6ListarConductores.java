package test;

import java.util.List;

import modelo.Conductor;
import modelo.Muber;

public class Init6ListarConductores {

	public static void main(String[] args) {
	Muber muber = new Muber();
		
		List<Conductor> conductores = muber.listarConductoresSimple();
		
		for (Conductor conductor : conductores) {
			System.out.println("------------      "+ conductor.toStringSimple()+"       -----------------");
		}
	}

}
