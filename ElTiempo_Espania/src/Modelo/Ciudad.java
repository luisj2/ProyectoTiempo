package Modelo;

import java.util.Date;

public class Ciudad {
	Date fecha;
	String ciudad;
	int tempMax;
	int tempMin;
	String clima;
	public Ciudad() {
		//super();
	}
	public Ciudad(Date fecha, String ciudad, int tempMax, int tempMin, String clima) {
		//super();
		this.fecha = fecha;
		this.ciudad = ciudad;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.clima = clima;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getTempMax() {
		return tempMax;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	public int getTempMin() {
		return tempMin;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	@Override
	public String toString() {
		return "Tiempo [fecha=" + fecha + ", ciudad=" + ciudad + ", tempMax=" + tempMax + ", tempMin=" + tempMin
				+ ", clima=" + clima + "]";
	}
	
}
