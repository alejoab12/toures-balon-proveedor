package com.toures.balon.modelo;

import com.toures.balon.persistencia.entidad.TipoProveedor;

import lombok.Getter;

@Getter
public class TipoProveedorModelo {
	private Integer idTipoProveedor;
	private String nombre;
	private String pathServicio;

	public TipoProveedorModelo() {
	}

	public TipoProveedorModelo(TipoProveedor tipoProveedor) {
		this.idTipoProveedor = tipoProveedor.getIdTipoProveedor();
		this.nombre = tipoProveedor.getNombre();
		this.pathServicio = tipoProveedor.getPathServicio();
	}

	public TipoProveedor toEntity() {
		TipoProveedor tipoProveedor = new TipoProveedor();
		tipoProveedor.setIdTipoProveedor(this.idTipoProveedor);
		tipoProveedor.setPathServicio(this.pathServicio);
		return tipoProveedor;
	}
}
