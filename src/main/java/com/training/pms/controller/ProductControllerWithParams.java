package com.training.pms.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductControllerWithParams {
	
	@GetMapping
	public String getProducts() { //localhost:5050/product -GET
		return "Getting all the products";
	}
	
	@GetMapping("productId")
	public String getProduct(@PathVariable("productId") int productId) { //localhost:5050/product/single -GET
		//code here to fetch product by id
		return "Getting a single product by productId : " + productId;
	}
	
	@GetMapping("searchProductByName/{productName}")
	public String getProductByProductName(@PathVariable("productName") String pname) { //localhost:5050/product -POST
		return "Getting a single product by productName : " + pname;
	}
	
	@GetMapping
	public String saveProducts() { //localhost:5050/product -POST
		return "Saving a single product";
	}
	
	@PutMapping
	public String updateProduct() { //localhost:5050/product -PUT
		return "Updating a single product";
	}
	
	@DeleteMapping
	public String deleteProduct() { //localhost:5050/product -DELETE
		return "Deleting a single product";
	}
	
	@DeleteMapping("/allProduct")
	public String deleteAllProducts() { //localhost:5050/product -DELETE
		return "Deleting all the products";
	}

}
