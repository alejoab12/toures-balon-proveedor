package com.toures.balon.servicio.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toures.balon.modelo.ProveedorModelo;
import com.toures.balon.persistencia.entidad.Proveedor;
import com.toures.balon.persistencia.repositorio.ProveedorRepositorio;
import com.toures.balon.servicio.ProveedorServicio;

@Service
public class ProveedorServicioImp implements ProveedorServicio {
	@Autowired
	private ProveedorRepositorio proveedorRepo;

	@Override
	public List<ProveedorModelo> listaProveedores() {
		List<Proveedor> proveedores = proveedorRepo.findAll();
		List<ProveedorModelo> proveedoresModelo = null;
		if (Objects.nonNull(proveedores)) {
			proveedoresModelo = new ArrayList<>(proveedores.size());
			for (Proveedor proveedor : proveedores) {
				proveedoresModelo.add(new ProveedorModelo(proveedor));
			}
		}

		return proveedoresModelo;
	}

	@Override
	public void guardarProveedor(ProveedorModelo proveedorModelo) {
		System.out.println(proveedorModelo);
		proveedorRepo.save(proveedorModelo.toEntity());

	}

	@Override
	public ProveedorModelo buscarPorNombre(String nombre) {
		return new ProveedorModelo(proveedorRepo.findByNombre(nombre));
	}

}
