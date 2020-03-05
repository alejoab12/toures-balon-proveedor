package com.toures.balon.servicio.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toures.balon.modelo.TipoProveedorModelo;
import com.toures.balon.persistencia.entidad.TipoProveedor;
import com.toures.balon.persistencia.repositorio.TipoProveedorRepositorio;
import com.toures.balon.servicio.TipoProveedorServicio;

@Service
public class TipoProveedorServicioImp implements TipoProveedorServicio {
	@Autowired
	private TipoProveedorRepositorio tipoProveedorRepo;

	@Override
	public List<TipoProveedorModelo> listaTiposProveedores() {
		List<TipoProveedor> tiposProveedor = tipoProveedorRepo.findAll();
		List<TipoProveedorModelo> tiposProveedorModelo = null;
		if (Objects.nonNull(tiposProveedor) && !tiposProveedor.isEmpty()) {
			tiposProveedorModelo = new ArrayList<>(tiposProveedor.size());
			for (TipoProveedor tipo : tiposProveedor) {
				tiposProveedorModelo.add(new TipoProveedorModelo(tipo));
			}
		}
		return tiposProveedorModelo;
	}

}
