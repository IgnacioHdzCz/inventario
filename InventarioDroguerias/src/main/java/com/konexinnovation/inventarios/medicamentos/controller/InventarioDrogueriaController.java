package com.konexinnovation.inventarios.medicamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.konexinnovation.inventarios.medicamentos.CrearVenta;
import com.konexinnovation.inventarios.medicamentos.InventarioDrogueria;
import com.konexinnovation.inventarios.medicamentos.service.IInventarioDrogueriaService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InventarioDrogueriaController {
	
	@Autowired
	private IInventarioDrogueriaService inventarioDrogueriaService;
	
	
//	@GetMapping("/filtrar/{nombre}")
//	public List<InventarioDrogueria> filtrar(@PathVariable String nombre,@RequestParam(value="pageNo",defaultValue = "0",required = false) 
//	int numeroPag,@RequestParam(value="pageSize",defaultValue = "4",required = false) int tamPagina){
//		
//		return inventarioDrogueriaService.finbByNombre(  nombre, numeroPag, tamPagina);
//		
//		
//		
//	}

	
	
	//Listar medicamentos
	
//	@GetMapping("/listar")
//	public List<InventarioDrogueria> listar(@RequestParam(value="pageNo",defaultValue = "0",required = false) 
//	int numeroPagina,@RequestParam(value="pageSize",defaultValue = "4",required = false) int tamanioPagina){
//		
//		return inventarioDrogueriaService.findAll(numeroPagina,tamanioPagina);
//		
//	}

	
	@GetMapping("/listar")
	public List<InventarioDrogueria> listar() {
		
		return inventarioDrogueriaService.findAll();
		
	}
	// Crear
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public InventarioDrogueria crear(@RequestBody InventarioDrogueria inventarioDrogueria) {
		return inventarioDrogueriaService.save(inventarioDrogueria);
	}
	
	@PutMapping("/actualizar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public InventarioDrogueria editar (@RequestBody InventarioDrogueria inventarioDrogueria, @PathVariable Long id) {
		InventarioDrogueria inventarioModificar = inventarioDrogueriaService.findById(id);
		inventarioModificar.setNombre(inventarioDrogueria.getNombre());
		inventarioModificar.setLaboratorioFabrica(inventarioDrogueria.getLaboratorioFabrica());
		inventarioModificar.setFechaFabricacion(inventarioDrogueria.getFechaFabricacion());
		inventarioModificar.setFechaVencimiento(inventarioModificar.getFechaVencimiento());
		inventarioModificar.setValorUnitario(inventarioDrogueria.getValorUnitario());
		return inventarioDrogueriaService.save(inventarioModificar);
		
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		inventarioDrogueriaService.deleteById(id);
	}
	
	
	
}
