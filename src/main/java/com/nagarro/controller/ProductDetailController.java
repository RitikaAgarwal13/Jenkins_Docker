package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entity.ProductDetails;
import com.nagarro.service.ProductDetailService;

//import lombok.extern.java.Log;
//import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/details")
public class ProductDetailController {
	
	@Autowired
	private ProductDetailService productDetailService;
	
	@PostMapping("/")
	public ProductDetails saveDetails(@RequestBody ProductDetails pDetails) {
		
		return productDetailService.saveDetails(pDetails);
	}
	
	@GetMapping("/all")
	public List<ProductDetails> getAllDetails(){
		return productDetailService.getAllDetails();
	}
	
	@GetMapping("/{id}")
	public ProductDetails findProductDetailsById(@PathVariable("id") Long detailId) {
		return productDetailService.findProductDetailsById(detailId);
	}
	 
	@DeleteMapping("/delete/{id}")
	public String deleteProductDetailsById(@PathVariable("id") Long detailId) {
		return productDetailService.deleteProductDetailsById(detailId);
	}
}
