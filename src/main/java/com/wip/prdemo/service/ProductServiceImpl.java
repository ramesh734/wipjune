package com.wip.prdemo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wip.prdemo.dto.ProductDto;
import com.wip.prdemo.entity.Product;
import com.wip.prdemo.exception.ProductNotFoundException;
import com.wip.prdemo.mapper.ProductMapper;
import com.wip.prdemo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductDto save(ProductDto dto) {
		Product product = ProductMapper.toEntity(dto);
		return ProductMapper.toDto(productRepository.save(product));
	}

	@Override
	public List<ProductDto> getAll() {

		return productRepository.findAll().stream().map(ProductMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public ProductDto update(Long id, ProductDto dto) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product", "productId", id));
		System.out.println(product);
		product.setPname(dto.getPname());
		product.setPrice(dto.getPrice());

		return ProductMapper.toDto(productRepository.save(product));
	}

	@Override
	public void delete(Long id) {

		productRepository.deleteById(id);
	}

	@Override
	public ProductDto getById(Long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product", "productId", id));
		return ProductMapper.toDto(product);
	}

}
