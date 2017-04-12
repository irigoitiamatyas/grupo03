package test;

import java.util.GregorianCalendar;

import modelo.Conductor;
import modelo.Muber;
import modelo.Pasajero;

public class Init1CrearUsuarios {

	public static void main(String[] args) {
		Muber muber = new Muber();
		// creamos Usuarios

		Conductor c = new Conductor("Roberto", "123", new GregorianCalendar(), "b1", new GregorianCalendar(1968, 4, 20));
		muber.addUsuario(c);
		Conductor c1 = new Conductor("Maria", "123", new GregorianCalendar(), "b2", new GregorianCalendar(1968, 4, 20));
		muber.addUsuario(c1);
		Pasajero p = new Pasajero("Diego", "4646", new GregorianCalendar(), 150.50);
		muber.addUsuario(p);
		Pasajero p1 = new Pasajero("Matias", "4646", new GregorianCalendar(), 154.50);
		muber.addUsuario(p1);
		Pasajero p2 = new Pasajero("Juan", "4646", new GregorianCalendar(), 1534.50);
		muber.addUsuario(p2);
		

		// un conductor crea un Viaje(recupero un conductor, agrego un viaje a su Collect de viajes)
//		Conductor cRecu = (Conductor) muber.recuperarUsuario(1, Conductor.class);

//		-----------------------------------------//
//		cRecu.nuevoViaje("Olmos", "Berisso", 500, new GregorianCalendar(), 4); 
//		muber.actualizarUsuario(cRecu);
//		 Finalizar el Viaje v1
		
//			Viaje viajeFin= cRecu.viajeAbierto();
//			if (viajeFin != null) {
//				viajeFin= muber.recuperarViaje(viajeFin.getIdViaje(), Viaje.class);
//				viajeFin= cRecu.finalizarViaje(viajeFin);
//				muber.actualizarViaje(viajeFin);
//				
//			}
		
		//--------------------------------------//
		
//		Agregar otro viaje 2
//		cRecu.nuevoViaje("La Quiaca", "Ushuaia", 2000.5, new GregorianCalendar(), 15); 
//		muber.actualizarUsuario(cRecu);
//		 Finalizar el Viaje 2
		
//			Viaje viajeFin= cRecu.viajeAbierto();
//			if (viajeFin != null) {
//				viajeFin= muber.recuperarViaje(viajeFin.getIdViaje(), Viaje.class);
//				viajeFin= cRecu.finalizarViaje(viajeFin);
//				muber.actualizarViaje(viajeFin);
//				
//			}


	
		
		
//		--------------agregar pasajeros a viaje--------------------------
		
//		Pasajero pRecu = (Pasajero)muber.recuperarUsuario(2, Pasajero.class);
//		Viaje vRecu = muber.recuperarViaje(1, Viaje.class);
//		
//		if(vRecu.agregarPasajero(pRecu)){
//			muber.actualizarViaje(vRecu);
//		}
//		System.out.println("-------------------->                "+vRecu.toString()+"                <------------------");
//		System.out.println("-------------------->                "+pRecu.toString()+"                <------------------");
//		
		
//		---------------- un pasajero agrega una calificacion a un viaje ya finalizado-----------------------
		
//		Pasajero pRecu1 = (Pasajero)muber.recuperarUsuario(2, Pasajero.class);
//		Viaje vRecu1 = muber.recuperarViaje(1, Viaje.class);
//		
//		Calificacion caliNueva= pRecu1.crearCalificacion(4,"el mejor viaje", vRecu1);
//		if (caliNueva != null) {
//			muber.addCalificacion(caliNueva);
//		}
//		
//		System.out.println("-------------------->                "+vRecu1.toString()+"                <------------------");
//		
		
//		------------------------- 
		
		
	}

}
