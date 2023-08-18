package com.banhang.diamon_shop.DiamonShop.entity;

import java.sql.ResultSet;

import java.sql.SQLException;

public class MapperSildes implements org.springframework.jdbc.core.RowMapper<Slides> {

	@Override
	public Slides mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slides slides = new Slides();
		slides.setId(rs.getInt("id"));
		slides.setImg(rs.getString("img"));
		slides.setCaption(rs.getString("caption"));
		slides.setContent(rs.getString("content"));
		return slides;
	}
	
}
