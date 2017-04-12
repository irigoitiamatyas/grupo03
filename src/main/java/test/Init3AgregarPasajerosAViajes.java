package test;

import modelo.Muber;
import modelo.Pasajero;
import modelo.Viaje;

public class Init3AgregarPasajerosAViajes {

	public static void main(String[] args) {

		// --------------agregar pasajeros a viaje--------------------------

		Muber muber = new Muber();
		Pasajero pRecu = (Pasajero) muber.recuperarUsuario(3, Pasajero.class);
		Viaje vRecu = muber.recuperarViaje(1, Viaje.class);

		if (vRecu.agregarPasajero(pRecu)) { // en este metodo se chequea que no
											// haya finalizado el viaje y otras
											// cosas
			muber.actualizarViaje(vRecu);
		}

		System.out.println("-------------------->                "+vRecu.toString()+"                <------------------");
		System.out.println("-------------------->                "+pRecu.toString()+"                <------------------");
		
		
		// --------------agregar otro pasajero al mismo viaje -----------------------

		Pasajero pRecu1 = (Pasajero) muber.recuperarUsuario(4, Pasajero.class);
		Viaje vRecu1 = muber.recuperarViaje(1, Viaje.class);

		if (vRecu1.agregarPasajero(pRecu1)) {// en este metodo se chequea que no
												// haya finalizado el viaje y
												// otras cosas
			muber.actualizarViaje(vRecu1);
		}
		
		System.out.println("-------------------->                "+vRecu1.toString()+"                <------------------");
		System.out.println("-------------------->                "+pRecu1.toString()+"                <------------------");

	}

}
