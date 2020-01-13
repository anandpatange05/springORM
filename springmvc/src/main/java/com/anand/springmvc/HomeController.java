package com.anand.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anand.springmvc.dao.AlienDao;
import com.anand.springmvc.model.Alien;

@Controller
public class HomeController
{
	@Autowired
	private AlienDao dao;
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
@RequestMapping("/")
public String home()
{
	return "index";
}
@GetMapping("getAliens")
public String getAliens(Model m)
{

m.addAttribute("result",dao.getAliens());
return "showAliens";
}
@GetMapping("getAlien")
public String getAlien(@RequestParam int aid,Model m)
{

m.addAttribute("result",dao.getAlien(aid));
return "showAliens";
}
@RequestMapping("addAlien")
public String addAlien(@ModelAttribute("result") Alien a)
{
dao.addAlien(a);
return "showAliens";
}
}
