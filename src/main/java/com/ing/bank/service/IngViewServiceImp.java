package com.ing.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.bank.model.IngProductModel;
import com.ing.bank.model.IngViewModel;
import com.ing.bank.model.IngGroupModel;
import com.ing.bank.repository.IngRepository;
import com.ing.bank.repository.IngProductRepository;
import com.ing.bank.repository.IngViewRepository;


@Service
public class IngViewServiceImp implements IngViewService{

	@Autowired
	private IngViewRepository ingRepoTwo;
	
	

	@Override
	public void saveData(IngGroupModel e) {
		// TODO Auto-generated method stub
		ingRepoTwo.save(e);
	}

}
