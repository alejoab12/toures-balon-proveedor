package com.toures.balon.modelo;

import com.toures.balon.persistencia.entidad.Servicio;

import lombok.Getter;

@Getter
public class ServicioModelo {
	private String nombre;
	private String path;
	private String requestTemplate;
	private String responseTemplate;
	private String urlConfirm;
	private String topico;

	public ServicioModelo() {
		super();
	}

	public ServicioModelo(Servicio servicio) {
		this.nombre = servicio.getNombre();
		this.path = servicio.getPath();
		this.requestTemplate = servicio.getRequestTemplate();
		this.responseTemplate = servicio.getResponseTemplate();
		this.urlConfirm = servicio.getUrlConfirm();
		this.topico = servicio.getTopico();
	}

	public Servicio toEntity() {
		Servicio servicio = new Servicio();
		servicio.setNombre(this.nombre);
		servicio.setPath(this.path);
		servicio.setRequestTemplate(this.requestTemplate);
		servicio.setResponseTemplate(this.responseTemplate);
		servicio.setUrlConfirm(this.urlConfirm);
		servicio.setTopico(this.topico);
		return servicio;
	}

}
