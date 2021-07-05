package com.cda.demo.dao;

import java.util.List;

import com.cda.demo.model.GrupoProducto;
import com.cda.demo.model.Producto;



public interface ProductoDao {
	
	List<Producto> getProductosPorGrupoProducto(GrupoProducto grupoProducto);

	
}
