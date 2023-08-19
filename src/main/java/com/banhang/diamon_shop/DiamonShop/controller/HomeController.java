package com.banhang.diamon_shop.DiamonShop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.banhang.diamon_shop.DiamonShop.dao.HomeDao;
import com.banhang.diamon_shop.DiamonShop.service.HomeServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	HomeServiceImpl homeService;
	
	@RequestMapping(value={"/", "/trang-chu"})
	public ModelAndView Index(HttpServletResponse response) throws IOException{
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides" , homeService.GetDataSlide());
		return mv;
	}
	
	@RequestMapping(value= "/product")
	public ModelAndView Product(HttpServletResponse response) throws IOException{
		return new ModelAndView("user/product");
	}
	
	@RequestMapping(value= "/login")
	public ModelAndView Login(HttpServletResponse response) throws IOException{
		return new ModelAndView("login/login");
	}
}
