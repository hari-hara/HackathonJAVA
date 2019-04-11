package com.ing.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ing.bank.model.IngProductModel;
import com.ing.bank.repository.IngRepository;


@Service
public class IngProductServiceImp implements IngGroupService{

	@Autowired
	private IngRepository ingRepo;
	
	@Override
	public void saveData(IngProductModel e) {
		
		ingRepo.save(e);
		
	}

}
