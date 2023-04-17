package com.revature.revshop.service;

import java.util.List;

import com.revature.revshop.entity.Product;
import com.revature.revshop.entity.User;

public interface ProductServiceInterface {

	Product createProduct(Product product) throws Exception;

	List<Product> getProduct(String productname);

	int DeleteProduct(Long productId);

	List<Product> getAllProducts();

}
