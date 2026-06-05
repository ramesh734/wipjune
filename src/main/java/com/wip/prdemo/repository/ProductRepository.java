package com.wip.prdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wip.prdemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
