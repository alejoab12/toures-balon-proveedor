package com.toures.balon.persistencia.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.toures.balon.persistencia.entidad.TipoProveedor;

public interface TipoProveedorRepositorio  extends MongoRepository<TipoProveedor, String>{

}
