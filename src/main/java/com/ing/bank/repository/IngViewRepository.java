package com.ing.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.bank.model.IngProductModel;
import com.ing.bank.model.IngGroupModel;

@Repository
public interface IngViewRepository extends JpaRepository<IngGroupModel, Long> {

}
