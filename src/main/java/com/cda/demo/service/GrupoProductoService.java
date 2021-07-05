package com.cda.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.demo.dao.GrupoProductoDao;
import com.cda.demo.model.GrupoProducto;


@Service
public class GrupoProductoService {
	
	@Autowired
	GrupoProductoDao grupoProductoDao;
	
	public Optional<GrupoProducto> getProductosPorGrupoProducto(Long idGrupoProducto){
		return grupoProductoDao.findById(idGrupoProducto);
	}

}
