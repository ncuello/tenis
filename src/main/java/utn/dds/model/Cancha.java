package utn.dds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cancha {
	
	@Id
    @GeneratedValue
	private Long id;
	
	private String nombre;
	private Boolean iluminacion;
	
	@ManyToOne
	private Color color;

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

	public Boolean getIluminacion() {
		return iluminacion;
	}

	public void setIluminacion(Boolean iluminacion) {
		this.iluminacion = iluminacion;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
