package utn.dds.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Partido {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Cancha cancha;
	private Date inicio;
	private Date fin;
	
	@ManyToMany
	@JoinTable(name="Participantes")
	private List<Jugador> jugadores;
	
	@ManyToMany
	@JoinTable(name="Participantes")
	private List<Paleta> paletas;
	
	@ManyToOne
	private Color colorCancha;
	
	@ManyToOne
	private Jugador solicitante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Color getColorCancha() {
		return colorCancha;
	}

	public void setColorCancha(Color colorCancha) {
		this.colorCancha = colorCancha;
	}

	public Jugador getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Jugador solicitante) {
		this.solicitante = solicitante;
	}
	
	
}
