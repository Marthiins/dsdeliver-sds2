package com.devsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.services.ProductService;

@RestController
@RequestMapping (value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@CrossOrigin
	@GetMapping //metodo HTTP
	public ResponseEntity<List<ProductDTO>> findAll() {
		List <ProductDTO> list = service.findAll(); //Criar uma Variavel
		return ResponseEntity.ok().body(list);//Retornar a Lista Response com o corpo da lista
	}

}
