package com.revature.revshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.revshop.entity.Product;


@Repository
public interface ProductRepositoryInterface extends JpaRepository<Product, Long> {

	Product findByProductName(String productName);

	

}
