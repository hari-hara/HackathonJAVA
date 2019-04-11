package com.ing.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.bank.model.IngViewModel;

@Repository
public interface IngProductRepository extends JpaRepository<IngViewModel, Long> {

}
