package com.konexinnovation.inventarios.medicamentos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.konexinnovation.inventarios.medicamentos.CrearVenta;
import com.konexinnovation.inventarios.medicamentos.InventarioDrogueria;

import com.konexinnovation.inventarios.medicamentos.dao.InventarioDrogueriaDAO;

import jakarta.transaction.Transactional;

@Service
public class InventarioDrogueriaServiceImpl implements IInventarioDrogueriaService {

	@Autowired
	private InventarioDrogueriaDAO inventarioDrogueriaDAO;
	

	
//	@Override
//	@Transactional
//	public List<InventarioDrogueria> findAll( int numeroDePagina, int tamanioPagina) {
//		Pageable pageable = PageRequest.of(numeroDePagina, tamanioPagina);
//		Page<InventarioDrogueria> listaInventario = inventarioDrogueriaDAO.findAll(pageable);
//		return listaInventario.getContent();
//	}
	
	@Override
	@Transactional
	public List<InventarioDrogueria> findAll( ) {
	
		 return inventarioDrogueriaDAO.findAll();
	}


	@Override
	@Transactional
	public InventarioDrogueria findById(Long id) {
		return inventarioDrogueriaDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public InventarioDrogueria save(InventarioDrogueria inventarioDrogueria) {
		// TODO Auto-generated method stub
		return inventarioDrogueriaDAO.save(inventarioDrogueria);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		inventarioDrogueriaDAO.deleteById(id);
		
	}




	


//	@Override
//	@Transactional
//	public List<InventarioDrogueria> finbByNombre(String nombre, int numeroDePagina, int tamanioPagina) {
//		// TODO Auto-generated method stub
//		return inventarioDrogueriaDAO.findByNombre(nombre);
//	}

}
