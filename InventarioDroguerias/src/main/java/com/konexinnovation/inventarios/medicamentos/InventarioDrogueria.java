package com.konexinnovation.inventarios.medicamentos;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="inventario_droguerias")
public class InventarioDrogueria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5395980028315027505L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	@Column(name="laboratorio_fabrica")
	private String laboratorioFabrica;
	@Temporal(TemporalType.DATE)
	private Date   fechaFabricacion;
	@Temporal(TemporalType.DATE)
	private Date   fechaVencimiento;
	@Column(name="cantidad_stock")
	private Integer cantidadStock;
	@Column(name="valor_unitario")
	private Double valorUnitario;
	
	

	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLaboratorioFabrica() {
		return laboratorioFabrica;
	}
	public void setLaboratorioFabrica(String laboratorioFabrica) {
		this.laboratorioFabrica = laboratorioFabrica;
	}
	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}
	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Integer getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
