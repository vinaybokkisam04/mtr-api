package com.meettheright.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meettheright.model.Main_Categories;

@Service
public interface MainCategoryDAO {

	List<Main_Categories> getMainCategoriesList();
	
}
