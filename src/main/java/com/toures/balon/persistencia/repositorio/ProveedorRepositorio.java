package com.toures.balon.persistencia.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.toures.balon.persistencia.entidad.Proveedor;

public interface ProveedorRepositorio extends MongoRepository<Proveedor,String > {
	
	public Proveedor findByNombre(String nombre);

}
