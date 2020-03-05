package com.toures.balon.servicio;

import java.util.List;

import com.toures.balon.modelo.ProveedorModelo;

public interface ProveedorServicio {
	public List<ProveedorModelo> listaProveedores();
	public void guardarProveedor(ProveedorModelo proveedor);
	public ProveedorModelo buscarPorNombre(String nombre);

}
