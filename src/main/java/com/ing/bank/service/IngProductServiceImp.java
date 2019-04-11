package com.ing.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.bank.model.IngViewModel;
import com.ing.bank.repository.IngRepository;


@Service
public class IngProductServiceImp implements IngProductService{

	@Autowired
	private IngRepository ingRepo;
	

	@Override
	public void saveData(IngViewModel e) {
		// TODO Auto-generated method stub
		
	}

}
