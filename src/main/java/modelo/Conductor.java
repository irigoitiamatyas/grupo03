package modelo;

import java.util.Calendar;

public class Conductor extends Usuario {

	private String tipoLicencia;
	private Calendar fechaLicencia;

	public Conductor() {

	}

	public Conductor(String nombreUsuario, String contrasenia, Calendar fechaIngreso, String tipoLicencia,
			Calendar fechaLicencia) {
		// this();----------> no puedo!!
		super(nombreUsuario, contrasenia, fechaIngreso);
		this.fechaLicencia = fechaLicencia;
		this.tipoLicencia = tipoLicencia;
	}

	public String getTipoLicencia() {
		return tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public Calendar getFechaLicencia() {
		return fechaLicencia;
	}

	public void setFechaLicencia(Calendar fechaLicencia) {
		this.fechaLicencia = fechaLicencia;
	}

	public Viaje finalizarViaje(Viaje viaje) {
		if (viaje != null) {
			if (!viaje.isFinalizo()) {
				viaje.setFinalizo(true);
				viaje.descontarCredito();
				return viaje;
			}
		}
		return null;
	}

	public Viaje viajeAbierto() {
		for (Viaje viaje : this.getViajes()) {
			if (!viaje.isFinalizo()) {
				return viaje;
			}
		}
		return null;
	}

	public void nuevoViaje(String destino, String origen, double costo, Calendar fecha, int maxPasajeros) {
		Viaje viaje = new Viaje(destino, origen, costo, fecha, maxPasajeros);
		this.agregarViaje(viaje);

	}

	@Override
	public String toString() {
		return "Conductor [tipoLicencia=" + tipoLicencia + ", fechaLicencia=" + fechaLicencia.getTime()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public String toStringSimple(){
		return "Conductor [tipoLicencia=" + tipoLicencia + ", fechaLicencia=" + fechaLicencia.getTime()
		+ ", toString()=" + super.toStringSimple() + "]";
	}

}
