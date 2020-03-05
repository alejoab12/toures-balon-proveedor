package com.toures.balon.servicio.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toures.balon.persistencia.entidad.Proveedor;
import com.toures.balon.persistencia.repositorio.ProveedorRepositorio;
import com.toures.balon.servicio.ProveedorServicio;
@Service
public class ProveedorServicioImp implements ProveedorServicio {
	@Autowired
	private ProveedorRepositorio proveedorRepo;
	@Override
	public List<Proveedor> listaProveedores() {
		return proveedorRepo.findAll();
	}
	@Override
	public void guardarProveedor(Proveedor proveedor) {
		proveedorRepo.save(proveedor);
		
	}
	@Override
	public Proveedor buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return proveedorRepo.findByNombre(nombre);
	}

}
