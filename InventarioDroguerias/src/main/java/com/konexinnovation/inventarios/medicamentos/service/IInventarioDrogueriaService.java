package com.konexinnovation.inventarios.medicamentos.service;

import java.util.List;

import com.konexinnovation.inventarios.medicamentos.CrearVenta;
import com.konexinnovation.inventarios.medicamentos.InventarioDrogueria;

public interface IInventarioDrogueriaService {
	
//	public List<InventarioDrogueria> findAll(int numeroDePagina,int tamanioPagina)
	public List<InventarioDrogueria> findAll();

	public InventarioDrogueria findById (Long id);
	public InventarioDrogueria save(InventarioDrogueria inventarioDrogueria);
	public void deleteById(Long id);
//	public List<InventarioDrogueria> finbByNombre(String nombre, int numeroDePagina,int tamanioPagina);
}
