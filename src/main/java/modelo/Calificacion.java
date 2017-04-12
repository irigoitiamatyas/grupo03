package modelo;
//comentario
public class Calificacion {

	private long idCalificacion;
	private int puntaje;
	private String comentario;
	private Pasajero pasajero;
	private Viaje viaje;

	public Calificacion() {
		// TODO Auto-generated constructor stub
	}

	public Calificacion(int puntaje, String comentario, Pasajero pasajero, Viaje viaje) {
		super();
		this.puntaje = puntaje;
		this.comentario = comentario;
		this.pasajero = pasajero;
		this.viaje = viaje;
	}

	public long getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(long idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "Calificacion [idCalificacion=" + idCalificacion + ", puntaje=" + puntaje + ", comentario=" + comentario
				+ ", pasajero=" + pasajero.getIdUsuario() + ", viaje=" + viaje.getIdViaje() + "]";
	}

	
}
