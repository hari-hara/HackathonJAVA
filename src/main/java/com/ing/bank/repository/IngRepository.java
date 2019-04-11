package com.ing.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.bank.model.IngProductModel;

@Repository
public interface IngRepository extends JpaRepository<IngProductModel, Long> {

}
