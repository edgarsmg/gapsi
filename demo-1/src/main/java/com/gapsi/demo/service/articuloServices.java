package com.gapsi.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gapsi.demo.entity.articulo;



@Service
public class articuloServices {
	
	@Autowired
	private com.gapsi.demo.repository.articuloRepository repository;
	
	public List<articulo> listaArticulos(){
		return repository.findAll();
	}
	
	public articulo guardarArticulo(articulo articulo) {
		return repository.save(articulo);
	}
	
	public List<articulo> guardarArticulos(List<articulo> articulos) {
		return repository.saveAll(articulos);
	}
	
	public articulo actualizarArticulo(articulo articulo) {
		articulo existingArticulo = repository.findById(articulo.getId()).orElse((null));
		existingArticulo.setDescripcion(articulo.getDescripcion());
		existingArticulo.setModel(articulo.getModel());
		return repository.save(existingArticulo);
	}
	
	
	
	
}
