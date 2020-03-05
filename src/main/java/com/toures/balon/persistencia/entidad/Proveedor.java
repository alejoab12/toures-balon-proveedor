package com.toures.balon.persistencia.entidad;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Document("proveedor")
@Data
public class Proveedor {
	@Id
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private String id;
	private String nombre;
	private Integer tipo;
	private List<Servicio> servicios;
	
}
