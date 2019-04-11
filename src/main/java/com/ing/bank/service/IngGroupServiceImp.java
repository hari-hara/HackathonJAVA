package com.ing.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.bank.model.IngProductModel;
import com.ing.bank.model.IngViewModel;

import com.ing.bank.repository.IngRepository;
import com.ing.bank.repository.IngProductRepository;


@Service
public class IngGroupServiceImp implements IngProductService{

	@Autowired
	private IngProductRepository ingRepoThree;
	
	@Override
	public void saveData(IngViewModel e) {
		
		ingRepoThree.save(e);
		
	}
}
