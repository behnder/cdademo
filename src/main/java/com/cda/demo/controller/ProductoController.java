package com.cda.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cda.demo.model.GrupoProducto;
import com.cda.demo.model.Producto;
import com.cda.demo.service.GrupoProductoService;
import com.cda.demo.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired GrupoProductoService grupoProductoService;
	@Autowired ProductoService productoService;
	
	@GetMapping("/getProductosPorGrupoProducto/{grupoProductoId}")
	public ResponseEntity<Object> getProductosPorGrupoProducto(@PathVariable Long grupoProductoId) {
		GrupoProducto grupoProducto = grupoProductoService.getProductosPorGrupoProducto(grupoProductoId).get();
		List<Producto> productos = productoService.getProductosPorGrupoProducto(grupoProducto);
		
		return new ResponseEntity<Object>(productos, HttpStatus.OK);
				
	}

}
