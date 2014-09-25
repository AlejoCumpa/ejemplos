package com.android.espanol.listapersonalizada;

public class Contacto {

	private String nombre;
	private String ultimoMensaje;
	private String fechaUltimoMensaje;
	
	public Contacto()
	{
		this.nombre = "";
		this.ultimoMensaje="";
		this.fechaUltimoMensaje="";
	}
	
	public Contacto(String Nombre, String Mensaje, String fecha)
	{
		this.nombre = Nombre;
		this.ultimoMensaje = Mensaje;
		this.fechaUltimoMensaje = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUltimoMensaje() {
		return ultimoMensaje;
	}
	public void setUltimoMensaje(String ultimoMensaje) {
		this.ultimoMensaje = ultimoMensaje;
	}
	public String getFechaUltimoMensaje() {
		return fechaUltimoMensaje;
	}
	public void setFechaUltimoMensaje(String fechaUltimoMensaje) {
		this.fechaUltimoMensaje = fechaUltimoMensaje;
	}
	
}
