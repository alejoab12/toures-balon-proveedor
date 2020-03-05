package com.toures.balon.persistencia.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

@Document("tipo_proveedor")
@Data
public class TipoProveedor {
	@Id
	@JsonProperty(access = Access.READ_ONLY)  
	private String id;
	private Integer idTipoProveedor;
	private String nombre;
	private String pathServicio;
}
