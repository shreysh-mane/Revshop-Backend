package com.revature.revshop.controller;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.revshop.entity.Product;
import com.revature.revshop.entity.Role;
import com.revature.revshop.entity.User;
import com.revature.revshop.entity.UserRole;
import com.revature.revshop.service.ProductServiceInterface;
import com.revature.revshop.service.UserServiceInterface;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	private ProductServiceInterface productServiceInterface;
	
	
	@PostMapping("/")
	public Product createProduct(@RequestBody Product product) throws Exception {
		
		return this.productServiceInterface.createProduct(product);
		
	}
	
	@GetMapping("/get-products")
	public List<Product> getAllProduct() {
		List<Product> productList =  productServiceInterface.getAllProducts();
		return productList;
	}
	
	
	@GetMapping("/get-products/{productname}")
	public List<Product> getProduct(@PathVariable("productname") String productname) {
		return this.productServiceInterface.getProduct(productname);
	}
	
	@DeleteMapping("/delete-product/{id}")
	public int deleteProduct(@PathVariable(value = "id") Long productId) {
		int result = productServiceInterface.DeleteProduct(productId);
		return result;
	}
	
	

}
