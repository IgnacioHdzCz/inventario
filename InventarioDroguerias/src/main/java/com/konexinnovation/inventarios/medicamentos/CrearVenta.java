package com.konexinnovation.inventarios.medicamentos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="ventas")
public class CrearVenta {

	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_y_hora_venta")
	private Date fechaYHoraVenta;
	
	private String medicamento;
	private Integer cantidad;
	@Column(name="valor_unitario_venta")
	private  String valorUnitarioVenta;
	private String valorTotal;
	
	
	
}
