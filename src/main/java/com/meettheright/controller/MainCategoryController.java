package com.meettheright.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meettheright.exceptions.UserEmailNotExistException;
import com.meettheright.model.Main_Categories;
import com.meettheright.service.MainCategoryService;

@RestController
@RequestMapping("meettheright")
public class MainCategoryController {

	@Autowired
	MainCategoryService mainCategoryService;

	@RequestMapping(value = "/getMain_Categories", method = RequestMethod.GET)
	public List<Main_Categories> getMain_Categories() {
		List<Main_Categories> main_Categories = null;
		try {
			main_Categories = mainCategoryService.getMainCategoriesList();
		} catch (UserEmailNotExistException e) {
			return main_Categories;
		}
		return main_Categories;
	}
}
