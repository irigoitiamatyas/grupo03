package test;

import java.util.GregorianCalendar;

import modelo.Conductor;
import modelo.Muber;

public class Init2ConductoresInicianViajes {

	public static void main(String[] args) {
		Muber muber = new Muber();

		// un conductor crea un Viaje(recupero un conductor, agrego un viaje a
		// su Collect de viajes)
		Conductor cRecu = (Conductor) muber.recuperarUsuario(1, Conductor.class);

		cRecu.nuevoViaje("Olmos", "Berisso", 500, new GregorianCalendar(), 4);
		muber.actualizarUsuario(cRecu);

		// otro conductor crea un Viaje(recupero un conductor, agrego un viaje a
		// su Collect de viajes)
		Conductor cRecu1 = (Conductor) muber.recuperarUsuario(2, Conductor.class);
		
		cRecu1.nuevoViaje("La Quiaca", "Ushuaia", 2000.5, new GregorianCalendar(), 15);
		muber.actualizarUsuario(cRecu1);

	}

}
