package Modelo;

import java.util.List;

public class Ciudades {

	private List <Ciudad> ciudades;

	public Ciudades() {
		super();
	}

	public Ciudades(List<Ciudad> ciudades) {
		super();
		this.ciudades = ciudades;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	@Override
	public String toString() {
		return "Ciudades [ciudades=" + ciudades + "]";
	}
	
	
}
