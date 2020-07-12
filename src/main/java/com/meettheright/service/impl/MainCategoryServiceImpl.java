package com.meettheright.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.MainCategoryDAO;
import com.meettheright.model.Main_Categories;
import com.meettheright.service.MainCategoryService;

@Repository
public class MainCategoryServiceImpl implements MainCategoryService {

	@Autowired
	private MainCategoryDAO mainCategoryDAO;

	@Override
	public List<Main_Categories> getMainCategoriesList() {
		return mainCategoryDAO.getMainCategoriesList();
	}

}
