package com.banhang.diamon_shop.DiamonShop.service;

import java.util.List;

import javax.swing.plaf.SliderUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.diamon_shop.DiamonShop.dao.SlidesDao;
import com.banhang.diamon_shop.DiamonShop.entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	
	@Autowired
	private SlidesDao slidesDao;
	
	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}
}
