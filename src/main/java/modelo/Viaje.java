package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Viaje {

	private long idViaje;
	private String destino;
	private String origen;
	private double costo;
	private Calendar fecha;
	private int maxPasajeros;
	private boolean finalizo;
	private Collection<Pasajero> pasajeros;
	private Collection<Calificacion> calificaciones;

	public Viaje() {
		this.setPasajeros(new HashSet<Pasajero>());
		this.setCalificaciones(new HashSet<Calificacion>());
		this.setFinalizo(false);
	}

	public Viaje(String destino, String origen, double costo, Calendar fecha, int maxPasajeros) {
		this();
		this.destino = destino;
		this.origen = origen;
		this.costo = costo;
		this.fecha = fecha;
		this.maxPasajeros = maxPasajeros;
	}

	public long getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(long idViaje) {
		this.idViaje = idViaje;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public int getMaxPasajeros() {
		return maxPasajeros;
	}

	public void setMaxPasajeros(int maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}

	public boolean isFinalizo() {
		return finalizo;
	}

	public void setFinalizo(boolean finalizo) {
		this.finalizo = finalizo;
	}

	public Collection<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Collection<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Collection<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Collection<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		if (!this.getPasajeros().contains(pasajero) && !this.isFinalizo() && this.getMaxPasajeros() > 0) {
			this.getPasajeros().add(pasajero);
			pasajero.getViajes().add(this);// PREGUNTAR
			this.setMaxPasajeros(this.getMaxPasajeros() - 1);
			return true;
		}
		return false;

	}
	public void descontarCredito(){
		double costoPorPasajero= this.getCosto() / this.getPasajeros().size(); 
		for (Pasajero pasajero : this.getPasajeros()) {
			pasajero.setCredito(pasajero.getCredito() - costoPorPasajero);
		}
	}

	public List<Long> imprimirPasajeros() {
		List<Long> idPasajeros = new ArrayList<Long>();
		for (Pasajero pasajero : this.pasajeros) {
			idPasajeros.add(pasajero.getIdUsuario());
		}
		return idPasajeros;
	}

	public List<Long> imprimirCalificaciones() {
		List<Long> idCalificaciones = new ArrayList<Long>();
		for (Calificacion calificacion : this.calificaciones) {
			idCalificaciones.add(calificacion.getIdCalificacion());
		}
		return idCalificaciones;
	}

	@Override
	public String toString() {
		return "Viaje [idViaje=" + idViaje + ", destino=" + destino + ", origen=" + origen + ", costo=" + costo
				+ ", fecha=" + fecha.getTime() + ", maxPasajeros=" + maxPasajeros + ", finalizo=" + finalizo
				+ ", pasajeros=" + this.imprimirPasajeros() + ", calificaciones=" + this.imprimirCalificaciones() + "]";
	}

}
