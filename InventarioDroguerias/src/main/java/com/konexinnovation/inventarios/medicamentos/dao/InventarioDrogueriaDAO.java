package com.konexinnovation.inventarios.medicamentos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.konexinnovation.inventarios.medicamentos.CrearVenta;
import com.konexinnovation.inventarios.medicamentos.InventarioDrogueria;



@Repository
public interface InventarioDrogueriaDAO extends JpaRepository<com.konexinnovation.inventarios.medicamentos.InventarioDrogueria, Long> {



//	@Query("SELECT nombre,laboratorio_fabrica,fecha_fabricacion, fecha_vencimiento,cantidad_stock,valor_unitario  FROM inventario_droguerias WHERE nombre = :nombre")
//	List<com.konexinnovation.inventarios.medicamentos.InventarioDrogueria> findByNombre(@Param("nombre") String nombre);

	
}
