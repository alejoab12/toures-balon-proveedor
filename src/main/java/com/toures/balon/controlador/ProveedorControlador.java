package com.toures.balon.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toures.balon.persistencia.entidad.Proveedor;
import com.toures.balon.servicio.ProveedorServicio;

@RestController
@RequestMapping("/proveedor")
public class ProveedorControlador {
	@Autowired
	private ProveedorServicio proveedorServicio;
	@GetMapping("/all")
	public ResponseEntity<List<Proveedor>> listarProveedores(){
		return ResponseEntity.ok(proveedorServicio.listaProveedores());
	}
	
	@PostMapping
	public ResponseEntity<Void> guardarProveedor(Proveedor proveedor){
		proveedorServicio.guardarProveedor(proveedor);
		return ResponseEntity.ok().build();
	}
	@GetMapping
	public ResponseEntity<Proveedor> buscarPorNombre(@RequestParam("nombre") String nombre){
		return ResponseEntity.ok(proveedorServicio.buscarPorNombre(nombre));
	}
}
