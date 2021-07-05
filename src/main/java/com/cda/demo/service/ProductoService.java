package com.cda.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.demo.dao.ProductoDao;
import com.cda.demo.model.GrupoProducto;
import com.cda.demo.model.Producto;

@Service
public class ProductoService {
	
	
	ProductoDao productoDao;
	
	public List<Producto> getProductosPorGrupoProducto(GrupoProducto grupoProducto){
		return productoDao.getProductosPorGrupoProducto(grupoProducto);
		
	}

}
