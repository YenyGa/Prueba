package com.acn.practica.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoriaProducto {

	@Id
	private int id;
    private String nombre;
    private String descripcion;
    private int estado;
    
	public CategoriaProducto(String nombre, String descripcion, int estado) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
    
}
