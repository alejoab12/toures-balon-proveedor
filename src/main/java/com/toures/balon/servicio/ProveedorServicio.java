package com.toures.balon.servicio;

import java.util.List;

import com.toures.balon.persistencia.entidad.Proveedor;

public interface ProveedorServicio {
	public List<Proveedor> listaProveedores();
	public void guardarProveedor(Proveedor proveedor);
	public Proveedor buscarPorNombre(String nombre);

}
