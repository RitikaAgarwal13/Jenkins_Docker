package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.entity.ProductDetails;
import com.nagarro.repository.DetailRepository;

@Service
public class ProductDetailService {

	@Autowired
	private DetailRepository detailRepository;

	public ProductDetails saveDetails(ProductDetails pDetails) {
		
		return detailRepository.save(pDetails);
	}

	public ProductDetails findProductDetailsById(Long detailId) {
		
		return detailRepository.findByDetailId(detailId);
	}

	public List<ProductDetails> getAllDetails() {
//		 TODO Auto-generated method stub
		return detailRepository.findAll();
	}

	public String deleteProductDetailsById(Long detailId) {
		// TODO Auto-generated method stub
		detailRepository.deleteById(detailId);
		return ("ProductDetails deleted with id ->"+detailId);
	}
}
