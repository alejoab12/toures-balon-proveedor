package com.toures.balon.servicio.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toures.balon.persistencia.entidad.TipoProveedor;
import com.toures.balon.persistencia.repositorio.TipoProveedorRepositorio;
import com.toures.balon.servicio.TipoProveedorServicio;

@Service
public class TipoProveedorServicioImp implements TipoProveedorServicio {
	@Autowired
	private TipoProveedorRepositorio tipoProveedorRepo;
	@Override
	public List<TipoProveedor> listaTiposProveedores() {
		return tipoProveedorRepo.findAll();
	}
	
}
