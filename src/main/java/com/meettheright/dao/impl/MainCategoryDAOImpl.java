package com.meettheright.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.MainCategoryDAO;
import com.meettheright.model.Main_Categories;

@Repository
public class MainCategoryDAOImpl implements MainCategoryDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Main_Categories> getMainCategoriesList() {

		StringBuilder selectSql = new StringBuilder("Select MainCatId, MainCatName");
		selectSql.append(" From Main_Categories");

		List<Main_Categories> main_Categories = new ArrayList<>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(selectSql.toString());
		for (Map<String, Object> row : rows) {
			Main_Categories categories = new Main_Categories();
			categories.setMainCatId(Integer.valueOf(row.get("MainCatId").toString()));
			categories.setMainCatName(row.get("MainCatName").toString());
			main_Categories.add(categories);
		}

		return main_Categories;
	}

}
