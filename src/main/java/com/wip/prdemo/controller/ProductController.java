package com.wip.prdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wip.prdemo.dto.ProductDto;
import com.wip.prdemo.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;


	@PostMapping
	public ResponseEntity<ProductDto> create(@Validated @RequestBody ProductDto dto) {
		ProductDto pdto = productService.save(dto);
		return new ResponseEntity<ProductDto>(pdto, HttpStatus.CREATED);
	}

	
	@GetMapping
	public List<ProductDto> getAll() {
		return productService.getAll();
	}

	@PutMapping("/{id}")
	public ProductDto update(@PathVariable Long id, @RequestBody ProductDto dto) {
		return productService.update(id, dto);
	}

	@GetMapping("/{id}")
	public ProductDto getProdById(@PathVariable Long id) {
		return productService.getById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteProd(@PathVariable Long id) {
		productService.delete(id);
		return "Product  with id "+  id + " Successfully Deleted";
	}

}
