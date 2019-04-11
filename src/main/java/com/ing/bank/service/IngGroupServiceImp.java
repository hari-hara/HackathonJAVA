package com.ing.bank.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ing.bank.model.ProductDetails;
import com.ing.bank.model.ProductUser;
import com.ing.bank.model.SubProductDetailsOverview;
import com.ing.bank.repository.IngGroupRepository;

@Service
public class IngGroupServiceImp implements IngGroupService {

	@Autowired
	private IngGroupRepository ingRepo;

	@Override
	public List<ProductUser> getProductDetails(String userId) {

		List<ProductDetails> listData = ingRepo.findAll();

		List<ProductUser> listAdd = new ArrayList<ProductUser>();

		try {
			for (int i = 0; i < listData.size(); i++) {
				if (String.valueOf(listData.get(i).getProductGroupId()).equals(userId)) {
					ProductUser p = new ProductUser();
					List<SubProductDetailsOverview> pdo = new ArrayList<SubProductDetailsOverview>();
					p.setId(listData.get(i).getProductGroupId());
					p.setProductGroupName(listData.get(i).getProductGroupName());
					p.setSub_id(listData.get(i).getSubProductNameId());
					listAdd.add(p);

					SubProductDetailsOverview p1 = new SubProductDetailsOverview();
					p1.setSubProductName(listData.get(i).getSubProductName());
					p1.setSubProductDuration(listData.get(i).getSubProductDuration());
					p1.setSubProductInterestRate(listData.get(i).getSubProductInterestRate());
					p1.setSubProductMaxInv(listData.get(i).getSubProductMaxInv());
					p1.setSubProductMinInv(listData.get(i).getSubProductMinInv());
					p1.setSubProductPercentage(listData.get(i).getSubProductPercentage());

					pdo.add(p1);
					p.setSubProductDetails(pdo);

				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listAdd;

	}

	@Override
	public String updateById(String name, String subid) {

		return subid;
	}

	@Override
	public List<ProductUser> getProductDetails() {

		List<ProductDetails> listData = ingRepo.findAll();

		List<ProductUser> listAdd = new ArrayList<ProductUser>();

		for (int i = 0; i < listData.size(); i++) {

			ProductUser p = new ProductUser();
			List<SubProductDetailsOverview> pdo = new ArrayList<SubProductDetailsOverview>();
			p.setId(listData.get(i).getProductGroupId());
			p.setProductGroupName(listData.get(i).getProductGroupName());
			p.setSub_id(listData.get(i).getSubProductNameId());
			listAdd.add(p);
			SubProductDetailsOverview p1 = new SubProductDetailsOverview();
			p1.setSubProductDuration(listData.get(i).getSubProductDuration());
			p1.setSubProductInterestRate(listData.get(i).getSubProductInterestRate());
			p1.setSubProductMaxInv(listData.get(i).getSubProductMaxInv());
			p1.setSubProductMinInv(listData.get(i).getSubProductMinInv());
			p1.setSubProductPercentage(listData.get(i).getSubProductPercentage());

			pdo.add(p1);
			p.setSubProductDetails(pdo);

		}

		return listAdd;

	}

}
