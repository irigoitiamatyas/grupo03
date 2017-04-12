package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public abstract class Usuario {

	private long idUsuario;
	private String nombreUsuario;
	private String contrasenia;
	private Calendar fechaIngreso;
	private Collection<Viaje> viajes;

	public Usuario() {
		this.setViajes(new HashSet<Viaje>());
	}

	public Usuario(String nombreUsuario, String contrasenia, Calendar fechaIngreso) {
		this();
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.fechaIngreso = fechaIngreso;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Collection<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Collection<Viaje> viajes) {
		this.viajes = viajes;
	}

	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}

	public List<Long> imprimirViajes() {
		List<Long> idViajes = new ArrayList<Long>();
		for (Viaje viaje : this.viajes) {
			idViajes.add(viaje.getIdViaje());
		}
		return idViajes;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia
				+ ", fechaIngreso=" + fechaIngreso.getTime() + ", viajes=" + this.imprimirViajes() + "]";
	}

	public String toStringSimple() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia
				+ ", fechaIngreso=" + fechaIngreso.getTime() + "]";
	}

}
