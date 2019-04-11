package com.ing.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.bank.model.ProductDetails;

@Repository
public interface IngGroupRepository extends JpaRepository<ProductDetails, Long> {

}
