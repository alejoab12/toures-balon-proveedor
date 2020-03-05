package com.toures.balon.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toures.balon.modelo.TipoProveedorModelo;
import com.toures.balon.servicio.TipoProveedorServicio;

@RestController
@RequestMapping("/proveedor/tipo")
public class TipoProveedorControlador {
	@Autowired
	private TipoProveedorServicio tipoProveedorServicio;

	@GetMapping
	public ResponseEntity<List<TipoProveedorModelo>> listarTiposProveedor() {
		return ResponseEntity.ok(tipoProveedorServicio.listaTiposProveedores());
	}

}
