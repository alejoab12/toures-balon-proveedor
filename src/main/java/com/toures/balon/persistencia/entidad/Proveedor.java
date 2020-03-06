package com.toures.balon.persistencia.entidad;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "proveedor")
@Data
public class Proveedor {
	@Id
	private String id;
	// @Indexed(unique = true)
	private String nombre;
	private Integer tipo;
	private List<Servicio> servicios;

}
