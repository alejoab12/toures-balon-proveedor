package com.toures.balon.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.toures.balon.persistencia.entidad.Proveedor;
import com.toures.balon.persistencia.entidad.Servicio;

import lombok.Getter;

@Getter
public class ProveedorModelo {	
	private String nombre;
	private Integer tipo;
	private List<ServicioModelo> servicios;
	public ProveedorModelo(Proveedor proveedor) {
		this.nombre=proveedor.getNombre();
		this.tipo=proveedor.getTipo();
		if(Objects.nonNull(proveedor.getServicios())&&!proveedor.getServicios().isEmpty()) {
			this.servicios=new ArrayList<>(proveedor.getServicios().size());
			proveedor.getServicios().forEach(servicio->{
				this.servicios.add(new ServicioModelo(servicio));
			});
		}
	}
	public Proveedor toEntity() {
		Proveedor proveedor=new Proveedor();
		proveedor.setNombre(this.nombre);
		proveedor.setTipo(this.tipo);
		if(Objects.nonNull(servicios)&&!servicios.isEmpty()) {
			List<Servicio> servicios=new ArrayList<>(this.servicios.size());
			this.servicios.forEach(servicio->{
				servicios.add(servicio.toEntity());
			});
			proveedor.setServicios(servicios);
		}
		return proveedor;
	}

}
