package com.cda.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.cda.demo.model.GrupoProducto;
import com.cda.demo.model.Producto;

@Repository
public abstract class ProductoDaoImpl implements ProductoDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Producto> getProductosPorGrupoProducto(GrupoProducto grupoProducto) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Producto> criteriaQuery = criteriaBuilder.createQuery(Producto.class);
		Root<Producto> root = criteriaQuery.from(Producto.class);
		TypedQuery<Producto> query = entityManager.createQuery(criteriaQuery.select(root).
				where(criteriaBuilder.equal(root.get("grupoProducto"), grupoProducto)));
		
		return query.getResultList();
				
	}
	
	
	
	

}
