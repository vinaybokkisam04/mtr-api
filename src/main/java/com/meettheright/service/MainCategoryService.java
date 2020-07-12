package com.meettheright.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meettheright.model.Main_Categories;

@Service
public interface MainCategoryService {

	List<Main_Categories> getMainCategoriesList();

}
