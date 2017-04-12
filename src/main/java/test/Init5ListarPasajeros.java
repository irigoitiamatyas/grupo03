package test;

import java.util.List;

import modelo.Muber;
import modelo.Pasajero;

public class Init5ListarPasajeros {

	public static void main(String[] args) {
		Muber muber = new Muber();
		
		List<Pasajero> pasajeros = muber.listarPasajerosSimple();
		
		for (Pasajero pasajero : pasajeros) {
			System.out.println("------------      "+ pasajero.toStringSimple()+"       -----------------");
		}
	}

}
