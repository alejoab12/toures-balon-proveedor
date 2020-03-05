package com.toures.balon.persistencia.entidad;

import lombok.Data;

@Data
public class Servicio {
	private String nombre;
	private String path;
	private String requestTemplate;
	private String responseTemplate;
	private String urlConfirm;
	private String topico;
}
