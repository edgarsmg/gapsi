package com.gapsi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gapsi.demo.entity.articulo;
import com.gapsi.demo.service.articuloServices;

@RestController
public class articuloController {
	
	@Autowired
	private com.gapsi.demo.service.articuloServices services;
	
	@GetMapping("/articulos")
	public List<articulo> articulos() {
		return services.listaArticulos();
	}
	
	@PutMapping("/actualizar")
	public articulo actualizaArticulo(@RequestBody articulo articulo) {
		return services.actualizarArticulo(articulo);
	}
	

}
