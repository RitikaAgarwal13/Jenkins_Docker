package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.entity.ProductDetails;

@Repository
public interface DetailRepository extends JpaRepository<ProductDetails, Long> {

	ProductDetails findByDetailId(Long detailId);

}
