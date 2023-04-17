package com.revature.revshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.revshop.entity.Product;
import com.revature.revshop.entity.User;
import com.revature.revshop.entity.UserRole;
import com.revature.revshop.repository.ProductRepositoryInterface;

@Service
@Transactional
public class ProductService implements ProductServiceInterface {
	
	@Autowired
	private ProductRepositoryInterface productRepository;


	@Override
	public Product createProduct(Product product) throws Exception {
		Product productData = this.productRepository.findByProductName(product.getProductName());
		if(productData!=null) {
			throw new Exception("product already present");
		}
		else {
		
			productData=this.productRepository.save(product);
		}
		return productData;
		
	}

	@Override
	public List<Product> getProduct(String productname) {
		// TODO Auto-generated method stub
		return (List<Product>) this.productRepository.findByProductName(productname);
	}
	
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int DeleteProduct(Long productId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
