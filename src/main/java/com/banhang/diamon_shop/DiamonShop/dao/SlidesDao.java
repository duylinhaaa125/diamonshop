package com.banhang.diamon_shop.DiamonShop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.banhang.diamon_shop.DiamonShop.entity.Slides;
import com.banhang.diamon_shop.DiamonShop.entity.MapperSildes;


@Repository
public class SlidesDao {
	
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Slides> GetDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		list = _jdbcTemplate.query(sql, new MapperSildes());
		return list;
	} 
}
