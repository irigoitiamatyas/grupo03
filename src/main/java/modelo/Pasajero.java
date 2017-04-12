package modelo;

import java.util.Calendar;

public class Pasajero extends Usuario {

	private double credito;

	public Pasajero() {
		// TODO Auto-generated constructor stub
	}

	public Pasajero(String nombreUsuario, String contrasenia, Calendar fechaIngreso, double credito) {
		super(nombreUsuario, contrasenia, fechaIngreso);
		this.credito = credito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public Calificacion crearCalificacion(int puntaje, String comentario, Viaje viaje) {
		
		if (viaje.isFinalizo()) {
			Calificacion calificacion = new Calificacion(puntaje, comentario, this, viaje);
			viaje.getCalificaciones().add(calificacion);
			return calificacion;
		}
		return null;

	}

	@Override
	public String toString() {
		return "Pasajero [credito=" + credito + ", toString()=" + super.toString() + "]";
	}

	public String toStringSimple(){
		return "Pasajero [credito=" + credito + ", toString()=" + super.toStringSimple() + "]";
		
	}
}
