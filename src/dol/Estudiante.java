package dol;

import java.util.Date;

public class Estudiante extends Person {
	
	private String NoCarnet;
	private Date FechaInscripcion;
	public Estudiante(String NoCarnet, Date FechaInscripcion) {
		this.NoCarnet=NoCarnet;
		this.FechaInscripcion=FechaInscripcion;
}
	public String getNoCarnet() {
		return NoCarnet;
	}
	public void setNoCarnet(String noCarnet) {
		NoCarnet = noCarnet;
	}
	public Date getFechaInscripcion() {
		return FechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		FechaInscripcion = fechaInscripcion;
	}
}