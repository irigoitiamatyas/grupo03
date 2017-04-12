package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Muber {

	Configuration cfg = new Configuration().configure("/hibernate/hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Transaction tran = null;

	public Muber() {

	}

	public void addUsuario(Usuario usuario) {

		Session session = sf.openSession();
		tran = session.beginTransaction();

		session.save(usuario);

		tran.commit();
		session.close();

	}

	public void addCalificacion(Calificacion calificacion) {
		Session session = sf.openSession();
		tran = session.beginTransaction();

		session.save(calificacion);

		tran.commit();
		session.close();

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Usuario recuperarUsuario(long id, Class clase) {
		Usuario usuario = null;
		Session session = sf.openSession();
		tran = session.beginTransaction();

		usuario = session.find(clase, id);
		usuario.getViajes().size();

		tran.commit();
		session.close();
		return usuario;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Viaje recuperarViaje(long id, Class clase) {

		Viaje viaje = null;
		Session session = sf.openSession();
		tran = session.beginTransaction();

		viaje = session.find(clase, id);
		viaje.getPasajeros().size();
		viaje.getCalificaciones().size();

		tran.commit();
		session.close();
		return viaje;

	}

	public void actualizarUsuario(Usuario usuario) {
		Session session = sf.openSession();
		tran = session.beginTransaction();

		session.merge(usuario);

		tran.commit();
		session.close();

	}

	public void actualizarViaje(Viaje viaje) {

		Session session = sf.openSession();
		tran = session.beginTransaction();

		session.merge(viaje);

		tran.commit();
		session.close();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Pasajero> listarPasajerosSimple() {

		Session session = sf.openSession();
		tran = session.beginTransaction();

		// Query q = session.createQuery("FROM Pasajero as p JOIN Viaje as v
		// WHERE p.viajes.contains(v)");
		Query q = session.createQuery("FROM Pasajero");
		List<Pasajero> p = q.getResultList();

		tran.commit();
		session.close();
		return p;

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Conductor> listarConductoresSimple() {

		Session session = sf.openSession();
		tran = session.beginTransaction();

		Query q = session.createQuery("FROM Conductor");
		List<Conductor> c = q.getResultList();

		tran.commit();
		session.close();
		return c;

	}

}
