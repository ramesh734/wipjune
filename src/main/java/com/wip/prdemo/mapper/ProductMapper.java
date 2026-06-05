package com.wip.prdemo.mapper;

import com.wip.prdemo.dto.ProductDto;
import com.wip.prdemo.entity.Product;

public class ProductMapper {

	public static Product toEntity(ProductDto dto) {
		Product p = new Product();
		p.setPid(dto.getPid());
		p.setPname(dto.getPname());
		p.setPrice(dto.getPrice());
		return p;

	}

	public static ProductDto toDto(Product p) {
		ProductDto dto = new ProductDto();
		dto.setPid(p.getPid());
		dto.setPname(p.getPname());
		dto.setPrice(p.getPrice());
		return dto;

	}
}
