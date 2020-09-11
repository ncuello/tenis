package utn.dds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Paleta {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private Double grosor;
	
	@ManyToOne
	private Color color;

	@ManyToOne
	private ConstructorPaleta constructor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getGrosor() {
		return grosor;
	}
	public void setGrosor(Double grosor) {
		this.grosor = grosor;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
