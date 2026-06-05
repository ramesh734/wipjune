package com.wip.prdemo.service;

import java.util.List;

import com.wip.prdemo.dto.ProductDto;


public interface ProductService {
	public ProductDto save(ProductDto pr);
	public List<ProductDto> getAll();
	public ProductDto update(Long id, ProductDto dto);
	public void delete(Long id);
	public ProductDto getById(Long id);
}
