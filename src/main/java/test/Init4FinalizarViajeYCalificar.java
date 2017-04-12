package test;

import modelo.Calificacion;
import modelo.Conductor;
import modelo.Muber;
import modelo.Pasajero;
import modelo.Viaje;

public class Init4FinalizarViajeYCalificar {

	public static void main(String[] args) {

		Muber muber = new Muber();
		Conductor cRecu = (Conductor) muber.recuperarUsuario(1, Conductor.class);

		// ----------cRecu finaliza su viaje-------------

		Viaje viajeFin = cRecu.viajeAbierto();
		if (viajeFin != null) {
			//recupero al viaje de la base asi me traigo a los pasajeros
			viajeFin = muber.recuperarViaje(viajeFin.getIdViaje(), Viaje.class);
			//dentro de finalizarViaje(Viaje v) llama a el metodo descontarCredito() del viaje y le decuenta a los pasajeros
			viajeFin = cRecu.finalizarViaje(viajeFin);
			muber.actualizarViaje(viajeFin);

		}

		// ---------Cada Pasajero del viaje le asigna una calificacion y un
		// comentario-----

		Pasajero pRecu1 = (Pasajero) muber.recuperarUsuario(3, Pasajero.class);
		Pasajero pRecu2 = (Pasajero) muber.recuperarUsuario(4, Pasajero.class);
		Viaje vRecu1 = muber.recuperarViaje(1, Viaje.class);

		// Antes de crear la calificacion verifico que el viaje este finalizado
		Calificacion califNueva1 = pRecu1.crearCalificacion(5, "el mejor viaje", vRecu1);
		if (califNueva1 != null) {
			muber.addCalificacion(califNueva1);
		}

		Calificacion califNueva2 = pRecu2.crearCalificacion(1, "el peor viaje", vRecu1);
		if (califNueva2 != null) {
			muber.addCalificacion(califNueva2);
		}
		
		System.out.println("-------------------->                "+vRecu1.toString()+"                <------------------");

	}

}
