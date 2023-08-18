package com.banhang.diamon_shop.DiamonShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.diamon_shop.DiamonShop.entity.Slides;


@Service
public interface IHomeService {

	@Autowired
	public List<Slides> GetDataSlide();
}
